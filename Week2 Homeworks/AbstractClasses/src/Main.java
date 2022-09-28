public class Main {
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.gameOver();
        womanGameCalculator.calculate();

        GameCalculator gameCalculator1 = new WomanGameCalculator();
        GameCalculator gameCalculator2 = new ManGameCalculator();
    }
}