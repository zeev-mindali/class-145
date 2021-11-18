package class6_1811;

public class Tester {
    public static void main(String[] args) {
        Employee[] employees = {
                new Programmer("Tomer", 17000f),
                new Programmer("Tal Rozner", 12000f),
                new Secretary("Nadav", 7000f, 500),
                new Secretary("Asi", 25000f, 500)
        };

        Employee[] talKipaCompany = new Employee[20];
        System.out.println(Art.SHOW_CLASS + "\n");
        for (Employee item : employees) {
            System.out.println(item);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }

        System.out.println(Art.SHOW_BANNER);
        for (Employee item : employees) {
            item.calcBouns();
        }

        //functional programming , will be learned in advanced java (functional programming)
        //Arrays.stream(employees).filter(item -> item.salary > 20000).forEach(System.out::println);

        for (Employee item : employees) {
            if (item instanceof Secretary) {
                System.out.println(item);
            }
        }

        System.out.println(Art.WHO_IS_THE_BOSS);
    }
}
