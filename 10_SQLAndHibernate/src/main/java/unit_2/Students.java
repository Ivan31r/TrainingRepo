package unit_2;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Students")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int age;

    @Column(name = "registration_date")
    private LocalDateTime registration_date;


    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", registration_date=" + registration_date +
                '}';
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDateTime getRegistration_date() {
        return registration_date;
    }

    public void setRegistration_date(LocalDateTime registration_date) {
        this.registration_date = registration_date;
    }
}
