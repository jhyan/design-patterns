package model;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void printList(List<? extends Number> numbers) {
        System.out.println(numbers);
    }

    public static void main(String[] args) {

        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);
        List<Integer> intList = Arrays.asList(1, 2, 3);

        printList(doubleList);
        printList(intList);

//        Pant pant = new Pant(100);
//        TShirt tShirt = new TShirt(100);
//        TaxVisitor taxVisitor = new TaxVisitor();
//
//        pant.accept(taxVisitor);
//        tShirt.accept(taxVisitor);
    }
}
