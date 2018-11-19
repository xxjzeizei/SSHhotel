package com.java.pojo;
// Generated 2018-11-19 15:54:28 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Role generated by hbm2java
 */
public class Role implements java.io.Serializable {

	private String id;
	private String roleName;
	private String descript;
	private Set users = new HashSet(0);

	public Role() {
	}

	public Role(String id) {
		this.id = id;
	}

	public Role(String id, String roleName, String descript, Set users) {
		this.id = id;
		this.roleName = roleName;
		this.descript = descript;
		this.users = users;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getDescript() {
		return this.descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

}
