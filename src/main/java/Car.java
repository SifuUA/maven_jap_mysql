import javax.persistence.*;
import java.util.Date;

/**
 * Created by Alex on 04.06.2017.
 */

@Entity
@Table(name = "cars")
@NamedQuery(name = "Car.getAll", query = "SELECT c from Car c")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name  ="name", length = 32)
    private String name;

    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date releaseDate;

    @Column(name = "cost")
    private float cost;

    public Car(String name, Date releaseDate, float cost) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public float getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", releaseDate=" + releaseDate +
                ", cost=" + cost +
                '}';
    }
}
