<?xml version="1.0" encoding="UTF-8" ?>
<%@page import="services.*, utils.*,java.util.*,java.sql.*"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Insert title here</title>
</head>
<body>
<%
TopicService topicService = TopicService.create();
try {
		ArrayList<DBObject> allTopics=topicService.list();		
		for(DBObject t: allTopics){%>
			<div><%=((Topic)t).getName()%></div>
		<%}		
	} catch (SQLException e) {
		e.printStackTrace();
	}
%>
</body>
</html>