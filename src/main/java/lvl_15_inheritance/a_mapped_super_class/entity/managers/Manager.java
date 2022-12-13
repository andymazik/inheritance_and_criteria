package lvl_15_inheritance.a_mapped_super_class.entity.managers;

import lombok.NoArgsConstructor;
import lombok.ToString;
import lvl_15_inheritance.a_mapped_super_class.entity.User;

import java.time.LocalDate;

@ToString
@NoArgsConstructor
public class Manager extends User {
    public String title;
    public int salary;
    public LocalDate hireDate;
}
