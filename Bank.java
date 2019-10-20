package sk.itsovy.jackanin.fragment;

public class Bank {
    private String name;

    //CONSTUCTOR
    public Bank(String name) {
        this.name = name;
    }

    public double convert(double amount, String code) {
        switch (code) {
            case "GBP":
                return amount * 0.86;
            case "HRK":
                return amount * 7.44;
            case "CHF":
                return amount * 1.10;
            case "HUF":
                return amount * 331.21;
            case "TRY":
                return amount * 6.47;
            default :
                return -1;
        }
    }

    public static double loan(double value, double interest, int months){
        if (value <=0 || interest <= 0 || months<=0)
            return -1;
        else{
            return (value+((value*interest)/100))/months;
        }
    }
}
