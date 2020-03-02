package Servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Service.Service;
@WebServlet("/stu")
public class indexServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Service se=new Service();
		Map<String,List> list = new HashMap<String, List>();
		list = se.allinfo();
		HttpSession session = req.getSession();
		session.setAttribute("list", list);
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
	
}
