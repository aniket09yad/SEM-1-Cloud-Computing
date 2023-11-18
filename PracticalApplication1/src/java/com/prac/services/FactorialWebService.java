/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prac.services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author hrisabhy
 */
@WebService(serviceName = "FactorialWebService")
public class FactorialWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Factorial")
    public Integer Factorial(@WebParam(name = "num") int num) {
        //TODO write your implementation code here:
        int fact = 1;
        for(int i=1; i<=num; i++){
            fact*=i;
        }
        return fact;
    }
}
