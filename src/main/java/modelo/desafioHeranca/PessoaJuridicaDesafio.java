package modelo.desafioHeranca;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("J")
public class PessoaJuridicaDesafio extends PessoaDesafio {

    private String cnpj;

    public PessoaJuridicaDesafio() {
    }

    public PessoaJuridicaDesafio(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
