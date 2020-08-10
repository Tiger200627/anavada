package admin.notice.answer.model.dao;

import static common.JDBCTemp.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import admin.notice.answer.model.vo.Answer;

public class AnswerDao {
	
	public AnswerDao() {}

	public Answer selectOne(Connection conn, int no) {
		Answer answer = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from answer where iq_no = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, no);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				answer = new Answer();
				answer.setAnNo(rset.getInt("an_no"));
				answer.setAnContent(rset.getString("an_content"));
				answer.setAnDate(rset.getDate("an_date"));
				answer.setIqNo(rset.getInt("iq_no"));
				answer.setIqId(rset.getString("iq_id"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		return answer;
	}

	public int deleteAnswer(Connection conn, int anNo) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "delete from answer where an_no = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, anNo);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}

	public int updateAnswer(Connection conn, Answer answer) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update answer set an_content = ?, an_date = sysdate, iq_no = ?, iq_id = ? where an_no = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, answer.getAnContent());
			pstmt.setInt(2, answer.getIqNo());
			pstmt.setString(3, answer.getIqId());
			pstmt.setInt(4, answer.getAnNo());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}
	
}
