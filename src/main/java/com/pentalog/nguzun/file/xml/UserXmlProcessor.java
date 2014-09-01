/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pentalog.nguzun.file.xml;

import org.apache.log4j.Logger;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import com.pentalog.nguzun.file.csv.BaseCsvProcessor;
import com.pentalog.nguzun.vo.User;

/**
 *
 * @author Guzun
 */
public class UserXmlProcessor extends BaseXmlProcessor<User> {
	
	protected static final Logger log = Logger.getLogger(BaseCsvProcessor.class.getName());
	
	private static UserXmlProcessor instance;

    private UserXmlProcessor() {
    }

    public static UserXmlProcessor getInstance() {
		if (instance == null) {
			instance = new UserXmlProcessor();
		}
		return instance;
	}

	@Override
	public User createEntity(Node node) {
		String name, login, password;
        int id, groupId;
        User user = null;
		if (node.getNodeType() == Node.ELEMENT_NODE) {	 
			Element element =  (Element) node;
			id = getIntProperty("id", element);
	        groupId = getIntProperty("groupId", element);
	        name = getStringProperty("name", element);
	        login = getStringProperty("login", element);
	        password = getStringProperty("password", element);
			user = new User.Builder()
						.id(id)
						.name(name)
						.login(login)
						.password(password)
						.idGroup(groupId)
						.build(); 
		}
		
		return user;
	}
	
	

	@Override
    public String createStringForEntity(User user) {
        StringBuilder strBuilder = new StringBuilder("");
        strBuilder.append("<user>")
			.append("\n\t<id>" + user.getId() + "</id>")
	        .append("\n\t<name>" + user.getName() + "</name>")
	        .append("\n\t<login>" + user.getLogin() + "</login>")
	        .append("\n\t<password>" + user.getPassword() + "</password>")
	        .append("\n\t<groupId>" + user.getIdGroup() + "</groupId>")
	        .append("\n</user>")
	        .append('\n');

        return strBuilder.toString();
    }
    
    @Override
	public String getHeader() {
    	StringBuilder strBuilder = new StringBuilder();
    	strBuilder.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>")
				.append('\n')
    			.append("<users>")
    			.append('\n');	        
	        
    	return strBuilder.toString();
	}

	@Override
	public String getFooter() {
		StringBuilder strBuilder = new StringBuilder("</users>");
    	
    	return strBuilder.toString();
	}
	
	@Override
	public String getTagName() {
		return "user";
	}

}
