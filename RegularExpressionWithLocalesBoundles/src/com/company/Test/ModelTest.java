package com.company.Test;

import com.company.model.LoginIsSetException;
import com.company.model.Model;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ModelTest {

    static Model model = null;

    @Rule
    public final ExpectedException ex = ExpectedException.none();

    @BeforeClass
    public static void getModel() {
        model = new Model();
    }

    @Test (expected = LoginIsSetException.class)
    public void setALoginTest1() throws LoginIsSetException {
        model.setLogin("tolyatolya");
    }

    @Test
    public void setALoginTest2() throws LoginIsSetException {
        ex.expect(LoginIsSetException.class);
        model.setLogin("theVasyyliy");
    }

    @Test
    public void setALoginTest3() throws LoginIsSetException {
        ex.expect(LoginIsSetException.class);
        model.setLogin("katya111");
    }

    @Test
    public void setALoginTest4() throws LoginIsSetException {
        ex.expect(LoginIsSetException.class);
        model.setLogin("login123");
    }
}
