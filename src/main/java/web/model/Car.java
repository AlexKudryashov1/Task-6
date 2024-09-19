package web.model;

public class Car {
    public String model;
    public int year;
    public int series;

    public Car(String model, int year, int series) {
        this.model = model;
        this.year = year;
        this.series = series;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public int getSeries() {
        return series;
    }
}

