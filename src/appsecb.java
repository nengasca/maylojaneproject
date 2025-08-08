import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class appsecb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<banking.bankingClass> bankAccounts = new ArrayList<>(); 
        boolean continueProgram = false;

        do {
            System.out.println("WELCOME TO MY SYSTEM");
            System.out.println("What do you feel like doing today?");
            System.out.println("1. Banking");
            System.out.println("2. Doctors Appointment");
            System.out.println("3. Shopping");

            System.out.print("Enter your choice: ");
            int choice = 0;
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
                continue;
            }
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("1. Create Account");
                    System.out.println("2. Login Account");
                    System.out.println("3. View all accounts"); 
                    System.out.print("Enter your selection: ");

                    int action = 0;
                    if (sc.hasNextInt()) {
                        action = sc.nextInt();
                    } else {
                        System.out.println("Invalid input. Please enter a number.");
                        sc.next();
                        break;
                    }
                    sc.nextLine();

                    switch (action) {
                        case 1:
                            System.out.print("Enter Account No.: ");
                            int accountNo = sc.nextInt();
                            System.out.print("Enter Pin No.: ");
                            int pin = sc.nextInt();
                            System.out.print("Enter Pin Again: ");
                            int pinAgain = sc.nextInt();
                            sc.nextLine();

                            if (pin == pinAgain) {
                                banking.bankingClass newAccount = new banking.bankingClass(accountNo, pin);
                                bankAccounts.add(newAccount);
                                System.out.println("Account Created Successfully!");
                            } else {
                                System.out.println("Pins do not match. Account creation failed.");
                            }
                            break;
                            
                          case 2:
                            int accountAttempts = 3;
                            while (accountAttempts > 0) {
                                System.out.print("Enter Account No.: ");
                                int loginAccountNo = sc.nextInt();
                                sc.nextLine();

                                banking.bankingClass loggedInAccount = null;
                                for (banking.bankingClass account : bankAccounts) {
                                    if (account.getAccNo() != loginAccountNo) {
                                        
                                    } else {
                                        loggedInAccount = account;
                                        break;
                                    }
                                }

                                if (loggedInAccount != null) {
                                    System.out.println("Account Found!");
                                    int pinAttempts = 3;
                                    while (pinAttempts > 0) {
                                        System.out.print("Enter Pin: ");
                                        int loginPin = sc.nextInt();
                                        sc.nextLine();

                                        if (loggedInAccount.verifyAccount(loginAccountNo, loginPin)) {
                                            System.out.println("Login Success!");

                                            // Banking options
                                            System.out.println("1. Deposit");
                                            System.out.println("2. Withdraw");
                                            System.out.println("3. Check Balance");
                                            System.out.print("Enter your choice: ");

                                            int option = 0;
                                            if (sc.hasNextInt()) {
                                                option = sc.nextInt();
                                            } else {
                                                System.out.println("Invalid input. Please enter a number.");
                                                sc.next();
                                                break;
                                            }
                                            sc.nextLine();

                                            switch (option) {
                                                case 1:
                                                    System.out.print("Enter amount to deposit: ");
                                                    double depositAmount = sc.nextDouble();
                                                    sc.nextLine();
                                                    loggedInAccount.deposit(depositAmount);
                                                    break;
                                                case 2:
                                                    System.out.print("Enter amount to withdraw: ");
                                                    double withdrawAmount = sc.nextDouble();
                                                    sc.nextLine();
                                                    loggedInAccount.withdraw(withdrawAmount);
                                                    break;
                                                case 3:
                                                    System.out.println("Your current balance is: " + loggedInAccount.getBalance());
                                                    break;
                                                default:
                                                    System.out.println("INVALID OPTION");
                                                    break;
                                            }
                                            accountAttempts = 0; 
                                            pinAttempts = 0;
                                        } else {
                                            pinAttempts--;
                                            System.out.println("Invalid Pin. " + pinAttempts + " attempts left.");
                                        }

                                        if (pinAttempts == 0) {
                                            System.out.println("Too many failed PIN attempts. Account locked.");
                                        }
                                    }
                                } else {
                                    accountAttempts--;
                                    System.out.println("Invalid Account No. " + accountAttempts + " attempts left.");
                                }

                                if (accountAttempts == 0) {
                                    System.out.println("Too many failed account number attempts. Account locked.");
                                }
                            }
                            break;

                        case 3: 
                            System.out.println("--- All Bank Accounts ---");
                            if (bankAccounts.isEmpty()) {
                                System.out.println("No accounts have been created yet.");
                            } else {
                                for (banking.bankingClass account : bankAccounts) {
                                    System.out.println("Account Number: " + account.getAccNo());
                                }
                            }
                            break;

                        default:
                            System.out.println("INVALID SELECTION");
                            break;
                    }
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                default:
                    System.out.println("INVALID SELECTION");
                    break;
            }

            System.out.print("Do you want to continue? (Y/N): ");
            String continueChoice = sc.next();
            sc.nextLine();
            continueProgram = continueChoice.equalsIgnoreCase("Y");
        } while (continueProgram);

        System.out.println("Thank you for using the system. Goodbye!");
        sc.close();
    }
}

