package lvl_15_inheritance.a_mapped_super_class.entity.clients;

import lombok.NoArgsConstructor;
import lombok.ToString;
import lvl_15_inheritance.a_mapped_super_class.entity.User;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

@ToString
@NoArgsConstructor

@MappedSuperclass
public class Client extends User {
    public String address;
    @Column(name="client_from")
    public LocalDate clientFrom;

    public Client(int id, String name, String address, LocalDate clientFrom) {
        super(id, name);
        this.address = address;
        this.clientFrom = clientFrom;
    }
}
