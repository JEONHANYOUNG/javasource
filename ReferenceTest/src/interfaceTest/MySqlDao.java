package interfaceTest;

public class MySqlDao implements DataAccessObject{ // <- 2) implements Soundable �Է�

    @Override
	public void select() { // <- 3) sound �Է� �� �ڵ� ����
	System.out.println("DB���� �˻�");
	}
    @Override
    public void insert() { // <- 3) sound �Է� �� �ڵ� ����
	System.out.println("DB���� ����");
    }
    @Override 
    public void update() { // <- 3) sound �Է� �� �ڵ� ����
   	System.out.println("DB���� ����");
    }
    @Override
    public void delete() { // <- 3) sound �Է� �� �ڵ� ����
    System.out.println("DB���� ����");
    }
	
}
