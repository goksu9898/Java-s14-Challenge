public class DeluxeBurger extends Hamburger{
    public int getCips() {
        return cips;
    }

    public int getDrink() {
        return drink;
    }

    private int cips;
    private int drink;

    public DeluxeBurger() {
        super("DeluxeBurger","double",19.1,BreadRollType.DoubleSandwich);
        this.cips=1;
        this.drink=1;
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }
}
