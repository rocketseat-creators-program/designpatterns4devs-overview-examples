package anabneri.singleton.connectionPool.after.conn;

public class Connection {
private boolean inUse;

// access inside the class
	public Connection() {
		inUse = false;
	}
	
	public Object query(String sql) {
		System.out.println("Running '" + sql + "' in Connection " + this);
		return null;
	}
	
	boolean isInUse() {
		return inUse;
	}
	
	void setInUse(boolean status) {
		inUse = status;
	}
}
