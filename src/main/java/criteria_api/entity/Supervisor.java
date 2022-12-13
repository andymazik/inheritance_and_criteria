package criteria_api.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
@SuppressWarnings("ALL")
@ToString
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table(name="supervisors", schema = "company")
public class Supervisor {
    @Id
    public Long id;
    public String name;
    public String title;
    public int salary;
    @Column(name="hire_date")
    public LocalDate hireDate;
    public int subordinates;
    public int experience;
}
