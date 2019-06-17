/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.petitpapa.demojenkins.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 *
 * @author acisse
 */
@Service
public class Calculator {

    @Cacheable("sum")
    public int sum(int a, int b) {
        return a + b;
    }
}
