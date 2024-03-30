public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    public String getHealthyExtra1Name() {
        return healthyExtra1Name;
    }

    public double getHealthyExtra1Price() {
        return healthyExtra1Price;
    }

    public String getHealthyExtra2Name() {
        return healthyExtra2Name;
    }

    public double getHealthyExtra2Price() {
        return healthyExtra2Price;
    }

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, String meat, double price, BreadRollType breadRollType) {
        super(name, meat, price, breadRollType);
    }
    public void addHealthyAddition1(String healthyExtra1Name,double healthyExtra1Price){
        this.healthyExtra1Name=healthyExtra1Name;
        this.healthyExtra1Price=healthyExtra1Price;
    }
    public void addHealthyAddition2(String healthyExtra2Name,double healthyExtra2Price){
        this.healthyExtra2Name=healthyExtra2Name;
        this.healthyExtra2Price=healthyExtra2Price;
    }
    @Override
    public double itemizeHamburger(){
    double totalPrice=getPrice()+healthyExtra1Price+healthyExtra2Price;
        String message= "Name: "+ getName()+"\n"+ "Meat: "+ getMeat()+"\n"+ "BreadRollType:"+ getBreadRollType()+"\n";
        if(getAddition1Name()!=null){
            message= message.concat( "Addition1: "+ getAddition1Name()+"\n");
        }
        if(getAddition2Name()!=null){
            message= message.concat( "Addition2: "+ getAddition2Name() +"\n");
        }
        if(getAddition3Name()!=null){
            message= message.concat( "Addition3: "+ getAddition3Name()+"\n");
        }
        if(getHealthyExtra1Name()!=null){
            message= message.concat( "HealthyAddition1: "+ getHealthyExtra1Name()+"\n");
        }
        if(getHealthyExtra2Name()!=null){
            message= message.concat( "HealthyAddition2: "+ getHealthyExtra2Name()+"\n");
        }
        message=message.concat("Price: "+ totalPrice);
        System.out.println(message );
        return totalPrice;


    }
}
