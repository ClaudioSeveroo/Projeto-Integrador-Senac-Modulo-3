
package com.estoque.farmacia.model;

import jakarta.persistence.*;  
import java.math.BigDecimal;
import lombok.Data;

@Data 
@Entity 
@Table(name="Medicamento")
public class Medicamento {
    @Id 
@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String validade;
    private String nome;
    private BigDecimal valor;
    private int quantidade;
    private String observacoes;
 
}
