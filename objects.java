class adder {
    public int add(int num1, int num2){
        return num1 + num2;
    }

public class objects{
    public static void main(String[] args){
        adder myadder = new adder();
        int result = myadder.add(3, 7);
        System.out.println("Result:" + result);
        }
    }
}
