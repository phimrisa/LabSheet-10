public class Choux extends Bakery {
    private int set;

    public Choux (int set, String flavor, double unitPrice) {
        super(flavor, unitPrice);
        this.set = set;
    }

    public int getSet(){
        return this.set;
    }

    @Override
    public int getPackingCost(){
        if(this.set >= 1)
            return super.getPackingCost() * this.set;
        return 0;
    }

    @Override
    public double calculateTotalPrice(){
        return getUnitPrice() * this.set + getPackingCost();
    }

    public String toString(){
        return super.toString() + "\n" + this.set + " set(s) of " + getFlavor() + " flavored Choux" +
                "\nTotal price of Choux = " + this.calculateTotalPrice();
    }
}
