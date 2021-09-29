package com.examen.examentrabajo.consola.dao;

import com.examen.examentrabajo.consola.model.Persona;

public interface ConsolaProject {
    Integer calcularIMC(Persona personaObject);
    Boolean esMayorDeEdad(Persona personaEdad);
    String toString(Persona persona);
    String generaNSS();
}
