package anabneri.singleton.connectionPool.beforeImplementation;


import anabneri.singleton.connectionPool.beforeImplementation.conn.Connection;
import anabneri.singleton.connectionPool.beforeImplementation.conn.ConnectionPool;

public class Client {
	public static void doQuery1() {
		ConnectionPool pool = new ConnectionPool();
		Connection conn = pool.getConnection();
		if(conn != null)
			conn.query("SELECT * FROM A1");
	}
	
	public static void doQuery2() {
		ConnectionPool pool = new ConnectionPool();
		Connection conn = pool.getConnection();
		if(conn != null)
			conn.query("SELECT * FROM A2");
	}

	public static void doQuery3() {
		ConnectionPool pool = new ConnectionPool();
		Connection conn = pool.getConnection();
		if(conn != null)
			conn.query("SELECT * FROM A3");
	}

	public static void main(String[] args) {
		doQuery1();
		doQuery2();
		doQuery3();
		
		//3 connections was made, even with 2 connections limit
	}
}
