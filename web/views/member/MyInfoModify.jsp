<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="member.model.vo.Member"%>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="../include/head.jsp" %>
</head>
<body oncontextmenu="return false" onselectstart="return false" ondragstart="return false">
    <div id="wrap">
        <%@ include file="../include/header.jsp" %>
        <!-- 컨텐츠 -->
        <div id="content">

            <!--서브 비주얼/타이틀-->
            <div class="visual-sub-vagas mypage-vagas">
                <div class="vsv-copy sub-title">
                   <div>
                        <ul class="navi">
                            <li><a href="#none">홈</a></li>
                            <li><a href="#none">MYPAGE</a></li>
                            <li class="glyphicon glyphicon-menu-right"><a href="#none">정보수정</a></li>
                        </ul>
                    </div>
                    <h2><span>MYPAGE</span></h2>
                    <h3>'Anavada'의 내 정보를 확인할 수 있습니다..</h3>
                </div>
            </div>
            <!--서브 비주얼/타이틀 끝-->
			    
            <!--서브 카테고리-->
            <div class="MyTap">
                <ul>
                    <li class="active"><a href="mypage.ss">정보수정</a></li>
                    <li><a href="MyProduct.jsp">중고거래조회</a></li>
                    <li><a href="MyCmnt.jsp">커뮤니티조회</a></li>
                    <li><a href="MyInquiry.jsp">문의하기조회</a></li>
                    <li><a href="MyDeclare.jsp">신고하기조회</a></li>
                </ul>
            </div>
            <!--서브 카테고리 끝-->

            
            <!--마이페이지컨텐츠-->
            <div class="mypage_area" style="margin-bottom: 100px;">
               
                <h2 class="mypage_title">정보수정</h2>

                <!-- 프로필 -->
				<dl class="profile">
					<dt>
						<div>
							<img src="/anavada/resources/images/test/testImg.jpg"
								width="200px" height="200px">
						</div>
					</dt>
					<dd>
						<div><span>이름</span> : <%= member.getMemberName() %></div>
						<div><span>아이디</span> : <%= member.getMemberId() %></div>
						<div><span>전화번호</span> : <%= member.getMemberPhone() %></div>
						<div><span>이메일</span> : <%= member.getMemberEmail() %></div>
						<div><span>가입일</span> : <%= member.getJoinDate() %></div>
					</dd>
				</dl>
				<!-- 프로필 끝 -->
                <form action="/anavada/mupdate.cp" method="post">
                <table class="InfoModify_table">
                    <colgroup>
                        <col width="20%">
                        <col width="80%">
                    </colgroup>
                    <tbody>
                        <tr>
                            <td>프로필 사진</td>
                            <td>
								<input type="file" name="memberOriginal" title="프로필 사진"/>
                            </td>
                        </tr>
                        <tr>
                            <td>아이디</td>
                            <td><input type="text" name="memberId" id="memberId" title="아이디" class="form-control w100p" placeholder="아이디" value="<%= member.getMemberId() %>" readonly/></td>
                        </tr>
                        <tr>
                            <td>비밀번호</td>
                            <td><input type="password" name="memberPwd" id="memberPwd" title="비밀번호" class="form-control w100p" placeholder="기존 비밀번호" required/></td>
                        </tr>
                        <tr>
                            <td>신규 비밀번호</td>
                            <td class="newPwd">
                                <input type="password" name="memberPwd2" id="memberPw2" title="신규 비밀번호" class="form-control w100p mb5" placeholder="신규 비밀번호 입력"/><br/>

                                <input type="text" name="memberPwd3" id="memberPw3" title="신규 비밀번호 재확인" class="form-control w100p" placeholder="신규 비밀번호 재입력"/>
                            </td>
                        </tr>
                        <tr>
                            <td>이름</td>
                            <td><input type="text" name="memberName" title="이름" class="form-control w100p" placeholder="이름" value="<%= member.getMemberName() %>" readonly/></td>
                        </tr>
                        <tr>
                            <td>이메일</td>
                            <td class="emailArea">
                                <input type="email" name="memberEmail" title="이메일" class="form-control w70p mb5" placeholder="이메일" value="<%= member.getMemberEmail() %>" />
                                <a href="#none" class="btnS1">인증하기</a><br/>

                                <input type="text" name="emailAuth" title="인증번호" class="form-control w70p" placeholder="인증번호" />
                                <a href="#none" class="btnS1">인증확인</a></td>
                        </tr>
                        <tr>
                            <td>휴대폰</td>
                            <td class="telArea"><input type="tel" name="memberPhone" title="휴대폰번호" class="form-control w100p" placeholder="'-' 포함 입력" value="<%= member.getMemberPhone() %>" /></td>
                        </tr>
                        <tr>
                            <td>회원탈퇴</td>
                            <td><button type="button" class="leaveBtn" onclick="memberDelete();">회원탈퇴</button></td>
                        </tr>
                    </tbody>
                </table>

                <div class="write-btn">
                    <a href="javascript:history.go(-1);">이전 페이지</a>
                    <input class="btn btn-list" type="reset" value="수정취소">
                    <input class="btn btn-success" type="submit" value="수정하기">
                </div>
				</form>
            </div>
        </div>
        <!-- 컨텐츠 끝 -->
	    <script>
		    function memberDelete(){
		    	location.href ="/anavada/mdelete.cp?memberId=<%= member.getMemberId()%>";
		    }
	    </script>
    <%@ include file="../include/footer.jsp" %>
    </div>
</body>
</html>