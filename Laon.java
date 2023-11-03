class account{
 public double laonacc(double princ, double rate, int years, int n){
    double Fv = princ*Math.pow(1+rate/n, n* years); 
    return Fv;
 }

 public class Loan{
public static void main(String[] args){

    account myaccount = new account();
    double result = myaccount.laonacc(500000,0.18,3,12);
    System.out.println("The amount to be paid is: " +result);
}
 }
}  