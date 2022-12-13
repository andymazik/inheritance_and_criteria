package lvl_15_inheritance.b_single_table.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@SuppressWarnings("ALL")
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("Первый тип")
@Entity
@Table(name="user_employee_client")
public class User {
    @Id
    int id;
    String name;
    LocalDate birthday;
}
