package es.upm.grise.profundizacion2019.ex1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClaseExamenTest {

	ClaseExamen pruebas = new ClaseExamen();
	
	@Test
	public void path1() { // 0-1-2-3-4-6
		int x = 2;
		int y = 1;
		assertEquals(pruebas.metodoAProbar(x, y),0,0);
	}
	
	@Test
	public void path2() { // 0-1-3-4-6
		int x = 1;
		int y = 1;
		assertEquals(pruebas.metodoAProbar(x, y),0,0);
	}
	
	// No se puede realizar el tercer test que pasa por el nodo 5

}
