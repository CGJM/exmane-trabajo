package com.examen.examentrabajo.consola;

import com.examen.examentrabajo.consola.model.Persona;
import com.examen.examentrabajo.consola.service.ConsolaProjectService;

import java.util.Scanner;

public class MainConsola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca su nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Introduzca su edad:");
        int edad = scanner.nextInt();
        System.out.println("Introduzca su sexo (H hombre, M mujer):");
        String sexo = scanner.next();
        System.out.println("Introduzca su peso:");
        Double peso = scanner.nextDouble();
        System.out.println("Introduzca su altura:");
        Double altura = scanner.nextDouble();
        ConsolaProjectService cps = new ConsolaProjectService();
        //Persona objeto para calcular IMC
        Persona persona = new Persona(nombre, edad, cps.generaNSS(), sexo.charAt(0), peso, altura);

        System.out.println("---------------------------------------");
        if (cps.calcularIMC(persona) == 1)
            System.out.println("Usted tiene sobrepeso");

        if (cps.calcularIMC(persona) == 0)
            System.out.println("Usted está en su peso ideal");

        if (cps.calcularIMC(persona) == -1)
            System.out.println("Usted está por debajo de su peso ideal");

        if (cps.esMayorDeEdad(persona))
            System.out.println("Es mayor de edad");
        else
            System.out.println("Es menor de edad");

        System.out.println("---------------------------------------");
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Edad: "+persona.getEdad());
        System.out.println("NSS: "+persona.getNss());
        System.out.println("Sexo: "+persona.getSexo());
        System.out.println("Peso: "+persona.getPeso());
        System.out.println("Altura: "+persona.getPeso());
    }
}
