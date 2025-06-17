
package com.estoque.farmacia.controller;

import com.estoque.farmacia.model.Medicamento;
import com.estoque.farmacia.service.MedicamentoService;
import com.estoque.farmacia.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FarmaciaController { 
        
    @Autowired
    private LoginService loginService;

    @Autowired
    private MedicamentoService medicamentoService;

    // LOGIN
    @GetMapping("/login")
    public String mapLogin() {
        return "login";
    }

    @PostMapping("/login")
public String processarLogin(@RequestParam String nome,
                             @RequestParam String senha,
                             Model model) {
    boolean autenticado = loginService.autenticar(nome, senha);

    if (autenticado) {
        return "redirect:/index";
    } else {
        model.addAttribute("erro", "Usuário ou senha inválidos.");
        return "login";  // Volta para a página login com erro
    }
}

    // TELA INICIAL
    @GetMapping("/index")
    public String mapIndex(Model model) {
        model.addAttribute("medicamentos", medicamentoService.listarMedicamento());
        return "index";
    }

    // CADASTRO DE MEDICAMENTO
    @GetMapping("/cadastro")
    public String mapCadastro(Model model) {
        model.addAttribute("medicamento", new Medicamento());
        return "cadastro";
    }

    @PostMapping("/cadastro")
    public String salvarMedicamento(@ModelAttribute Medicamento medicamento) {
        medicamentoService.criarMedicamento(medicamento);
        return "redirect:/index";
    }

    // EXCLUSÃO
    @GetMapping("/excluir/{id}")
    public String excluirMedicamento(@PathVariable Integer id) {
        medicamentoService.deletarMedicamento(id);
        return "redirect:/index";
    }
}
