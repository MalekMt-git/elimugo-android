package ngo.dean.elimugo.utils.xml;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import ngo.dean.elimugo.repositories.models.ContentFile;
import ngo.dean.elimugo.repositories.models.FileSize;

public class FilesXml implements XmlObject {

    public ContentFile[] values;

    @Override
    public void deserialize(String s) {
        this.values = parse(s);
    }

    private ContentFile[] parse(String s) {
        List<ContentFile> fileReferenceList = new ArrayList<>();
        try {
            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            XmlPullParser parser = factory.newPullParser();
            parser.setInput(new StringReader(s));
            int event = parser.getEventType();
            while (event != XmlPullParser.END_DOCUMENT) {
                String name = parser.getName();
                if (event == XmlPullParser.START_TAG && name.equals("File")) {
                    String size = parser.getAttributeValue(null, "size");
                    advanceParser(parser);
                    String path = parser.getText();
                    fileReferenceList.add(new ContentFile(new FileSize(Integer.parseInt(size)), path));
                    advanceParser(parser);
                }
                event = advanceParser(parser);
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
        return fileReferenceList.toArray(new ContentFile[0]);
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
