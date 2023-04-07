import java.util.Scanner;

class BankAccount {
  Scanner sc = new Scanner(System.in);
  private String accountHoldersName;
  private int accountNumber;
  private double accountBalance;

  public void setAccountHolderName(String accountHoldersName) {
    this.accountHoldersName = accountHoldersName;
  }

  public String getAccountHolderName() {
    return this.accountHoldersName;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public int getAccountNumber() {
    return this.accountNumber;
  }

  public void setAccountBalance(double accountBalance) {
    this.accountBalance = accountBalance;
  }

  public double getAccountBalance() {
    return this.accountBalance;
  }

  public void depositAmount(int accNumber) {
    if (this.accountNumber == accNumber) {
      System.out.println("Enter the Deposit Ammount");
      double depositAmount = sc.nextDouble();
      this.accountBalance += depositAmount;
    } else {
      System.out.println("Invalid Account Number");
    }
  }

  public void withDrawAmount(int accNumber) {
    if (this.accountNumber == accNumber) {
      System.out.println("Enter the withdraw Ammount");
      double withDrawAmount = sc.nextDouble();
      if (accountBalance >= withDrawAmount) {
        this.accountBalance -= withDrawAmount;
      } else {
        System.out.println("your accountbalnce not sufficient");
      }
    } else {
      System.out.println("Invalid Account Number");
    }
  }

  public void displayBalance(int accNumber1) {
    if (this.accountNumber == accNumber1) {
      System.out.println("Your account Balance :- " + this.accountBalance);
    } else {
      System.out.println("Invalid Account Number");
    }
  }
}

class BankAccountTester {
  BankAccount bnk = new BankAccount();
  Scanner sc = new Scanner(System.in);

  public void acceptRecord() {
    System.out.println(
      "=====================WELCOME CDAC BANK======================"
    );
    System.out.println(
      "Enter the name of Account Holder and press two Enter :-"
    );
    bnk.setAccountHolderName(sc.nextLine());
    sc.nextLine();
    System.out.println("Enter the Account Number");
    bnk.setAccountNumber(sc.nextInt());
    System.out.println(
      "============================================================"
    );
  }

  public void printRecord() {
    System.out.println(
      "=====================WELCOME CDAC BANK======================"
    );
    System.out.println("Account Holder Name :- " + bnk.getAccountHolderName());
    System.out.println("Account Holder Name :- " + bnk.getAccountNumber());
    System.out.println(
      "Your account curent balance  :- " + bnk.getAccountBalance()
    );
    System.out.println(
      "============================================================"
    );
  }

  public void depositAmount() {
    System.out.println(
      "=====================WELCOME CDAC BANK======================"
    );
    System.out.println("Enter the Account Number");
    bnk.depositAmount(sc.nextInt());
    System.out.println(
      "============================================================"
    );
  }

  public void withDrawAmount() {
    System.out.println(
      "=====================WELCOME CDAC BANK======================"
    );
    System.out.println("Enter the Account Number");
    bnk.withDrawAmount(sc.nextInt());
    System.out.println(
      "============================================================"
    );
  }

  public void displayBalance() {
    System.out.println(
      "=====================WELCOME CDAC BANK======================"
    );
    System.out.println("Enter the Account Number");
    bnk.displayBalance(sc.nextInt());
    System.out.println(
      "============================================================"
    );
  }
}

class BankProcess {
  Scanner sc = new Scanner(System.in);
  BankAccountTester bnkop = new BankAccountTester();

  public void bankProcess() {
    while (true) {
      System.out.println("Welcome to CDAC BANK");
      System.out.println("Select Option :-");
      System.out.println("1. Create a new account");
      System.out.println("2. Deposit money");
      System.out.println("3. Withdraw money");
      System.out.println("4. Display account balance");
      System.out.println("5. Display account holder's information");
      System.out.println("6. Exit");
      int choice = sc.nextInt();
      if (choice == 6) {
        System.out.println("Exsiting for Cdac bank sucessfully............");
        break;
      }
      switch (choice) {
        case 1:
          bnkop.acceptRecord();
          break;
        case 2:
          bnkop.depositAmount();
          break;
        case 3:
          bnkop.withDrawAmount();
        case 4:
          bnkop.displayBalance();
          break;
        case 5:
          bnkop.printRecord();
          break;
      }
    }
  }
}

class BankOperation {

  public static void main(String[] args) {
    BankProcess op = new BankProcess();
    op.bankProcess();
  }
}
