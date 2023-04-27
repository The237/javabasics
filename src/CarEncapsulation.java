public class CarEncapsulation {

    private String make;
    private String model;
    private int year;

    public CarEncapsulation(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Copy constructor
    public CarEncapsulation(CarEncapsulation x){
          this.copy(x);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "CarEncapsulation{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void copy(CarEncapsulation x){
        this.make = x.make;
        this.model = x.model;
        this.year = x.year;
    }
}
