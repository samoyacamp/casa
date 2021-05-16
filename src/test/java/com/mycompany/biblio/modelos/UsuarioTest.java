/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblio.modelos;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author sergi
 */
public class UsuarioTest {
//    
//    public UsuarioTest() {
//    }
//    
//    @BeforeAll
//    public static void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }
//    
//    @BeforeEach
//    public void setUp() {
//    }
//    
//    @AfterEach
//    public void tearDown() {
//    }
//
//    /**
//     * Test of toString method, of class Usuario.
//     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        Usuario instance = new Usuario();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getNombre method, of class Usuario.
//     */
//    @Test
//    public void testGetNombre() {
//        System.out.println("getNombre");
//        Usuario instance = new Usuario();
//        String expResult = "dfsdfsdfsdfsd";
//        String result = instance.getNombre();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        
//    }
//
//    /**
//     * Test of setNombre method, of class Usuario.
//     */
//    @Test
//    public void testSetNombre() {
//        System.out.println("setNombre");
//        String nombre = "";
//        Usuario instance = new Usuario();
//        instance.setNombre(nombre);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getEmail method, of class Usuario.
//     */
//    @Test
//    public void testGetEmail() {
//        System.out.println("getEmail");
//        Usuario instance = new Usuario();
//        String expResult = "";
//        String result = instance.getEmail();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setEmail method, of class Usuario.
//     */
//    @Test
//    public void testSetEmail() {
//        System.out.println("setEmail");
//        String email = "";
//        Usuario instance = new Usuario();
//        instance.setEmail(email);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPassword method, of class Usuario.
//     */
//    @Test
//    public void testGetPassword() {
//        System.out.println("getPassword");
//        Usuario instance = new Usuario();
//        String expResult = "";
//        String result = instance.getPassword();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setPassword method, of class Usuario.
//     */
//    @Test
//    public void testSetPassword() {
//        System.out.println("setPassword");
//        String password = "";
//        Usuario instance = new Usuario();
//        instance.setPassword(password);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of checkNombre method, of class Usuario.
//     */
//    @Test
//    public void testCheckNombre() {
//        System.out.println("checkNombre");
//        String nombre = "asdasd";
//        Usuario instance = new Usuario();
//        boolean expResult = false;
//        boolean result = instance.checkNombre(nombre);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of checkEmail method, of class Usuario.
//     */
//    @Test
//    public void testCheckEmail() {
//        System.out.println("checkEmail");
//        String email = "";
//        Usuario instance = new Usuario();
//        boolean expResult = false;
//        boolean result = instance.checkEmail(email);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of checkPassword method, of class Usuario.
//     */
//    @Test
//    public void testCheckPassword() {
//        System.out.println("checkPassword");
//        String pwd = "P@asdas";
//        Usuario instance = new Usuario();
//        boolean expResult = false;
//        boolean result = instance.checkPassword(pwd);
//        assertTrue(expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getCodigo_usuarios method, of class Usuario.
//     */
//    @Test
//    public void testGetCodigo_usuarios() {
//        System.out.println("getCodigo_usuarios");
//        Usuario instance = new Usuario();
//        int expResult = 0;
//        int result = instance.getCodigo_usuarios();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setCodigo_usuarios method, of class Usuario.
//     */
//    @Test
//    public void testSetCodigo_usuarios() {
//        System.out.println("setCodigo_usuarios");
//        int codigo_usuarios = 0;
//        Usuario instance = new Usuario();
//        instance.setCodigo_usuarios(codigo_usuarios);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getApellido method, of class Usuario.
//     */
//    @Test
//    public void testGetApellido() {
//        System.out.println("getApellido");
//        Usuario instance = new Usuario();
//        String expResult = "";
//        String result = instance.getApellido();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setApellido method, of class Usuario.
//     */
//    @Test
//    public void testSetApellido() {
//        System.out.println("setApellido");
//        String apellido = "";
//        Usuario instance = new Usuario();
//        instance.setApellido(apellido);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getDNI method, of class Usuario.
//     */
//    @Test
//    public void testGetDNI() {
//        System.out.println("getDNI");
//        Usuario instance = new Usuario();
//        String expResult = "";
//        String result = instance.getDNI();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDNI method, of class Usuario.
//     */
//    @Test
//    public void testSetDNI() {
//        System.out.println("setDNI");
//        String DNI = "";
//        Usuario instance = new Usuario();
//        instance.setDNI(DNI);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getDomicilio method, of class Usuario.
//     */
//    @Test
//    public void testGetDomicilio() {
//        System.out.println("getDomicilio");
//        Usuario instance = new Usuario();
//        String expResult = "";
//        String result = instance.getDomicilio();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDomicilio method, of class Usuario.
//     */
//    @Test
//    public void testSetDomicilio() {
//        System.out.println("setDomicilio");
//        String domicilio = "";
//        Usuario instance = new Usuario();
//        instance.setDomicilio(domicilio);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getCiudad method, of class Usuario.
//     */
//    @Test
//    public void testGetCiudad() {
//        System.out.println("getCiudad");
//        Usuario instance = new Usuario();
//        String expResult = "albacete";
//        String result = instance.getCiudad();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//    }
//
//    /**
//     * Test of setCiudad method, of class Usuario.
//     */
//    @Test
//    public void testSetCiudad() {
//        System.out.println("setCiudad");
//        String ciudad = "";
//        Usuario instance = new Usuario();
//        instance.setCiudad(ciudad);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    @Test
//    public void chek(){
//        Usuario Pacopa=new Usuario();
//        assertTrue(Pacopa.checkNombre("asdas"));
//    }
//    /**
//     * Test of getProvincia method, of class Usuario.
//     */
    @Test
    public void testGetProvincia() {
        System.out.println("getProvincia");
        Usuario instance = new Usuario();
        String expResult = "asdasdasda";
        String result = instance.getProvincia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of setProvincia method, of class Usuario.
//     */
//    @Test
//    public void testSetProvincia() {
//        System.out.println("setProvincia");
//        String provincia = "";
//        Usuario instance = new Usuario();
//        instance.setProvincia(provincia);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    private void assertTrue(boolean expResult) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    @Test
//    public void checkNombre(){
//    Usuario user = new Usuario();
//    boolean checkNombre = user.checkNombre("oac");
//    assertTrue(checkNombre);
//    
//    }
}
