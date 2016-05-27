package services;

import java.sql.*;
import java.util.*;

public abstract class DBObjectService extends Service{
	
	
	public abstract DBObject insert() throws SQLException;

	public abstract DBObject select() throws SQLException;

	public abstract DBObject update() throws SQLException;

	public abstract DBObject delete() throws SQLException;

	public abstract ArrayList<DBObject> list() throws SQLException;

}
