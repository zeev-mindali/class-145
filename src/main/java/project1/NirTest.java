package project1;

public class NirTest {
    public static void main(String[] args)  {
        //blah blah blah
        System.out.println("Nir iz in the house");
        try {
            if (true) {
                throw new NirException("Nir: Oops i did it again....");
            } else {
                throw new Exception("Alon: the roof , the roof, the roof iz on fire");
            }
        } catch (NirException err) {
            System.out.println(err.getMessage());
            //err.printStackTrace(); -> no no no no no no
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
    }
}
