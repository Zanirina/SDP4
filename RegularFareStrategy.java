public class RegularFareStrategy implements FareStrategy {

    @Override
    public double calculateFare(double distance, double time) {
        double per_km = 1.00;
        double per_min= 0.25;
        double all = (per_km * distance) + (per_min * time);

        return Math.max(all, 2.00);
    }

}