/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-08-14 05:37:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.inquiry;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import inquiry.model.vo.Inquiry;
import member.model.vo.Member;
import member.model.vo.Member;

public final class inquiry_005fupdateform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/views/inquiry/../include/footer.jsp", Long.valueOf(1597276855223L));
    _jspx_dependants.put("/views/inquiry/../include/header.jsp", Long.valueOf(1597376070781L));
    _jspx_dependants.put("/views/inquiry/../include/head.jsp", Long.valueOf(1597276855223L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("inquiry.model.vo.Inquiry");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	Inquiry inquiry = (Inquiry)request.getAttribute("inquiry");
	int currentPage = (Integer)request.getAttribute("page");
	
	String[] checked = new String[4];
	switch(inquiry.getIqType()){
	case "회원정보" : checked[0] = "checked"; break;
	case "오류" : checked[1] = "checked"; break;
	case "제안하기" : checked[2] = "checked"; break;
	case "기타" : checked[3] = "checked"; break;
	}
	
	boolean[] fileExist = new boolean[3];

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/anavada/resources/js/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("<meta name=\"title\" content=\"Anavada\" />\r\n");
      out.write("<meta name=\"description\" content=\"Anavada 설명\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"Anavada 키워드\" />\r\n");
      out.write("\r\n");
      out.write("<title>Anavada</title>\r\n");
      out.write("\r\n");
      out.write("<link href=\"/anavada/resources/css/common.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"/anavada/resources/js/jquery-1.12.4.js\"></script>\r\n");
      out.write("<script src=\"/anavada/resources/js/bootstrap.js\"></script>\r\n");
      out.write("<script src=\"/anavada/resources/js/common.js\"></script>\r\n");
      out.write("<script src=\"/anavada/resources/js/vegas.js\"></script>\r\n");
      out.write("<script src=\"/anavada/resources/js/swiper.min.js\"></script>\r\n");
      out.write("<script src=\"/anavada/resources/js/mainNotice.js\"></script>\r\n");
      out.write("<script src=\"/anavada/resources/js/member.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!--티스토리 불펌금지-->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    var omitformtags=[\"input\", \"textarea\", \"select\"]\r\n");
      out.write("    omitformtags=omitformtags.join(\"|\")\r\n");
      out.write("    function disableselect(e){\r\n");
      out.write("    if (omitformtags.indexOf(e.target.tagName.toLowerCase())==-1)\r\n");
      out.write("        return false\r\n");
      out.write("    }\r\n");
      out.write("    function reEnable(){\r\n");
      out.write("        return true\r\n");
      out.write("    }\r\n");
      out.write("    if (typeof document.onselectstart!=\"undefined\")\r\n");
      out.write("        document.onselectstart=new Function (\"return false\")\r\n");
      out.write("    else{\r\n");
      out.write("        document.onmousedown=disableselect\r\n");
      out.write("        document.onmouseup=reEnable\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
 Member loginMember = (Member)session.getAttribute("loginMember"); 
      out.write('\r');
      out.write('\n');
 Member member = (Member)request.getAttribute("member"); 
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    function deleteFile(no, value, page) {\r\n");
      out.write("    \tif(confirm(\"삭제하시겠습니까?\"))\r\n");
      out.write("    \t\tlocation.href = \"/anavada/ideletefile?no=\"+no+\"&value=\"+value+\"&page=\"+page;\r\n");
      out.write("    }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body oncontextmenu=\"return false\" onselectstart=\"return false\" ondragstart=\"return false\">\r\n");
      out.write("    <div id=\"wrap\">\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- 상단메뉴 -->\r\n");
      out.write("    <dl class=\"gnbWrap clearfix\">\r\n");
      out.write("    \t<dt><h1><a href=\"/anavada/\" title=\"Anavada\">Anavada</a></h1></dt>\r\n");
      out.write("        <dd>\r\n");
      out.write("            <ul class=\"gnb clearfix\">\r\n");
      out.write("                <li><a href=\"/anavada/jblist\">중고거래</a></li>\r\n");
      out.write("                <li><a href=\"/anavada/clistview?page=1&local=0\">커뮤니티</a></li>\r\n");
      out.write("                <li><a href=\"/anavada/fbklist\">지역축제</a></li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"/anavada/nlist\">고객센터</a>\r\n");
      out.write("                    <div class=\"subGnb\">\r\n");
      out.write("                        <a href=\"/anavada/nlist\">공지사항</a>\r\n");
      out.write("                        <a href=\"/anavada/flist\">FAQ</a>\r\n");
      out.write("                      ");
 if(loginMember != null) { 
      out.write("\r\n");
      out.write("                        <a href=\"/anavada/ilist\">문의하기</a>\r\n");
      out.write("                        ");
 }else { 
      out.write("<a href=\"/anavada/views/member/login.jsp\">문의하기</a>");
 } 
      out.write("\r\n");
      out.write("                        ");
 if(loginMember != null && loginMember.getMemberId().equals("admin")){ 
      out.write("\r\n");
      out.write("                        <a href=\"/anavada//dbolist.ad\">신고하기</a>\r\n");
      out.write("                        ");
 }else{ 
      out.write("\r\n");
      out.write("                        <a href=\"/anavada/dbolist\">신고하기</a>\r\n");
      out.write("                        ");
 } 
      out.write("\r\n");
      out.write("                   \t\t\r\n");
      out.write("                     \r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </dd>\r\n");
      out.write("        <dt>\r\n");
      out.write("            <ul class=\"util\">\r\n");
      out.write("                <li>\r\n");
      out.write("                    <form action=\"\" method=\"\">\r\n");
      out.write("                        <input type=\"text\" placeholder=\"검색어를 입력해주세요.\">\r\n");
      out.write("                        <button class=\"top-search\"><i class=\"xi-search\"></i></button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </li>\r\n");
      out.write("                ");
 if(loginMember == null){ 
      out.write("\r\n");
      out.write("                <li><a class=\"hover_line01\" href=\"/anavada/views/member/join_agree.jsp\">JOIN</a></li>\r\n");
      out.write("                <li><a class=\"hover_line01\" href=\"/anavada/views/member/login.jsp\">LOGIN</a></li>\r\n");
      out.write("                ");
 } else if(loginMember.getMemberId().equals("admin")){ 
      out.write("\r\n");
      out.write("                <li><a class=\"hover_line01\" href=\"/anavada/mlist.ad?memberId=");
      out.print( loginMember.getMemberId() );
      out.write("&secessionOK=N\">관리자페이지</a></li>\r\n");
      out.write("                <li><a class=\"hover_line01\" href=\"/anavada/logout\">LOGOUT</a></li>\r\n");
      out.write("                ");
 } else { 
      out.write("\r\n");
      out.write("                <li><a class=\"hover_line01\" href=\"/anavada/mypage.cp?memberId=");
      out.print( loginMember.getMemberId() );
      out.write("\">MYPAGE</a></li>\r\n");
      out.write("                <li><a class=\"hover_line01\" href=\"/anavada/logout\">LOGOUT</a></li>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("                <li><i id=\"favorite\" class=\"xi-star-o\" title=\"즐겨찾기 등록\"></i></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </dt>\r\n");
      out.write("    </dl>\r\n");
      out.write("    <!-- //상단메뉴 -->\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- 컨텐츠 -->\r\n");
      out.write("        <div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("            <!--서브 비주얼/타이틀-->\r\n");
      out.write("            <div class=\"visual-sub-vagas notice-vagas\">\r\n");
      out.write("                <div class=\"vsv-copy sub-title\">\r\n");
      out.write("                   <div>\r\n");
      out.write("                        <ul class=\"navi\">\r\n");
      out.write("                            <li><a href=\"#none\">홈</a></li>\r\n");
      out.write("                            <li><a href=\"#none\">고객센터</a></li>\r\n");
      out.write("                            <li class=\"glyphicon glyphicon-menu-right\"><a href=\"#none\">문의하기</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <h2><span>문의하기</span></h2>\r\n");
      out.write("                    <h3>관리자에게 문의할 수 있는 공간입니다.</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--서브 비주얼/타이틀 끝-->\r\n");
      out.write("\r\n");
      out.write("            <!-- 글쓰기 -->\r\n");
      out.write("            <div class=\"write-area\">\r\n");
      out.write("                <form action=\"/anavada/iupdateiq\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" value=\"");
      out.print( inquiry.getIqNo() );
      out.write("\" name=\"no\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" value=\"");
      out.print( currentPage );
      out.write("\" name=\"page\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" value=\"");
      out.print( inquiry.getIqOriginal() );
      out.write("\" name=\"ofile\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" value=\"");
      out.print( inquiry.getIqRename() );
      out.write("\" name=\"rfile\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" value=\"");
      out.print( inquiry.getIqOriginal2() );
      out.write("\" name=\"ofile2\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" value=\"");
      out.print( inquiry.getIqRename2() );
      out.write("\" name=\"rfile2\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" value=\"");
      out.print( inquiry.getIqOriginal3() );
      out.write("\" name=\"ofile3\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" value=\"");
      out.print( inquiry.getIqRename3() );
      out.write("\" name=\"rfile3\">\r\n");
      out.write("                    <h2>문의글 수정</h2>\r\n");
      out.write("\r\n");
      out.write("                    <table>\r\n");
      out.write("                        <colgroup>\r\n");
      out.write("                            <col width=\"20%\">\r\n");
      out.write("                            <col width=\"80%\">\r\n");
      out.write("                        </colgroup>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>카테고리</td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <label><input type=\"radio\" name=\"type\" value=\"member\" ");
      out.print( checked[0] );
      out.write(">회원정보</label>\r\n");
      out.write("                                    <label><input type=\"radio\" name=\"type\" value=\"error\" ");
      out.print( checked[1] );
      out.write(">오류</label>\r\n");
      out.write("                                    <label><input type=\"radio\" name=\"type\" value=\"proposal\" ");
      out.print( checked[2] );
      out.write(">제안하기</label>\r\n");
      out.write("                                    <label><input type=\"radio\" name=\"type\" value=\"etc\" ");
      out.print( checked[3] );
      out.write(">기타</label>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>제목</td>\r\n");
      out.write("                                <td><input type=\"text\" name=\"title\" class=\"form-control w100p\" placeholder=\"제목\" value=\"");
      out.print( inquiry.getIqTitle() );
      out.write("\"></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>내용</td>\r\n");
      out.write("                                <td><textarea name=\"content\" class=\"form-control\" style=\"resize: none; width:100%; min-height:300px; max-height:300px;\">");
      out.print( inquiry.getIqContent() );
      out.write("</textarea></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr class=\"filebox\">\r\n");
      out.write("                                <td>첨부파일</td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                ");
 if(inquiry.getIqOriginal() != null) { fileExist[0] = true;
      out.write("\r\n");
      out.write("                                \t");
      out.print( inquiry.getIqOriginal() );
      out.write(" &nbsp; <button onclick=\"deleteFile(");
      out.print( inquiry.getIqNo() );
      out.write(", 1, ");
      out.print( currentPage );
      out.write("); return false;\">삭제</button> &nbsp; &nbsp; &nbsp; &nbsp;\r\n");
      out.write("                                ");
 } if(inquiry.getIqOriginal2() != null) { fileExist[1] = true;
      out.write("\r\n");
      out.write("                                \t");
      out.print( inquiry.getIqOriginal2() );
      out.write(" &nbsp; <button onclick=\"deleteFile(");
      out.print( inquiry.getIqNo() );
      out.write(", 2, ");
      out.print( currentPage );
      out.write("); return false;\">삭제</button> &nbsp; &nbsp; &nbsp; &nbsp;\r\n");
      out.write("                                ");
 } if(inquiry.getIqOriginal3() != null) { fileExist[2] = true;
      out.write("\r\n");
      out.write("                               \t\t");
      out.print( inquiry.getIqOriginal3() );
      out.write(" &nbsp; <button onclick=\"deleteFile(");
      out.print( inquiry.getIqNo() );
      out.write(", 3, ");
      out.print( currentPage );
      out.write("); return false;\">삭제</button>\r\n");
      out.write("                                ");
 } 
      out.write("\r\n");
      out.write("                                \r\n");
      out.write("                                ");
 for(int i=0; i<fileExist.length; i++) { 
                                	if(!fileExist[i]) {	
                                		switch(i) {
                                		case 0 : 
      out.write("<input type=\"file\" name=\"newofile1\">");
break;
                                		case 1 : 
      out.write("<input type=\"file\" name=\"newofile2\">");
break;
                                		case 2 : 
      out.write("<input type=\"file\" name=\"newofile3\"></td>");
break;  } } } 
      out.write("\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"write-btn\">\r\n");
      out.write("                    \t<input type=\"reset\" class=\"btn btn-success\" value=\"수정취소\" style=\"width:100px;\">\r\n");
      out.write("                        <a onclick=\"javascipt:history.go(-1); return false;\" class=\"btn btn-list\">뒤로가기</a>\r\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-success\" value=\"수정하기\" style=\"width:100px;\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- 글쓰기 끝 -->\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 컨텐츠 끝 -->\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("    <dl>\r\n");
      out.write("        <dt>\r\n");
      out.write("            <a href=\"/anavada/views/etc/terms.jsp\">이용약관</a>\r\n");
      out.write("            <a href=\"/anavada/views/etc/privacy.jsp\">개인정보처리방침</a>\r\n");
      out.write("            <a href=\"/anavada/views/etc/email.jsp\">이메일무단수집거부</a>\r\n");
      out.write("        </dt>\r\n");
      out.write("        <dd>\r\n");
      out.write("        \tAnavada | 서울특별시 중구 남대문로 120 대일빌딩 2F, 3F | 대표자 : 공유 | 개인정보 담당자 : 강동원 | 고객센터 : 1577-7777<br/>\r\n");
      out.write("            <span>Copyright 2020. Anavada. All Rights Reserved</span>\r\n");
      out.write("        </dd>\r\n");
      out.write("    </dl>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
