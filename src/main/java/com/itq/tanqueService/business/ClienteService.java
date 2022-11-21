/**
 * 
 */
package com.itq.tanqueService.business;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import com.itq.tanqueService.dto.Ack;
import com.itq.tanqueService.dto.Cliente;
import com.itq.tanqueService.dto.ClienteCURP;
import com.itq.tanqueService.dto.nuestroObjetoCliente;


@Component
public class ClienteService {
	
	//array que guarda los elementos tanque
			static ArrayList<nuestroObjetoCliente> listaTank= new ArrayList<nuestroObjetoCliente>();
			
			//insert cliente
			public Ack insertCliente(Cliente client) {
				Ack ack = new Ack();
				
				listaTank.add(new nuestroObjetoCliente(client.getNombre(), client.getCURP(), client.getDireccion(), client.getUbicacion()));
				ack.setDescription("Cliente agregado correctamente");
				System.out.println("Nombre: " + client.getNombre() + "\n CURP: " + client.getCURP() + "\n Direccion: "
						+ client.getDireccion() + "\n Ubicacion: "+ client.getUbicacion());
				ack.setCode(0);
				return ack;
			}
			
			
			//show cliente
			public Ack showCliente(ClienteCURP clienteID) {
				Ack ack = new Ack();
				int cont = -1;
				for(int i = 0; i<listaTank.size(); i++) {
					
					if (listaTank.get(i).getCURP().equals(clienteID.getCURP())) {
						//System.out.println("Te encontre");
						cont = i;
						break;
					}		
					//System.out.println("nombre: "+ listaTank.get(i).getNombre());
				}
				if(cont == -1) {
					ack.setDescription("Cliente no encontrado");
				}else {
					ack.setDescription("\nNombre: " + listaTank.get(cont).getNombre() + "\nUbicacion: " + listaTank.get(cont).getUbicacion() 
							+ "\nDirección: " + listaTank.get(cont).getDireccion() + "\nCURP: " 
							+ listaTank.get(cont).getCURP() + "\n");
				}		
				ack.setCode(0);
				return ack;
			}
			
			
			//delete cliente
				public Ack deleteCliente(ClienteCURP clienteID) {
					Ack ack = new Ack();
					int cont = -1;
					for(int i = 0; i<listaTank.size(); i++) {
						
						if (listaTank.get(i).getCURP().equals(clienteID.getCURP())) {
							cont = i;
							break;
						}
								
						//System.out.println("nombre: "+ listaTank.get(i).getNombre());
					}
					if(cont == -1) {
						ack.setDescription("Cliente no encontrado");
					}else {
						listaTank.remove(cont);
						ack.setDescription("Se borro!!!!!");
					}		
					ack.setCode(0);
					return ack;
				}
}
