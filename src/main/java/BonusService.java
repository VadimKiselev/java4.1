public class BonusService {
    public int calculate(long amount, boolean registered) {
        int percent = registered ? 3 : 1;
        int bonus = (int) (amount * percent / 100);
        int limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}