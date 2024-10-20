public class RegularFareStrategy implements FareStrategy {

    @Override
    public double calculateFare(double dist, double time) {
        double per_km = 1.00;
        double per_min= 0.25;
        double fare = (per_km * dist) + (per_min * time);

        return Math.max(fare, 2.00);
    }

}