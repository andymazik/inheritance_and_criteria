package lvl_15_inheritance.a_mapped_super_class.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@ToString
@NoArgsConstructor
@AllArgsConstructor

@MappedSuperclass
public class User {
    @Id
    public int id;
    public String name;
}
