package co.powergym.dao;

import java.util.ArrayList;
import java.util.Date;

import co.powergym.interfacedao.SocioDaoInterface;
import co.powergym.model.Conexion;
import co.powergym.model.Socio;

public class SocioDao implements SocioDaoInterface{
	
	Conexion conexion;
	
	public SocioDao(){
		conexion = new Conexion();
	}

	@Override
	public boolean registrarSocio(String identificacion, Date fechaNacimiento, String primerNombre,
			String segundoNombre, String primerApellido, String segundoApellido, String correo, String telefono,
			int genero) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Socio> listaSocios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminarSocio(String identificacion) {
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean modificarSocio(String identificacion, Date fechaNacimiento, String primerNombre,
			String segundoNombre, String primerApellido, String segundoApellido, String correo, String telefono,
			int genero) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Socio buscarSocio(String identificacion) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
