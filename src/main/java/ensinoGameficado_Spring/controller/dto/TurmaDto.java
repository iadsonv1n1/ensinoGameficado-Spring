package ensinoGameficado_Spring.controller.dto;

import ensinoGameficado_Spring.model.Turma;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class TurmaDto {
    private Long id;
    private String nome;
    private String prof_nome;
    private String prof_email;
    private LocalDateTime data_criacao;

    public TurmaDto(Turma turma){
        this.id = turma.getId();
        this.nome = turma.getNome();
        this.prof_nome = turma.getProfessor().getNome();
        this.prof_email = turma.getProfessor().getEmail();
        this.data_criacao = turma.getDataCriacao();
    }

}
