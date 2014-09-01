package com.pentalog.nguzun.vo;

/**
 *
 * @author Guzun
 */
public class Group extends BaseValueObject {

    private String description;
    private int idRole;
    private Role role;

    public Group(){
    }
    
//    public Group(String name, String description, int idRole) {
//        this.setName(name);
//        this.setDescription(description);
//        this.setIdRole(idRole);
//    }
//
//    public Group(int id, String name, String description, int idRole) {
//        this.setName(name);
//        this.setDescription(description);
//        this.setIdRole(idRole);
//        this.setId(id);
//    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the idRole
     */
    public int getIdRole() {
        return idRole;
    }

    
    /**
     * @param idRole the idRole to set
     */
    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }
    
    /**
     * @return the role
     */
    public Role getRole() {
		return role;
	}

    /**
     * @param idRole the role to set
     */
	public void setRole(Role role) {
		this.role = role;
	}
    
    public static class Builder extends BaseValueObject.Builder<Builder>{
    	private String description;
    	private int idRole;
    	private Role role;
        
        public Builder description(String description) {
        	this.description = description;
            return this;
        }
        
        public Builder idRole(int idRole) {
        	this.idRole = idRole;
            return this;
        }
        
        public Builder role(Role role) {
        	this.role = role;
            return this;
        }
        
        public Group build() {
           return new Group(this);
        }
    }
    
    private Group(Builder builder) {
    	super(builder);
    	description = builder.description;
    	idRole = builder.idRole;
    	role = builder.role;
    }

	
}
