package Dio_projeto.lab_padroes_projeto_spring.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Clientes") // nome a tabela;
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    @ManyToOne // muitios apara um o endereç pode está para muitos
    private String endereco;
}
