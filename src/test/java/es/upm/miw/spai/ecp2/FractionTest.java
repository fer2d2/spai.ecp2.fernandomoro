package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
    private Fraction fr;

    @Before
    public void before() {
        fr = new Fraction(3, 5);
    }

    @Test
    public void testFractionIntInt() {
        assertEquals(3, fr.getNumerator());
        assertEquals(5, fr.getDenominator());
    }

    @Test
    public void testFraction() {
        fr = new Fraction();
        assertEquals(1, fr.getNumerator());
        assertEquals(1, fr.getDenominator());
    }

    @Test
    public void testDecimal() {
        assertEquals(0.6, fr.decimal(), 10e-2);
    }

    @Test
    public void testDecimalWithDenominatorZero() {
        fr = new Fraction(3, 0);
        assertEquals(Double.POSITIVE_INFINITY, fr.decimal(), 10e-1);
    }

    @Test
    public void testIsPropia() {
        assertEquals(true, fr.isPropia());
    }

    @Test
    public void testIsEquivalente() {
        assertEquals(true, fr.isEquivalente(new Fraction(3, 5)));
    }

    @Test
    public void testIsMayor() {
        assertEquals(true, fr.isMayor(new Fraction(1, 5)));
        assertEquals(false, fr.isMayor(new Fraction(8, 5)));
    }

    @Test
    public void testIsMenor() {
        assertEquals(true, fr.isMenor(new Fraction(8, 5)));
        assertEquals(false, fr.isMenor(new Fraction(1, 5)));
    }
}
