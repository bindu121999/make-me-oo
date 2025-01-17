package org.oop;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point to){
        double xDistance = getxDistance(to);
        double yDistance = getyDistance(to);
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public double direction(Point to){
        double xDistance = getxDistance(to);
        double yDistance = getyDistance(to);
        return Math.atan2(yDistance, xDistance);
    }

    private double getxDistance(Point to){
        return to.x-this.x;
    }

    private double getyDistance(Point to){
        return to.y-this.y;
    }
}
