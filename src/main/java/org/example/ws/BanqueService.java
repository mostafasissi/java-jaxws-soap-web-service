package org.example.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {

    @WebMethod(operationName = "convert")
    public double conversion(@WebParam(name = "mantant") Double mt){
        return mt*11.12;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code ){
        return new Compte(code , Math.random()*100,new Date());
    }
    @WebMethod
    public List<Compte> listCompte(){
        return List.of(
                new Compte(1,Math.random()*100,new Date()),
                new Compte(2,Math.random()*100,new Date()),
                new Compte(3,Math.random()*100,new Date())
        );
    }

}
