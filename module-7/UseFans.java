/*
 * Sam Dirr
 * CSD 402 Assignment 7.2
 * July 5, 2026
 */

import java.util.ArrayList;

class Fan7 {
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan7() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    public Fan7(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

public class UseFans {
    public static void displayFan(Fan7 fan) {
        System.out.println("Fan speed: " + fan.getSpeed());
        System.out.println("Fan status: " + (fan.isOn() ? "On" : "Off"));
        System.out.println("Fan radius: " + fan.getRadius());
        System.out.println("Fan color: " + fan.getColor());
        System.out.println();
    }

    public static void displayFans(ArrayList<Fan7> fans) {
        for (Fan7 fan : fans) {
            displayFan(fan);
        }
    }

    public static void main(String[] args) {
        ArrayList<Fan7> fans = new ArrayList<>();

        fans.add(new Fan7());
        fans.add(new Fan7(Fan7.SLOW, true, 8, "blue"));
        fans.add(new Fan7(Fan7.MEDIUM, true, 10, "red"));
        fans.add(new Fan7(Fan7.FAST, false, 12, "green"));

        System.out.println("Displaying all fans:");
        displayFans(fans);

        System.out.println("Displaying one fan:");
        displayFan(fans.get(1));
    }
}