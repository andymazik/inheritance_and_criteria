package lvl_15_inheritance.d_table_per_class.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@SuppressWarnings("ALL")
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="managers")
public class Manager extends User {
    String occupation;
    int salary;
    @Column(name="join_date")
    LocalDate join;

    public Manager(int id, String name, LocalDate birthday, String occupation, int salary, LocalDate join) {
        super(id, name, birthday);
        this.occupation = occupation;
        this.salary = salary;
        this.join = join;
    }
}
