/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.NombreParfait;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author insset
 */
public class ParfaitTest {
    
    public ParfaitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of estDivisiblePar method, of class Parfait.
     */
    @Test
    public void testEstDivisibleParTrue() {
        System.out.println("estDivisiblePar");
        
        //given
        long n = 3;
        long val = 6;
        Parfait instance = new Parfait();
        boolean expResult = true;
        
        //when
        boolean result = instance.estDivisiblePar(n, val);
        
        //then
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testEstDivisibleParFalse() {
        System.out.println("estDivisiblePar");
        
        //given
        long n = 4;
        long val = 6;
        Parfait instance = new Parfait();
        boolean expResult = false;
        
        //when
        boolean result = instance.estDivisiblePar(n, val);
        
        //then
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of diviseurs method, of class Parfait.
     */
    @Test
    public void testDiviseursTrue() {
        System.out.println("diviseurs");
        
        //given
        long val = 6;
        Parfait instance = new Parfait();
        long[] expResult = {1,6,2,3};
        
        //when
        long[] result = instance.diviseurs(val);
        
        //then
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testDiviseursFalse() {
        System.out.println("diviseurs");
        
        //given
        long val = 4;
        Parfait instance = new Parfait();
        long[] expResult = {1,4,2};
        
        //when
        long[] result = instance.diviseurs(val);
        
        //then
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of estParfait method, of class Parfait.
     */
    @Test
    public void testEstParfaitTrue() {
        System.out.println("estParfait");
        long val = 6;
        Parfait instance = new Parfait();
        boolean expResult = true;
        boolean result = instance.estParfait(val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testEstParfaitFalse() {
        System.out.println("estParfait");
        long val = 7;
        Parfait instance = new Parfait();
        boolean expResult = false;
        boolean result = instance.estParfait(val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of formaterResult method, of class Parfait.
     */
    @Test
    public void testFormaterResultTrue() {
        System.out.println("formaterResult");
        boolean isParfait = true;
        long nb = 6;
        Parfait instance = new Parfait();
        String expResult = "le nombre 6 est parfait";
        String result = instance.formaterResult(isParfait, nb);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testFormaterResultFalse() {
        System.out.println("formaterResult");
        boolean isParfait = false;
        long nb = 7;
        Parfait instance = new Parfait();
        String expResult = "le nombre 7 n'est pas parfait";
        String result = instance.formaterResult(isParfait, nb);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
