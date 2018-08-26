package pl.bukmacher.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;


@Entity
@Table (name = "bet")
public class Bet {

    @Id
    @GeneratedValue
    @Column(name = "id_bet", nullable = false)
    private Integer id_bet;

    @ManyToMany(mappedBy="bets")
    private List<AppUser> appusers;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_event")
    private MyEvent myevent;


    @Column(name = "id_types")
    private Integer id_type;

    @Column(name = "amount")
    private Double amount;

    public Bet() {
    }

    public Bet(MyEvent event, Integer id_type, Double amount) {
        this.myevent = event;
        this.id_type = id_type;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Bet{" +
                "id=" + id_bet +
                ", appusers=" + appusers +
                ", event=" + myevent +
                ", id_type=" + id_type +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bet bet = (Bet) o;
        return Objects.equals(id_bet, bet.id_bet) &&
                Objects.equals(appusers, bet.appusers) &&
                Objects.equals(myevent, bet.myevent) &&
                Objects.equals(id_type, bet.id_type) &&
                Objects.equals(amount, bet.amount);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id_bet, appusers, myevent, id_type, amount);
    }

    public Integer getId_bet() {
        return id_bet;
    }

    public void setId_bet(Integer id) {
        this.id_bet = id;
    }

    public Integer getId_type() {
        return id_type;
    }

    public void setId_type(Integer id_type) {
        this.id_type = id_type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}