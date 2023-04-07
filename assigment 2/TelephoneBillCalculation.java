import java.util.Scanner;
class TelePhoneBillCalculation{
    private String customerName;
    private String phoneNumber;
    private double NumberOfCallmade;
    private double DaurtionOfCall;
    private double billAmount=0;

   public void setCustomerName(String customerName)
   {
    this.customerName=customerName;
   }
    public String getCustomerName()
   {
     return this.customerName;
   }


   public void setPhoneNumber(String phoneNumber)
   {
    if(phoneNumber.length()==10)
    this.phoneNumber=phoneNumber;
    else
    System.out.println("Invalid Number");
   } 
   public String getPhoneNumber()
   {
    return this.phoneNumber;
   }

    public void setNumberOfCallMade(double NumberOfCallmade)
   {
    this.NumberOfCallmade=NumberOfCallmade;
   }
    public double getNumberOfCallMade()
   {
    return this.NumberOfCallmade;
   }
   public void calBill()
   {
  
    double callBeyond=this.NumberOfCallmade-100;
    if(callBeyond>0)
    {
        billAmount+=callBeyond*0.25;

    }
    double callhun=this.NumberOfCallmade-callBeyond;
    if(callhun>=1 && callhun<=100)
    {
        billAmount+=callhun*0.5;
    }

    System.out.println("Total charge is "+billAmount);
    System.out.println("Total charge with flat rate 10$ :-"+(billAmount+10));
    
   }


    public void setDaurtionOfCall(double DaurtionOfCall)
   {
    this.DaurtionOfCall=DaurtionOfCall;
   }
    public double getDaurtionOfCall()
   {
    return this.DaurtionOfCall;
   }




}
class TelePhoneBillCalculationTester{
   static Scanner sc =new Scanner(System.in);
   TelePhoneBillCalculation tel=new TelePhoneBillCalculation();
   public void acceptRecord()
   {
    System.out.println("=====================TelePhone Bill Calculation=======================");
    System.out.println("Enter the customer name");
    tel.setCustomerName(sc.nextLine());
    System.out.println("Enter the customer phone number");
    tel.setPhoneNumber(sc.nextLine());
    System.out.println("Enter the Number of call made");
    tel.setNumberOfCallMade(sc.nextDouble());
    System.out.println("Enter the Dauration of call in minute");
    tel.setDaurtionOfCall(sc.nextDouble());
   }

   public void printRecord(){
    System.out.println("=======================================================================");
    System.out.println("Customer Name is :- "+ tel.getCustomerName());
    System.out.println("Customer Phone Number :- "+ tel.getPhoneNumber());
    System.out.println("Customer Number of call made :- "+ tel.getNumberOfCallMade());
    System.out.println("Customer call duration in Minute :- "+tel.getDaurtionOfCall());
    tel.calBill();
    System.out.println("=======================================================================");
   }
}

class TelePhoneBill{
    public static void main(String [] args){
    TelePhoneBillCalculationTester telBill=new TelePhoneBillCalculationTester();
    telBill.acceptRecord();
    telBill.printRecord();
    }
}