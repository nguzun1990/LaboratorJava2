/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pentalog.nguzun.vo;


/**
 *
 * @author Guzun
 */
public class User extends BaseValueObject {

    private String login;
    private String password;
    private int idGroup;
    private Group group;

    public User(){
    }

//    public User(String name, String login, String password, int idGroup){
//        this.setLogin(login);
//        this.setName(name);
//        this.setPassword(password);
//        this.setIdGroup(idGroup);
//    }
//
//    public User(int id, String name, String login, String password, int idGroup){
//        this.setLogin(login);
//        this.setName(name);
//        this.setPassword(password);
//        this.setIdGroup(idGroup);
//        this.setId(id);
//    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the idGroup
     */
    public int getIdGroup() {
        return idGroup;
    }

    /**
     * @param idGroup the idGroup to set
     */
    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }
    
    /**
     * @return the Group
     */
    public Group getGroup() {
		return group;
	}

    /**
     * @param group the group to set
     */
	public void setGroup(Group group) {
		this.group = group;
	}
    
    public static class Builder extends BaseValueObject.Builder<Builder>{
    	private String login;
    	private String password;
    	private int idGroup;
    	private Group group;

        public Builder login(String login) {
        	this.login = login;
            return this;
        }

        public Builder password(String password) {
        	this.password = password;
            return this;
        }
        
        public Builder idGroup(int idGroup) {
        	this.idGroup = idGroup;
            return this;
        }
        
        public Builder group(Group group) {
        	this.group = group;
            return this;
        }
        
        public User build() {
           return new User(this);
        }
    }
    
    private User(Builder builder) {
    	super(builder);
    	login = builder.login;
    	password = builder.password;
    	idGroup = builder.idGroup;
    	group = builder.group;
    }

    
}
