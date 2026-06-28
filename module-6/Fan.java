/*
Sam Dirr
CSD 402 Assignment 6.2
June 27, 2026
*/

public class Fan {

    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        String fanState = on ? "on" : "off";

        return "Fan is " + fanState +
                ", speed is " + getSpeedName() +
                ", radius is " + radius +
                ", and color is " + color + ".";
    }

    private String getSpeedName() {
        switch (speed) {
            case SLOW:
                return "slow";
            case MEDIUM:
                return "medium";
            case FAST:
                return "fast";
            default:
                return "stopped";
        }
    }

    public static void main(String[] args) {
        Fan defaultFan = new Fan();
        Fan customFan = new Fan(FAST, true, 10, "blue");

        System.out.println("DEFAULT FAN");
        System.out.println(defaultFan);
        System.out.println();

        System.out.println("CUSTOM FAN");
        System.out.println(customFan);
        System.out.println();

        defaultFan.setOn(true);
        defaultFan.setSpeed(MEDIUM);
        defaultFan.setRadius(8);
        defaultFan.setColor("black");

        System.out.println("UPDATED DEFAULT FAN");
        System.out.println("Speed value: " + defaultFan.getSpeed());
        System.out.println("On: " + defaultFan.isOn());
        System.out.println("Radius: " + defaultFan.getRadius());
        System.out.println("Color: " + defaultFan.getColor());
        System.out.println(defaultFan);
    }
}
