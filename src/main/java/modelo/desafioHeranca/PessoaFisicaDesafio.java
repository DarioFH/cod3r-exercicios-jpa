package modelo.desafioHeranca;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("F")
public class PessoaFisicaDesafio extends PessoaDesafio {

    private String cpf;

    public PessoaFisicaDesafio() {
    }

    public PessoaFisicaDesafio(String cpf, String nome){
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
