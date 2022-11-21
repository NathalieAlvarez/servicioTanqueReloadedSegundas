/**
 * 
 */
package com.itq.tanqueService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.itq.tanqueService.business.ClienteService;
import com.itq.tanqueService.business.TanqueService;
import com.itq.tanqueService.dto.Ack;
import com.itq.tanqueService.dto.Cliente;
import com.itq.tanqueService.dto.ClienteCURP;
import com.itq.tanqueService.dto.TanqueAlta;
import com.itq.tanqueService.dto.TanqueConsulta;
import com.itq.tanqueService.dto.TanqueDelete;
import com.itq.tanqueService.dto.TanqueUpdate;
/**
 * @author herre
 *
 */
@Endpoint
public class TanqueEndpoint {
	@Autowired TanqueService tanqueService;
	@Autowired  ClienteService clienteService;
	
	private static final String NAMESPACE_URI = "http://com.Tanque";
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "tanqueAlta")
	@ResponsePayload
	public Ack tanqueRegistration(@RequestPayload TanqueAlta request) {
		Ack response = tanqueService.insertTanque(request);
		return response;
		
	}
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "tanqueConsulta")
	@ResponsePayload
	public Ack tanqueShow(@RequestPayload TanqueConsulta request) {
		Ack response = tanqueService.showTanque(request);
		return response;
	}
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "tanqueDelete")
	@ResponsePayload
	public Ack tanqueDelete(@RequestPayload TanqueDelete request) {
		Ack response = tanqueService.deleteTanque(request);
		return response;
	}
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "tanqueUpdate")
	@ResponsePayload
	public Ack tanqueUpdate(@RequestPayload TanqueUpdate request) {
		Ack response = tanqueService.updateTanque(request);
		return response;
	}
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "cliente")
	@ResponsePayload
	public Ack clienteRegistration(@RequestPayload Cliente request) {
		Ack response = clienteService.insertCliente(request);
		return response;
	}
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "clienteCURP")
	@ResponsePayload
	public Ack clienteShow(@RequestPayload ClienteCURP request) {
		Ack response = clienteService.showCliente(request);
		return response;
	}

}
