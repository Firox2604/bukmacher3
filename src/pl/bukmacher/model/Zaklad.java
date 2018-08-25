package pl.bukmacher.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class Zaklad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer appUserId;

    @Column
    private Integer eventId;

    @Column
    private Double amount;

    @Override
    public String toString() {
        return "Zaklad{" +
                "id=" + id +
                ", appUserId=" + appUserId +
                ", eventId=" + eventId +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zaklad zaklad = (Zaklad) o;
        return Objects.equals(id, zaklad.id) &&
                Objects.equals(appUserId, zaklad.appUserId) &&
                Objects.equals(eventId, zaklad.eventId) &&
                Objects.equals(amount, zaklad.amount);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, appUserId, eventId, amount);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAppUserId() {
        return appUserId;
    }

    public void setAppUserId(Integer appUserId) {
        this.appUserId = appUserId;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
