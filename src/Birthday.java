public class Birthday extends Event{
    String theme;
    boolean clown;
    double menu_price, clown_price, theme_price;

    public Birthday(String custName, int numOfGuests, int menuType, String theme, boolean clown) { //Normal Constructor
        super(custName, numOfGuests, menuType);
        this.theme = theme;
        this.clown = clown;
    }
    public String getTheme() {return theme;} //Accessor

    public boolean getClown() {
        return clown;
    } //Accessor

    @Override //Printer Method using toString() with @Override
    public String toString() {
        return "\n\t==========Birthday Order==========" +
                "\n\tTheme of Choice = '" + getTheme() + '\'' +
                "\n\tOpted for Clown? = " + getClown() +
                "\n\tNumber of Guests = " + super.getGuests() +
                "\n\tMenu Type = " + super.getMenuType() +
                "\n\tCustomer Name='" + super.getCustName() + '\'' +
                "\n\tTotal Price=" + calPayment() +
                "\n\t=================================";
    }

    @Override
    public double calPayment() { //Processor method to calculate Birthday final payments
        double Payment;
        if(menuType ==1){
            menu_price = 10.0;
            System.out.println(menu_price);
        }else if(menuType ==2){
            menu_price = 20.0;
            System.out.println(menu_price);
        }else if (menuType ==3){
            menu_price = 30.0;
            System.out.println(menu_price);
        }

        if(theme.equalsIgnoreCase("Anime")){
            theme_price = 400.0;
        }else if(theme.equalsIgnoreCase("Superhero")){
            theme_price = 300.0;
        }else if (theme.equalsIgnoreCase("Barbie")){
            theme_price = 450.0;
        }
        if(clown){
            clown_price = 200;
        }else {
            clown_price = 0;
        }
        Payment =(menu_price * numOfGuests)+ clown_price + theme_price;
        return Payment;
    }
}
