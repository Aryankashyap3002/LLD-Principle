package Lesson3AbstractClassesAndInterfaces.AbstractClassDemo;

public class Macbook extends Product{

    @Override
    public double claculateDiscount() {
        System.out.println("Discount calculated");
        return 22;
    }

    @Override
    public void termsAndCondition() {
        System.out.println("Terms of macbook");
    }
    
}
