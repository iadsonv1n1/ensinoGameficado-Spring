package ensinoGameficado_Spring.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Turma {
    private Long id;
    private String nome;
    private Professor professor;
    private LocalDateTime dataCriacao;
    private List<Aluno> alunos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Turma turma = (Turma) o;
        return Objects.equals(id, turma.id) && Objects.equals(nome, turma.nome) && Objects.equals(professor, turma.professor) && Objects.equals(dataCriacao, turma.dataCriacao) && Objects.equals(alunos, turma.alunos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, professor, dataCriacao, alunos);
    }
}
