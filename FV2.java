class calc{
public double calculateFV(double princ,double rate,int years){
    double Famount = (princ*rate*years)/100;
    return Famount;
}}
public class FV2{
public static void main(String[] args){


    calc mycalc = new calc( );
    double result = mycalc.calculateFV(100000, 5,5);
    System.out.println("The SIR is: " +result);

}
}


