package edu.badpals.cotxox;

import static org.junit.Assert.*;

import edu.badpals.cotxox.carrera.Carrera;
import edu.badpals.cotxox.tarifa.Tarifa;
import org.junit.Test;

public class TarifaTest {

	Carrera carrera = new Carrera("4929637175949220");

	@Test
	public void getCosteDistanciaTest() {
		double distancia = 7.75;
		double esperado = 10.4625;
		double delta = 0.01;

		assertEquals(esperado, Tarifa.getCosteDistancia(distancia), delta);
	}

	@Test
	public void getCosteTiempo() {
		int minutos = 10;
		double costeTiempoEsperado = 3.5;
		double delta = 0.01;
		assertEquals(costeTiempoEsperado, Tarifa.getCosteTiempo(minutos), delta);
	}

	@Test
	public void getCosteTotalEsperado() {
		carrera.setDistancia(7.75);
		carrera.setTiempoEsperado(10);
		double costeTotal = 7.75 * 1.35 + 0.35 * 10;
		double delta = 0.01;
		assertEquals(costeTotal, Tarifa.getCosteTotalEsperado(carrera), delta);
	}

	@Test
	public void getCosteTotalEsperadoMinimoTest() {
		carrera.setDistancia(2);
		carrera.setTiempoEsperado(2);
		double delta = 0.01;
		assertEquals(5, Tarifa.getCosteTotalEsperado(carrera), delta);
	}

}
