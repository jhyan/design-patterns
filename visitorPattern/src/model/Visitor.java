package model;

public interface Visitor {
    void visit(TShirt tShirt);
    void visit(Pant pant);
}
