package edu.badpals.cotxox.tarifa;

import edu.badpals.cotxox.carrera.Carrera;

public class Tarifa {
    final static double costeMilla = 1.35;
    final static double costeMinuto = 0.35;
    final static double costeMinimo = 5;
    final static byte porcentajeComision = 20;
    public Tarifa(){}
    public static double getCosteDistancia(double distancia){
        return distancia*costeMilla;
    }

    public static double getCosteTiempo(int minutos){
        return costeMinuto*minutos;
    }

    public static double getCosteTotalEsperado(Carrera carrera){
        return Math.max(
                getCosteTiempo(carrera.getTiempoEsperado())
                        + getCosteDistancia(carrera.getDistancia()), costeMinimo
        );
    }

}
