package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// JDBC 
// ~DAO : database 와 관련된 작업 클래스
// 커넥션  , 조회(select), 삽입, 삭제, 수정

public class EmpDAO {
	// 드라이브 로드
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver"); // 괄호 안에 있는 것은 실행시 오타 발생(그냥은 오류가 표시가 안남)
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##scott";
		String password = "tiger";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public List<EmpDTO> select() { // 커넥션이 안되면 코드가 안되서 주의
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<EmpDTO> list = new ArrayList<EmpDTO>();

		try {
			con = getConnection();
			String sql = "select * from emp_temp order by hiredate desc";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setMgr(rs.getInt("mgr"));
				dto.setHiredate(rs.getDate("hiredate"));
				dto.setSal(rs.getInt("sal"));
				dto.setComm(rs.getInt("comm"));
				dto.setDeptno(rs.getInt("deptno"));
				list.add(dto);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				con.close(); // con의 경우는 다른 항목에 대해서 보조를 해주는 것이므로 맨 마지막으로 닫아줘야함
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}

	// 특정 사원 조회
	public EmpDTO getRow(int empno) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		EmpDTO dto = null; // 하나만 나오면 작성

		try {
			con = getConnection();
			// String sql = "select * from emp where empno=" + empno;

			String sql = "select * from emp_temp where empno=?"; // 사이 띄기 구별 잘해야 함, 대,소문자 구별 안함
			pstmt = con.prepareStatement(sql);

			// 물음표에 대한 처리

			pstmt.setInt(1, empno);

			rs = pstmt.executeQuery();
			if (rs.next()) { // 1) 하나의 행에서 필드별로 가져오기 + EmpDTO 담기
				dto = new EmpDTO();
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setMgr(rs.getInt("mgr"));
				dto.setHiredate(rs.getDate("hiredate"));
				dto.setSal(rs.getInt("sal"));
				dto.setComm(rs.getInt("comm"));
				dto.setDeptno(rs.getInt("deptno"));

				rs.getInt("empno");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}

	// 급여 오름차순
	public List<EmpDTO> orderBySal() { // void 자리에 List<EmpDTO> 넣어주기
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<EmpDTO> list = new ArrayList<EmpDTO>();

		try {
			// 커넥션 연결
			con = getConnection();
			// 커넥션을 통해 SQL 문 보내기
			String sql = "Select ename, sal from emp_temp order by sal"; // 여러개 할려면 => (list 작성)
			pstmt = con.prepareStatement(sql);
			// sql 구문 실행
			rs = pstmt.executeQuery();
			// 받은 결과를 리턴 (여러개 while, 하나만 if)
			while (rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEname(rs.getString(1)); // (1) <= ename
				dto.setSal(rs.getInt(2)); // (2) <= sal
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}

	// 특정 사원의 급여 수정
	public boolean updateSal(int empno, int sal) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean updateFlag = false;
		try {
			con = getConnection();
			String sql = "update emp_temp set sal=? where empno=?"; // 차례대로 ?의 의미
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, sal); // 1=> sal=?, 1번 ?의 의미
			pstmt.setInt(2, empno); // 2=> empno=?, 2번 ?의 의미

			int result = pstmt.executeUpdate();
			if (result > 0) { // update 성공
				updateFlag = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return updateFlag; // true 업데이트 성공, false 업데이트 실패
	}

	// 특정 사원의 추가수당 수정
	public boolean updateComm(int comm, int sal) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean updateFlag = false;

		try {
			con = getConnection();
			String sql = "update emp_temp set comm=? where sal <= ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, comm);
			pstmt.setInt(2, sal);
			int result = pstmt.executeUpdate();
			if (result > 0) { // update 성공
				updateFlag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return updateFlag;
	}

	// 신입사원 입력
	public boolean insertEmp(EmpDTO dto) {

		Connection con = null;
		PreparedStatement pstmt = null;
		boolean insertFlag = false;
		try {
			con = getConnection();
			String sql = "insert into emp_temp(empno,ename,job,mgr,hiredate,sal,comm,deptno)";
			sql += " values(?,?,?,?,sysdate,?,?,?)"; // 물음표인 것들은 받아내기 => ex) (int comm, int sal), 유형을 모를 때는 sql에서 desc
														// emp_temp 입력 후 알아내기;
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getEmpno());
			pstmt.setString(2, dto.getEname());
			pstmt.setString(3, dto.getJob());
			pstmt.setInt(4, dto.getMgr());
			pstmt.setInt(5, dto.getSal());
			pstmt.setInt(6, dto.getComm());
			pstmt.setInt(7, dto.getDeptno());

			int result = pstmt.executeUpdate();
			if (result > 0) { // update 성공
				insertFlag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close(); // con의 경우는 다른 항목에 대해서 보조를 해주는 것이므로 맨 마지막으로 닫아줘야함
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return insertFlag;
	}

	// 특정 사원 삭제
	public boolean deleteEmp(int empno) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean deleteFlag = false;

		try {
			con = getConnection();
			String sql = "delete emp_temp where empno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empno);

			int result = pstmt.executeUpdate();
			if (result > 0) {
				deleteFlag = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return deleteFlag;
	}

}
