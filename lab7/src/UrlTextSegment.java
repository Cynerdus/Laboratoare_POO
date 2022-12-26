public class UrlTextSegment extends TextSegment{
    private final String urlDescription;

    public UrlTextSegment(String urlDescription, String content) {
        super(content);
        this.urlDescription = urlDescription;
    }

    @Override
    public void acceptVisitor(DocumentVisitor documentVisitor) {
        documentVisitor.visit(this);
    }

    public String getUrlDescription() {
        return urlDescription;
    }
}
