package web.Model;

public class Car {
    private String model;
    private int series;
    private int price;
    private String url;

    public Car() {
    }

    public Car(String model, int series, int price) {
        this.model = model;
        this.series = series;
        this.price = price;
    }

    public Car(String model, int series, int price, String url) {
        this(model, series, price);
        this.url = url;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    @Override
    public String toString() {
        return "{model='" + model + '\'' +
                ", series=" + series +
                ", price=" + price +
                '}';
    }

}