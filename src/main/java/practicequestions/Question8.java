package practicequestions;
//Encapsulation
//Create a BankAccount class with a private balance field. Provide public methods deposit() and withdraw() with validation.

import java.math.BigDecimal;

class BankAccount{
    private BigDecimal balance = new BigDecimal(0);
    BankAccount(BigDecimal initialBalance){
        assert initialBalance.compareTo(new BigDecimal(0)) > 0 : "Invalid Initial balance";
        balance = initialBalance;
    }
    public BigDecimal deposit(BigDecimal depositAmount){
        assert depositAmount.compareTo(new BigDecimal(0)) > 0 : "Deposit amount can't be -ve or 0";
        balance = balance.add(depositAmount);
        return balance;
    }

    public BigDecimal withdraw(BigDecimal withdrawAmount ){
        assert withdrawAmount.compareTo(BigDecimal.valueOf(0)) > 0 && withdrawAmount.compareTo(balance) < 0: "Withdraw amount can't be -ve or 0 or greater than balance";
        balance = balance.subtract(withdrawAmount);
        return balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
public class Question8 {
    public static void main(String args[]){
        BankAccount b1 = new BankAccount(new BigDecimal("78.78"));
        BankAccount b2 = new BankAccount(new BigDecimal("897.56"));
        System.out.println("Your end balance after deposit is "+ b1.deposit(BigDecimal.valueOf(789.54)));
        System.out.println("Your end balance after withdraw is "+ b1.withdraw(BigDecimal.valueOf(89.76)));
        System.out.println("Your end balance after deposit is "+ b1.deposit(BigDecimal.valueOf(90)));
        System.out.println("Your end balance after withdraw is "+ b1.withdraw(BigDecimal.valueOf(89.9)));
        System.out.println("Your end balance after deposit is "+ b2.withdraw(BigDecimal.valueOf(90.46)));
        System.out.println("Your end balance after deposit is "+ b2.deposit(BigDecimal.valueOf(908.87)));
    }
}