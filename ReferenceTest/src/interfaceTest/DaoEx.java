package interfaceTest;

public class DaoEx {
public static void main(String[] args) {
	dbWork(new OracleDao()); // <- 1) class ����
	dbWork(new MySqlDao()); // <- 1) class ����
	
}


public static void dbWork(DataAccessObject dao) {
	dao.select();
	dao.insert();
	dao.update();
	dao.delete();
	
}
}
