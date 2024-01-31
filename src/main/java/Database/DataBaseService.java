package Database;
public class DataBaseService {
	private Database data;
	
	public DataBaseService() {
		System.out.println("0-Args Constructer");
	}
	public DataBaseService(Database data) {
		this.data=data;
	}
	public void setData(Database data) {
		this.data = data;
	}
	public void inject() {
		int con = data.checkConnection();
		if(con>0) {
			System.out.println("Your DataBase Is Connected");
		}else {
                 System.out.println("you Missed Somethings! database is not connected");
		}
	}


	


	

}
