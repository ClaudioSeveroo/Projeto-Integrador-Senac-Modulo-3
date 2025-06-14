
package com.estoque.farmacia.controller;

import com.estoque.farmacia.model.Medicamento;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FarmaciaController {
        private List<Medicamento> medicamentos = new ArrayList(); 
        
    @GetMapping("/login") 
                public String mapLogin(Model model) {  
                return "login"; 
                }
                
   
    @GetMapping("/index") 
                public String mapIndex(Model model) {  
                model.addAttribute("medicamentos", medicamentos); // passa a lista ao template
                return "index"; 
                }
                
     @GetMapping("/cadastro") 
                public String exibirFormularioFilme(Model model) { 
                // Cria uma nova instância da classe Filme e a adiciona ao modelo 
                model.addAttribute("medicamento", new Medicamento()); 
                // Retorna o nome do template "cadastro" para exibir o formulário 
                return "cadastro"; 
                } 
                 @PostMapping("/cadastro") 
    public String processarFormularioFilme(@ModelAttribute Medicamento medicamento) {  
        medicamentos.add(medicamento);
        return "redirect:/index";  // Redireciona para /index para mostrar as listas atualizadas
    }
}
