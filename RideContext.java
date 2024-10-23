public class RideContext {
    private FareStrategy strategy;

    public RideContext(FareStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(FareStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateFare(double distance, double time, boolean isPeak) {
        if (distance < 0 || time < 0) {
            throw new IllegalArgumentException("distance and time should not be negative");
        }

        if (isPeak) {
            this.setStrategy(new SurgeFareStrategy());
        }

        return this.strategy.calculateFare(distance, time);
    }
}