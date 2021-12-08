package ngo.dean.elimugo.repositories.models;

public class FileSize {

    public int value;

    public FileSize(int value) {
        this.value = value;
    }

    public String asHumanReadable() {
        if (divideAsDouble(value, Math.pow(10, 9)) > 1) {
            return String.format("%.1f GB", divideAsDouble(value, Math.pow(10, 9)));
        } else if (divideAsDouble(value, Math.pow(10, 6)) > 1) {
            return String.format("%.1f MB", divideAsDouble(value, Math.pow(10, 6)));
        } else if (divideAsDouble(value, Math.pow(10, 3)) > 1) {
            return String.format("%.1f KB", divideAsDouble(value, Math.pow(10, 3)));
        } else {
            return String.format("%s byte", value);
        }
    }

    private double divideAsDouble(double value, double denominator) {
        return value / denominator;
    }
}
