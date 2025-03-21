package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

//entity ele transforma uma classe em uma entidade do BD
//JPA = Java Persistence API
@Entity // Com esta "annotation" eu torno toda esta classe(NinjaModel) em uma entidade do meu banco de dados
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id // Diz que o atributo logo abaixo vai representar o id com todas as suas características inerentes
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Passa a extratégia de como nós vamos gerar este respectivo id
    private Long id;

    private String nome;

    private String email;

    private int idade;

    private List<MissoesModel> missoes; // Terei que criar, como tarefa, a classe "Missoes".

    // @ManyToOne significa que um ninja tem uma única missão
    @ManyToOne
    @JoinColumn(name = "misssoes_id") // "missoes_id" é uma "Foreing Key" ou "Chave Estrangeira".
    private MissoesModel missoes;

    public NinjaModel() { //Por agora, aqui seria um construtor vazio, ou seja, um "no args contructor"
    }

    public NinjaModel(String nome, String email, int idade) { //Aqui já é um contrutor com todos os argumentos, ou seja, um "all args contructor"
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
