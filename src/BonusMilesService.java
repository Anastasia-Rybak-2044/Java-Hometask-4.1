public class BonusMilesService {
    public int calculate(int price) {
        int bonuscoef = 20;
        int miles = price / bonuscoef;
        return miles;
    }
}