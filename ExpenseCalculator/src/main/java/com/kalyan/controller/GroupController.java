package com.kalyan.controller;

import java.util.List;

import com.kalyan.entity.Group;
import com.kalyan.entity.User;

public class GroupController {


	public Group createGroup(String name, List<User> userList) {

		Group group = new Group(name);

		if (group.avail()) {
			group.addUserList(userList);
		}

		return group;

	}

	public Group updateGroup(String name, List<User> userList) {

		Group group = new Group(name);

		if (group.avail()) {
			group.addUserList(userList);
		}

		return group;

	}

	public Group searchGroup(String name) {

		Group group = new Group(name);
		group.load();
		return group;

	}

	public boolean deleteGroup(String name) {

		Group group = new Group(name);
		group.delete();
		return true;

	}
	
	
	public boolean addUsers(String name,List<User> users) {

		Group group = new Group(name);
		group.addUsers(users);
		return true;

	}
	
	
	public boolean removeUsers(String name,List<User> users) {

		Group group = new Group(name);
		group.removeUsers(users);
		return true;

	}
	

}
