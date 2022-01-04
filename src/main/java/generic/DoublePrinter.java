package generic;

public class DoublePrinter {
    private Double thingToPrint;

    public DoublePrinter(Double thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(this.thingToPrint);
    }
}
