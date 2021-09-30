package interfaceTest; // <- 1) interface 생성

public interface DataAccessObject { // <- 4) 항목별 입력 (void) -> OracleDao, MySqlDao 클래스 생성
	void select();
	void insert();
	void update();
	void delete();
}
