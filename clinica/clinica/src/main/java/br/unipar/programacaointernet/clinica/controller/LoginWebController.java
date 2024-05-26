package br.unipar.programacaointernet.clinica.controller;

import br.unipar.programacaointernet.clinica.model.Usuario;
import br.unipar.programacaointernet.clinica.service.UsuarioService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginWebController {

    private final UsuarioService usuarioService;

    public LoginWebController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/login")
    public String loginForm() {
        return "login"; // Retorna a página de login (login.html)
    }

    @GetMapping("/hello-world/{name}")
    public String helloWorld(@PathVariable(value = "name") String name) {
        return "Hello " + name + "!";
    }

    @GetMapping("/bemvindo")
    public String bemvindo() {
        return "bemvindo";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session, Model model) {

        Usuario usuario = usuarioService.validarUsuario(username, password);
        if(usuario != null) {
            session.setAttribute("usuarioLogado", username);
            return "redirect:/bemvindo";
        } else {
            model.addAttribute("erro",
                    "Usuário ou senha inválidos");
            return "login";
        }
    }


}
