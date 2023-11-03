class CalcuFv{
    public double Calc(double Pv,double rate,int years){
        double Futurev =( Pv*rate*years)/100;
        return Futurev;
    }
}
public class fv{
    public static void main(String[] args){
        CalcuFv myCalcuFv = new CalcuFv();
        double result = myCalcuFv.Calc(100000,5,5);
        System.out.println("The result is : " + result);
    }
}

