
package com.estoque.farmacia.service;

import com.estoque.farmacia.model.Login;
import com.estoque.farmacia.model.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private LoginRepository loginRepository;

    public boolean autenticar(String nome, String senha) {
        Login login = loginRepository.findByNome(nome);
        
        if (login != null) {
            return login.getSenha().equals(senha); // ⚠️ Atenção: Senha deve ser criptografada em produção.
        }
        return false;
    }
}
