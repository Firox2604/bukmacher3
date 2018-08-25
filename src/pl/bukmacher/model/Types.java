package pl.bukmacher.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Types")
public class Types {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Integer id_event;
    @Column
    private Integer value1;
    @Column
    private Integer value2;
    @Column
    private Integer value3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_event() {
        return id_event;
    }

    public void setId_event(Integer id_event) {
        this.id_event = id_event;
    }

    public Integer getValue1() {
        return value1;
    }

    public void setValue1(Integer value1) {
        this.value1 = value1;
    }

    public Integer getValue2() {
        return value2;
    }

    public void setValue2(Integer value2) {
        this.value2 = value2;
    }

    public Integer getValue3() {
        return value3;
    }

    public void setValue3(Integer value3) {
        this.value3 = value3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Types)) return false;
        Types types = (Types) o;
        return Objects.equals(getId(), types.getId()) &&
                Objects.equals(getId_event(), types.getId_event()) &&
                Objects.equals(getValue1(), types.getValue1()) &&
                Objects.equals(getValue2(), types.getValue2()) &&
                Objects.equals(getValue3(), types.getValue3());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getId_event(), getValue1(), getValue2(), getValue3());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Types{");
        sb.append("id=").append(id);
        sb.append(", id_event=").append(id_event);
        sb.append(", value1=").append(value1);
        sb.append(", value2=").append(value2);
        sb.append(", value3=").append(value3);
        sb.append('}');
        return sb.toString();
    }
}
