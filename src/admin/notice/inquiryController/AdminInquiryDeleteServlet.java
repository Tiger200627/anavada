package admin.notice.inquiryController;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import inquiry.model.service.InquiryService;

/**
 * Servlet implementation class AdminInquiryDeleteServlet
 */
@WebServlet("/aidelete")
public class AdminInquiryDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminInquiryDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	int result = new InquiryService().deleteInquiry(Integer.parseInt(request.getParameter("no")));

    	String savePath = request.getSession().getServletContext().getRealPath("/resources/noticefiles/inquiryfiles");
		
		String rfile = request.getParameter("rfile");
		String rfile2 = request.getParameter("rfile2");
		String rfile3 = request.getParameter("rfile3");
		
		
		if(result > 0) {
			
			if(rfile != null) {
				new File(savePath + "\\" + rfile).delete();
			}if(rfile2 != null) {
				new File(savePath + "\\" + rfile2).delete();
			}if(rfile3 != null) {
				new File(savePath + "\\" + rfile3).delete();
			}
			
			response.sendRedirect("ailist");
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
