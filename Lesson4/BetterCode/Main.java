package Lesson4.BetterCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<InternationalPaymentComaptableInterface> cards = new ArrayList<>();
        for(InternationalPaymentComaptableInterface card: cards) {
            card.intPayment();
        }
        
    }
}

