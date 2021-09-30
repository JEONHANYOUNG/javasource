package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// JDBC 
// ~DAO : database �� ���õ� �۾� Ŭ����
// Ŀ�ؼ�  , ��ȸ(select), ����, ����, ����

public class EmpDAO {
	// ����̺� �ε�
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver"); // ��ȣ �ȿ� �ִ� ���� ����� ��Ÿ �߻�(�׳��� ������ ǥ�ð� �ȳ�)
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

	public List<EmpDTO> select() { // Ŀ�ؼ��� �ȵǸ� �ڵ尡 �ȵǼ� ����
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
				con.close(); // con�� ���� �ٸ� �׸� ���ؼ� ������ ���ִ� ���̹Ƿ� �� ���������� �ݾ������
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}

	// Ư�� ��� ��ȸ
	public EmpDTO getRow(int empno) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		EmpDTO dto = null; // �ϳ��� ������ �ۼ�

		try {
			con = getConnection();
			// String sql = "select * from emp where empno=" + empno;

			String sql = "select * from emp_temp where empno=?"; // ���� ��� ���� ���ؾ� ��, ��,�ҹ��� ���� ����
			pstmt = con.prepareStatement(sql);

			// ����ǥ�� ���� ó��

			pstmt.setInt(1, empno);

			rs = pstmt.executeQuery();
			if (rs.next()) { // 1) �ϳ��� �࿡�� �ʵ庰�� �������� + EmpDTO ���
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

	// �޿� ��������
	public List<EmpDTO> orderBySal() { // void �ڸ��� List<EmpDTO> �־��ֱ�
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<EmpDTO> list = new ArrayList<EmpDTO>();

		try {
			// Ŀ�ؼ� ����
			con = getConnection();
			// Ŀ�ؼ��� ���� SQL �� ������
			String sql = "Select ename, sal from emp_temp order by sal"; // ������ �ҷ��� => (list �ۼ�)
			pstmt = con.prepareStatement(sql);
			// sql ���� ����
			rs = pstmt.executeQuery();
			// ���� ����� ���� (������ while, �ϳ��� if)
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

	// Ư�� ����� �޿� ����
	public boolean updateSal(int empno, int sal) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean updateFlag = false;
		try {
			con = getConnection();
			String sql = "update emp_temp set sal=? where empno=?"; // ���ʴ�� ?�� �ǹ�
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, sal); // 1=> sal=?, 1�� ?�� �ǹ�
			pstmt.setInt(2, empno); // 2=> empno=?, 2�� ?�� �ǹ�

			int result = pstmt.executeUpdate();
			if (result > 0) { // update ����
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
		return updateFlag; // true ������Ʈ ����, false ������Ʈ ����
	}

	// Ư�� ����� �߰����� ����
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
			if (result > 0) { // update ����
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

	// ���Ի�� �Է�
	public boolean insertEmp(EmpDTO dto) {

		Connection con = null;
		PreparedStatement pstmt = null;
		boolean insertFlag = false;
		try {
			con = getConnection();
			String sql = "insert into emp_temp(empno,ename,job,mgr,hiredate,sal,comm,deptno)";
			sql += " values(?,?,?,?,sysdate,?,?,?)"; // ����ǥ�� �͵��� �޾Ƴ��� => ex) (int comm, int sal), ������ �� ���� sql���� desc
														// emp_temp �Է� �� �˾Ƴ���;
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getEmpno());
			pstmt.setString(2, dto.getEname());
			pstmt.setString(3, dto.getJob());
			pstmt.setInt(4, dto.getMgr());
			pstmt.setInt(5, dto.getSal());
			pstmt.setInt(6, dto.getComm());
			pstmt.setInt(7, dto.getDeptno());

			int result = pstmt.executeUpdate();
			if (result > 0) { // update ����
				insertFlag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close(); // con�� ���� �ٸ� �׸� ���ؼ� ������ ���ִ� ���̹Ƿ� �� ���������� �ݾ������
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return insertFlag;
	}

	// Ư�� ��� ����
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
