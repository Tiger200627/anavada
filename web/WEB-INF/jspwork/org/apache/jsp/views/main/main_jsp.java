/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-08-07 00:05:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.Member;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/views/main/../include/header.jsp", Long.valueOf(1596758713837L));
    _jspx_dependants.put("/views/main/../include/footer.jsp", Long.valueOf(1596705633788L));
    _jspx_dependants.put("/views/main/../include/head.jsp", Long.valueOf(1596705633788L));
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
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
      out.write("\r\n");
      out.write("<!--티스토리 불펌금지-->\r\n");
      out.write("\r\n");
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
      out.write("</script>");
      out.write(" \r\n");
      out.write("</head>\r\n");
      out.write("<body oncontextmenu=\"return false\" onselectstart=\"return false\" ondragstart=\"return false\">\r\n");
      out.write("    <div id=\"wrap\">\r\n");
      out.write("        ");
      out.write('\r');
      out.write('\n');
 Member loginMember = (Member)session.getAttribute("loginMember"); 
      out.write("\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("\t<!-- 상단메뉴 -->\r\n");
      out.write("    <dl class=\"gnbWrap clearfix\">\r\n");
      out.write("    \t<dt><h1><a href=\"/anavada/\" title=\"Anavada\">Anavada</a></h1></dt>\r\n");
      out.write("        <dd>\r\n");
      out.write("            <ul class=\"gnb clearfix\">\r\n");
      out.write("                <li><a href=\"/anavada/jblist\">중고거래</a></li>\r\n");
      out.write("                <li><a href=\"/anavada/clistview?page=1&local=0\">커뮤니티</a></li>\r\n");
      out.write("                <li><a href=\"../fboard/areaEvent_list.jsp\">지역축제</a></li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"/anavada/nlist\">고객센터</a>\r\n");
      out.write("                    <div class=\"subGnb\">\r\n");
      out.write("                        <a href=\"/anavada/nlist\">공지사항</a>\r\n");
      out.write("                        <a href=\"/anavada/views/notice/faq_list.jsp\">FAQ</a>\r\n");
      out.write("                        <a href=\"/anavada/views/inquiry/inquiry_list.jsp\">문의하기</a>\r\n");
      out.write("                        <a href=\"../declare/declare_list.jsp\">신고하기</a>\r\n");
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
      out.write("                <li><a class=\"hover_line01\" href=\"../member/join_agree.jsp\">JOIN</a></li>\r\n");
      out.write("                <li><a class=\"hover_line01\" href=\"../member/login.jsp\">LOGIN</a></li>\r\n");
      out.write("                ");
 } else if(loginMember.getMemberId().equals("admin")){ 
      out.write("\r\n");
      out.write("                <li><a class=\"hover_line01\" href=\"../admin/member/memberList.jsp\">관리자페이지</a></li>\r\n");
      out.write("                <li><a class=\"hover_line01\" href=\"/anavada/logout\">LOGOUT</a></li>\r\n");
      out.write("                ");
 } else { 
      out.write("\r\n");
      out.write("                <li><a class=\"hover_line01\" href=\"../member/MyInfoModify.jsp\">MYPAGE</a></li>\r\n");
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
      out.write("        <!-- 비주얼영역 -->\r\n");
      out.write("\r\n");
      out.write("        <div id=\"main_visual\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("            <ol class=\"carousel-indicators\">\r\n");
      out.write("                <li data-target=\"#main_visual\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("                <li data-target=\"#main_visual\" data-slide-to=\"1\"></li>\r\n");
      out.write("            </ol>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("                <div class=\"item active\">\r\n");
      out.write("                    <div class=\"main_vText\">\r\n");
      out.write("                        <h2>도심 속 우리의 연결고리</h2>\r\n");
      out.write("                        <p>'Anavada'와 함께하는 이웃거래와 지역축제의 활성화</p>\r\n");
      out.write("                        <a class=\"btn-primary\" href=\"#none\" role=\"button\">자세히보기</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"item\">\r\n");
      out.write("                    <div class=\"main_vText\">\r\n");
      out.write("                        <h2>여러분, 우리와 함께해요!</h2>\r\n");
      out.write("                        <p>'Anavada'의 커뮤니티에서 다양한 정보와 소식을 공유</p>\r\n");
      out.write("                        <a class=\"btn-primary\" href=\"#none\" role=\"button\">자세히보기</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <a class=\"left carousel-control\" href=\"#main_visual\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\r\n");
      out.write("                <span class=\"sr-only\">Previous</span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a class=\"right carousel-control\" href=\"#main_visual\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\r\n");
      out.write("                <span class=\"sr-only\">Next</span>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 비주얼영역 끝 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"main_content\">\r\n");
      out.write("            <div id=\"mainNotice\" class=\"mainNotice\">\r\n");
      out.write("                <ul class=\"Notice\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <h2 onclick=\"location.href=''\"><span>[공지] </span> 'Anavada' 홈페이지가 오픈되었습니다!</h2>\r\n");
      out.write("                        <div>조회수 : 1</div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <h2 onclick=\"location.href=''\">1. 'Anavada' 홈페이지가 오픈되었습니다!</h2>\r\n");
      out.write("                        <div>조회수 : 1</div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <h2 onclick=\"location.href=''\">2. 'Anavada' 홈페이지가 오픈되었습니다!</h2>\r\n");
      out.write("                        <div>조회수 : 1</div>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("                <ul class=\"Notice\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <h2 onclick=\"location.href=''\"><span>[문의] </span> 'Anavada' 홈페이지가 오픈되었습니다!</h2>\r\n");
      out.write("                        <div>조회수 : 1</div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <h2 onclick=\"location.href=''\">1. 'Anavada' 홈페이지가 오픈되었습니다!</h2>\r\n");
      out.write("                        <div>조회수 : 1</div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <h2 onclick=\"location.href=''\">2. 'Anavada' 홈페이지가 오픈되었습니다!</h2>\r\n");
      out.write("                        <div>조회수 : 1</div>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div>\r\n");
      out.write("                <div class=\"mianPdt\">\r\n");
      out.write("                    <h2>지금 당장 만나는 중고거래!</h2>\r\n");
      out.write("                    <a href=\"#none\" class=\"more\">더보기 +</a>\r\n");
      out.write("                    <ul class=\"Pdt_list\">\r\n");
      out.write("                        <li onclick=\"location.href=''\">\r\n");
      out.write("                            <div><img src=\"/anavada/resources/images/test/testImg.jpg\"/></div>\r\n");
      out.write("                            <h3>밤하늘의 별</h3>\r\n");
      out.write("                            <h4>700,000 <span>원</span></h4>\r\n");
      out.write("                            <p><i class=\"good_i glyphicon glyphicon-heart-empty\">좋아요<span>+999</span></i></p>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li onclick=\"location.href=''\">\r\n");
      out.write("                            <div><img src=\"/anavada/resources/images/test/testImg.jpg\"/></div>\r\n");
      out.write("                            <h3>찌릿찌릿</h3>\r\n");
      out.write("                            <h4>800,000 <span>원</span></h4>\r\n");
      out.write("                            <p><i class=\"good_i glyphicon glyphicon-heart-empty\">좋아요<span>+999</span></i></p>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li onclick=\"location.href=''\">\r\n");
      out.write("                            <div><img src=\"/anavada/resources/images/test/testImg.jpg\"/></div>\r\n");
      out.write("                            <h3>집집집집</h3>\r\n");
      out.write("                            <h4>1,000,000 <span>원</span></h4>\r\n");
      out.write("                            <p><i class=\"good_i glyphicon glyphicon-heart-empty\">좋아요<span>+999</span></i></p>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li onclick=\"location.href=''\">\r\n");
      out.write("                            <div><img src=\"/anavada/resources/images/test/testImg.jpg\"/></div>\r\n");
      out.write("                            <h3>레몬에이드</h3>\r\n");
      out.write("                            <h4>7,800,000 <span>원</span></h4>\r\n");
      out.write("                            <p><i class=\"good_i glyphicon glyphicon-heart-empty\">좋아요<span>+999</span></i></p>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"mianCnt\">\r\n");
      out.write("                    <h2>우리동네 커뮤니티!</h2>\r\n");
      out.write("                    <a href=\"#none\" class=\"more\">더보기 +</a>\r\n");
      out.write("                    <div class=\"Cnt_list\">\r\n");
      out.write("                        <dl>\r\n");
      out.write("                            <dt><span>1</span></dt>\r\n");
      out.write("                            <dd>\r\n");
      out.write("                                <h3 onclick=\"location.href=''\"><span>[종로구] </span>응용 SW 기초기술 활용</h3>\r\n");
      out.write("                                <p class=\"con\" onclick=\"location.href=''\">정보시스템 진단 및 모의해킹 전문가 양성 과정 1회차_실전대비면접</p>\r\n");
      out.write("                                <p><i class=\"good_i glyphicon glyphicon-heart-empty\">좋아요<span>+999</span></i><i class=\"score_i glyphicon glyphicon-user\">조회수<span>+999</span></i></p>\r\n");
      out.write("                            </dd>\r\n");
      out.write("                        </dl>\r\n");
      out.write("                        <dl>\r\n");
      out.write("                            <dt><span>2</span></dt>\r\n");
      out.write("                            <dd>\r\n");
      out.write("                                <h3 onclick=\"location.href=''\"><span>[종로구] </span>응용 SW 기초기술 활용</h3>\r\n");
      out.write("                                <p class=\"con\" onclick=\"location.href=''\">정보시스템 진단 및 모의해킹 전문가 양성 과정 1회차_실전대비면접</p>\r\n");
      out.write("                                <p><i class=\"good_i glyphicon glyphicon-heart-empty\">좋아요<span>+999</span></i><i class=\"score_i glyphicon glyphicon-user\">조회수<span>+999</span></i></p>\r\n");
      out.write("                            </dd>\r\n");
      out.write("                        </dl>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mainEvent\">\r\n");
      out.write("                <h2>함께 즐기는 지역축제</h2>\r\n");
      out.write("                <p>남녀노소 모두와 나누는 우리 지역만의 축제로!</p>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"#none\"><img src=\"/anavada/resources/images/test/testImg.jpg\" width=\"150px\" height=\"150px\" /></a></li>\r\n");
      out.write("                    <li><a href=\"#none\"><img src=\"/anavada/resources/images/test/testImg.jpg\" width=\"150px\" height=\"150px\" /></a></li>\r\n");
      out.write("                    <li><a href=\"#none\"><img src=\"/anavada/resources/images/test/testImg.jpg\" width=\"150px\" height=\"150px\" /></a></li>\r\n");
      out.write("                    <li><a href=\"#none\"><img src=\"/anavada/resources/images/test/testImg.jpg\" width=\"150px\" height=\"150px\" /></a></li>\r\n");
      out.write("                    <li><a href=\"#none\"><img src=\"/anavada/resources/images/test/testImg.jpg\" width=\"150px\" height=\"150px\" /></a></li>\r\n");
      out.write("                    <li><a href=\"#none\"><img src=\"/anavada/resources/images/test/testImg.jpg\" width=\"150px\" height=\"150px\" /></a></li>\r\n");
      out.write("                    <li><a href=\"#none\"><img src=\"/anavada/resources/images/test/testImg.jpg\" width=\"150px\" height=\"150px\" /></a></li>\r\n");
      out.write("                    <li><a href=\"#none\"><img src=\"/anavada/resources/images/test/testImg.jpg\" width=\"150px\" height=\"150px\" /></a></li>\r\n");
      out.write("                </ul>    \r\n");
      out.write("            </div>           \r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("    <dl>\r\n");
      out.write("        <dt>\r\n");
      out.write("            <a href=\"../etc/terms.jsp\">이용약관</a>\r\n");
      out.write("            <a href=\"../etc/privacy.jsp\">개인정보처리방침</a>\r\n");
      out.write("            <a href=\"../etc/email.jsp\">이메일무단수집거부</a>\r\n");
      out.write("        </dt>\r\n");
      out.write("        <dd>\r\n");
      out.write("        \tAnavada | 서울특별시 중구 남대문로 120 대일빌딩 2F, 3F | 대표자 : 공유 | 개인정보 담당자 : 강동원 | 고객센터 : 1577-7777<br/>\r\n");
      out.write("            <span>Copyright 2020. Anavada. All Rights Reserved</span>\r\n");
      out.write("        </dd>\r\n");
      out.write("    </dl>\r\n");
      out.write("</div>");
      out.write(" \r\n");
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
