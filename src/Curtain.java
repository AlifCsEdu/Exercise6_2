public class Curtain extends Tailor {
    private int windows;
    private int doors;

    final double WINDOW_PRICE = 45.00;
    final double DOOR_PRICE = 55.00;

    public Curtain() { //Default Constructor
        this.windows = 0;
        this.doors = 0;
    }
    public Curtain(String custNo, String custName, String date, char custType, int windows, int doors){ //Normal Constructor
        super(custNo, custName, date, custType);
        this.windows = windows;
        this.doors = doors;
    }

    public int getWindows() {
        return windows;
    }//Accessor

    public int getDoors() {
        return doors;
    }//Accessor

    @Override
    public double calCharges() { //Processor method to calculate final charges
        double charge;
        charge = (getWindows() * WINDOW_PRICE)+(getDoors()*DOOR_PRICE);
        return charge;
    }

    @Override
    public String toString() { //Printer Method using toString() with @Override
        return "=====Curtain=====" +
                "\n\tWindows = " + windows +
                "\n\tDoor amount = " + doors +
                "\n\tWindow Prices = " + WINDOW_PRICE +
                "\n\tDoor Prices = " + DOOR_PRICE +
                "\n\tCustomer Number = '" + super.getCustNo() + '\'' +
                "\n\tCustomer Name = '" + super.getCustName() + '\'' +
                "\n\tDate = '" + super.getDate() + '\'' +
                "\n\tCustomer Type = " + super.getCustType() +
                "\n\tFinal Prices=" + calCharges() +
                "================";
    }
}
