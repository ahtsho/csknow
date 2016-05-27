package tests;

import java.sql.SQLException;
import java.util.ArrayList;

import services.DBObject;
import services.Topic;
import services.TopicService;

public class TopicTester {

	public static void main(String[] args){
		TopicService topicService = TopicService.create();
		
		try {
			ArrayList<DBObject> allTopics=topicService.list();
			
			for(DBObject t: allTopics){
				System.out.println(((Topic)t).getName());
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
