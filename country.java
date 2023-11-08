class country {
    String name = "Country";
    public void countryname()
   {System.out.println("Rwanda");}}
   
   class Province extends country{
    String  provinceN = "30 provinces";
    public void provincen(){
        System.out.println("The number is 30 provinces");

    }}
   class District extends Province{
    String DistrictN = "30 districts";
    public void Districtn(){
        System.out.println("The number of districs is 30");
    }}

   class Community extends District{
    String PopulationN = "13 Millions";
    public void Populationn(){
        System.out.println("The total pupulation is 13M");
    }}
    //interface community implements province{
        class main{
            public static void main(String[]args){
                Community obj = new Community();
                obj.countryname();
                obj.provincen();
                obj.Districtn();
                obj.Populationn();
                
            }
        }
    
    

