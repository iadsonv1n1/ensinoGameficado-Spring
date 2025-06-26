package ensinoGameficado_Spring.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "turma")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Turma {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;
    private LocalDateTime dataCriacao = LocalDateTime.now();

    @ManyToMany(mappedBy = "turmas")
    private List<Aluno> alunos;
}
