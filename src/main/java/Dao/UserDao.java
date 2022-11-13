
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Dto.User;

public class UserDao {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "system";
	String password = "1234";

	Connection con = null;

	private void DBcon() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			
			if(con!=null)System.out.print("DB연결 성공");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	//회원가입
	public void insert(User user){
		DBcon();
		
		String sql="insert into lee_user (id,pw,name,bith,gender,email,phone,adress) values(?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, user.getId());
			pst.setString(2, user.getPw());
			pst.setString(3, user.getName());
			pst.setString(4, user.getBirth());
			pst.setString(5, user.getGender());
			pst.setString(6, user.getEmail());
			pst.setString(7, user.getPhone());
			pst.setString(8, user.getAdress());
			pst.executeUpdate();
			
			pst.close();
			con.close();
			System.out.print("DB종료");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	//	아이디 찾기
	//입력 : 이름,휴대폰번호
	//출력 : 아이디
	
	//	비밀번호 찾기
	//입력 : 이름,휴대폰번호,아이디
	//출력 : 비밀번호
	
	//	가입자 확인
	//입력 : 이름,주민번호
	//출력 : 고유키 존재 확인
	//이동 : (로그인/아이디찾기 창 alert)
	//의문 : 
	public boolean IdFind(UserDao user) {
		
		
		return true;
	}
	
	//벤 상태 확인
	//입력 : 이름 생일
	//출력 : 벤 상태인지 확인

}
