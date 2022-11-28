import java.util.List;

/**
 * Uses visitors to parse documents and provide dokuwiki and markdown outputs.
 */
class WikiGenerator {

    private final List<TextSegment> textSegments;

    public WikiGenerator(List<TextSegment> textSegments) {
        this.textSegments = textSegments;
    }

    public StringBuilder getDokuWikiDocument() {
        DokuWikiVisitor dokuWikiVisitor = new DokuWikiVisitor();
        for (TextSegment textSegment : textSegments) {
            textSegment.acceptVisitor(dokuWikiVisitor);
        }

        return dokuWikiVisitor.getDocument();
    }

    public StringBuilder getMarkdownDocument() {
        MarkdownVisitor markdownVisitor = new MarkdownVisitor();
        for (TextSegment textSegment : textSegments) {
            textSegment.acceptVisitor(markdownVisitor);
        }

        return markdownVisitor.getDocument();
    }
}