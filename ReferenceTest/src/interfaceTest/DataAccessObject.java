package interfaceTest; // <- 1) interface ����

public interface DataAccessObject { // <- 4) �׸� �Է� (void) -> OracleDao, MySqlDao Ŭ���� ����
	void select();
	void insert();
	void update();
	void delete();
}
