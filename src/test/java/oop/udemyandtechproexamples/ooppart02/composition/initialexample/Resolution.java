package oop.udemyandtechproexamples.ooppart02.composition.initialexample;
/*
Resolution class is the composition - it's a part of a monitor, monitor isn't a resolution but has a resolution.
The resolution is a component of the monitor, and the monitor has a resolution, which is the native resolution.
 */

public class Resolution {
    private int width;
    private int height;

    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
