package com.sistemas.examenes3.ec3_2023;

/*import java.util.HashSet;
import java.util.Set;*/

/*import org.springframework.beans.factory.annotation.Autowired;*/
/*import org.springframework.boot.CommandLineRunner;*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*import com.sistemas.examenes3.ec3_2023.models.Rol;
import com.sistemas.examenes3.ec3_2023.models.Usuario;
import com.sistemas.examenes3.ec3_2023.models.UsuarioRol;
import com.sistemas.examenes3.ec3_2023.services.UsuarioService;*/

@SpringBootApplication
public class Ec32023Application /*implements CommandLineRunner*/{
	//Implementamos el ComandLineRunner para inicializar con la prueba unitaria

	//INyectamos usuarioservice
	/*@Autowired
	private UsuarioService usuarioService;*/

	public static void main(String[] args) {
		SpringApplication.run(Ec32023Application.class, args);
	}


	//Mostrara el metodo que cargara al iniciar el proyecto
	/*@Override
	public void run(String... args) throws Exception {

		//Llamamos a la clase usuario
		Usuario usuario = new Usuario();
		//Y procedemos a ingresarle datos 
		usuario.setNombre("Roberto");
		usuario.setApellido("Mendoza");
		usuario.setUsername("RMENDOZAF");
		usuario.setPassword("112233");
		usuario.setEmail("arnorouge55@gmail.com");
		usuario.setTelefono("938626150");
		usuario.setPerfil("foto.png");

		//Llamamos a la clase rol
		Rol rol=new Rol();
		//Y procedemos a ingresar datos
		rol.setRolId(1L);
		rol.setNombre("ADMIN");
		
		//Llamamos al Set que permitira la habilitacion de una tabla intermedia
		Set<UsuarioRol> usuarioRols= new HashSet<>();

		//Llamamos a la clase usuariorol
		UsuarioRol usuarioRol = new UsuarioRol();
		//Y le ingresamos los campos a las clases q enlazaran
		usuarioRol.setRol(rol);
		usuarioRol.setUsuario(usuario);
		usuarioRols.add(usuarioRol);
		
		//Luego creamos una variable que utilizara el metodo guarda de service
		Usuario usuarioguardado= usuarioService.guardarUsuario(usuario, usuarioRols);
		//y lo mostrara en consola
		System.out.println(usuarioguardado.getUsername());
	}*/

	

}
