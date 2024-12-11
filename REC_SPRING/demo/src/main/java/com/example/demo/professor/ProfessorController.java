package com.example.demo.professor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

    @Autowired
    private ProfessorRepository professorRepository;

    @PostMapping
    public Professor criarProfessor(@RequestBody Professor professor) {
        return professorRepository.save(professor);
    }

    @GetMapping
    public List<Professor> listarProfessores() {
        return professorRepository.findAll();
    }
}
