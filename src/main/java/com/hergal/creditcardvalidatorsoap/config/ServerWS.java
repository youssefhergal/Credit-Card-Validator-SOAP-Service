package com.hergal.creditcardvalidatorsoap.config;

import com.hergal.creditcardvalidatorsoap.controller.CreditCardController;
import com.hergal.creditcardvalidatorsoap.service.CreditCardServiceImpl;
import com.hergal.creditcardvalidatorsoap.service.CreditCardServiceInterface;
import jakarta.xml.ws.Endpoint;

public class ServerWS {

    public static void main(String[] args) {
        CreditCardServiceInterface creditCardService = new CreditCardServiceImpl();
        String url = "http://localhost:8182/" ;
        Endpoint.publish(url, new CreditCardController(creditCardService));
        System.out.println("Le serveur est demerré sur :" + url);
    }
}
