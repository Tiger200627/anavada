package admin.notice.answer.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.notice.answer.model.service.AnswerService;
import admin.notice.answer.model.vo.Answer;

/**
 * Servlet implementation class AdminAnswerUpdateServlet
 */
@WebServlet("/aaupdate")
public class AdminAnswerUpdateAnswerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminAnswerUpdateAnswerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int page = Integer.parseInt(request.getParameter("page"));
		int no = Integer.parseInt(request.getParameter("no"));
		int anNo = Integer.parseInt(request.getParameter("anNo"));
		
		Answer answer = new Answer();
		answer.setAnNo(anNo);
		answer.setAnContent(request.getParameter("content"));
		answer.setIqId(request.getParameter("id"));
		answer.setIqNo(no);
		
		int result = new AnswerService().updateAnswer(answer);
		
		if(result > 0) {
			response.sendRedirect("aidetail?no="+no+"&page="+page);
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
