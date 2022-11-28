public interface DocumentVisitor {
    void visit(ItalicTextSegment italicTextSegment);
    void visit(BoldTextSegment boldTextSegment);
    void visit(UrlTextSegment urlTextSegment);
    void visit(PlainTextSegment plainTextSegment);

    StringBuilder getDocument();
}