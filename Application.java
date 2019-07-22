package.home.khanyisa.Desktop.atm
import java.util.Scanner;

public class Application{

public static void main(String [] args){
Scanner sc = new Scanner(System.in);

System.out.println("------------------------------First National Bank------------------------------");

System.out.println("------------------------------How can we help you------------------------------");

Customer c = new Customer();
Bank b = new Bank();

int choose;

System.out.println("Please select an option");
System.out.println(" 1) Deposit");
System.out.println(" 2) Withdraw");
System.out.println(" 3) Check Balance");
System.out.println();
System.out.println("Enter choose: ");
choose = sc.nextInt();


if(choose==1){
c.deposit();
System.out.println("Would you like a receipt( press 1 for receipt or 2 for no");
int press = sc.nextInt(); 
b.receipt(c);
}
else if(choose==2){
c.withdraw();
}else if(choose==3){
c.checkBalance();
}
}
}
