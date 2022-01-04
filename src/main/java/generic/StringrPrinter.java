package generic;

public class StringrPrinter {
    private String thingToPrint;

    public StringrPrinter(String thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(this.thingToPrint);
    }
}
