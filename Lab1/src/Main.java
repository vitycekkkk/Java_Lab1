public class Main {


    public static void main(String[] args) {
        Coursework first = new Coursework();
        Coursework second = new Coursework("Forest", 120, 1, 2018);
        Coursework third = new Coursework("River", 123, 3, 2019, "Koda" );
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        Coursework.printStaticMark();
        first.printMark();
        third.resetValues("New Theme", 12, 1, 2019, "Protechko");

    }
}