package vending_machine;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vending_Machine {
    public static Scanner sc = new Scanner(System.in);
    public static int choice, qty;
     public static double total=0, balance=0, change=0, subTotal, money;
     public static String option, product, itemCode, accessMenu;
   
     public static void main(String[] args) {
     //Displays the welcome message and asks user to enter menu code
    System.out.println("---\tHELLO CUSTOMER\t---");
    System.out.println("                                  ");
    System.out.println("---\tWELCOME TO 5 GUYS VENDING MACHINE\t---");
    System.out.println("                                  ");
    
    do{
      System.out.print("Enter code to access menu:");
    accessMenu = sc.next().toUpperCase(); 
    } while(!accessMenu.equals("ABC5"));
         System.out.println("                                                ");
         
      //Displays items and their codes
    System.out.println("--------------------------------------------------------");
    System.out.println("                              ");
    System.out.println("---Drinks---");
    System.out.println("A01.\tJuice\tN$ 12.50");
    System.out.println("A02.\tPepsi\tN$ 10.00");
    System.out.println("A03.\tSprite\tN$ 15.00");
    System.out.println("A04.\tWater\tN$ 10.00");
    System.out.println("A05.\tCoke\tN$ 15.00");
    System.out.println("X.\tExit");
    System.out.println("                                                   ");
    System.out.println("--------------------------------------------------------");
    
    System.out.println("                                                        ");
    System.out.println("---Chips---");
    System.out.println("B01.\tSimba\tN$ 13.50");
    System.out.println("B02\tDoritos\tN$ 16.50");
    System.out.println("B03.\tNiknaks\tN$ 10.50");
    System.out.println("B04.\tLays\tN$ 7.20");
    System.out.println("B05.\tCheetos\tN$ 5.10");
    System.out.println("X.\tExit");
    System.out.println("                                                   ");
    System.out.println("--------------------------------------------------------");
    
    System.out.println("                                                        ");
    System.out.println("---Chocolates---");
    System.out.println("C01.\tBar One \tN$ 12.00");
    System.out.println("C02.\tMars Bar\tN$ 15.00");
    System.out.println("C03.\tCadbury Slab\tN$ 20.00");
    System.out.println("C04.\tSnickers\tN$ 25.00");
    System.out.println("C05.\tLunch Bar\tN$ 25.50");
    System.out.println("X.\tExit!"); 
     System.out.println("                                                       ");
     product();
     payment();
     DisbursementOfChange();
    }
   

//product method 
   public static void product(){
       int Juice = 23;
       --Juice;
       // Displays message for user to enter an item code.
       System.out.println("-----------------------------------------------------");
       System.out.println("                                                     ");
       do{
           System.out.print(" ENTER THE CODE OF THE PRODUCT YOU WANT TO BUY: ");
       product = sc.next().toUpperCase();
       System.out.println("                                                    ");
       
            switch(product){
          case "A01":
              if(Juice>25){
               balance = 12.50;
              subTotal = (balance * qty);
              System.out.println("Juice N$ "+balance);
              break;   
              } else if(Juice<25){
                  System.out.println("ITEM OUT OF ORDER");
                  break;
              }
          case "A02":
              balance = 10.00;
              System.out.println("Pepsi N$"+balance);
              break;
          case "A03":
              balance = 15.00;
              System.out.println("Sprite N$"+balance);
              break;
          case "A04":
              balance = 10.00;
              System.out.println("Water N$"+balance);
              break;
          case "A05":
              balance =15.00;
              System.out.println("Coke N$"+balance);
              break;
              
          case "B01":
              balance = 13.50;
              System.out.println("Simba N$ "+balance);
              break;
          case "B02":
              balance = 16.50;
              System.out.println("Doritos N$"+balance);
              break;
          case "B03":
              balance = 10.50;
              System.out.println("Nik Naks N$"+balance);
              break;
          case "B04":
              balance = 7.20;
              System.out.println("Lays N$"+balance);
              break;
          case "B05":
              balance =5.10;
              System.out.println("Cheetos N$"+balance);
              break;
                   
        
          case "C01":
              balance = 12.00;
              System.out.println("Bar One N$ "+balance);
              break;
          case "C02":
              balance = 15.00;
              System.out.println("Mars Bar N$"+balance);
              break;
          case "C03":
              balance = 20.00;
              System.out.println("Cadbury N$"+balance);
              break;
          case "C04":
              balance = 25.00;
              System.out.println("Snickers N$"+balance);
              break;
          case "C05":
              balance =25.50;
              System.out.println("Lunch Bar N$"+balance);
              break;    
              
          default:
              System.out.print("INVALID CODE ENTERED.");
              break;
      }  
   }while(!product.equals("A01")&& (!product.equals("A02")) && (!product.equals("A03")) &&(!product.equals("A04")) &&(!product.equals("A05"))&&
    (!product.equals("B01")) &&(!product.equals("B02"))&&(!product.equals("B03"))&&(!product.equals("B04")) &&(!product.equals("B05"))&&
    (!product.equals("C01"))&&(!product.equals("C02"))&&(!product.equals("C03"))&&(!product.equals("C04")) && (!product.equals("C05")));
    }
   
   //Payment method
   public static void payment(){
    System.out.println("                              ");
    System.out.println("--------------------------------------------------------");
    System.out.println("                              ");
        do {
            System.out.println("INSERT PAYMENT METHOD: ");
            System.out.println("1.\tBILLS");
            System.out.println("2.\tCOINS");
            System.out.println("0.\tEXIT");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    System.out.println("INSERT NOTES: ");
                    System.out.println("Amounts allowed!! ");
                    System.out.println("N$\t100");
                    System.out.println("N$\t50");
                    System.out.println("N$\t20");
                    System.out.println("N$\t10");
                    System.out.print("INSERT NOTES: N$");
                    money = sc.nextDouble();
                    if (money>=balance) {
                        if (money>balance) {
                            change = money - balance;
                            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                            Date date = new Date();
                            System.out.println("                                                     ");
                            System.out.println("-----------------------------------------------------");
                            System.out.println("                                                     ");
                            System.out.println("HERE IS YOUR RECEIPT, HAVE A GOOD DAY SIR/MADAM!!");
                            System.out.println("*****************************************************");
                            System.out.println("ITEM:\t "+product);
                            System.out.println("                              ");
                            System.out.println("PRICE:\tN$ "+balance);
                            System.out.println("                              ");
                            System.out.println("                              ");
                            System.out.println("YOUR CHANGE IS:\tN$ "+change);
                            System.out.println("                               ");
                            System.out.println("-----\tTHANK YOU FOR PURCHASING AT 5 GUYS VENDING MACHINE\t-----");
                            System.out.println(formatter.format(date));
                            break;
                        }
                    }
                case 2:
                    System.out.println("INSERT COINS: ");
                    System.out.println("Amounts allowed!! ");
                    System.out.println("N$\t10");
                    System.out.println("N$\t5");
                    System.out.print("INSERT COINS: N$");
                    money = sc.nextDouble();
                    if (money>=balance) {
                        change=money - balance;
                        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        Date date = new Date();
                        System.out.println("                                                     ");
                        System.out.println("-----------------------------------------------------");
                        System.out.println("                                                     ");
                        System.out.println("HERE IS YOUR RECEIPT, HAVE A GOOD DAY SIR/MADAM!!");
                        System.out.println("*****************************************************");
                        System.out.println("ITEM:\t "+product);
                        System.out.println("                              ");
                        System.out.println("PRICE:\tN$ "+balance);
                        System.out.println("                              ");
                        System.out.println("YOUR CHANGE IS:\tN$ "+change);
                        System.out.println("                               ");
                        System.out.println("-----\tTHANK YOU FOR PURCHASING AT 5 FIVE GUYS VENDING MACHINE\t-----");
                        System.out.println(formatter.format(date));
                        break;
                    } else if(money<balance){
                        System.out.println("NOT ENOUGH MONEY INSERTED. TRY AGAIN!!!");
                    }
                default: 
                    System.out.println("INVALID CHOICE!!");
                    break;
            }
        } while (choice!=1 && choice!=2 && choice!=0);
        }
   
   
   public static void DisbursementOfChange(){
        System.out.println("                                                    ");
        System.out.println("----------------------------------------------------------------");
        System.out.println("                                                    ");
        System.out.print("Disbursed as follows: ");
        
       int hundred = (int)(change/100);
       change = change%100;
        System.out.print(hundred+" x N$100 ");
       
       int fifty = (int)(change/50);
       change = change%50;
       System.out.print(fifty+" x N$50 ");
       
      int twenty = (int)(change/20);
       change = change%20;
       System.out.print(twenty+" x N$20 ");
       
      int ten = (int)(change/10);
       change = change%10;
       System.out.print(ten+" x N$10 ");
       
       int five =(int)(change/5);
       change = change%5;
       System.out.println(five+" x N$5 ");
       
      int one =(int)(change/1);
       change = change%1;
       System.out.print(one+" x N$1 ");

        int fiftyCent =(int)(change/0.5);
       change = change%0.5;
       System.out.print(fiftyCent+" x 50c ");

         int tenCent = (int)(change/0.1);
       change = change%0.1;
       System.out.print(tenCent+" x 10c ");
       
         int fiveCent = (int)(change/0.05);
       change = change%0.05;
       System.out.println(fiveCent+" x 5c ");
   }
    } 

