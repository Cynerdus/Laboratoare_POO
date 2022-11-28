public class ItalicTextSegment extends TextSegment{
    ItalicTextSegment(String content) {
        super(content);
    }

    @Override
    public void acceptVisitor(DocumentVisitor documentVisitor) {
        documentVisitor.visit(this);
    }
}
