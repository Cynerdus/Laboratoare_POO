public class BoldTextSegment extends TextSegment{
    BoldTextSegment(String content) {
        super(content);
    }

    @Override
    public void acceptVisitor(DocumentVisitor documentVisitor) {
        documentVisitor.visit(this);
    }
}
