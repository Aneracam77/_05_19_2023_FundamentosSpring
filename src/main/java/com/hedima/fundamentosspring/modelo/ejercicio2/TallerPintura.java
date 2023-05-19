package com.hedima.fundamentosspring.modelo.ejercicio2;

import org.springframework.stereotype.Component;

@Component("tp")/*Italler tp = new TallerPintura()*/
public class TallerPintura implements ITaller {
    @Override
    public String reparar(Coche c) {
        return "El coche con matricula " + c.getMatricula() + " se está reparando en taller de pintura";
    }
}