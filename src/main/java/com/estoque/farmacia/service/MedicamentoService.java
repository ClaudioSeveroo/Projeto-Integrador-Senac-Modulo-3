
package com.estoque.farmacia.service;

import com.estoque.farmacia.model.Medicamento;
import com.estoque.farmacia.model.MedicamentoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicamentoService {
    @Autowired
    private MedicamentoRepository medicamentoRepository;

    public Medicamento criarMedicamento(Medicamento medicamento) {
        medicamento.setId(0);
        return medicamentoRepository.save(medicamento);
    }

    public List<Medicamento> listarMedicamento() {
        return medicamentoRepository.findAll();
    }

    public void deletarMedicamento(Integer id) {
        medicamentoRepository.deleteById(id);
    }
}
