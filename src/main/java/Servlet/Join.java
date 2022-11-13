package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.UserDao;
import Dto.User;
import Service.UserService;

@WebServlet("/join")
public class Join extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String birth = request.getParameter("birth");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String adress = request.getParameter("adress");
		
		User user = new User(id, pw, name, birth, gender, email, phone, adress);
		UserDao userDao = new UserDao();
		UserService userService =  new UserService(userDao);
		userService.insert(user);
		
		//회원가입 완료 -> Servlet - Login
		
		//이미 가입된 사람 -> Servlet - IdFind
		
		//가입 할 수 없는 사람 -> Servlet - JoinBen
		
		
	}
}
