package class6_18_11_static;

public class MyWife {
    private static int maam = 0;

    public static void setMaam(int maam) {
        MyWife.maam = maam;
    }

    public static float getPriceWithVat(float price) {
        return (float) (price * (maam / 100.0 + 1));
    }
}
