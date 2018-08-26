package pl.bukmacher.model;

import java.util.List;
import java.util.Objects;
import javax.persistence.*;
@Entity
@Table(name = "appuser")
public class AppUser {

    @Id
    @GeneratedValue
    @Column(name = "id_appuser", nullable = false)
    private Integer id;

    @ManyToMany
    @JoinTable(
            name="appbet",
            joinColumns=@JoinColumn(name="appuser", referencedColumnName="id_appuser"),
            inverseJoinColumns=@JoinColumn(name="bet", referencedColumnName="id_bet"))
    private List<Bet> bets;


    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "balance")
    private Double balance;

    @Column(name= "role")
    private String role;

    public AppUser() {
    }

    public AppUser(String name, String surname, String login, String password, Double balance, String role) {
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
        this.balance = balance;
        this.role = role;
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", role='" + role + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return Objects.equals(id, appUser.id) &&
                Objects.equals(name, appUser.name) &&
                Objects.equals(surname, appUser.surname) &&
                Objects.equals(login, appUser.login) &&
                Objects.equals(password, appUser.password) &&
                Objects.equals(balance, appUser.balance) &&
                Objects.equals(role, appUser.role);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, surname, login, password, balance, role);
    }

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
