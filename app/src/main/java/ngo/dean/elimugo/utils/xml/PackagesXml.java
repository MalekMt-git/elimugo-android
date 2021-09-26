package ngo.dean.elimugo.utils.xml;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ngo.dean.elimugo.repositories.models.ContentDescriptions;
import ngo.dean.elimugo.repositories.models.ContentModule;
import ngo.dean.elimugo.repositories.models.FileSize;

public class PackagesXml implements XmlObject {

    public ContentModule[] values;

    @Override
    public void deserialize(String s) {
        this.values = this.parse(s);
    }

    public static String serializeModule(ContentModule module) {
        StringBuilder moduleText = new StringBuilder();
        moduleText.append("<Package>\n");
        moduleText.append(String.format("<UniqueId>%s</UniqueId>\n", module.uniqueId));
        moduleText.append("<Descriptions>\n");
        for (Map.Entry<String, String> description : module.descriptions.descriptions.entrySet()) {
            moduleText.append(String.format("<Description xml:lang=\"%s\">%s</Description>\n", description.getKey(), description.getValue()));
        }
        moduleText.append("</Descriptions>\n");
        moduleText.append(String.format("<Type>%s</Type>\n", module.type));
        moduleText.append(String.format("<ContentVersion>%s</ContentVersion>\n", module.contentVersion));
        moduleText.append(String.format("<Accessibility>%s</Accessibility>\n", module.accessibility));
        moduleText.append(String.format("<ReleaseDate>%s</ReleaseDate>\n", module.releaseDate));
        moduleText.append(String.format("<Size>%s</Size>\n", module.size.value));
        moduleText.append("</Package>\n");
        return moduleText.toString();
    }

    private ContentModule[] parse(String s) {
        List<ContentModule> modules = new ArrayList<>();
        try {
            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            XmlPullParser parser = factory.newPullParser();
            parser.setInput(new StringReader(s));
            int event = parser.getEventType();
            ContentModule module = new ContentModule();
            while (event != XmlPullParser.END_DOCUMENT) {
                if (event == XmlPullParser.START_TAG) {
                    String name = parser.getName();
                    switch (name) {
                        case "UniqueId":
                            advanceParser(parser);
                            module.uniqueId = parser.getText();
                            break;
                        case "Descriptions":
                            module.descriptions = parseDescriptions(parser);
                            break;
                        case "Type":
                            advanceParser(parser);
                            module.type = parser.getText();
                            break;
                        case "ContentVersion":
                            advanceParser(parser);
                            module.contentVersion = parser.getText();
                            break;
                        case "Accessibility":
                            advanceParser(parser);
                            module.accessibility = parser.getText();
                            break;
                        case "ReleaseDate":
                            advanceParser(parser);
                            module.releaseDate = parser.getText();
                            break;
                        case "Size":
                            advanceParser(parser);
                            module.size = new FileSize(Integer.parseInt(parser.getText()));
                            modules.add(module);
                            module = new ContentModule();
                            break;
                    }
                }

                event = advanceParser(parser);
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
        return modules.toArray(new ContentModule[0]);
    }

    private ContentDescriptions parseDescriptions(XmlPullParser parser) throws XmlPullParserException {
        ContentDescriptions descriptions = new ContentDescriptions();
        Map<String, String> languageValues = new HashMap<>();

        advanceParser(parser);
        int event = parser.getEventType();

        while (event != XmlPullParser.END_TAG) {
            String name = parser.getName();
            if (name != null && name.equals("Description")) {
                String language = parser.getAttributeValue(null, "xml:lang");
                advanceParser(parser);
                String value = parser.getText();
                advanceParser(parser);
                languageValues.put(language, value);
            }
            event = advanceParser(parser);
        }
        descriptions.descriptions = languageValues;

        return descriptions;
    }

    private int advanceParser(XmlPullParser parser) throws XmlPullParserException{
        int event = XmlPullParser.END_DOCUMENT;
        try {
            event = parser.next();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return event;
    }
}
