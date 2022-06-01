abstract class Event {
    String custName;
    int numOfGuests;
    int menuType;

    public Event(String custName, int numOfGuests, int menuType) { //Normal Constructor
        this.custName = custName;
        this.numOfGuests = numOfGuests;
        this.menuType = menuType;
    }

    public String getCustName() { //Accessor
        return custName;
    }

    public int getGuests() { //Accessor
        return numOfGuests;
    }

    public int getMenuType() { //Accessor
        return menuType;
    }

    @Override
    public String toString() { //Printer method using toString
        return "Event{" +
                "custName='" + getCustName() + '\'' +
                ", menuType=" + getMenuType() +
                ", guests=" + getGuests() +
                '}';
    }
    public abstract double calPayment(); //abstract Method
}
