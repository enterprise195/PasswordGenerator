/*
 * Copyright 2020 José Ramón Albiach Vaño <joseramon.albiach.alum@iescamp.es>.
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
package org.japo.java.app;

import java.util.Locale;
import java.util.Scanner;
import org.japo.java.libraries.UtilesAleatorio;

/**
 *
 * @author José Ramón Albiach Vaño <joseramon.albiach.alum@iescamp.es>
 */
public class App {

    //Objeto Scanner
    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
    
    //Numero Aleatorio
    public static final int NUM_MIN = 1;
    public static final int NUM_MAX = 10;
    
    public void launchApp() {
        //Variables
        int n;
        
        //Cabecera
        System.out.println("MEGA ADIVINATOR (c) 2020 - JAPO Labs");
        System.out.println("------------------------------------");
        
        System.out.println("Se ha generado un número entre 1 y 10");
        
        //Separador
        System.out.println("---");
        
        //Obtencion aleatorio
        int numRnd = UtilesAleatorio.aleatorioEntero(NUM_MIN, NUM_MAX);
        
        //Bucle
        for (int i = 3; i > 0; i--) {
            try {
                System.out.printf("Quedan %d intentos - Número: ", i);
                n = SCN.nextInt();
                
                //Validar intentos
                if (i > 1) {
                    
                    //Validar Victoria
                    if (n == numRnd) {
                        
                        //Separador
                        System.out.println("---");
                        
                        //Informe victoria
                        System.out.printf("Era el %d - ¡Enhorabuena! %n", 
                                numRnd);
                        i = 0;
                        
                    //Validar num mayor o menor
                    } else {
                        if (n < numRnd) {
                            System.out.println("Prueba un número MAYOR.");
                            
                            //Separador
                            System.out.println("---");
                            
                        } else if (n > numRnd) {
                            System.out.println("Prueba un número MENOR.");
                            
                            //Separador
                            System.out.println("---");
                        }
                    }
                    
                //Validar Derrota    
                } else {
                    System.out.println("Número de intentos AGOTADO.");
                    
                    //Separador
                    System.out.println("---");
                    
                    //Informe derrota
                    System.out.printf("Era el %d - ¡Otra vez será! %n", numRnd);
                }
            } catch (Exception e) {
                System.out.println("ERROR: Entrada Incorrecta");
                i++;
            } finally {
                SCN.nextLine();
            }
        }
    }
}
