/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-08-13 06:52:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.cboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import cboard.model.service.CboardService;
import cboard.model.vo.Cboard;
import creply.model.vo.Creply;
import member.model.vo.Member;
import member.model.vo.Member;

public final class community_005fview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/views/cboard/../include/footer.jsp", Long.valueOf(1597277304994L));
    _jspx_dependants.put("/views/cboard/../include/head.jsp", Long.valueOf(1597277304995L));
    _jspx_dependants.put("/views/cboard/../include/header.jsp", Long.valueOf(1597288241111L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("cboard.model.service.CboardService");
    _jspx_imports_classes.add("cboard.model.vo.Cboard");
    _jspx_imports_classes.add("creply.model.vo.Creply");
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("java.util.ArrayList");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	ArrayList<Creply> rlist = (ArrayList<Creply>) request.getAttribute("rlist");
	ArrayList<Creply> srlist = (ArrayList<Creply>) request.getAttribute("srlist");
	Cboard cboard = (Cboard) request.getAttribute("cboard");
	String local = String.valueOf(request.getAttribute("local"));
	String search = String.valueOf(request.getAttribute("search"));
	String keyword = String.valueOf(request.getAttribute("keyword"));
	int currentPage = ((Integer) request.getAttribute("page")).intValue();
	int allListCount = ((Integer) request.getAttribute("allListCount")).intValue();
	int allReplyCount = ((Integer) request.getAttribute("allReplyCount")).intValue();
	String[] localArr = { "강남구", "강동구", "강북구", "강서구", "관악구", "광진구", "구로구", "금천구", "노원구", "도봉구", "동대문구", "동작구",
			"마포구", "서대문구", "서초구", "성동구", "성북구", "송파구", "양천구", "영등포구", "용산구", "은평구", "종로구", "중구", "중랑구" };

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
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
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function (){\r\n");
      out.write("\t\t$(\".Subcmt_btn\").click(function () {\r\n");
      out.write("\t\t\t$(this).siblings(\".Subcmt\").toggle(200);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t$(function (){\r\n");
      out.write("\t\t$(\".Subcmt_update_btn\").click(function () {\r\n");
      out.write("\t\t\t$(this).siblings(\".Subcmt_update\").toggle(200);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t$(function (){\r\n");
      out.write("\t\t$(\".Cmt_update_btn\").click(function () {\r\n");
      out.write("\t\t\t$(this).siblings(\".Cmt_update\").toggle(200);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".like {\r\n");
      out.write("\twidth: 50px;\r\n");
      out.write("\theight: 50px;\r\n");
      out.write("\tpadding: 1px;\r\n");
      out.write("\tborder-radius:50%;\r\n");
      out.write("\tborder: 0px;\r\n");
      out.write("\tmargin-right: 15px;\r\n");
      out.write("}\r\n");
      out.write(".report{\r\n");
      out.write("\twidth: 50px;\r\n");
      out.write("\theight: 50px;\r\n");
      out.write("\tpadding: 1px;\r\n");
      out.write("\tborder-radius:50%;\r\n");
      out.write("\tborder: 0px;\r\n");
      out.write("\tmargin-right: 15px;\r\n");
      out.write("}\r\n");
      out.write("font{\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("\tmargin-right: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body oncontextmenu=\"return false\" onselectstart=\"return false\"\r\n");
      out.write("\tondragstart=\"return false\">\r\n");
      out.write("\t<div id=\"wrap\">\r\n");
      out.write("\t");
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
      out.write("                        <a href=\"/anavada/views/notice/faq_list.jsp\">FAQ</a>\r\n");
      out.write("                        <a href=\"/anavada/ilist\">문의하기</a>\r\n");
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
      out.write("\">관리자페이지</a></li>\r\n");
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
      out.write("\t\t<!-- 컨텐츠 -->\r\n");
      out.write("\t\t<div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!--서브 비주얼/타이틀-->\r\n");
      out.write("\t\t\t<div class=\"visual-sub-vagas community-vagas\">\r\n");
      out.write("\t\t\t\t<div class=\"vsv-copy sub-title\">\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"navi\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#none\">홈</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#none\">고객센터</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"glyphicon glyphicon-menu-right\"><a href=\"#none\">커뮤니티</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t<span>커뮤니티</span>\r\n");
      out.write("\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t<h3>우리의 이웃과 'Anavada'를 통해 소통할 수 있는 공간입니다.</h3>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--서브 비주얼/타이틀 끝-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- 상세 -->\r\n");
      out.write("\t\t\t<div class=\"view-area cmnt_view\">\r\n");
      out.write("\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t<span>");
      out.print(localArr[Integer.parseInt(cboard.getLocalNo()) - 1]);
      out.write("</span>");
      out.print(cboard.getCboardTitle());
      out.write("</h2>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><span>작성자 : </span>");
      out.print(cboard.getMemberId());
      out.write("</li>\r\n");
      out.write("\t\t\t\t\t<li><span>등록일 : </span>");
      out.print(cboard.getDate());
      out.write("</li>\r\n");
      out.write("\t\t\t\t\t<li><span>조회수 : </span>");
      out.print(cboard.getCboardViewCount());
      out.write("</li>\r\n");
      out.write("\t\t\t\t\t<li><i class=\"good_i glyphicon glyphicon-heart-empty\">좋아요<span>");
      out.print(cboard.getLikeCount());
      out.write("</span></i></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t");
if((cboard.getCfilesOriginalFilepath1() != null) || (cboard.getCfilesOriginalFilepath2() != null) || (cboard.getCfilesOriginalFilepath3() != null) || (cboard.getCfilesOriginalFilepath4() != null)) { 
      out.write("\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t");

						for (int i = 0; i < 4; i++) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t");

						if (i == 0 && (cboard.getCfilesOriginalFilepath1() != null)) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><span>첨부파일#1 : </span><a\r\n");
      out.write("\t\t\t\t\t\thref=\"/anavada/cfdown?ofile=");
      out.print(cboard.getCfilesOriginalFilepath1());
      out.write("&rfile=");
      out.print(cboard.getCfilesRenameFilepath1());
      out.write('"');
      out.write('>');
      out.print(cboard.getCfilesOriginalFilepath1());
      out.write("</a></li>\r\n");
      out.write("\t\t\t\t\t");

						} else if (i == 1 && cboard.getCfilesOriginalFilepath2() != null) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><span>첨부파일#2 : </span><a\r\n");
      out.write("\t\t\t\t\t\thref=\"/anavada/cfdown?ofile=");
      out.print(cboard.getCfilesOriginalFilepath2());
      out.write("&rfile=");
      out.print(cboard.getCfilesRenameFilepath2());
      out.write('"');
      out.write('>');
      out.print(cboard.getCfilesOriginalFilepath2());
      out.write("</a></li>\r\n");
      out.write("\t\t\t\t\t");

						} else if (i == 2 && cboard.getCfilesOriginalFilepath3() != null) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><span>첨부파일#3 : </span><a\r\n");
      out.write("\t\t\t\t\t\thref=\"/anavada/cfdown?ofile=");
      out.print(cboard.getCfilesOriginalFilepath3());
      out.write("&rfile=");
      out.print(cboard.getCfilesRenameFilepath3());
      out.write('"');
      out.write('>');
      out.print(cboard.getCfilesOriginalFilepath3());
      out.write("</a></li>\r\n");
      out.write("\t\t\t\t\t");

						} else if (i == 3 && cboard.getCfilesOriginalFilepath4() != null) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><span>첨부파일#4 : </span><a\r\n");
      out.write("\t\t\t\t\t\thref=\"/anavada/cfdown?ofile=");
      out.print(cboard.getCfilesOriginalFilepath4());
      out.write("&rfile=");
      out.print(cboard.getCfilesRenameFilepath4());
      out.write('"');
      out.write('>');
      out.print(cboard.getCfilesOriginalFilepath4());
      out.write("</a></li>\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"view-ctn\">\r\n");
      out.write("\t\t\t\t\t");
      out.print(cboard.getCboardContent());
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"float: center; margin: 10px; text-align: center;\">\r\n");
      out.write("\t\t\t\t<div style=\"display: inline-block;\">\r\n");
      out.write("\t\t\t\t\t<button onclick=\"location.href='/anavada/uplike?cnum=");
      out.print(cboard.getCboardNo() );
      out.write("'\" class=\"like\"><i class=\"xi-heart\" style=\"font-size: 300%;\"></i></button>\r\n");
      out.write("\t\t\t\t\t<br><font>");
      out.print( cboard.getLikeCount() );
      out.write("</font>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"display: inline-block;\">\r\n");
      out.write("\t\t\t\t\t<button  onclick=\"location.href='/anavada/upreport?cnum=");
      out.print(cboard.getCboardNo() );
      out.write("'\" class=\"report\"><i class=\"xi-error\" style=\"font-size: 300%;\"></i></button>\r\n");
      out.write("\t\t\t\t\t<br><font>");
      out.print( cboard.getReportCount() );
      out.write("</font>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"view-btn\">\r\n");
      out.write("\t\t\t\t\t");

						if (cboard.getCboardNo() > 1) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\thref=\"/anavada/cdetail?cnum=");
      out.print(cboard.getCboardNo() - 1);
      out.write("&page=");
      out.print(currentPage);
      out.write("&local=");
      out.print(local);
      out.write("&search=");
      out.print(search);
      out.write("&keyword=");
      out.print(keyword);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"btn btn-prev\">이전글</a>\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\t\t\t\t\t");

						if (cboard.getCboardNo() < allListCount) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\thref=\"/anavada/cdetail?cnum=");
      out.print(cboard.getCboardNo() + 1);
      out.write("&page=");
      out.print(currentPage);
      out.write("&local=");
      out.print(local);
      out.write("&search=");
      out.print(search);
      out.write("&keyword=");
      out.print(keyword);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"btn btn-next\">다음글</a>\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"view-btn\">\r\n");
      out.write("\t\t\t\t\t");
 if(loginMember != null && loginMember.getMemberId().equals(cboard.getMemberId())) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t<a href=\"/anavada/cupdateview.ss?cnum=");
      out.print( cboard.getCboardNo() );
      out.write("&local=");
      out.print( cboard.getLocalNo() );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"btn btn-list\">수정</a> \r\n");
      out.write("\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 if(loginMember != null && loginMember.getMemberId().equals(cboard.getMemberId())) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t<a href=\"/anavada/cdelete?cnum=");
      out.print(cboard.getCboardNo());
      out.write("&rfile1=");
      out.print(cboard.getCfilesRenameFilepath1());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t&rfile2=");
      out.print(cboard.getCfilesRenameFilepath2());
      out.write("&rfile3=");
      out.print(cboard.getCfilesRenameFilepath3());
      out.write("&rfile4=");
      out.print(cboard.getCfilesRenameFilepath4());
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"btn btn-list\">삭제</a>\r\n");
      out.write("\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t<a href=\"/anavada/clistview?page=");
      out.print(currentPage);
      out.write("&local=");
      out.print(local);
      out.write("&search=");
      out.print(search);
      out.write("&keyword=");
      out.print(keyword);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"btn btn-list\">목록</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"cmt_wrap\">\r\n");
      out.write("\t\t\t\t");
 if(loginMember != null) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t<form action=\"crwrite.ss\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"writer\" value=\"");
      out.print(loginMember.getMemberId());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"cnum\" value=\"");
      out.print(cboard.getCboardNo());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cmt_form\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4 class=\"cmt_head\">댓글 ");
      out.print( allReplyCount );
      out.write("</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"cmt_body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<textarea name=\"content\" style=\"resize: none; width: 100%; min-height: 100px; max-height: 100px;\" onfocus=\"this.value='';\">비방글은 작성하실 수 없습니다.</textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"cmt_ok\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"등록\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t<ul class=\"cmt_con\">\r\n");
      out.write("\t\t\t\t\t");
 for(Creply c : rlist) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>");
      out.print( c.getMemberId() );
      out.write("</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>");
      out.print( c.getCreplyDate() );
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<p>");
      out.print( c.getCreplyContent() );
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"Subcmt_btn\">대댓글</button>\r\n");
      out.write("\t\t\t\t\t\t\t");
 if(loginMember != null && loginMember.getMemberId().equals(c.getMemberId())) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<button onclick=\"location.href='/anavada/crdelete?crnum=");
      out.print( c.getCreplyNo() );
      out.write("&depth=");
      out.print( c.getCreplyDepth() );
      out.write("&cnum=");
      out.print( cboard.getCboardNo() );
      out.write("'\" style=\"float: right;\">삭제</button>\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"Cmt_update_btn\" style=\"float: right;margin-right: 10px;\">수정</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- 댓글수정입력 폼 시작 -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"Cmt_update\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<form action=\"crupdate.ss\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"crnum\" value=\"");
      out.print( c.getCreplyNo() );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"cnum\" value=\"");
      out.print( c.getCbaordNo() );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"cmt_form\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"cmt_body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<textarea name=\"content\" style=\"resize: none; width: 100%; min-height: 100px; max-height: 100px;\" onfocus=\"this.value='';\">");
      out.print( c.getCreplyContent() );
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"cmt_ok\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"수정\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- 댓글수정입력 폼 끝 -->\r\n");
      out.write("\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
 if(loginMember != null) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- 댓글 등록 폼 시작 -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"Subcmt\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<form action=\"scwrite.ss\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"writer\" value=\"");
      out.print(loginMember.getMemberId());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"cnum\" value=\"");
      out.print(cboard.getCboardNo());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"prnum\" value=\"");
      out.print(c.getCreplyNo());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"cmt_form\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"cmt_body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<textarea name=\"content\" style=\"resize: none; width: 100%; min-height: 100px; max-height: 100px;\" onfocus=\"this.value='';\">비방글은 작성하실 수 없습니다.</textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"cmt_ok\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"등록\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- 댓글 등록 폼 끝 -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 for(Creply sc : srlist) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 if(c.getCreplyNo() == sc.getParantReply()) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- 댓글 수정 입력 폼 시작 -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"Subcmt_form\" style=\"background-color: #E6E6E6;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h4>");
      out.print( sc.getMemberId() );
      out.write("</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span>");
      out.print( sc.getCreplyDate() );
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>");
      out.print( sc.getCreplyContent() );
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 if(loginMember != null && loginMember.getMemberId().equals(sc.getMemberId())) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button onclick=\"location.href='/anavada/crdelete?crnum=");
      out.print( sc.getCreplyNo() );
      out.write("&depth=");
      out.print( sc.getCreplyDepth() );
      out.write("&cnum=");
      out.print( cboard.getCboardNo() );
      out.write("'\" style=\"float: right;\">삭제</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button class=\"Subcmt_update_btn\" style=\"float: right;margin-right: 10px;\">수정</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"Subcmt_update\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<form action=\"crupdate.ss\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"crnum\" value=\"");
      out.print( sc.getCreplyNo() );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"cnum\" value=\"");
      out.print( sc.getCbaordNo() );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"cmt_form\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"cmt_body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<textarea name=\"content\" style=\"resize: none; width: 100%; min-height: 100px; max-height: 100px;\" onfocus=\"this.value='';\">");
      out.print( sc.getCreplyContent() );
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"cmt_ok\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"수정\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- 댓글 수정 입력 폼 끝 -->\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<button class=\"cmt_in\">\r\n");
      out.write("\t\t\t\t\t\t댓글 더보기 <i class=\"glyphicon glyphicon-menu-right\"></i>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- 상세 끝 -->\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- 컨텐츠 끝 -->\r\n");
      out.write("\r\n");
      out.write("\t\t");
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
      out.write("\t</div>\r\n");
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