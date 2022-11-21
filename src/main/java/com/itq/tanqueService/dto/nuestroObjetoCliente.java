/**
 * 
 */
package com.itq.tanqueService.dto;

/**
 * @author molin
 *
 */
public class nuestroObjetoCliente {
	//atributos
			String nombre, CURP, direccion, calle, colonia;
			int ubicacion, numero;
			
			//constructor
			public nuestroObjetoCliente() {
				this.nombre = "";
				this.CURP = "";
				this.direccion = "";
				this.ubicacion = 0;

			}

			//constructor que sí se usa
			public nuestroObjetoCliente(String nombre, String CURP, String direccion, int ubicacion) {
				this.nombre = nombre;
				this.CURP = CURP;
				this.direccion = direccion;
				this.ubicacion = ubicacion;

			}
			
			//geters y seters
			public String getNombre() {
				return nombre;
			}

			public void setNombre(String nombre) {
				this.nombre = nombre;
			}

			public String getCURP() {
				return CURP;
			}

			public void setCURP(String cURP) {
				CURP = cURP;
			}

			public String getDireccion() {
				return direccion;
			}

			public void setDireccion(String direccion) {
				this.direccion = direccion;
			}

			public String getCalle() {
				return calle;
			}

			public void setCalle(String calle) {
				this.calle = calle;
			}

			public String getColonia() {
				return colonia;
			}

			public void setColonia(String colonia) {
				this.colonia = colonia;
			}

			public int getUbicacion() {
				return ubicacion;
			}

			public void setUbicacion(int ubicacion) {
				this.ubicacion = ubicacion;
			}

			public int getNumero() {
				return numero;
			}

			public void setNumero(int numero) {
				this.numero = numero;
			}
}