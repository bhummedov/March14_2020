package March14_2020;

public class BankClass {
    String Name;
    double Balance;
    int AccountNumber;
    public BankClass (String BankName, double accountBalance, int number) {
        Name = BankName;
        Balance = accountBalance;
        AccountNumber = number;
    }
    public void checkBalance(){
        System.out.println(Balance);
        }
    public void addMoney(){
        Balance=+10;
    }public void addMoney(int number) {
        Balance = +number;
    }
    public void drawMoney (){
        Balance = Balance - 10;
    }
    public void drawMoney (Double amount){
        Balance = Balance - amount;
    }

    public static void main(String[] args) {
        BankClass myAccount = new BankClass("Chase", 555,56898900);
        System.out.println(myAccount.AccountNumber);
        System.out.println(myAccount.Balance);
        System.out.println(myAccount.Name);
        myAccount.addMoney();
        myAccount.addMoney(55);
        myAccount.drawMoney();
        myAccount.drawMoney(56.7);
        myAccount.checkBalance();
    }
}