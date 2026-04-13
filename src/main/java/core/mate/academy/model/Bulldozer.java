package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double bladeWidth;
    private double bladeVolume;

    public Bulldozer() {
    }

    public double getBladeVolume() {
        return bladeVolume;
    }

    public void setBladeVolume(double bladeVolume) {
        this.bladeVolume = bladeVolume;
    }

    public double getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(double bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
