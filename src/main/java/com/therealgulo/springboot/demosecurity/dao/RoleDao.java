package com.therealgulo.springboot.demosecurity.dao;

import com.therealgulo.springboot.demosecurity.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
