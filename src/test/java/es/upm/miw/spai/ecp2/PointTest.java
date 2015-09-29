package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PointTest {
    private Point pt;

    @Before
    public void before() {
        pt = new Point(5, 7);
    }

    @Test
    public void testPuntoIntInt() {
        assertEquals(5, pt.getX());
        assertEquals(7, pt.getY());
    }

    @Test
    public void testPunto() {
        pt = new Point();
        assertEquals(0, pt.getX());
        assertEquals(0, pt.getY());
    }

    @Test
    public void testModulo() {
        assertEquals(8.6023, pt.module(), 10e-5);
    }

    @Test
    public void testFase() {
        assertEquals(0.9505, pt.phase(), 10e-5);
    }

    @Test
    public void testTranslate() {
        this.pt.translateOrigin(new Point(1, 1));
        assertEquals(4, pt.getX());
        assertEquals(6, pt.getY());
    }

}