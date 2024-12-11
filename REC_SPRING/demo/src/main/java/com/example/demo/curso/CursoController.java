package com.example.demo.curso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    @PostMapping
    public Curso criarCurso(@RequestBody Curso curso) {
        return cursoRepository.save(curso);
    }

    @GetMapping
    public List<Curso> listarCursos() {
        return cursoRepository.findAll();
    }
}
