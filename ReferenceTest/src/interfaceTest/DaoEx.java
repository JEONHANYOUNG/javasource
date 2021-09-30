package interfaceTest;

public class DaoEx {
public static void main(String[] args) {
	dbWork(new OracleDao()); // <- 1) class 持失
	dbWork(new MySqlDao()); // <- 1) class 持失
	
}


public static void dbWork(DataAccessObject dao) {
	dao.select();
	dao.insert();
	dao.update();
	dao.delete();
	
}
}
