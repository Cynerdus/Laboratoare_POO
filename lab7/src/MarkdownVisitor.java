public class MarkdownVisitor implements DocumentVisitor{
    private final StringBuilder markdownStringBuilder = new StringBuilder();

    @Override
    public void visit(ItalicTextSegment italicTextSegment) {
        markdownStringBuilder.append("*").append(italicTextSegment.getContent()).append("*");
    }

    @Override
    public void visit(BoldTextSegment boldTextSegment) {
        markdownStringBuilder.append("**").append(boldTextSegment.getContent()).append("**");
    }

    @Override
    public void visit(UrlTextSegment urlTextSegment) {
        markdownStringBuilder.append("[").append(urlTextSegment.getContent()).append("](")
                            .append(urlTextSegment.getUrlDescription()).append(")");
    }

    @Override
    public void visit(PlainTextSegment plainTextSegment) {
        markdownStringBuilder.append(plainTextSegment.getContent());
    }

    @Override
    public StringBuilder getDocument() {
        return markdownStringBuilder;
    }
}
