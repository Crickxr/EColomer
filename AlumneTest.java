import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;


public class AlumneTest extends TestCase {
	Alumne Enric, David, Sergi;
	
	@Before
	public void setUp() throws Exception {
		Enric = new Alumne("Enric",17, 2017, 7, 11);
		David = new Alumne("David",18, 2015, 4, 5);
		Sergi = new Alumne("Sergi",19, 2017, 6, 9);
	}
	@Test
	public void testesMajorEdat() {
		assertFalse("Hauria de retornar que no es major d'edat.", Enric.esMajorEdat());
		assertTrue("Hauria de retornar que es major d'edat.", David.esMajorEdat());
		assertTrue("Hauria de retornar que es major d'edat.", Sergi.esMajorEdat());
	}
	@Test
	public void testaprovaM5() {
		assertTrue("Hauria de retornar que aprova M5.", Enric.aprovaM5(8));
		assertFalse("Hauria de retornar que no aprova M5.", David.aprovaM5(4));
		assertTrue("Hauria de retornar que aprova M5.", Sergi.aprovaM5(10));
	}
	@Test
	public void testanyMatriculat() {
		assertEquals("Hauria de retornar que ha estat 1 any matriculat", 1, Enric.anysMatriculat(2018));
		assertEquals("Hauria de retornar que ha estat 3 anys matriculat", 3, David.anysMatriculat(2018));
		assertEquals("Hauria de retornar que ha estat 1 any matriculat", 1, Sergi.anysMatriculat(2018));
	}
	@Test
	public void testpassaASegon() {
		assertTrue("Hauria de retornar que passa a segon", Enric.passaASegon());
		assertFalse("Hauria de retornar que no passa a segon", David.passaASegon());
		assertTrue("Hauria de retornar que passa a segon", Sergi.passaASegon());
	}
}
