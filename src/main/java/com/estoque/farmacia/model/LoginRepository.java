
package com.estoque.farmacia.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer> {
    Login findByNome(String nome);
    
}