package com.example.demo.turma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

    @Autowired
    private TurmaRepository turmaRepository;

    @PostMapping
    public Turma criarTurma(@RequestBody Turma turma) {
        return turmaRepository.save(turma);
    }

    @GetMapping
    public List<Turma> listarTurmas() {
        return turmaRepository.findAll();
    }
}