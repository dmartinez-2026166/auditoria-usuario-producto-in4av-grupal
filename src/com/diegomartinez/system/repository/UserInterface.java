/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.diegomartinez.system.repository;

import com.diegomartinez.system.config.ConexionDB;
import com.diegomartinez.system.model.User;
import com.mysql.cj.jdbc.CallableStatement;

/**
 *
 * @author informatica
 */
public interface UserInterface {
    
    
    
    void create (User user);
    
}
