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

import java.util.ArrayList;
import org.japo.java.libraries.UtilesPassword;

/**
 *
 * @author José Ramón Albiach Vaño <joseramon.albiach.alum@iescamp.es>
 */
public class App {
    
    //Longitud Password
    public static final int LONG_PASS = 12;

    public void launchApp() {
        
        //Cabecera
        System.out.println("GENERADOR DE CONTRASEÑAS");
        System.out.println("========================");
        
        System.out.println("Generando contraseña");
        
        //Separador
        System.out.println("---");
        
        //Contraseña
        ArrayList<Character> pass = new ArrayList<>();
        
        //Generar
        UtilesPassword.generarPassword(pass, LONG_PASS);
        
        //Pass > Texto
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < pass.size(); i++) {
             sb.append(pass.get(i));
        }

        String str = sb.toString();
        
        //Mostrar
//        System.out.printf("Contraseña [%d dígitos] ...: %s%n", LONG_PASS, pass);
        System.out.printf("Contraseña [%d dígitos] ...: %s%n", LONG_PASS, str);
    }
}
