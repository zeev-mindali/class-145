package generic;

public class Print<T>{
    private T thingToPrint;
    public Print(T thingToPrint){
        this.thingToPrint=thingToPrint;
    }

    public void print (){
        System.out.println(this.thingToPrint);
    }
}
