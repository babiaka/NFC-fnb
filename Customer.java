 import java.util.Scanner;

public class Customer{
String fullName;
String reference;
int pin;
String card;
long phoneNumber;
long accountNumber;
double balance = 10000;
double amount;
int choice;
int select;
int option;
double  withdraw;
double depositAmount;
double minAmount = 20;
double maxAmount = 10000;

Scanner sc = new Scanner(System.in);

public double deposit(){

System.out.println("Enter accountNumber");
accountNumber = sc.nextLong();


System.out.println("Enter reference");
reference = sc.nextLine();
sc.nextLine();

System.out.println("Are you sure?");
System.out.println("accountNumber= "+accountNumber);
System.out.println("reference= "+reference);
sc.nextLine();
System.out.println("Press 1 to continue or 2 to cancel");



System.out.println("Enter fullName");
fullName = sc.nextLine();

System.out.println("Enter phoneNumber");
phoneNumber = sc.nextLong();


System.out.println("Minimum amount 20");
System.out.println("Maximum notes 100");

System.out.println("enter depositAmount");
depositAmount = sc.nextDouble();



System.out.println("Confirm Deposit Details");
System.out.println("accountNumber= "+accountNumber);
System.out.println("reference= "+reference);
sc.nextLine();
System.out.println("fullName= "+fullName);
System.out.println("amount= "+amount);

int option;
System.out.println("choose option");
System.out.println("1.Proceed");
System.out.println("2.Cancel");
sc.nextLine();

if(accountNumber == accountNumber){
System.out.println("Successful");
}else{
System.out.println("Fail");
depositAmount = balance + depositAmount;
}
return balance;
}

public double  withdraw(){

System.out.println("Enter pin");
pin = sc.nextInt();

 if(pin==pin){
System.out.println("withdraw");
 }else{
 System.out.println("invalid pin");
 }

System.out.println("Enter option");
System.out.println(" 1) 1000.00");
System.out.println(" 2) 500.00");
System.out.println(" 3) Enter amount");


int choice = sc.nextInt();

if(choice==1){
System.out.println("1000.00");
}else if(choice==2){
System.out.println("500.00");
}else{
System.out.println("enter amount");
amount = sc.nextDouble();
}

if (balance >= withdraw){
balance = balance - withdraw;
System.out.println("Transaction successful");

}else{
System.out.println("Transaction failed");

}
return balance;
}

public void checkBalance(){
System.out.println("Enter pin");
pin = sc.nextInt();
System.out.println("Select balance");
System.out.println("1)Print balance,2)Preview balance ");

int select;
select = sc.nextInt();

if(select==1){
System.out.println("Print balance");
}else if(select==2){
System.out.println("Preview balance");
}

}
}
