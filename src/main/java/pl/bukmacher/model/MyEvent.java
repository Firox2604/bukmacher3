package pl.bukmacher.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table (name ="event")
public class MyEvent {
    @Id
    @GeneratedValue
    @Column(name = "id_event", nullable = false)
    private int id;

    @OneToMany(mappedBy="myevent")
    private List<Bet> bets;

    @OneToMany(mappedBy="ContestantMyEvent")
    private List<ContestantType> types;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name = "date")
    private Date date;

    public MyEvent() {
    }

    public MyEvent(String name, String location, Date date) {
        this.name = name;
        this.location = location;
        this.date = date;
    }

    @Override
    public String toString() {
        return "MyEvent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyEvent myEvent = (MyEvent) o;
        return id == myEvent.id &&
                Objects.equals(name, myEvent.name) &&
                Objects.equals(location, myEvent.location) &&
                Objects.equals(date, myEvent.date);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, location, date);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
