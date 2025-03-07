import java.util.Scanner;
public class Atm1 {
    public static void main(String[] args) {
Bankaccount bankaccount=new Bankaccount(1000);
Scanner sc=new Scanner(System.in);     //initial balance 1000
boolean exit=false;
long pin=123456;
System.out.print("pls enter your Pin number: ");
int code=sc.nextInt();
if(pin==code){
    System.out.print("hello customer"); 
while (!exit) {
System.out.println(" please select your options");
System.out.println(" 1.Acount  balance   2.money deposite");
System.out.println(" 3.money withdrwal   4.Exit");
int option=sc.nextInt();
if(option==1){
    bankaccount.getbalance();
          }
 else if(option==2){
    System.out.println("enter your deposite amount");
    int deposite=sc.nextInt();
    bankaccount.addBalance(deposite);
    }
  else if(option==3){
    System.out.println("enter your withdrwal amount");
    int withdraw=sc.nextInt();
    bankaccount.withdraw(withdraw);
    }
  else if(option==4){
    System.out.println("Thanks for Visiting");
    exit=true;
        }
      }
   }
   else{
    System.out.println("please enter a vaild pin number");
      }
    }
}
 class Bankaccount  {
    public double balance;
    public Bankaccount(double inititalBalance){
    this.balance=inititalBalance;
 }
    public  void getbalance(){
    System.out.println("your A/C balance is:"+balance);
 }  
    public void addBalance(int amount){
        if(amount>0){
     this.balance+=amount;
     System.out.println("Amount "+amount+" has been Credited Successfully");
     }
      else{
        System.out.println("enter amount greater than zero");
         }   
      }
      public void withdraw(int withdrawamount){
     if(balance>=withdrawamount){
        System.out.println("amount "+withdrawamount+" withdrawed successfully");
        this.balance-=withdrawamount;
           }
      else{
        System.out.println("Insufficient Funds in your A/C");
      }
    }
}