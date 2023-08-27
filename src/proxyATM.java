public class proxyATM implements ATM{

    RealATM realATM = new RealATM();
    @Override
    public String withdraw(CreditCard C) {
        if(C.getDaysTillExpiry()>0)
        {
            return realATM.withdraw(C);
        }
        else {
            return "Your credit card isn't valid due to passage of expiry date, credit card has been withdrawn!";
        }
    }

    @Override
    public String deposit(CreditCard C) {
        if(C.getDaysTillExpiry()>0)
        {
            return realATM.deposit(C);
        }
        else {
            return "Your credit card isn't valid due to passage of expiry date, credit card has been withdrawn!";
        }
    }

    @Override
    public String checkBalance(CreditCard C) {
        if(C.getDaysTillExpiry()>0)
        {
            return realATM.checkBalance(C);
        }
        else {
            return "Your credit card isn't valid due to passage of expiry date, credit card has been withdrawn!";
        }
    }
}
