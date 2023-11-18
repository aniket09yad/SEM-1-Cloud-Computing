/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prac2.entity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hrisabhy
 */
@Stateless
public class StudentsFacade extends AbstractFacade<Students> {
    @PersistenceContext(unitName = "ProjectApplication2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StudentsFacade() {
        super(Students.class);
    }
    
}
