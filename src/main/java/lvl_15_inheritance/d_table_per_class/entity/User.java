package lvl_15_inheritance.d_table_per_class.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@ToString
@NoArgsConstructor
@AllArgsConstructor

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
@Table(name="users")
public class User {
    @Id
    int id;
    String name;
    LocalDate birthday;
}
