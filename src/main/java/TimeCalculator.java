public class TimeCalculator {
    public double calculateTime(double distance, double speed) {
        if (speed <= 0) {
            throw new IllegalArgumentException("Speed must be greater than zero.");
        }
        return distance / speed;
    }

    public static void main(String[] args) {
        TimeCalculator calculator = new TimeCalculator();
        double distance = 100.0;
        double speed = 10.0;

        try {
            double time = calculator.calculateTime(distance, speed);
            System.out.println("Time to travel " + distance + " km at " + speed + " km/h is: " + time + " hours.");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
