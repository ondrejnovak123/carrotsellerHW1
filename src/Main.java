public class Main {
    public static void main(String[] args) {
        CarrotSeller carrotSeller1 = new CarrotSeller();
        CarrotSeller carrotSeller2 = new CarrotSeller();

        carrotSeller1.setCityName("Brno");
        carrotSeller1.setName("Tonda");

        carrotSeller2.setCityName("Jihlava");
        carrotSeller2.setName("Jaroslav");

        System.out.println("Prodejce 1 : " + carrotSeller1.getName() + ", " + carrotSeller1.getCityName() + ".");
        System.out.println("Prodejce 2 : " + carrotSeller2.getName() + ", " + carrotSeller2.getCityName() + ".");
    }
}