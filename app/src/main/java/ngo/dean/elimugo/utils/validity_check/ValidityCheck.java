package ngo.dean.elimugo.utils.validity_check;

import ngo.dean.elimugo.repositories.models.ContentFile;
import ngo.dean.elimugo.repositories.models.ContentIndex;

public class ValidityCheck {

    public static boolean isValid(ContentIndex index, ContentFile[] files) {
        return index.size.value == calculateSize(files);
    }

    private static int calculateSize(ContentFile[] files) {
        int size = 0;
        for (ContentFile file : files) {
            size += file.size.value;
        }
        return size;
    }
}
