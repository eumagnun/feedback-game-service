package br.com.fiap.avaliacaoGame.controller;

import br.com.fiap.avaliacaoGame.model.AvaliacaoGame;
import br.com.fiap.avaliacaoGame.repository.AvaliacaoGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/feedback-games/v1/api")
public class AvaliacaoGameController {


    @Autowired
    AvaliacaoGameRepository repository;

    @PostMapping("/feedbacks")
    public AvaliacaoGame inserir(@RequestBody AvaliacaoGame avaliacaoGame){
        return repository.save(avaliacaoGame);
    }

    @GetMapping("/feedbacks")
    public List<AvaliacaoGame> consultarTodos(){
        return repository.findAll();
    }
}
