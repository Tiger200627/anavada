/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-08-11 10:14:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.admin.declare;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import declare.model.vo.Declare;

public final class admindeclareListView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/views/admin/declare/../include/admin_head.jsp", Long.valueOf(1596522599650L));
    _jspx_dependants.put("/views/admin/declare/../include/admin_header.jsp", Long.valueOf(1597114298199L));
    _jspx_dependants.put("/views/admin/declare/../include/admin_footer.jsp", Long.valueOf(1596522599650L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("declare.model.vo.Declare");
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

	ArrayList<Declare> list = (ArrayList<Declare>) request.getAttribute("list");
	int listCount = ((Integer) request.getAttribute("listCount")).intValue();
	int startPage = ((Integer) request.getAttribute("startPage")).intValue();
	int endPage = ((Integer) request.getAttribute("endPage")).intValue();
	int maxPage = ((Integer) request.getAttribute("maxPage")).intValue();
	int currentPage = ((Integer) request.getAttribute("currentPage")).intValue();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>신고자관리</title>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" /> \r\n");
      out.write("<title>Anavada 관리자</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/anavada/resources/admin/css/common.css\">");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body oncontextmenu=\"return false\" onselectstart=\"return false\"\r\n");
      out.write("\tondragstart=\"return false\">\r\n");
      out.write("\t<div id=\"wrap\">\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("  <header id=\"admin_header\">\r\n");
      out.write("   \r\n");
      out.write("    <h1 class=\"logo\">Anavada</h1>  \r\n");
      out.write("    \r\n");
      out.write("    <!-- gnb -->\r\n");
      out.write("    <div class=\"admin_gnb\">\r\n");
      out.write("        \r\n");
      out.write("        <h2><p>회원관리</p></h2>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><a href=\"../member/memberList.jsp\">전체회원</a></li>\r\n");
      out.write("            <li><a href=\"../member/memberSecession.jsp\">탈퇴회원</a></li>\r\n");
      out.write("            <li><a href=\"../member/memberDeclare.jsp\">신고회원</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <h2><p>중고거래/커뮤니티관리</p></h2>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><a href=\"../product/product_list.jsp\">중고거래</a></li>\r\n");
      out.write("            <li><a href=\"../community/community_list.jsp\">커뮤니티</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <h2><p>게시판관리</p></h2>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><a href=\"/anavada/anlist\">공지사항</a></li>\r\n");
      out.write("            <li><a href=\"../notice/faq_list.jsp\">FAQ</a></li>\r\n");
      out.write("            <li><a href=\"../notice/inquiry_list.jsp\">문의하기</a></li>\r\n");
      out.write("            <li><a href=\"/anavada/dlist.ad\">신고자관리</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        \r\n");
      out.write("        <h2><p>홈페이지관리</p></h2>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li><a href=\"/anavada/blist.ad\">사용자배너</a></li>\r\n");
      out.write("            <li><a href=\"../member/adminPwd.jsp\">관리자 계정변경</a></li>\r\n");
      out.write("            <li class=\"homeBtn\"><a href=\"/anavada/\">home</a></li>\r\n");
      out.write("            <li class=\"logoutBtn\"><a href=\"#none\">로그아웃</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- //gnb -->\r\n");
      out.write("\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 컨텐츠 -->\r\n");
      out.write("\t\t<div id=\"admin_container\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- 상단 타이틀 -->\r\n");
      out.write("\t\t\t<div class=\"admin_title\">\r\n");
      out.write("\t\t\t\t<div class=\"admin_path\">\r\n");
      out.write("\t\t\t\t\t<h3>신고자관리</h3>\r\n");
      out.write("\t\t\t\t\t<h2>등록</h2>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- 리스트 -->\r\n");
      out.write("\t\t\t<div class=\"list-area\">\r\n");
      out.write("\t\t\t\t<!--종류 리스트-->\r\n");
      out.write("\t\t\t\t<div style=\"width: 500px; float: left;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"sort-area\">\r\n");
      out.write("\t\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t\t전체\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print( list.size() );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t개\r\n");
      out.write("\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t<!-- <a href=\"/anavada/views/admin/declare/admindeclareWriteView.jsp\" class=\"write_btn\">블랙회원 등록</a> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- <a href=\"/anavada/ddelete.ad\" class=\"write_btn\">삭제하기</a> -->\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <form action=\"\" method=\"\" id=\"\">\r\n");
      out.write("\t\t                            유형 선택 : <select name=\"\" class=\"ListSelect\">\r\n");
      out.write("\t\t                                    <option value=\"분류 선택\" selected=\"selected\">유형</option>\r\n");
      out.write("\t\t                                    <option value=\"중고거래 신고\">중고거래</option>\r\n");
      out.write("\t\t                                    <option value=\"커뮤니티 신고\">커뮤니티</option>\r\n");
      out.write("\t\t                            </select>\r\n");
      out.write("\t\t                            \r\n");
      out.write("\t\t                            <input type=\"text\" placeholder=\"검색어를 입력해주세요.\">\r\n");
      out.write("\t\t                            <button class=\"top-search\"><i class=\"xi-search\"></i></button>\r\n");
      out.write("\t\t                        </form>  -->\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/anavada/resources/js/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("/* $(document).ready(function(){\r\n");
      out.write("\t\t$(\"#all\").on(\"click\", function(){\r\n");
      out.write("\t\t\tif($('input:checkbox[id=\"all\"]').is(\":checked\")==ture){\r\n");
      out.write("\t\t\t\t$('input:checkbox[name=\"no\"]').each(function(){\r\n");
      out.write("\t\t\t\t\tthis.checked = true;\t\t\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$('input:checkbox[name=\"no\"]').each(function){\r\n");
      out.write("\t\t\t\t\tthis.checked = false;\t\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t$(\"#del\").on(\"click\",function(){\r\n");
      out.write("\t\tparamdata=\"\"\r\n");
      out.write("\t\t$('input:checkbox[name=\"no\"]').each(function() {\r\n");
      out.write("\t\t\tif(this.checked){\r\n");
      out.write("\t\t\t\t//alert($(this).closest(\"td\").next().children('input:text[name=\"id\"]').val())\r\n");
      out.write("\t\t\t\tparamdata=paramdata+\"id=\"+\r\n");
      out.write("\t\t\t\t\t$(this).closest(\"td\").next().children('input:text[name=\"no\"]').val()+\"&\"\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\tlocation.href=\"/kimsaemERP/admin/passmodify.do?\"\r\n");
      out.write("\t\t\t\t\t\t\t+paramdata.substr(0, paramdata.length-1)\r\n");
      out.write("\t})\r\n");
      out.write("}) */\r\n");
      out.write("function checkAll(){\r\n");
      out.write("\tif($(\"input[name=checkAll]\").is(\":checked\")){\r\n");
      out.write("\t\t$(\"input[name=checkDel]\").prop(\"checked\", true);\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\t$(\"input[name=checkDel]\").prop(\"checked\", false);\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("function deleteAction(){\r\n");
      out.write("\tvar checkRow = \"\";\r\n");
      out.write("\t$(\"input[name='checkDel']:checked\").each(function(){\r\n");
      out.write("\t\tcheckRow = checkRow + $(this).val()+\",\";\r\n");
      out.write("\t});\r\n");
      out.write("\tcheckRow = checkRow.substring(0, checkRow.lastIndexOf(\",\"));\r\n");
      out.write("\t\r\n");
      out.write("\tif(checkRow == \"\"){\r\n");
      out.write("\t\talert(\"삭제할 대상을 선택하세요.\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tconsole.log(\"### checkRow => {\"+checkRow+\"}\");\r\n");
      out.write("\t\r\n");
      out.write("\tif(confirm(\"삭제 하시겠습니까?\"))\r\n");
      out.write("\t\tlocation.href = \"/anavada/ddelete.ad?checkRow=\"+checkRow;\r\n");
      out.write("}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\t\t\t\t<form action=\"\">\r\n");
      out.write("\t\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t    <th></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>번호</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>신고회원</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>신고횟수</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>제한설정</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 for(Declare d : list){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"checkBox\"><input type=\"checkbox\" name=\"checkDel\" value=\"");
      out.print( d.getDeclareNo() );
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print( d.getDeclareNo() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print( d.getDeclareId() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print( d.getDeclareCount() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 if(d.getDeclareOk().equals("N")){ 
      out.write(" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</i>제한없음</span> &nbsp; \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 }else{// 배너가 보이게 하려면
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</i>제한설정</span> &nbsp; ");
 }  
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- <div class=\"list-no\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/anavada/dlist.ad\">목록</a>\r\n");
      out.write("\t\t\t\t\t\t</div> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- 버튼 -->\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkBox\" name=\"checkAll\" onclick=\"checkAll();\" class=\"checkBox\"> 전체 선택\r\n");
      out.write("                \t<div class=\"btn_wrap\">\r\n");
      out.write("                   \t <a onclick=\"deleteAction();\" class=\"btn-left btn_gray\">선택삭제</a>\r\n");
      out.write("              \t\t</div>\r\n");
      out.write("                <!-- //버튼 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t<!-- 페이지넘버 -->\r\n");
      out.write("\t\t\t\t\t<dl class=\"list-paging pb80\" style=\"width: 100%;\">\r\n");
      out.write("\t\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t\t");
 if(currentPage <= 1){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a><i class=\"glyphicon glyphicon-menu-left\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t\t");
 }else{ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/anavada/dlist.ad?page=1\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-menu-left\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 이전으로 이동처리 -->\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 현재 페이지가 속한 페이지그룹의 숫자 출력 처리 -->\r\n");
      out.write("\t\t\t\t\t\t\t");
 for(int p = startPage; p <= endPage; p++){ 
	                 		if(p == currentPage){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"active\">");
      out.print( p );
      out.write("</a>\r\n");
      out.write("\t\t\t\t\t\t\t");
 }else{ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/anavada/dlist.ad?page=");
      out.print( p );
      out.write('"');
      out.write('>');
      out.print( p );
      out.write("</a>\r\n");
      out.write("\t\t\t\t\t\t\t");
 }} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 맨끝 페이지로 이동처리 -->\r\n");
      out.write("\t\t\t\t\t\t\t");
 if(currentPage >= maxPage){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a><i class=\"glyphicon glyphicon-menu-right\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t\t");
 }else{ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/anavada/dlist.ad?page=");
      out.print( maxPage );
      out.write("\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-menu-right\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <a href=\"#none\" class=\"active\">1</a> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <a href=\"#none\">2</a> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <a href=\"#none\">3</a>활성화 class=\"active\" -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <a href=\"#none\">4</a> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <a href=\"#none\">5</a> -->\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <a href=\"#none\"><i class=\"glyphicon glyphicon-menu-right\"></i></a> -->\r\n");
      out.write("\t\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t\t<!-- 페이지넘버 끝 -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- 리스트 끝 -->\r\n");
      out.write("\t\t\t\t<div style=\"width: 500px; float: right;\">\r\n");
      out.write("\t\t\t\t\t<!-- 글쓰기 -->\r\n");
      out.write("\t\t\t\t\t<form action=\"/anavada/dinsert.ad\" method=\"post\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-inline\" onesubmit=\"return validate();\">\r\n");
      out.write("\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"admin-library-write\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2>블랙회원 등록</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<col width=\"20%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<col width=\"80%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</colgroup>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>회원아이디</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"blackid\" title=\"\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"form-control w100p\" placeholder=\"회원아이디\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!--   <tr>\r\n");
      out.write("                                        <td>신고당한 횟수</td>\r\n");
      out.write("                                        <td>\r\n");
      out.write("                                        \t<label><input type=\"radio\" name=\"count\" id=\"숨기기\" value=\"1\">처음이면</label>\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                    </tr> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>로그인제한 설정(Y/N)</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<!-- <input type=\"text\" name=\"check\" title=\"\" class=\"form-control w100p\" placeholder=\"Y/N\" /> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label><input type=\"radio\" name=\"controller\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"제한설정\" value=\"Y\">제한설정</label> <label><input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\ttype=\"radio\" name=\"controller\" id=\"제한없음\" value=\"N\" checked>제한없음</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- <tr>\r\n");
      out.write("                                        <td>설명</td>\r\n");
      out.write("                                        <td><textarea name=\"content\" rows=\"\" cols=\"\" class=\"form-control\" style=\"resize: none; width:100%; min-height:200px; max-height:200px;\"></textarea></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td>배너파일등록</td>\r\n");
      out.write("                                        <td><input type=\"file\" name=\"ofile\"></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td>URL등록</td>\r\n");
      out.write("                                        <td><input type=\"text\" name=\"url\" title=\"\" class=\"form-control w100p\" placeholder=\"http://\" /></td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td>배경사이즈</td>\r\n");
      out.write("                                       <td><input type=\"text\" name=\"size\" title=\"\" class=\"form-control w100p\" placeholder=\"사이즈\" /></td>\r\n");
      out.write("                                    </tr> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- //글쓰기 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- 버튼 -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"write-btn\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:history.go(-1);\" class=\"btn btn-cancel\">작성취소</a>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" class=\"btn btn-success\" value=\"등록\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- //버튼 -->\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- 컨텐츠 끝 -->\r\n");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("<footer id=\"admin_footer\">\r\n");
      out.write("\t<address>Copyright 2020. Anavada. All Rights Reserved</address>\r\n");
      out.write("</footer>");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
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
