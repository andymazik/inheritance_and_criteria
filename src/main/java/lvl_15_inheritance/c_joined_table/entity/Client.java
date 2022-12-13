package lvl_15_inheritance.c_joined_table.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.time.LocalDate;

@SuppressWarnings("ALL")
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="clients")
@PrimaryKeyJoinColumn(name="client_id")
public class Client extends User {
    String address;

    public Client(int id, String name, LocalDate birthday, String address) {
        super(id, name, birthday);
        this.address = address;
    }
}
