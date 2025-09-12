package Lesson4.ProblematicCode;

public class RupayCard extends CreditCard{
    
    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay impl of Rupay");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer impl of Rupay");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay impl of Rupay");
    }

    @Override
    public void mandatePayments() {
        System.out.println("Mandate payment impl of Rupay");
    }
}
