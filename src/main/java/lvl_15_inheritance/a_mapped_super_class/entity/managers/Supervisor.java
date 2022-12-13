package lvl_15_inheritance.a_mapped_super_class.entity.managers;

import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
public class Supervisor extends Manager{
    public int numberOfSubordinates;
}
