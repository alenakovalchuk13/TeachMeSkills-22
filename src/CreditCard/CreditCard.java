package CreditCard;

public class CreditCard {

    private String accountNumber;
    private float accountBalance;


    public CreditCard(String accountNumber, float accountBalance){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public void showBalance(){
        System.out.println("The balance of your card number " + accountNumber + "  is " + accountBalance);
    }

    public void addMoney(float money){
        if (money > 0){
            accountBalance +=money;
        }
    }

    public void withdrawMoney(float money){
        accountBalance -=money;
    }


}
