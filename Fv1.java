class LoanAc {
public double Loan(double princ,double  annualrate,int years, int coumpfr){
    double  monthlyrate = annualrate/(coumpfr);
    int totalcoumperiod = years* coumpfr;
    double amount = princ*Math.pow(1+monthlyrate,totalcoumperiod);
    return amount;
}
    public class Fv1{
        public static void main(String[] args){
            int year = 3;
            LoanAc  myLoanAc = new LoanAc();
        double result = myLoanAc.Loan( 500000,18.0,3,12);
        System.out.println("The amount paid after" + year +"Years with compound interest"+ result +"Frw" );
        }

    }
}
