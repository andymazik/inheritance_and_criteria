package lvl_15_inheritance.b_single_table.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@SuppressWarnings("ALL")
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Entity
@DiscriminatorValue("Второй тип")
@Table(name="user_employee_client")
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
}
