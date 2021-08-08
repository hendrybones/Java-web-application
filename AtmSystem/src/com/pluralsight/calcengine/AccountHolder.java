package com.pluralsight.calcengine;

public class AccountHolder implements Runnable{
    private Account account;

    public AccountHolder(Account account) {
        this.account = account;
    }


    @Override
    public void run() {
        for (int i=1;i<=4; i++){
            makeWithdrawal(2000);
            if (account.getBalance()<0){
                System.out.println("account is overdrawn");
            }
        }

    }

    private synchronized void makeWithdrawal(int makeWithAmount) {
        if (account.getBalance() >=makeWithAmount){
            System.out.println(Thread.currentThread().getName() + "is going to withdraw" + makeWithAmount);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.withdraw(makeWithAmount);
            System.out.println(Thread.currentThread().getName() + "complete withdrawal"+ makeWithAmount);
        }
        else {
            System.out.println("no enough in  the account" + Thread.currentThread().getName()+ "to withdraw"
            +account.getBalance());
        }

    }
}
