package ngo.dean.elimugo.utils.xml;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import ngo.dean.elimugo.repositories.models.ContentDescriptions;
import ngo.dean.elimugo.repositories.models.ContentIndex;
import ngo.dean.elimugo.repositories.models.FileSize;

public class IndexXml implements XmlObject {

    public ContentIndex values;

    @Override
    public void deserialize(String s) {
        this.values = parse(s);
    }

    private ContentIndex parse(String s) {
        ContentIndex index = new ContentIndex();
        try {
            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            XmlPullParser parser = factory.newPullParser();
            parser.setInput(new StringReader(s));
            int event = parser.getEventType();
            while (event != XmlPullParser.END_DOCUMENT) {
                if (event == XmlPullParser.START_TAG) {
                    String name = parser.getName();
                    switch (name) {
                        case "UniqueId":
                            advanceParser(parser);
                            index.uniqueId = parser.getText();
                            break;
                        case "Type":
                            advanceParser(parser);
                            index.type = parser.getText();
                            break;
                        case "ReleaseDate":
                            advanceParser(parser);
                            index.releaseDate = parser.getText();
                            break;
                        case "ContentVersion":
                            advanceParser(parser);
                            index.contentVersion = parser.getText();
                            break;
                        case "Descriptions":
                            index.descriptions = parseDescriptions(parser);
                            break;
                        case "Size":
                            advanceParser(parser);
                            index.size = new FileSize(Integer.parseInt(parser.getText()));
                            break;
                        case "Accessibility":
                            advanceParser(parser);
                            index.accessibility = parser.getText();
                            break;
                    }
                }

                event = advanceParser(parser);
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
        return index;
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
