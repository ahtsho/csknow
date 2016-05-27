package services;

import java.sql.*;
import java.util.ArrayList;

import utils.DBConnectionAdapter;

public class TopicService extends DBObjectService {

	private static TopicService topicService = null;

	private TopicService() {
	}

	public static TopicService create() {
		if (topicService == null) {
			topicService = new TopicService();
		}
		return topicService;
	}

	@Override
	public DBObject insert() throws SQLException {

		return null;
	}

	@Override
	public ArrayList<DBObject> list() throws SQLException {
		Connection connection = DBConnectionAdapter.getConnection();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM topics");

		ArrayList<DBObject> topics = new ArrayList<DBObject>();
		while (resultSet.next()) {
			topics.add((DBObject) new Topic(resultSet));
		}
		resultSet.close();
		statement.close();
		connection.close();
		return topics;
	}

	@Override
	public DBObject update() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DBObject delete() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DBObject select() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
