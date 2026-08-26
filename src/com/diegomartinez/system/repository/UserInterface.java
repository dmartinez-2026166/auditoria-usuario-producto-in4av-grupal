package com.diegomartinez.system.repository;

import com.diegomartinez.system.config.ConexionDB;
import com.diegomartinez.system.model.User;
import com.mysql.cj.jdbc.CallableStatement;

public interface UserInterface {

    void create(User user);

}
