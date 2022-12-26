public class DokuWikiVisitor implements DocumentVisitor{
    private final StringBuilder dokuWikiStringBuilder = new StringBuilder();

    @Override
    public void visit(ItalicTextSegment italicTextSegment) {
        dokuWikiStringBuilder.append("//").append(italicTextSegment.getContent()).append("//");
    }

    @Override
    public void visit(BoldTextSegment boldTextSegment) {
        dokuWikiStringBuilder.append("**").append(boldTextSegment.getContent()).append("**");
    }

    @Override
    public void visit(UrlTextSegment urlTextSegment) {
        dokuWikiStringBuilder.append("[[").append(urlTextSegment.getUrlDescription()).append("|")
                            .append(urlTextSegment.getContent()).append("]]");
    }

    @Override
    public void visit(PlainTextSegment plainTextSegment) {
        dokuWikiStringBuilder.append(plainTextSegment.getContent());
    }

    @Override
    public StringBuilder getDocument() {
        return dokuWikiStringBuilder;
    }
}
