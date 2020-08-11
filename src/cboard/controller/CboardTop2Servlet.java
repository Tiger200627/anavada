package cboard.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import cboard.model.service.CboardService;
import cboard.model.vo.Cboard;

/**
 * Servlet implementation class CboardTop2Servlet
 */
@WebServlet("/ctop2")
public class CboardTop2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CboardTop2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Cboard> list = new CboardService().selectTop2();
		
		JSONObject sendJSON = new JSONObject();
		JSONArray jarr = new JSONArray();
		
		for (Cboard cboard : list) {
			JSONObject job = new JSONObject();
			
			job.put("cnum", cboard.getCboardNo());
			job.put("local", cboard.getLocalNo());
			job.put("ctitle", URLEncoder.encode(cboard.getCboardTitle(), "utf-8"));
			job.put("ccontent", cboard.getCboardContent());
			job.put("clike", cboard.getCboardViewCount());
			job.put("cview", cboard.getCboardViewCount());
			
			jarr.add(job);
		} // for each
		
		sendJSON.put("list", jarr);
		
		response.setContentType("application/json; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.write(sendJSON.toJSONString());
		out.flush();
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}