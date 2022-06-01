class Dress extends Tailor {
    private String dressType;
    private boolean silk;
    int kebaya, kurung, jubah, charges;

    public Dress(){ //Default Constructor
        this.dressType = "";
        this.silk = false;
    }
    public Dress(String custNo, String custName, String date, char custTypes, String dressType,boolean silk){ //Normal Constructor
        super(custNo, custName, date, custTypes);
        this.dressType = dressType;
        this.silk = silk;
    }
    public String getDressType(){
        return this.dressType;
    } //Accessor

    public boolean getSilk() {
        return silk;
    } //Accessor

    @Override
    public double calCharges() { //Processor method to calculate final charges for Dress object

        if (dressType.equalsIgnoreCase("Kebaya")){
            if(silk){
                kebaya = 80;
            }
            else{
                kebaya = 40;
            }
        }else if (dressType.equalsIgnoreCase("Kurung")){
            if(silk) {
                kurung = 50;
            }
            else{
                kurung = 25;
            }
        }else if (dressType.equalsIgnoreCase("Jubah")){
            if(silk) {
                jubah = 100;
            }
            else{
                jubah = 50;
            }
        }
        charges = kebaya + kurung + jubah;
        return charges;
    }

    @Override
    public String toString() {
        return "\n\t====Dress====" +
                "\n\tDress Type = '" + getDressType() + '\'' +
                "\n\tHave Silk = " + getSilk() +
                "\n\tCustomer Number = '" + super.getCustNo() + '\'' +
                "\n\tCustomer Name = '" + super.getCustName() + '\'' +
                "\n\tDate = '" + super.getDate() + '\'' +
                "\n\tCustomer Type = " + super.getCustType() +
                "\n\tFinal Prices=" + calCharges() +
                "\n\t============";
    }
}
