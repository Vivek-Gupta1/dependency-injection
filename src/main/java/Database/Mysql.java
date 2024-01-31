package Database;

public class Mysql implements Database {
	public Mysql() {
		 System.out.println("MySql 0-args Constructer");
	}
	public int checkConnection() {
		System.out.println("Your Data is Inserting in MySqlDatabse");
		return 10;
	}

}
