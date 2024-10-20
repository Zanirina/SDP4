public class Main {
    public static void main(String[] args) {
        FareStrategy regul = new RegularFareStrategy();
        FareStrategy prem = new PremiumFareStrategy();
        FareStrategy discount = new DiscountFareStrategy();
        FareStrategy surge = new SurgeFareStrategy();


        RideContext ride = new RideContext(regul);
        System.out.println("Regular: " + ride.calculateFare(10, 17, false));

        ride.setStrategy(prem);
        System.out.println("Premium: " + ride.calculateFare(15, 15, false));

        ride.setStrategy(discount);
        System.out.println("Discount: " + ride.calculateFare(10, 15, false));

        ride.setStrategy(regul);
        System.out.println("Peak hour: " + ride.calculateFare(5, 20, true));

        try {
            System.out.println(ride.calculateFare(-7, 15, false));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
