
package com.estoque.farmacia.model;

import jakarta.persistence.*; 
import lombok.Data; 

@Data 
@Entity 
@Table(name="Login")
public class Login {
    @Id 
@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nome;
    private String senha;
      
}
