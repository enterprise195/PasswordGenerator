/*
 * Copyright 2020 Jose Ramon Albiach Vaño - joseramon.albiach.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.libraries;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Jose Ramon Albiach Vaño - joseramon.albiach.alum@iescamp.es
 */
public class UtilesEntrada {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    //Metodo para obtener un numero entero
    public static final int obtenerEntero(String msgUsr, String msgErr) {
        boolean entradaOK = false;
        int entero = 0;
        do {
            try {
                System.out.print(msgUsr);
                entero = SCN.nextInt();
                entradaOK = true;
            } catch (Exception e) {
                System.out.println(msgErr);
            } finally {
                SCN.nextLine();
            }
        } while (!entradaOK);

        return entero;
    }

    //Metodo para obtener un numero Real
    public static final double obtenerReal(String msgUsr, String msgErr) {
        boolean entradaOK = false;
        double real = 0;
        do {
            try {
                System.out.print(msgUsr);
                real = SCN.nextDouble();
                entradaOK = true;
            } catch (Exception e) {
                System.out.println(msgErr);
            } finally {
                SCN.nextLine();
            }
        } while (!entradaOK);

        return real;
    }

    //Metodo para obtener un Logico
    public static final boolean obtenerLogico(String msgUsr, String msgErr) {
        boolean entradaOK = false;
        boolean logico = false;
        do {
            try {
                System.out.print(msgUsr);
                logico = SCN.nextBoolean();
                entradaOK = true;
            } catch (Exception e) {
                System.out.println(msgErr);
            } finally {
                SCN.nextLine();
            }
        } while (!entradaOK);

        return logico;
    }

    //Metodo para obtener un Caracter
    public static final char obtenerCaracter(String msgUsr, String msgErr) {
        boolean entradaOK = false;
        char caracter = (char) 0;
        do {
            try {
                System.out.print(msgUsr);
                caracter = SCN.nextLine().charAt(0);
                entradaOK = true;
            } catch (Exception e) {
                System.out.println(msgErr);
            }
        } while (!entradaOK);

        return caracter;
    }

    //Metodo para obtener un texto
    public static final String obtenerTexto(String msgUsr) { 
        System.out.print(msgUsr);
        return SCN.nextLine();
    }
}
