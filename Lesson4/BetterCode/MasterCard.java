package Lesson4.BetterCode;

public class MasterCard extends CreditCard implements InternationalPaymentComaptableInterface{
    
    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay impl of Master");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer impl of Master");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay impl of Master");
    }

    @Override
    public void mandatePayments() {
        System.out.println("Mandate payment impl of Master");
    }

    @Override
    public void intPayment() {
        System.out.println("Int payment using MasterCard");
    }

   
}
