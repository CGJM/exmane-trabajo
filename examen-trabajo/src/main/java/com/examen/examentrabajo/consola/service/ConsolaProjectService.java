package com.examen.examentrabajo.consola.service;

import com.examen.examentrabajo.consola.dao.ConsolaProject;
import com.examen.examentrabajo.consola.model.Persona;

public class ConsolaProjectService implements ConsolaProject {
    @Override
    public Integer calcularIMC(Persona personaObject) {
        double imc = personaObject.getPeso()*(Math.pow(personaObject.getAltura(),2));
        long imcRedondeado = Math.round(imc);
        Integer variableRetorno = 0;
        char hombre ='H';
        /**TODO validaciones para mujer imc calculo*/
        if (personaObject.getSexo()!=hombre){
            /**Falta de peso*/
            if(imcRedondeado <19)
                variableRetorno = -1;
            /**Sobrepeso*/
            if(imcRedondeado >24)
                variableRetorno = 1;
        }
        /**TODO validaciones para hombre imc calculo*/
        else if (personaObject.getSexo() == hombre){
            /**Falta de peso*/
            if(imcRedondeado <20)
                variableRetorno = -1;
            /**Sobrepeso*/
            if(imcRedondeado >25)
                variableRetorno = 1;

        }
        return variableRetorno;
    }

    @Override
    public Boolean esMayorDeEdad(Persona personaEdad) {
        if (personaEdad.getEdad()>=18)
            return true;
        else
            return false;
    }

    @Override
    public String toString(Persona persona) {
        return persona.toString();
    }

    @Override
    public String generaNSS() {
        String theAlphaNumericS="ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789";
        StringBuilder builder= new StringBuilder(8);
        for (int m = 0; m < 8; m++) {
            int indice = (int)(theAlphaNumericS.length()* Math.random());
            builder.append(theAlphaNumericS .charAt(indice));
        }
        return builder.toString();
    }
}
