package lvl_15_inheritance.a_mapped_super_class.entity.clients;

import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@SuppressWarnings("ALL")
@ToString
@NoArgsConstructor

@Entity
@Table(name="individuals")
public class Individual extends Client{
    @Column(name="tax_number")
    public int taxNumber;
    public LocalDate birthday;

    public Individual(int id, String name, String address, LocalDate clientFrom, int taxNumber, LocalDate birthday) {
        super(id, name, address, clientFrom);
        this.taxNumber = taxNumber;
        this.birthday = birthday;
    }
}
