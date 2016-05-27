package services;

import java.sql.*;

public class Topic implements DBObject {

	private int id;
	private int parent_id;
	private String name;
	private int position;

	public Topic(int id, int parentId, String name, int position) {
		setId(id);
		setParent_id(parentId);
		setName(name);
		setPosition(position);
	}

	public Topic(ResultSet resultSet) throws SQLException {
		setId(resultSet.getInt("id"));
		setParent_id(resultSet.getInt("parent_id"));
		setName(resultSet.getString("name"));
		setPosition(resultSet.getInt("position"));
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getParent_id() {
		return parent_id;
	}

	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

}
