package declare.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import declare.model.service.DBoService;
import declare.model.service.DeclareService;
import notice.model.service.NoticeService;

/**
 * Servlet implementation class DeclareAdminDeleteServlet
 */
@WebServlet("/ddelete.ad")
public class DeclareAdminDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeclareAdminDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] checkRow = request.getParameter("checkRow").split(",");
		System.out.println(request.getParameter("checkRow")+", "+checkRow.length);
		
		int[] checkedNum = new int[checkRow.length];
		for(int i=0; i<checkRow.length; i++) {
			checkedNum[i] = Integer.parseInt(checkRow[i]);
			System.out.print(checkedNum[i]+", ");
		}System.out.println();
		
		int result = new DeclareService().deleteDeclare(checkedNum);

		if(result > 0)
			response.sendRedirect("dlist.ad");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
