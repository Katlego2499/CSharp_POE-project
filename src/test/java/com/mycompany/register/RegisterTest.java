/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.register;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class RegisterTest {
    
    public RegisterTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of CheckUserName method, of class Register.
     */
    @org.junit.jupiter.api.Test
    public void testCheckUserName() {
        System.out.println("CheckUserName");
        Register instance = new Register();
        instance.CheckUserName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkpassword method, of class Register.
     */
    @org.junit.jupiter.api.Test
    public void testCheckpassword() {
        System.out.println("checkpassword");
        String password = "";
        Register instance = new Register();
        boolean expResult = false;
        boolean result = instance.checkpassword(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RegisterUser method, of class Register.
     */
    @org.junit.jupiter.api.Test
    public void testRegisterUser() {
        System.out.println("RegisterUser");
        Register instance = new Register();
        instance.RegisterUser();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Register.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Register.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
