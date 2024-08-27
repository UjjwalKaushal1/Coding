import java.util.Scanner;

class Account {
    int number;
    String account_type;
    String service_branch;
    float minimum_balance;
    float available_balance;
    int customer_id;
    String customer_name;
    public static int total_accounts = 0;

    Account() {
        this.number = 0;
        this.account_type = null;
        this.service_branch = null;
        this.minimum_balance = 0;
        this.available_balance = 0;
        this.customer_id = 0;
        this.customer_name = null;
    }

    void Set_details(int number, String account_type, String service_branch, float minimum_balance, float available_balance, int customer_id, String customer_name) {
        this.number = number;
        this.account_type = account_type;
        this.service_branch = service_branch;
        this.minimum_balance = minimum_balance;
        this.available_balance = available_balance;
        this.customer_id = customer_id;
        this.customer_name = customer_name;
    }

    void Get_details() {
        System.out.println("Account Number: " + this.number);
        System.out.println("Account Type: " + this.account_type);
        System.out.println("Service Branch: " + this.service_branch);
        System.out.println("Minimum Balance: " + this.minimum_balance);
        System.out.println("Available Balance: " + this.available_balance);
        System.out.println("Customer ID: " + this.customer_id);
        System.out.println("Customer Name: " + this.customer_name);
    }

    void Get_Balance() {
        System.out.println("Available Balance: " + this.available_balance);
    }

    void deposit(float amount) {
        this.available_balance += amount;
    }

    void updateDetails(float minimumBalance, int customerID, String customerName, String accountType) {
        if (minimumBalance != -1) {
            this.minimum_balance = minimumBalance;
        }
        if (customerID != -1) {
            this.customer_id = customerID;
        }
        if (!customerName.isEmpty()) {
            this.customer_name = customerName;
        }
        if (!accountType.isEmpty()) {
            this.account_type = accountType;
        }
    }

    void withdraw(float amount) {
        if (this.available_balance >= amount) {
            this.available_balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public static int total() {
        return Account.total_accounts;
    }

    static void Compare(Account n1, Account n2) {
        if (n1.available_balance >= n2.available_balance) {
            n1.Get_details();
        } else {
            n2.Get_details();
        }
    }
}

public class Banking_System {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Account[] account_array = new Account[15];

        int x = 0;
        boolean istrue = true;
        while (istrue) {
            System.out.println("Enter 1 for create account: ");
            System.out.println("Enter 2 for Get Details: ");
            System.out.println("Enter 3 for updating details: ");
            System.out.println("Enter 4 for deposit: ");
            System.out.println("Enter 5 for withdraw: ");
            System.out.println("Enter 6 for total accounts: ");
            System.out.println("Enter 7 for comparing 2 balances: ");
            System.out.println("Enter 8 for Exiting: ");

            int n = s.nextInt();
            s.nextLine();

            switch (n) {
                case 1:
                    if (x >= account_array.length) {
                        System.out.println("Account limit reached.");
                        break;
                    }
                    System.out.println("Enter account number: ");
                    int account_number = s.nextInt();
                    s.nextLine();
                    System.out.println("Enter account type: ");
                    String account_type = s.nextLine();
                    System.out.println("Enter service branch: ");
                    String service_branch = s.nextLine();
                    System.out.println("Enter minimum balance: ");
                    float minimum_balance = s.nextFloat();
                    s.nextLine();
                    System.out.println("Enter Balance: ");
                    float available_balance = s.nextFloat();
                    s.nextLine();
                    System.out.println("Enter customer id: ");
                    int customer_id = s.nextInt();
                    s.nextLine();
                    System.out.println("Enter customer name: ");
                    String customer_name = s.nextLine();

                    account_array[x] = new Account();
                    account_array[x].Set_details(account_number, account_type, service_branch, minimum_balance, available_balance, customer_id, customer_name);
                    Account.total_accounts++;
                    x++;
                    break;

                case 2:
                    System.out.println("Enter account number: ");
                    int num = s.nextInt();
                    s.nextLine();
                    boolean found = false;
                    for (Account account : account_array) {
                        if (account != null && account.number == num) {
                            account.Get_details();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    boolean isvalid = true;
                    while (isvalid) {
                        System.out.println("Enter 1 to Update Name: ");
                        System.out.println("Enter 2 to Update Account Type: ");
                        System.out.println("Enter 3 to Update Id: ");
                        System.out.println("Enter 4 to Update Minimum Balance: ");
                        System.out.println("Enter 5 to Exit");
                        int number = s.nextInt();
                        s.nextLine();

                        switch (number) {
                            case 1:
                                System.out.print("Account Number: ");
                                int accountNumber1 = s.nextInt();
                                s.nextLine();
                                System.out.print("New Name: ");
                                String name = s.nextLine();
                                for (Account account : account_array) {
                                    if (account != null && account.number == accountNumber1) {
                                        account.updateDetails(-1, -1, name, "");
                                        break;
                                    }
                                }
                                break;

                            case 2:
                                System.out.print("Account Number: ");
                                int accountNumber2 = s.nextInt();
                                s.nextLine();
                                System.out.print("Account Type: ");
                                String accountType = s.nextLine();
                                for (Account account : account_array) {
                                    if (account != null && account.number == accountNumber2) {
                                        account.updateDetails(-1, -1, "", accountType);
                                        break;
                                    }
                                }
                                break;

                            case 3:
                                System.out.print("Account Number: ");
                                int accountNumber3 = s.nextInt();
                                s.nextLine();
                                System.out.print("New Id: ");
                                int id = s.nextInt();
                                s.nextLine();
                                for (Account account : account_array) {
                                    if (account != null && account.number == accountNumber3) {
                                        account.updateDetails(-1, id, "", "");
                                        break;
                                    }
                                }
                                break;

                            case 4:
                                System.out.print("Account Number: ");
                                int accountNumber4 = s.nextInt();
                                s.nextLine();
                                System.out.print("New Minimum Balance: ");
                                float minimumBalance = s.nextFloat();
                                s.nextLine();
                                for (Account account : account_array) {
                                    if (account != null && account.number == accountNumber4) {
                                        account.updateDetails(minimumBalance, -1, "", "");
                                        break;
                                    }
                                }
                                break;

                            case 5:
                                isvalid = false;
                                break;

                            default:
                                System.out.println("Invalid choice. Try again.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Enter the account number: ");
                    int numm = s.nextInt();
                    s.nextLine();
                    System.out.println("Enter the amount you want to deposit:  ");
                    float depositt = s.nextFloat();
                    s.nextLine();
                    for (Account account : account_array) {
                        if (account != null && account.number == numm) {
                            account.deposit(depositt);
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("Enter the account number: ");
                    int nummm = s.nextInt();
                    s.nextLine();
                    System.out.println("Enter the amount to withdraw: ");
                    float withdraww = s.nextFloat();
                    s.nextLine();
                    for (Account account : account_array) {
                        if (account != null && account.number == nummm) {
                            account.withdraw(withdraww);
                            break;
                        }
                    }
                    break;

                case 6:
                    int totalAccounts = Account.total();
                    System.out.println("The total number of accounts is: " + totalAccounts);
                    break;

                case 7:
                    System.out.println("Enter account number 1: ");
                    int n1 = s.nextInt();
                    s.nextLine();
                    System.out.println("Enter account number 2: ");
                    int n2 = s.nextInt();
                    s.nextLine();

                    Account b1 = null;
                    Account b2 = null;

                    for (Account account : account_array) {
                        if (account != null && account.number == n1) {
                            b1 = account;
                        }
                        if (account != null && account.number == n2) {
                            b2 = account;
                        }
                    }

                    if (b1 != null && b2 != null) {
                        Account.Compare(b1, b2);
                    } else {
                        System.out.println("One or both accounts not found.");
                    }
                    break;

                case 8:
                    istrue = false;
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        s.close();
    }
}
