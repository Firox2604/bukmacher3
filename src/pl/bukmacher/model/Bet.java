package pl.bukmacher.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class Bet {

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
        return "Bet{" +
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
        Bet bet = (Bet) o;
        return Objects.equals(id, bet.id) &&
                Objects.equals(appUserId, bet.appUserId) &&
                Objects.equals(eventId, bet.eventId) &&
                Objects.equals(amount, bet.amount);
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

