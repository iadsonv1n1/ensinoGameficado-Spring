package ensinoGameficado_Spring.model;

import java.util.Objects;

public class Professor {
    private Long id;
    private String name;
    private String email;
    private String senha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(id, professor.id) && Objects.equals(name, professor.name) && Objects.equals(email, professor.email) && Objects.equals(senha, professor.senha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, senha);
    }
}
