# Anavada

## 목차
1. [프로젝트 소개](#1-프로젝트-소개)
2. [개발 환경](#2-개발-환경)
3. [구현 기능](#3-구현-기능)
4. [구현 영상](#4-구현-영상)
5. [업데이트 현황](#5-업데이트-현황)

## 1. 프로젝트 소개
KH_정보교육원에서 6명이 함께한 Semi 팀 프로젝트입니다.<br>
지역 내에 따뜻한 정(情)을 다시 살리기 위해 지역간의 중고거래, 커뮤니티, 축제정보를 제공하는 웹사이트입니다.<br>

그 중 저는 한국관광공사의 공공데이터 OPEN API를 사용하여 서울시 축제정보를 JSON으로 가지고와 데이터를 가지고<br>
KaKao Map API를 사용하여 축제 위치를 제공하는 서비스등 지역 축제관련 서비스를 맡았습니다.<br>

개발기간은 기획, 설계, 개발 총 한달 간 했습니다.(2020/07/16 ~ 2020/08/17)<br>
자세한 보고서(기획, 설계, 화면 구현 이미지)를 보시려면 [여기](https://drive.google.com/file/d/1yx8NfNtySx3fFh_xHSQogiZPu7gT5eQL/view?usp=sharing)를 클릭해주세요.

## 2. 개발 환경
&nbsp;&nbsp; 💻 &nbsp; Eclipse 2019-12 (4.14.0) | Oracle SQL Developer 19.4.0.354 <br>
&nbsp;&nbsp; 🔨 &nbsp; Java 1.8 | Servlet | JSP <br>
&nbsp;&nbsp; 🌐 &nbsp; HTML5 | CSS | JavaScript | jQuery 3.5.1 <br>
&nbsp;&nbsp; 🛢 &nbsp; Oracle Database 11g Release 11.2.0.2.0 | SQL <br>
&nbsp;&nbsp; 🔧 &nbsp; Git | SourceTree <br>
&nbsp;&nbsp; 📡 &nbsp; apache-tomcat-8.5.57 <br>

## 3. 구현 기능
`Code, View 클릭시 해당 기능이 있는 코드 위치로 이동합니다`
#### 사용자 [🔍](https://github.com/Tiger200627/anavada/tree/master/src/fboard)
- 축제데이터 가지고 오기 [Code](https://github.com/Tiger200627/anavada/blob/master/src/fboard/FestivalDetailInformation.java)
- 축제 리스트 출력(Ajax처리 + 검색기능) [Code](https://github.com/Tiger200627/anavada/blob/master/src/fboard/controller/FboardLIstServlet.java)&nbsp;&nbsp;
[View](https://github.com/Tiger200627/anavada/blob/master/web/views/fboard/areaEvent_list.jsp)
  - 카카오 맵에 출력할 축제데이터 리스트 [Code](https://github.com/Tiger200627/anavada/blob/master/src/fboard/controller/FboardKListServlet.java)
  
![축제 리스트 상단](https://user-images.githubusercontent.com/67498192/103649769-62740900-4fa2-11eb-974e-c784dfee6626.png)

- 축제 상세정보 출력(Ajax처리) [Code - 데이터 가지고오기](https://github.com/Tiger200627/anavada/blob/master/src/fboard/FestivalDetailInformation.java)&nbsp;&nbsp;
[Code - 데이터 가공](https://github.com/Tiger200627/anavada/blob/master/src/fboard/controller/FboardDetailServlet.java)&nbsp;&nbsp;
[View](https://github.com/Tiger200627/anavada/blob/master/web/views/fboard/areaEvent_view.jsp)
  - 댓글 출력(Ajax처리) [Code](https://github.com/Tiger200627/anavada/blob/master/src/fboardreply/controller/FboardReplyListServlet.java)
  - 댓글 삭제(Ajax처리) [Code](https://github.com/Tiger200627/anavada/blob/master/src/fboardreply/controller/FboardReplyInsertServlet.java) / 수정(Ajax처리) [Code](https://github.com/Tiger200627/anavada/blob/master/src/fboardreply/controller/FboardReplyDeleteServlet.java)

#### 관리자 [Code](https://github.com/Tiger200627/anavada/tree/master/src/admin/fboard/controller)
- 공공데이터 와 서버에 저장된 축제 정보 비교하여 출력(Ajax처리) 
[Code - 공공데이터 출력](https://github.com/Tiger200627/anavada/blob/master/src/admin/fboard/controller/FestivalAPIListServlet.java)&nbsp;&nbsp;
[Code - 서버데이터 ](https://github.com/Tiger200627/anavada/blob/master/src/admin/fboard/controller/FboardAdminListServlet.java)&nbsp;&nbsp; 
[View](https://github.com/Tiger200627/anavada/blob/master/web/views/admin/fboard/adminfboardList.jsp)
  - 축제번호 비교 후 없는 축제정보 서버에 저장(Insert) [Code](https://github.com/Tiger200627/anavada/blob/master/src/admin/fboard/controller/FboardAdminInsertServlet.java)
  - 축제수정일 비교 후 바뀐 경우 해당 축제 수정(Update) [Code](https://github.com/Tiger200627/anavada/blob/master/src/admin/fboard/controller/FboardAdminUpdateServlet.java)
  - 년도가 지난 경우 지난년도 축제 삭제(Delete) [Code](https://github.com/Tiger200627/anavada/blob/master/src/admin/fboard/controller/FboardAdminDeleteServlet.java) 
  / 서버에 저장된 축제 전체 삭제(All Delete) [Code](https://github.com/Tiger200627/anavada/blob/master/src/admin/fboard/controller/FboardAdminDeleteAllServlet.java)

## 4. 구현 영상
아직 촬영 전

## 5. 업데이트 현황
