/**
 * Represents a text segment of a document that needs to be parsed.
 */
abstract class TextSegment {
    private final String content;

    TextSegment(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public abstract void acceptVisitor(DocumentVisitor documentVisitor);
}