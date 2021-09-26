package ngo.dean.elimugo.repositories.models;

public class ContentFile {
    public FileSize size;
    public String path;

    public ContentFile(FileSize size, String path) {
        this.size = size;
        this.path = path;
    }
}
