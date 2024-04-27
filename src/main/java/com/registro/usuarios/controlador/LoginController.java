package com.registro.usuarios.controlador;

import com.registro.usuarios.security.UsuarioSecurity;
import com.registro.usuarios.service.IUsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;



    @AllArgsConstructor
    @Controller
    @RequestMapping("/auth")
    public class LoginController {
        private IUsuarioService iUsuarioService;

        @GetMapping("/login")
        public String login() {
            return "backoffice/auth/frmlogin";
        }

        @GetMapping("/login-success")
        public String loginSuccess() {
            return "redirect:/auth/dashboard";
        }

        @GetMapping("/dashboard")
        public String dashboard(HttpServletRequest request) {
            HttpSession session = request.getSession();
            UserDetails userDetails = (UserDetails) SecurityContextHolder
                    .getContext().getAuthentication().getPrincipal();
            UsuarioSecurity usuarioSecurity = (UsuarioSecurity) userDetails;
            session.setAttribute("nomusuario", usuarioSecurity.getNombre());
            return "backoffice/auth/home";
        }
    }
