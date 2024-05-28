package com.registro.usuarios.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.registro.usuarios.modelo.Usuario;
import com.registro.usuarios.servicio.UsuarioServicio;

@Controller
public class RegistroControlador {

	@Autowired
	private UsuarioServicio servicio;
	
	@GetMapping("/prueba")
	public String inciarprueba() {
		return "img/prueba";
	}
	@GetMapping("/login")
	public String iniciarSesion() {
		return "login";
	}
	
	@GetMapping("/")
	public String verPaginaDeInicio(Model modelo) {
		modelo.addAttribute("usuarios", servicio.listarUsuarios());
		return "index";
	}
	
	@GetMapping("/nuevo")
	public String MostrarFormularioDeRegistrarUsuario(Model modelo) {
		Usuario usuario= new Usuario();
		modelo.addAttribute("usuario", usuario);
		return "nuevo_usuario";	
	}
	@GetMapping("/editar/{id}")
	public ModelAndView mostrarFormularioDeEditar(@PathVariable(name="id")Long id){
		ModelAndView modelo = new ModelAndView("editar_usuario");	
		return modelo;
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminarProducto(@PathVariable(name="id")Long id){
		
		return "redirect:/";
	}
	
	
}
