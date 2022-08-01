public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        int actual1 = service.calculate(1000, true);
        int expected1 = 30;

        System.out.println("ОР: " + expected1 + " ФР: " + actual1);

        int actual2 = service.calculate(1_000_000, true);
        int expected2 = 500;

        System.out.println("ОР: " + expected2 + " ФР: " + actual2);

        int actual3 = service.calculate(1000, false);
        int expected3 = 10;

        System.out.println("ОР: " + expected3 + " ФР: " + actual3);

        int actual4 = service.calculate(1_000_000, false);
        int expected4 = 500;

        System.out.println("ОР: " + expected4 + " ФР: " + actual4);
    }
}