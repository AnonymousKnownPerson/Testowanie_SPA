package ats.v1.pkb.ast.nodes;

public class ProcedureNode extends Node {
    private final int procIdx;

    public ProcedureNode(int procIdx) {
        super();
        this.procIdx = procIdx;
    }

    @Override
    protected String nodeName() {
        return super.nodeName() + " - Index: " + procIdx;
    }
}
