package com.rest.udemy.holamundo;

public class holamundoBean {

	private String mensaje;

	public holamundoBean(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		return "holamundoBean [mensaje=" + mensaje + "]";
	}

}
