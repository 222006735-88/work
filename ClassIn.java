class Employee{
    float salary= 40000;
}
class programmer extends Employee{
    int bonous = 10000;
    public static void main(String args[]){
        programmer p = new programmer();
        System.out.println("The orogrammeer salary is:" +p. salary);
        System.out.println("The programmer bonous is: "+ p.bonous);

    }

}