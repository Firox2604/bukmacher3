package pl.bukmacher.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name ="contestanttype")
public class ContestantType {

    @Id
    @GeneratedValue
    @Column(name = "id_type", nullable = false)
    private Integer id_type;

    @Column(name = "participantNo" )
    private Integer participantNo;

    @Column(name = "winfactor")
    private Double winFactor;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_event")
    private MyEvent ContestantMyEvent;

    public ContestantType() {
    }

    public ContestantType(Integer participantNo, Double winFactor, MyEvent contestantMyEvent) {
        this.participantNo = participantNo;
        this.winFactor = winFactor;
        ContestantMyEvent = contestantMyEvent;
    }

    @Override
    public String toString() {
        return "ContestantType{" +
                "id_type=" + id_type +
                ", participantNo=" + participantNo +
                ", winFactor=" + winFactor +
                ", ContestantMyEvent=" + ContestantMyEvent +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContestantType that = (ContestantType) o;
        return Objects.equals(id_type, that.id_type) &&
                Objects.equals(participantNo, that.participantNo) &&
                Objects.equals(winFactor, that.winFactor) &&
                Objects.equals(ContestantMyEvent, that.ContestantMyEvent);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id_type, participantNo, winFactor, ContestantMyEvent);
    }

    public Integer getId_type() {
        return id_type;
    }

    public void setId_type(Integer id_type) {
        this.id_type = id_type;
    }

    public Integer getParticipantNo() {
        return participantNo;
    }

    public void setParticipantNo(Integer participantNo) {
        this.participantNo = participantNo;
    }

    public Double getWinFactor() {
        return winFactor;
    }

    public void setWinFactor(Double winFactor) {
        this.winFactor = winFactor;
    }

    public MyEvent getContestantMyEvent() {
        return ContestantMyEvent;
    }

    public void setContestantMyEvent(MyEvent contestantMyEvent) {
        ContestantMyEvent = contestantMyEvent;
    }
}
