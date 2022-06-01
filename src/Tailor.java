abstract class Tailor {
    String custNo;
    String custName;
    String date;
    char custType;

    public Tailor() { //Default Constructor
        this.custNo = "";
        this.custName = "";
        this.date = "";
        this.custType = 'a';
    }
    public Tailor(String custNo, String custName, String date, char custType) { //Normal Constructor
        this.custNo = custNo;
        this.custName = custName;
        this.date = date;
        this.custType = custType;
    }
    public String getCustNo() {
        return custNo;
    } //Accessor

    public String getCustName() { //Accessor
        return custName;
    }

    public String getDate() { //Accessor
        return date;
    }

    public char getCustType() { //Accessor
        return custType;
    }


    @Override
    public String toString() { //Printer Method using toString
        return "Tailor{" +
                "custNo='" + custNo + '\'' +
                ", custName='" + custName + '\'' +
                ", date='" + date + '\'' +
                ", custType=" + custType +
                '}';
    }
    public abstract double calCharges(); //Abstract Method

}
