
public class Bank{
String name;
long contactNumber;
String emailAddress;
String accountType;
String website;

public void receipt(Customer c){


 System.out.println("..................FNB...........");

 System.out.println("FIRST NATIONAL BANK");

 System.out.println("012 045 7854");

 System.out.println("info@fnb.co.za");

 System.out.println("Savings account");

 System.out.println(                              "www.fnb.co.za"                    );

System.out.println("accountNumber " + c.accountNumber);
System.out.println("depositAmount: " + c.depositAmount);
System.out.println("withdraw: " + c.withdraw);
System.out.println("balance: " + c.balance);

}
}
