package com.hergal.creditcardvalidatorsoap.controller;

import com.hergal.creditcardvalidatorsoap.service.CreditCardServiceInterface;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import org.springframework.stereotype.Component;

import jakarta.jws.WebService;

@WebService (serviceName = "CreditCardWS")
@Component
public class CreditCardController {

    private final CreditCardServiceInterface creditCardService;

    public CreditCardController(CreditCardServiceInterface creditCardService) {
        this.creditCardService = creditCardService;
    }


    @WebMethod (operationName = "isNumberCreditCardValide")
    public boolean isCreditCardValid(@WebParam (name = "cardNumber") String cardNumber){
        return creditCardService.isCreditCardValid(cardNumber);
    }


}














