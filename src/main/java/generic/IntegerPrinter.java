package generic;

public class IntegerPrinter {
    private Integer thingToPrint;

    public IntegerPrinter(Integer thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(this.thingToPrint);
    }
}
