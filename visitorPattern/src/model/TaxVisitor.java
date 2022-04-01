package model;

public class TaxVisitor implements Visitor {
    @Override
    public void visit(TShirt tShirt) {
        System.out.println(tShirt.getPrice() * 0.9);
    }

    @Override
    public void visit(Pant pant) {
        System.out.println(pant.getPrice() * 0.5);
    }
}
