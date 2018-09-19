/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_selenium;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import org.testng.Assert;

/**
 *
 * @author ASUS
 */
public class Demo_seleniumNGTest {
    
    public Demo_seleniumNGTest() {
    }

    @Test
    public void testSomeMethod(String SignIn_verify) {
        
        Assert.assertTrue(SignIn_verify.contains("Sign in"));
    }
    
}
