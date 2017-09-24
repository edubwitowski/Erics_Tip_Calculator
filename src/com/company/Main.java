import java.util.Scanner;





class Tipcalc1
{



    public static void main(String[] args){
        System.out.println("Welcome to Tip Calculator! ");
        TipCalc2 Calculator = new TipCalc2();
        System.out.println("Please enter the bill amount: ");
        TipCalc2.calcBill();
        System.out.println("What percentage would you like to tip?: ");
        Calculator.percTip();

    }

}


class TipCalc2
{
    static double bill;
    double tip;
    double total;
    double share;
    double shareBill;
    double billPerPerson;

    static Scanner scan = new Scanner(System.in);

    public static void calcBill() {
        bill = scan.nextDouble(); }

    public void percTip() {
        tip = scan.nextDouble();
        if(tip<1.00)
        {
            total = bill + tip; }

        else total = bill + (bill*.10);
        System.out.println("Your total is: " + total);
        share();
    }


    public void share()
    {
        System.out.println("Would you like to share the bill? ");
        System.out.println("Enter 1 for YES or 0 for NO: ");

        share = scan.nextDouble();
        if(shareBill == 0)
        {
            System.out.println("Your total is: " + total);
            System.out.println("its reading line 61.");
            System.out.println("KEEP CHARGING");
            System.out.println("This is an extra line");


        }
        else System.out.println("Still Under Construction");
    }

}
