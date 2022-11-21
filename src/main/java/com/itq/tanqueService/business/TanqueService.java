/**
 * 
 */
package com.itq.tanqueService.business;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.itq.tanqueService.dto.Ack;
import com.itq.tanqueService.dto.TanqueAlta;
import com.itq.tanqueService.dto.TanqueConsulta;
import com.itq.tanqueService.dto.TanqueDelete;
import com.itq.tanqueService.dto.TanqueUpdate;
import com.itq.tanqueService.dto.nuestroObjetoTanque;


@Component
public class TanqueService {

	//array que guarda los elementos tanque
	static ArrayList<nuestroObjetoTanque> listaTank= new ArrayList<nuestroObjetoTanque>();
	
	//insert tanque
	public Ack insertTanque(TanqueAlta tanque) {
		Ack ack = new Ack();		
		System.out.println(listaTank.size());
		System.out.println(tanque.getNombre());
		listaTank.add(new nuestroObjetoTanque(tanque.getNombre(), tanque.getUbicacion(), tanque.getCapacidad(), tanque.getTiempoLlenado(), tanque.getCantidadActual()));
		System.out.println("despues: "+listaTank.size());
		ack.setDescription("Agregado correctamente");
		ack.setCode(0);
		
		return ack;
	}
	
	//show tanque
	public Ack showTanque(TanqueConsulta tanque) {
		Ack ack = new Ack();
		int cont = -1;
		for(int i = 0; i<listaTank.size(); i++) {
			
			if (listaTank.get(i).getNombre().equals(tanque.getNombre())) {
				System.out.println("Te encontre");
				cont = i;
				break;
			}		
			//System.out.println("nombre: "+ listaTank.get(i).getNombre());
		}
		if(cont == -1) {
			ack.setDescription("Tanque no encontrado");
		}else {
			ack.setDescription("\nNombre: " + listaTank.get(cont).getNombre() + "\nUbicacion: " + listaTank.get(cont).getUbicacion() 
					+ "\nCant actual: " + listaTank.get(cont).getCantidadActual() + "\nCapacidad: " +
					+ listaTank.get(cont).getCapacidad() + "\ntiempo llenado: " + listaTank.get(cont).getTiempoLlenado() + "\n");
		}		
		ack.setCode(0);
		return ack;
	}
	//delet tanque updateTanque
		
		public Ack deleteTanque(TanqueDelete tanque) {
			Ack ack = new Ack();
			//int cont = -1;
			for(int i = 0; i<listaTank.size(); i++) {
				
				if (listaTank.get(i).getNombre().equals(tanque.getNombre())) {
					System.out.println("Te encontre2");
					listaTank.remove(i);
					ack.setDescription("Se borro!!!!!");
					System.out.println("despues de borrar: "+listaTank.size());
				}
				else {
					ack.setDescription("Tanque no encontrado");
				}
				//System.out.println("nombre: "+ listaTank.get(i).getNombre());
			}	
			ack.setCode(0);
			return ack;
		}
		
		//update tanque updateTanque
		
			public Ack updateTanque(TanqueUpdate tanque) {
				Ack ack = new Ack();
				for(int i = 0; i<listaTank.size(); i++) {
					
					if (listaTank.get(i).getNombreID().equals(tanque.getNombreID())) {
						listaTank.get(i).setNombre(tanque.getNombre());
						listaTank.get(i).setCantidadActual(tanque.getCantidadActual());
						listaTank.get(i).setCapacidad(tanque.getCapacidad());
						listaTank.get(i).setTiempoLlenado(tanque.getTiempoLlenado());
						listaTank.get(i).setUbicacion(tanque.getUbicacion());
						ack.setDescription("Ya se modifico el tanque");
					}
					else {
						ack.setDescription("Tanque no encontrado, no se puede modificar");
					}	
				}	
				ack.setCode(0);
				return ack;
			}
	
	

}
