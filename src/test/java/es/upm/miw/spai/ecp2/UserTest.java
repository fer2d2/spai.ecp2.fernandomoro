package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
    private User usr;

    @Before
    public void before() {
        usr = new User(1, "Diego", "Gomez");
    }

    @Test
    public void testUser() {
        assertEquals("Number does not match", usr.getNumber(), 1);
        assertEquals("Name does not match", usr.getName(), "Diego");
        assertEquals("FamilyName does not match", usr.getFamilyName(), "Gomez");
    }

    @Test
    public void testUserFirstLetterUppercase() {
        usr = new User(2, "jorge", "hernan");
        assertEquals("Number does not match", usr.getNumber(), 2);
        assertEquals("Name does not match", usr.getName(), "Jorge");
        assertEquals("FamilyName does not match", usr.getFamilyName(), "Hernan");
    }

    @Test
    public void testFullName() {
        assertEquals(usr.fullName(), "Diego Gomez");
    }

    @Test
    public void testInitials() {
        assertEquals(usr.initials(), "D.");
    }

    @Test
    public void testFullNameWithInitial() {
        assertEquals(usr.fullNameWithInitial(), "D. Gomez");
    }

    @Test
    public void testfullNameInverseOrder() {
        assertEquals(usr.fullNameInverseOrder(), "Gomez, Diego");
    }

    @Test
    public void testfullNameInverseOrderWithInitial() {
        assertEquals(usr.fullNameInverseOrderWithInitial(), "Gomez, D.");
    }

    @Test
    public void testNameUppercase() {
        assertEquals(usr.nameUppercase(), "DIEGO");
    }
}
