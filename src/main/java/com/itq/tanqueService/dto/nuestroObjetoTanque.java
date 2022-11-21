/**
 * 
 */
package com.itq.tanqueService.dto;

/**
 * @author molin
 *
 */
public class nuestroObjetoTanque {
	//atributos
		String nombre, nombreID;
		int capacidad, ubicacion, tiempoLlenado, cantidadActual;
		
		//constructor
		public nuestroObjetoTanque() {
			this.nombreID = "";
			this.nombre = "";
			this.ubicacion = 0;
			this.capacidad = 0;
			this.tiempoLlenado = 0;
			this.cantidadActual = 0;
		}

		//constructor que sí se usa
		public nuestroObjetoTanque(String nombre, int ubicacion, int capacidad, int tiempoLlenado, int cantidadActual) {
			this.nombreID = nombre;
			this.nombre = nombre;
			this.ubicacion = ubicacion;
			this.capacidad = capacidad;
			this.tiempoLlenado = tiempoLlenado;
			this.cantidadActual = cantidadActual;
		}

		
		//geters y seters
		public String getNombreID() {
			return nombreID;
		}
		
		public String getNombre() {
			return nombre;
		}
		
		public int getUbicacion() {
			return ubicacion;
		}
		
		public int getCapacidad() {
			return capacidad;
		}
		
		public int getTiempoLlenado() {
			return tiempoLlenado;
		}
		
		public int getCantidadActual() {
			return cantidadActual;
		}

		public void setNombre(String nombre2) {
			
			 this.nombre = nombre2;
			
		}
		
		public void setCapacidad(int capacidad2) {
			
			 this.capacidad = capacidad2;
			
		}

		public void setNombreID(String nombreID2) {
			
			 this.nombreID = nombreID2;
			
		}
		
		public void setUbicacion(int ubicacion2) {
			this.ubicacion = ubicacion2;
		}
		
		public void setTiempoLlenado(int tiempoLlenado2) {
			this.tiempoLlenado = tiempoLlenado2;
		}
		
		public void setCantidadActual(int cantidadActual2) {
			this.cantidadActual = cantidadActual2;
		}
		
		
		
}