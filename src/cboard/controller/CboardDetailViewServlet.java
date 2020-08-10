package cboard.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cboard.model.service.CboardService;
import cboard.model.vo.Cboard;
import creply.model.service.CreplyService;
import creply.model.vo.Creply;

/**
 * Servlet implementation class CboardDetailViewServlet
 */
@WebServlet("/cdetail")
public class CboardDetailViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CboardDetailViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		int cboardNum = Integer.parseInt(request.getParameter("cnum"));
		int currentPage = 1;
		if (request.getParameter("page") != null) {
			currentPage = Integer.parseInt(request.getParameter("page"));
		}
		String local = request.getParameter("local");
		String search = request.getParameter("search");
		String keyword = request.getParameter("keyword");
		
		CboardService cservice = new CboardService();
		
		int allListCount = cservice.getAllListCount();
		
		cservice.addReadCount(cboardNum);
		
		Cboard cboard = cservice.selectCboard(cboardNum);
		System.out.println(cboard);
		System.out.println(currentPage);
		System.out.println(local);
		System.out.println(search);
		System.out.println(keyword);
		System.out.println(allListCount);
		
		CreplyService crservice = new CreplyService();
		ArrayList<Creply> rlist = crservice.creplyList(cboardNum);
		int allReplyCount = crservice.allReplyCount(cboardNum);
		
		
		RequestDispatcher view = null;
		if (cboard != null) {
			view = request.getRequestDispatcher("views/cboard/community_view.jsp");
			request.setAttribute("rlist", rlist);
			request.setAttribute("cboard", cboard);
			request.setAttribute("page", currentPage);
			request.setAttribute("local", local);
			request.setAttribute("search", search);
			request.setAttribute("keyword", keyword);
			request.setAttribute("allListCount", allListCount);
			request.setAttribute("allReplyCount", allReplyCount);
			view.forward(request, response);
		} else {
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", "error");
			view.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
