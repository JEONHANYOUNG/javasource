package interfaceTest;

public class MySqlDao implements DataAccessObject{ // <- 2) implements Soundable 입력

    @Override
	public void select() { // <- 3) sound 입력 후 자동 생성
	System.out.println("DB에서 검색");
	}
    @Override
    public void insert() { // <- 3) sound 입력 후 자동 생성
	System.out.println("DB에서 삽입");
    }
    @Override 
    public void update() { // <- 3) sound 입력 후 자동 생성
   	System.out.println("DB에서 수정");
    }
    @Override
    public void delete() { // <- 3) sound 입력 후 자동 생성
    System.out.println("DB에서 삭제");
    }
	
}
