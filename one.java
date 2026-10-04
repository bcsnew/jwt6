class Account {
String custname;
int accno;

Account() {
custname = "Default";
accno = 0;
}

Account(String custname, int accno) {
this.custname = custname;
this.accno = accno;
}
}

class SavingAccount extends Account {
double savingbal;
double minbal;

SavingAccount() {
super();
savingbal = 500.0;
minbal = 500.0;
}

SavingAccount(String custname, int accno, double savingbal, double minbal) {
super(custname, accno);
this.savingbal = savingbal;
this.minbal = minbal;
}
}

class AccountDetail extends SavingAccount {
double depositamt;
double withdrawalamt;

AccountDetail(String custname, int accno, double savingbal, double minbal, double depositamt, double withdrawalamt) {
super(custname, accno, savingbal, minbal);
this.depositamt = depositamt;
this.withdrawalamt = withdrawalamt;
}

void display() {
System.out.println("Customer Name: " + custname);
System.out.println("Account Number: " + accno);
System.out.println("Minimum Balance: " + minbal);
System.out.println("Current Savings Balance: " + savingbal);
System.out.println("Deposit Amount: " + depositamt);
System.out.println("Withdrawal Amount: " + withdrawalamt);
double finalBalance = savingbal + depositamt - withdrawalamt;
System.out.println("Final Balance: " + finalBalance);
}
}

public class one {
public static void main(String[] args) {
AccountDetail ad = new AccountDetail("Ramesh Sharma", 101245, 10000.0, 1000.0, 5000.0, 2000.0);
ad.display();
}
}
