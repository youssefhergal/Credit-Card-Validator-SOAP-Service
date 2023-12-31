package com.hergal.creditcardvalidatorsoap.model;




import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CreditCard {

    private Long id;
    private String number;
    private String expiryDate;
    private int controlNumber;
    private String type;
    private String nom ;
    private String prenom ;


}
