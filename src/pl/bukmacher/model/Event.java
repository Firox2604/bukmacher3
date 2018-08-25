package pl.bukmacher.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Event")
public class Event {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
@Column
    private String name;
@Column
    private String date;
@Column
    private String location;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event)) return false;
        Event event = (Event) o;
        return Objects.equals(getId(), event.getId()) &&
                Objects.equals(getName(), event.getName()) &&
                Objects.equals(getDate(), event.getDate()) &&
                Objects.equals(getLocation(), event.getLocation());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getName(), getDate(), getLocation());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Event{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", date='").append(date).append('\'');
        sb.append(", location='").append(location).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

