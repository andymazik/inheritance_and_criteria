package lvl_15_inheritance.b_single_table.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@SuppressWarnings("ALL")
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Entity
@DiscriminatorValue("Третий тип")
@Table(name="user_employee_client")
public class Client extends User {
    String address;

    public Client(int id, String name, LocalDate birthday, String address) {
        super(id, name, birthday);
        this.address = address;
    }
}
