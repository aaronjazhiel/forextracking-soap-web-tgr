package com.ab.soap;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.spring.guides.gs_producing_web_service.GetTG7065IRequest;
import io.spring.guides.gs_producing_web_service.GetTG7065OResponse;
import io.spring.guides.gs_producing_web_service.TG7065I;
import io.spring.guides.gs_producing_web_service.TG7065O;


@Endpoint
public class CountryEndpoint {
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

		
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getTG7065IRequest")
	@ResponsePayload
	public GetTG7065OResponse getCountry(@RequestPayload GetTG7065IRequest request) {
		GetTG7065OResponse response = new GetTG7065OResponse();
		
		
    	response.setTG7065O(crearRespesta());
    	prosesarRequest(request.getTG7065I());
    	
        return response;
    }
    
	
    public void prosesarRequest(TG7065I request) {
    	if(request !=null) {
    		System.out.println("CODENTID: "+request.getCODENTID());
    		System.out.println("NIF: "+request.getNIF());
    		System.out.println("NUMPERSONA: "+request.getNUMPERSONA());
    		System.out.println("NUMOPERA: "+request.getNUMOPERA());
    		System.out.println("OPCION: "+request.getOPCION());
    	}else {
    		System.out.println("Vacio....");
    	}
    }
    
    
    public List<TG7065O> crearRespesta(){
    	List<TG7065O> list = new ArrayList<TG7065O>();
    	
    	TG7065O obj1 = new TG7065O();
    	TG7065O obj2 = new TG7065O();
    	    	
    	list.add(crear(obj1,1));
    	list.add(crear(obj2,2));
    	
    	
    	return list;
    }
    
    public TG7065O crear(TG7065O obj1, int sec) {
    	
    	obj1.setCODIDIVI("123"+sec);
    	obj1.setCODPROOP("3565"+sec);
    	obj1.setDESPRODO("3454.35"+sec);
    	obj1.setDIVNOMVEN("4545.4"+sec);
    	obj1.setDIVPRIMA("4545.45"+sec);
    	obj1.setFECALTA("2019-05-0"+sec);
    	obj1.setFECVTO("2019-05-1"+sec);
    	obj1.setGLOBALID("1000000000373480"+sec);
    	obj1.setIMPNOMINAL("1538461.5"+sec);
    	obj1.setIMPNOMVEN("854700.8"+sec);
    	obj1.setIMPPRIMA("343.34"+sec);
    	obj1.setINDCALPUT("23.3"+sec);
    	obj1.setINDCOMP("23.3"+sec);
    	obj1.setNIVBARR1("1.2"+sec);
    	obj1.setNIVBARR2("1.6"+sec);
    	obj1.setNUMESTRAT("4324"+sec);
    	obj1.setNUMOPERA("3434.33"+sec);
    	obj1.setTIPBARR1("1.7"+sec);
    	obj1.setTIPBARR2("1.5"+sec);
    	obj1.setTRANOPE("23232.3"+sec);
    	
    	return obj1;
    }
}
