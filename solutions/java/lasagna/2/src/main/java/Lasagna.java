public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int elapsedTime) {
        return expectedMinutesInOven() - elapsedTime;
    }

    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    public int totalTimeInMinutes(int layers, int elapsedTime) {
        return preparationTimeInMinutes(layers) + elapsedTime;
    }
}
