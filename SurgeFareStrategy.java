public class SurgeFareStrategy implements FareStrategy {
    @Override
    public double calculateFare(double dist, double time) {
        double per_km = 2.00;
        double per_min = 0.5;
        double fare = (per_km * dist) + (per_min * time);

        return Math.max(fare, 10.00);
    }

}