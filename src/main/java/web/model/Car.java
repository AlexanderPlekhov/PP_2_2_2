package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String brand;
    private String series;
    private int yearOfManufacture;

    public Car() {};
    public Car(String brand, String series, int yearOfManufacture) {
        this.brand = brand;
        this.series = series;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getBrand() {return brand;}
    public void setBrand(String brand) {this.brand = brand;}

    public String getSeries() {return series;}
    public void setSeries(String series) {this.series = series;}

    public int getYearOfManufacture() {return yearOfManufacture;}
    public void setYearOfManufacture(int yearOfManufacture) {this.yearOfManufacture = yearOfManufacture;}

    @Override
    public String toString() {
        return "Car {" +
                "brand = '" + brand + '\'' +
                ", series = " + series +
                ", yearOfIssue = " + yearOfManufacture +
                '}';
    }
}