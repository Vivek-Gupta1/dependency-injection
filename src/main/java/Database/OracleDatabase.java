package Database;

public class OracleDatabase  implements Database{
 
	public OracleDatabase() {
		 System.out.println("oracle 0-args Constructer");
}
	public int checkConnection() {
		return 10;
	}
}
