package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long car_id;

    private String model;
    private int series;
    @OneToOne(mappedBy = "car")
    private User user;


    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public Car() {
    }

    public long getId() {
        return car_id;
    }

    public void setId(long id) {
        this.car_id = id;
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
}
