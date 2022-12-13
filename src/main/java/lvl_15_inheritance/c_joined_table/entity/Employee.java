package lvl_15_inheritance.c_joined_table.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@SuppressWarnings("ALL")
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="employees")
@PrimaryKeyJoinColumn(name="employee_id")
public class Employee extends User {
    String occupation;
    int salary;
    @Column(name="join_date")
    LocalDate join;

    public Employee(int id, String name, LocalDate birthday, String occupation, int salary, LocalDate join) {
        super(id, name, birthday);
        this.occupation = occupation;
        this.salary = salary;
        this.join = join;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "occupation='" + occupation + '\'' +
                ", salary=" + salary +
                ", join=" + join +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
