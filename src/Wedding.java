public class Wedding extends Event{
    boolean pelamin;
    String style;
    double menu_price, pelamin_price, stylePrice;

    public Wedding(String custName, int numOfGuests, int menuType, boolean pelamin, String style) { //Normal Constructor
        super(custName, numOfGuests, menuType);
        this.pelamin = pelamin;
        this.style = style;
    }
    public boolean getPelamin() {return pelamin;} //Accessor
    public String getStyle() {return style;} //Accessor

    @Override //Printer Method using toString() with @Override
    public String toString() {
        return " \n\t==========Wedding Order==========" +
                "\n\tNumber of Guests = " + super.getGuests() +
                "\n\tMenu Type = " + super.getMenuType() +
                "\n\tCustomer Name = '" + super.getCustName() + '\'' +
                "\n\tComes with Pelamin? = " + getPelamin() +
                "\n\tStyle of Choice = '" + getStyle() + '\'' +
                "\n\tTotal price = '" +calPayment()+'\''+
                "\n\t=================================";
    }

    @Override
    public double calPayment() { //Processor method to calculate final payments for Wedding
        double Payment;
        if(menuType ==1){
        }else if(menuType ==2){
        }else if (menuType ==3){
        }

        if(pelamin){
            pelamin_price = 1500.0;
        }else {
            pelamin_price = 0.0;
        }
        if(style.equalsIgnoreCase("Garden")){
            stylePrice = 3000.0;
        }else if(style.equalsIgnoreCase("Modern")){
            stylePrice = 3500.0;
        }else if (style.equalsIgnoreCase("Traditional")){
            stylePrice = 2000.0;
        }
        Payment = (menu_price * numOfGuests) + pelamin_price + stylePrice;

        return Payment;
    }
}
