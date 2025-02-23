package ats.v1.pkb.ast.nodes;

public class StatementNode extends Node {
    private int line;

    public StatementNode(int line) {
        super();
        this.line = line;
    }

    @Override
    protected String nodeName() {
        return super.nodeName() + " - Line: " + line;
    }
}
