/*
 * Copyright 2021 Jose Ramon Albiach Vaño - joseramon.albiach.alum@iescamp.es.
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

import java.util.List;

/**
 *
 * @author Jose Ramon Albiach Vaño - joseramon.albiach.alum@iescamp.es
 */
public class UtilesPassword {

    //Numero Categorias
    public static final int NUM_CAT = 4;

    //Categorías
    public static final int CAT_MIN = 0;
    public static final int CAT_MAY = 1;
    public static final int CAT_NUM = 2;
    public static final int CAT_PUN = 3;

    //Caracteres Aceptados
    public static final String CAR_MIN = "abcdefghijklmnopqrstuvwxyz";
    public static final String CAR_MAY = "ABCDEFGHIJQLMNOPQRSTUVWXYZ";
    public static final String CAR_NUM = "0123456789";
    public static final String CAR_PUN = "|@#$%&/=?¿";

    //Arrays de Caracteres
    public static final char[] LST_MIN = CAR_MIN.toCharArray();
    public static final char[] LST_MAY = CAR_MAY.toCharArray();
    public static final char[] LST_NUM = CAR_NUM.toCharArray();
    public static final char[] LST_PUN = CAR_PUN.toCharArray();

    public static final void generarPassword(List<Character> lista,
            int longitud) {
        lista.add(LST_MIN[UtilesAleatorio.aleatorioEntero(0,
                LST_MIN.length - 1)]);
        lista.add(LST_MAY[UtilesAleatorio.aleatorioEntero(0,
                LST_MAY.length - 1)]);
        lista.add(LST_NUM[UtilesAleatorio.aleatorioEntero(0,
                LST_NUM.length - 1)]);
        lista.add(LST_PUN[UtilesAleatorio.aleatorioEntero(0,
                LST_PUN.length - 1)]);

        for (int i = 4; i < longitud; i++) {
            int cat = UtilesAleatorio.aleatorioEntero(0, NUM_CAT - 1);

            switch (cat) {
                case CAT_MIN:
                    lista.add(LST_MIN[UtilesAleatorio.aleatorioEntero(0,
                            LST_MIN.length - 1)]);
                    break;
                case CAT_MAY:
                    lista.add(LST_MAY[UtilesAleatorio.aleatorioEntero(0,
                            LST_MAY.length - 1)]);
                    break;
                case CAT_NUM:
                    lista.add(LST_NUM[UtilesAleatorio.aleatorioEntero(0,
                            LST_NUM.length - 1)]);
                    break;
                case CAT_PUN:
                    lista.add(LST_PUN[UtilesAleatorio.aleatorioEntero(0,
                            LST_PUN.length - 1)]);
            }
        }

        //Desordenar contenido
        barajarLista(lista);
    }

    public static final void barajarLista(List<Character> lista) {

        for (int posAct = 0; posAct < lista.size(); posAct++) {
            int posRnd = UtilesAleatorio.aleatorioEntero(0, lista.size() - 1);
            char aux = lista.get(posAct);
            lista.set(posAct, lista.get(posRnd));
            lista.set(posRnd, aux);
        }
    }
}
