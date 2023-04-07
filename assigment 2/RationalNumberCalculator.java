import java.util.Scanner;

class RationalNumberCalculator {
  private double add;
  private double sub;
  private double mul;
  private double div;
  private double Nm1;
  private double Dm1;
  private double Nm2;
  private double Dm2;

  public void setNm1(double Nm1) {
    this.Nm1 = Nm1;
  }

  public void setDm1(double Dm1) {
    this.Dm1 = Dm1;
  }

  public void setNm2(double Nm2) {
    this.Nm2 = Nm2;
  }

  public void setDm2(double Dm2) {
    this.Dm2 = Dm2;
  }

  public void add() {
    System.out.println((Nm1 / Dm1) + (Nm2 / Dm2));
  }

  public void sub() {
    System.out.println((Nm1 / Dm1) - (Nm2 / Dm2));
  }

  public void mul() {
    System.out.println((Nm1 / Dm1) * (Nm2 / Dm2));
  }

  public void div() {
    System.out.println((Nm1 / Dm1) / (Nm2 / Dm2));
  }
}

class RationalNumberCalculatorTester {
  Scanner sc = new Scanner(System.in);
  RationalNumberCalculator cal = new RationalNumberCalculator();
  public void acceptRecord() {
    while (true) {
      System.out.println("Enter the first rational number :-");
      System.out.println("Numerator1 :- ");
      cal.setNm1(sc.nextDouble());
      System.out.println("Denominator1 :- ");
      cal.setDm1(sc.nextDouble());
      System.out.println("Enter the Second rational number :-");
      System.out.println("Numerator2 :- ");
      cal.setNm2(sc.nextDouble());
      System.out.println("Denominator2 :- ");
      cal.setDm2(sc.nextDouble());
      System.out.println("Enter Operation 1.add|2.sub|3.mul|4.div|5.exit");
      int choice=sc.nextInt();
      if(choice==5)
      {
        System.out.println("Exit Sucessfully...............");
        break;
      }
      switch (choice) {
        case 1:
          cal.add();
          break;
        case 2:
          cal.sub();
          break;
        case 3:
          cal.mul();
          break;
        case 4:
          cal.div();
          break;
      }
    }
  }
}
class rationalOperation{
    public static void main(String [] args)
    {
    RationalNumberCalculatorTester op=new RationalNumberCalculatorTester();
    op.acceptRecord();
    }
}