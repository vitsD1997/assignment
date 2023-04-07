import java.util.Scanner;
class ElectricityBill{
    private String customerName;
    private double unitsConsumed;
    private double billAmount;

  
    public void setConsumerName(String customerName)
    {
        this.customerName=customerName;
    }
    public void setUnitConsumed(double unitsConsumed)
    {
        this.unitsConsumed=unitsConsumed;
    }
    public String getConsumerName()
    {
        return this.customerName;
    }
    public double getUnitConsumed()
    {
        return this.unitsConsumed;
    }
     public double calculateBillAmount()
    {
        if(this.unitsConsumed<=100)
        {   
            this.billAmount=this.unitsConsumed*5;
            return (this.billAmount);
        }
        else if(this.unitsConsumed>100 && this.unitsConsumed<=200)
        {
          this.billAmount=this.unitsConsumed*7;
            return (this.billAmount) ; 
        }
        else
        {
            this.billAmount=this.unitsConsumed*10;
            return (this.billAmount) ; 
        }
        
    }

}
class ElectricityBillTester{
    static Scanner sc=new Scanner(System.in);
    ElectricityBill bill = new ElectricityBill();
    public void acceptRecord(){
        System.out.println("============Eletricity Bill==============");
        System.out.println("Enter the consumer name");
        bill.setConsumerName(sc.nextLine());
        System.out.println("Enter the unit consume");
        bill.setUnitConsumed(sc.nextDouble());
    }
    public void printRecord(){
      System.out.println("===========================================");
      System.out.println("Consumer Name :-"+bill.getConsumerName());
      System.out.println("Unit Consumed :-"+bill.getUnitConsumed());
      System.out.println("Bill Amount :-"+bill.calculateBillAmount());
      System.out.println("===========================================");
    } 
}

class Eletricity{
    public static void main(String [] args)
    {
        ElectricityBillTester ele=new ElectricityBillTester();
        ele.acceptRecord();
        ele.printRecord();
    }
}