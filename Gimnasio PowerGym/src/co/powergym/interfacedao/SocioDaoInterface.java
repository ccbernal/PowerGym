package co.powergym.interfacedao;

import java.util.ArrayList;
import java.util.Date;

import co.powergym.model.Socio;

public interface SocioDaoInterface {

	public boolean registrarSocio(String identificacion, Date fechaNacimiento, String primerNombre, String segundoNombre, String primerApellido,
            String segundoApellido, String correo, String telefono, int genero);
	
	public ArrayList<Socio> listaSocios();
	
	public boolean eliminarSocio(String identificacion);
	
	public boolean modificarSocio(String identificacion, Date fechaNacimiento, String primerNombre, String segundoNombre, String primerApellido,
            String segundoApellido, String correo, String telefono, int genero);
	
	public Socio buscarSocio(String identificacion);
}
