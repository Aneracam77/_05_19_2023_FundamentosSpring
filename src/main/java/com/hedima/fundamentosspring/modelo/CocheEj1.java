package com.hedima.fundamentosspring.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class CocheEj1 implements IVehiculo {

    private int deposito;

    @Override
    public String moverse() {
       /* if(deposito>0){
            return "El coche se mueve";

        }else{
            return "El coche no se puede mover";
        }
        return null;
    }*/
        return deposito > 0 ? "el coche se mueve" : "El coche no se puede mover";
    }
}
