package com.example.demo.matricula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaRepository matriculaRepository;

    @PostMapping
    public Matricula criarMatricula(@RequestBody Matricula matricula) {
        return matriculaRepository.save(matricula);
    }

    @GetMapping
    public List<Matricula> listarMatriculas() {
        return matriculaRepository.findAll();
    }
}