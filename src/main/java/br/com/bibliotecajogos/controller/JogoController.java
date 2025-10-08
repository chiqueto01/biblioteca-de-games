package br.com.bibliotecajogos.controller;

import br.com.bibliotecajogos.model.Jogo;
import br.com.bibliotecajogos.repository.JogoRepository;
import br.com.bibliotecajogos.repository.CategoriaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/jogos")
public class JogoController {
    private final JogoRepository repo;
    private final CategoriaRepository categoriaRepository;

    public JogoController(JogoRepository repo, CategoriaRepository categoriaRepository){
        this.repo = repo; this.categoriaRepository = categoriaRepository;
    }

    @GetMapping
    public String list(Model model){
        model.addAttribute("jogos", repo.findAll());
        return "jogo/list";
    }

    @GetMapping("/novo")
    public String novo(Model model){
        model.addAttribute("jogo", new Jogo());
        model.addAttribute("categorias", categoriaRepository.findAll());
        return "jogo/form";
    }

    @PostMapping
    public String salvar(@Valid @ModelAttribute Jogo jogo, BindingResult br, Model model){
        if(br.hasErrors()){
            model.addAttribute("categorias", categoriaRepository.findAll());
            return "jogo/form";
        }
        repo.save(jogo);
        return "redirect:/jogos";
    }

    @GetMapping("/{id}/editar")
    public String editar(@PathVariable Long id, Model model){
        model.addAttribute("jogo", repo.findById(id).orElseThrow());
        model.addAttribute("categorias", categoriaRepository.findAll());
        return "jogo/form";
    }

    @PostMapping("/{id}/excluir")
    public String excluir(@PathVariable Long id){
        repo.deleteById(id);
        return "redirect:/jogos";
    }
}
