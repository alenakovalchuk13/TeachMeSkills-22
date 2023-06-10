package CreditCard;

import CreditCard.CreditCard;

public class Main {
    public static void main (String[] args){

        CreditCard one = new CreditCard ("2200345543",87687);
        CreditCard two = new CreditCard ("6789765997",765439);
        CreditCard three = new CreditCard("767657887",768954);


        one.showBalance();
        two.showBalance();
        three.showBalance();

        one.addMoney(789);
        two.addMoney(987);
        three.withdrawMoney(8765);

        one.showBalance();
        two.showBalance();
        three.showBalance();



    }
}
