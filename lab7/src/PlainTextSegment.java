public class PlainTextSegment extends TextSegment{
    PlainTextSegment(String content) {
        super(content);
    }

    @Override
    public void acceptVisitor(DocumentVisitor documentVisitor) {
        documentVisitor.visit(this);
    }
}
