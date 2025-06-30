package ensinoGameficado_Spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "teacher")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Teacher extends User {

    @OneToMany(mappedBy = "teacher")
    private List<Clazz> clazzes;

    public Teacher(String name, String email, String password) {
        super(name, email, password);
    }
}
