//generator and caculator method not create private how to create
import java.util.Scanner;
class TollBoothBillGenerator{
    private String vehicleType;
    private int numAxles;
    private double distanceTraveled;
    private double tollFee;
    private double totalAmountDue;
    

    public void setVehicleType(String vehicleType )
    {
        this.vehicleType=vehicleType;
    }
    public String getVechicleType()
    {
        return this.vehicleType;
    }

    public void setNumAxles(int numAxles )
    {
          this.numAxles=numAxles;   
    }
     public int getNumAxles( )
    {
          return this.numAxles;   
    }

    public void setDistanceTraveled(double distanceTraveled )
    {
        this.distanceTraveled=distanceTraveled;
    }
    
    public double getDistanceTraveled( )
    {
        return this.distanceTraveled;
    }
  public  void Calculatetollfee (){
    if(vehicleType.equals("car") || vehicleType.equals("van") || vehicleType.equals("bus"))
    {
        tollFee=0.25*distanceTraveled*numAxles;
    }
    else
    {
        tollFee=0.5*distanceTraveled*numAxles;
    }
  }
 public void generateBill()
 {
    this.totalAmountDue=this.tollFee+2;
    System.out.println("========================================================");
    System.out.println("Vehicle Type is :-"+ vehicleType);
    System.out.println("Number of Axels is :-"+numAxles);
    System.out.println("Distance trvalled in miles :-"+distanceTraveled);
    System.out.println("Toll fee :-"+this.tollFee+"$");
    System.out.println("total amount due :-"+this.totalAmountDue+"$");
    System.out.println("========================================================");
 }
}
class TesterTollBoothBillGenerator{
    Scanner sc=new Scanner(System.in);
    TollBoothBillGenerator bill=new TollBoothBillGenerator();
    public void acceptRecord(){
        while(true)
        {
            System.out.println("1.Enter vehicle type (car, van, bus, or truck) ");
            System.out.println("2.Enter number of axles ");
            System.out.println("3.Enter distance travelled ");
            System.out.println("4.Calculate Toll Fee ");
            System.out.println("5.Generate Bill ");
            System.out.println("6.Exit ");
            int choice=sc.nextInt();
            if(choice==6)
            {
                System.out.println("Exsisting Sucessfully in Toll........... ");
                break;
            }
    switch(choice)
    {
        case 1:
        sc.nextLine();
        System.out.println("Enter vechicle");
        bill.setVehicleType(sc.nextLine());
        break;
        case 2:
        System.out.println("number axles");
        bill.setNumAxles(sc.nextInt());
        break;
        case 3:
        System.out.println("distance in miles");
        bill.setDistanceTraveled(sc.nextDouble());
        break;
        case 4:
        System.out.println("calculate Toll fee");
        bill.Calculatetollfee();
        break;
        case 5:
        bill.generateBill();
        break;
       }
    }
    }
}

class Toll{
    public static void main(String [] args)
    {
        TesterTollBoothBillGenerator Bill=new TesterTollBoothBillGenerator();
        Bill.acceptRecord();


    }
}  