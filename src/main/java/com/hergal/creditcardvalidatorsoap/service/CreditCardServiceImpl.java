package com.hergal.creditcardvalidatorsoap.service;

import com.hergal.creditcardvalidatorsoap.util.LuhnAlgorithm;
import org.springframework.stereotype.Service;

@Service
public class CreditCardServiceImpl implements CreditCardServiceInterface{
    @Override
    public boolean isCreditCardValid(String creditCardNumber) {
        return LuhnAlgorithm.validateCreditCardNumber(creditCardNumber);
    }
}
