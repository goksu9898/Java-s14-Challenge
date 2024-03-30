public class Hamburger {
    private String name;
    private String meat;

    private double price;
    private BreadRollType breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public BreadRollType getBreadRollType() {
        return breadRollType;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, BreadRollType breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;

    }
    public void addHamburgerAddition1(String name, double price){
        this.addition1Name=name;
        this.addition1Price=price;
        this.price+=price;
    }
    public void addHamburgerAddition2(String name, double price){
        this.addition2Name=name;
        this.addition2Price=price;
        this.price+=price;
    }
    public void addHamburgerAddition3(String name, double price){
        this.addition3Name=name;
        this.addition3Price=price;
        this.price+=price;
    }
    public void addHamburgerAddition4(String name, double price){
        this.addition4Name=name;
        this.addition4Price=price;
        this.price+=price;
    }
    public double itemizeHamburger(){
        String message= "Name: "+ name+"\n"+ "Meat: "+ meat+"\n"+ "BreadRollType:"+ breadRollType+"\n";
       if(addition1Name!=null){
        message= message.concat( "Addition1: "+ addition1Name+"\n");
       }
       if(addition2Name!=null){
           message= message.concat( "Addition2: "+ addition2Name+"\n");
       }
        if(addition3Name!=null){
            message= message.concat( "Addition3: "+ addition3Name+"\n");
        }
        message=message.concat("Price: "+ price);
        System.out.println(message );
        return price;


    }
}
