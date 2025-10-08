package br.com.bibliotecajogos.controller;

import br.com.bibliotecajogos.model.Categoria;
import br.com.bibliotecajogos.repository.CategoriaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {
    private final CategoriaRepository repo;
    public CategoriaController(CategoriaRepository repo){ this.repo = repo; }

    @GetMapping
    public String list(Model model){
        model.addAttribute("categorias", repo.findAll());
        return "categoria/list";
    }

    @GetMapping("/novo")
    public String novo(Model model){
        model.addAttribute("categoria", new Categoria());
        return "categoria/form";
    }

    @PostMapping
    public String salvar(@Valid @ModelAttribute Categoria categoria, BindingResult br){
        if(br.hasErrors()) return "categoria/form";
        repo.save(categoria);
        return "redirect:/categorias";
    }

    @GetMapping("/{id}/editar")
    public String editar(@PathVariable Long id, Model model){
        model.addAttribute("categoria", repo.findById(id).orElseThrow());
        return "categoria/form";
    }

    @PostMapping("/{id}/excluir")
    public String excluir(@PathVariable Long id){
        repo.deleteById(id);
        return "redirect:/categorias";
    }
}
