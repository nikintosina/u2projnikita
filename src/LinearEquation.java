public class LinearEquation {
    private int x1, y1, x2, y2;
    private double slope, yIntercept, distance;
    private boolean isSlopeCalculated = false, isYInterceptCalculated = false, isDistanceCalculated = false;

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    private double calculateSlope() {
        if (!isSlopeCalculated) {
            slope = (double) (y2 - y1) / (x2 - x1);
            isSlopeCalculated = true;
        }
        return slope;
    }

    private double calculateYIntercept() {
        if (!isYInterceptCalculated) {
            yIntercept = y1 - calculateSlope() * x1;
            isYInterceptCalculated = true;
        }
        return yIntercept;
    }

    private double calculateDistance() {
        if (!isDistanceCalculated) {
            distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            isDistanceCalculated = true;
        }
        return distance;
    }

    public String getSlopeInterceptForm() {
        return "y = " + calculateSlope() + "x + " + calculateYIntercept();
    }

    @Override
    public String toString() {
        return "Points: (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ")\n" +
                "Slope: " + calculateSlope() + "\n" +
                "Y-Intercept: " + calculateYIntercept() + "\n" +
                "Distance: " + calculateDistance() + "\n" +
                "Equation: " + getSlopeInterceptForm();
    }

    public String getCoordinateForX(double x) {
        double y = calculateSlope() * x + calculateYIntercept();
        return "(" + x + ", " + y + ")";
    }
}
