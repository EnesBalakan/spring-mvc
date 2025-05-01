package com.luv2code.springboot.thymeeafdemo.entity;

// JPA (Java Persistence API) anotasyonlarını içeri aktarıyor. Veritabanı işlemleri için kullanılır
import jakarta.persistence.*;

// Bu sınıfın bir JPA entity (varlık) olduğunu belirtir. Yani bu sınıf, veritabanındaki bir tabloya karşılık gelir
@Entity
// Sınıfın, veritabanındaki employee adlı tabloya karşılık geldiğini belirtir.
@Table(name="employee")
public class Employee {

    // define fields
    @Id
    // Otomatik olarak artırılan birincil anahtar
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // sonra da database deki tablolarla yeni varlıkları eşitliyoruz
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;


    // constructors tanımla
    public Employee() {

    }

    public Employee(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // getter/setter tanımla

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString tanımla
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}








