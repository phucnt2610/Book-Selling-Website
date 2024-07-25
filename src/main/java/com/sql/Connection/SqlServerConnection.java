package com.sql.Connection;

import java.sql.Connection;
import java.sql.DriverManager;

//Hai
public class SqlServerConnection {
	private final String serverName = "LAPTOP-VDUMRGAT\\SQLEXPRESS";
	private final String dbName = "DemoWeb";
	private final String portNumber = "1433";
	private final String instance = "";
	private final String userID = "sa";
	private final String password = "12";


	public Connection getConnection() throws Exception {
		String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + "\\" + instance + ";databaseName=" + dbName;
		if (instance == null || instance.trim().isEmpty())
			url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		return DriverManager.getConnection(url, userID, password);
	}

}
