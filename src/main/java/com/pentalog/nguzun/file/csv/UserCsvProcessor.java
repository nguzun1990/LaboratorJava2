/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pentalog.nguzun.file.csv;

import com.pentalog.nguzun.record.UserRecord;
import com.pentalog.nguzun.vo.User;

/**
 *
 * @author Guzun
 */
public class UserCsvProcessor extends BaseCsvProcessor<User> {
	
	private static UserCsvProcessor instance;

    private UserCsvProcessor() {
    }

    public static UserCsvProcessor getInstance() {
		if (instance == null) {
			instance = new UserCsvProcessor();
		}
		return instance;
	}
    
    @Override
    public User createEntity(String[] record) {
        String name, login, password;
        int id, groupId;
        User user = null;
		if (record.length == UserRecord.EXPECTED_RECORD_LENGTH) {
			name = UserRecord.getName(record);
            login = UserRecord.getLogin(record);
            password = UserRecord.getPassword(record);
            id = UserRecord.getId(record);
            groupId = UserRecord.getGroupId(record);
            user = new User.Builder().id(id).name(name)
            		.login(login).password(password).idGroup(groupId).build();
		}
		
	    return user;
    }

    @Override
    public String createStringForEntity(User user, String cvsSplitBy) {
        StringBuilder strBuilder = new StringBuilder("");
        strBuilder.append(user.getId())
                .append(cvsSplitBy)
                .append(user.getName())
                .append(cvsSplitBy)
                .append(user.getLogin())
                .append(cvsSplitBy)
                .append(user.getPassword())
                .append(cvsSplitBy)
                .append(user.getIdGroup())
                .append('\n');

        return strBuilder.toString();
    }
}
