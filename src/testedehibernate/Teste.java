
package testedehibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity 
@Table(name="teste")
public class Teste {
    @Id
    @GeneratedValue
    private int id;
    private int idade;
    private String nome;
    private String cor;

    public Teste() {
    }

    public Teste(int idade, String nome, String cor) {
        this.idade = idade;
        this.nome = nome;
        this.cor = cor;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }  
}
