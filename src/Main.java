public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10000;
        int miles = service.bonusСalculator(price); // должно получиться 500
        System.out.println(miles);
    }
}