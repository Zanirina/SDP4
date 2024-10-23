
public class DiscountFareStrategy implements FareStrategy {

    @Override
    public double calculateFare(double distance, double time) {
        double per_km = 0.5;
        double per_min = 0.15;
        double all = (per_km * distance) + (per_min * time);

        return Math.max(all, 3.00);
    }

}
