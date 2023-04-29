package org.example;

import jakarta.xml.ws.Endpoint;
import org.example.ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        //Creer un petit serveur web qui permet de consommé notre service {BanqueService}
        // à partir de n'import @ip du reseau local
        Endpoint.publish("http://0.0.0.0:9191/", new BanqueService());
        System.out.println("Web service déployé http://0.0.0.0:9191/");
    }
}