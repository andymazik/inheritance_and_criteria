package lvl_15_inheritance.c_joined_table.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@SuppressWarnings("ALL")
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name="users")
public class User {
    @Id
    @Column(name="user_id")
    int id;
    String name;
    LocalDate birthday;


}
