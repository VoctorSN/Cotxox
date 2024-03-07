package edu.badpals.cotxox;

import static org.junit.Assert.*;

import java.util.ArrayList;

import edu.badpals.cotxox.carrera.Carrera;
import edu.badpals.cotxox.conductores.Conductor;
import edu.badpals.cotxox.conductores.PoolConductores;
import org.junit.Before;
import org.junit.Test;

public class CarreraTest {

	Carrera carrera;

	@Before
	public void ConstructorTest() {

		// http://ensaimeitor.apsl.net/gen_visa/10/

		String[] tarjetasVisa = { "4929637175949220", 
								  "4024007198786385", 
								  "4417129513323481", 
								  "4532121888937144",
								  "4916119711304546" };

		for (String tarjetaVisa : tarjetasVisa) {
			carrera = new Carrera(tarjetaVisa);
			assertEquals(tarjetaVisa, carrera.getTarjetaCredito());
		}
	}

	@Test
	public void setOrigenTest() {
		String origen = "Aeroport Son Sant Joan";
		carrera.setOrigen(origen);
		assertEquals(origen, carrera.getOrigen());
	}

	@Test
	public void setDestinoTest() {
		String destino = "Magaluf";
		carrera.setDestino(destino);
		assertEquals(destino, carrera.getDestino());
	}

	@Test
	public void setDistanciaTest() {
		double distancia = 7.75;
		double delta = 0.001;
		carrera.setDistancia(distancia);
		assertEquals(distancia, carrera.getDistancia(), delta);
	}

	@Test
	public void getCosteEsperadoTest() {
		double distancia = 7.75;
		double costeEsperado = 10.4625;
		int tiempoEsperado = 10;
		double delta = 0.01;
		carrera.setDistancia(distancia);
		carrera.setTiempoEsperado(tiempoEsperado);
		assertEquals(distancia * 1.35 + tiempoEsperado * 0.35, carrera.getCosteEsperado(), delta);

		// coste por debajo del minimo 5€
		distancia = 1.0;
		costeEsperado = 5.0;
		delta = 0.01;
		carrera.setDistancia(distancia);
		assertEquals(costeEsperado, carrera.getCosteEsperado(), delta);
	}

	@Test
	public void setTiempoEsperadoTest() {
		int minutos = 10;
		double delta = 0;
		carrera.setTiempoEsperado(minutos);
		assertEquals(minutos, carrera.getTiempoEsperado(), delta);
	}

	@Test
	public void setTiempoCarreraTest() {
		int minutos = 10;
		double delta = 0;
		carrera.setTiempoCarrera(minutos);
		assertEquals(minutos, carrera.getTiempoCarrera(), delta);
	}

	@Test
	public void setConductorTest() {
		String nombre = "Samantha";
		Conductor conductor = new Conductor(nombre);
		carrera.setConductor(conductor);
		assertEquals(nombre, carrera.getConductor().getNombre());
	}

	@Test
	public void asignarConductor() {
		carrera.setConductor(null);
		String nombre = "Samantha";
		Conductor conductor = new Conductor(nombre);
		ArrayList<Conductor> poolConductores = new ArrayList<>();
		poolConductores.add(conductor);
		PoolConductores conductores = new PoolConductores(poolConductores);
		carrera.asignarConductor(conductores);
		assert (carrera.getConductor() != null);
	}

	@Test
	public void realizarPagoTest() {
		double delta = 0d;
		carrera.realizarPago(carrera.getCosteEsperado());
		assertEquals(carrera.getCosteEsperado(), carrera.getCosteTotal(), delta);
	}

	@Test
	public void liberarConductor() {
		Conductor conductor = new Conductor("Samantha");
		carrera.setConductor(conductor);
		carrera.liberarConductor();
		assert (!carrera.getConductor().isOcupado());
	}

	@Test
	public void setValoracion() {
		Conductor conductor = new Conductor("Samantha");
		carrera.setConductor(conductor);
		carrera.getConductor().setValoracion((byte) 5);
		assertEquals(5, carrera.getConductor().getValoracion(), 0);
	}

}
