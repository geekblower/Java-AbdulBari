class Account {
    public String accNo;
    public String name;
    public String phNo;
    public String address;
    public String dob;
    public double balance;

    public String getAccNo() {return accNo;}
    public String getName() {return name;}
    public String getAddress() {return address;}
    public String getDob() {return dob;}
    public String getPhNo() {return phNo;}
    public double getBalance() {return balance;}

    public void setAccNo(String accNo) {this.accNo = accNo;}
    public void setName(String name) {this.name = name;}
    public void setAddress(String address) {this.address = address;}
    public void setDob(String dob) {this.dob = dob;}
    public void setPhNo(String phNo) {this.phNo = phNo;}
    public void setBalance(long balance) {this.balance = balance;}

    public void closeAccount() {
        this.accNo = "000-0000-000";
        this.name = "------ ------";
        this.address = "---- ---- ----";
        this.dob = "00-00-0000";
        this.phNo = "000-0000-000";
        this.balance = 0L;
    }
}

class SavingAccount extends Account {
    public double fixedBalance;

    public double getFixedBalance() {return fixedBalance;}
    public void setFixedBalance(double fixedBalance) {this.fixedBalance = fixedBalance;}

    public void deposit(double amount) {
        balance += amount;
    }

    public void withDraw(double amount) {
        balance -= amount;
    }

    public void fixedDeposit(double amount) {
        fixedBalance += amount;
    }

    public void liquidate(double amount) {
        fixedBalance -= amount;
    }   
}

class LoanAccount extends Account {
    public double loanBalance;

    public double getLoanBalance() {return loanBalance;}
    public void setLoanBalance(double loanBalance) {this.loanBalance = loanBalance;}

    public void payEMI(double amount) {
        loanBalance -= amount;
    }
    
    public void topUpLoan(double amount) {
        loanBalance += amount;
    }
    
    public void repayment() {
        loanBalance = 0;
    }
    
}

public class accountInheritance {
    public static void main(String[] args) {
        Account A = new Account();
        SavingAccount S = new SavingAccount();
        LoanAccount L = new LoanAccount();
    }
}
