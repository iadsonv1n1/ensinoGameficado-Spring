package ensinoGameficado_Spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "professor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Professor extends Usuario{

    @OneToMany(mappedBy = "professor")
    private List<Turma> turmas;
}
