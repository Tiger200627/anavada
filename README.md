# Anavada

## 목차
1. [프로젝트 소개](#1-프로젝트-소개)
2. [개발 환경](#2-개발-환경)
3. [구현 기능](#3-구현-기능)
4. [구현 이미지](#4-구현-이미지)
5. [구현 영상](#5-구현-영상)
6. [업데이트 현황](#6-업데이트-현황)

## 1. 프로젝트 소개
KH_정보교육원에서 6명이 함께한 Semi 팀 프로젝트입니다.<br>
지역 내에 따뜻한 정(情)을 다시 살리기 위해 지역 간의 중고거래, 커뮤니티, 축제 정보를 제공하는 웹사이트입니다.<br>

그중 저는 한국관광공사의 공공데이터 OPEN API를 사용하여 서울시 축제 정보를 JSON 형태로 가지고와 데이터를 가지고<br>
KaKao Map API를 사용하여 축제 위치를 제공하는 서비스 등 지역 축제 관련 서비스를 맡았습니다.<br>

총 개발기간은 한달입니다.(2020/07/16 ~ 2020/08/17)<br>
자세한 보고서(기획, 설계, 화면 구현 설명)를 보시려면 [여기](https://drive.google.com/file/d/1yx8NfNtySx3fFh_xHSQogiZPu7gT5eQL/view?usp=sharing)를 클릭해주세요.

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
- 축제 데이터 가지고 오기 [Code](https://github.com/Tiger200627/anavada/blob/master/src/fboard/FestivalDetailInformation.java)
- 축제 리스트 출력(+검색기능) [Code](https://github.com/Tiger200627/anavada/blob/master/src/fboard/controller/FboardLIstServlet.java)&nbsp;&nbsp;
[View](https://github.com/Tiger200627/anavada/blob/master/web/views/fboard/areaEvent_list.jsp)
  - 카카오 맵에 출력할 축제 리스트 [Code](https://github.com/Tiger200627/anavada/blob/master/src/fboard/controller/FboardKListServlet.java)

- 축제 상세정보 출력 [Code - 데이터 가지고오기](https://github.com/Tiger200627/anavada/blob/master/src/fboard/FestivalDetailInformation.java)&nbsp;&nbsp;
[Code - 데이터 가공](https://github.com/Tiger200627/anavada/blob/master/src/fboard/controller/FboardDetailServlet.java)&nbsp;&nbsp;
[View](https://github.com/Tiger200627/anavada/blob/master/web/views/fboard/areaEvent_view.jsp)
  - 댓글 출력 [Code](https://github.com/Tiger200627/anavada/blob/master/src/fboardreply/controller/FboardReplyListServlet.java)
  - 댓글 삭제 [Code](https://github.com/Tiger200627/anavada/blob/master/src/fboardreply/controller/FboardReplyInsertServlet.java) / 수정 [Code](https://github.com/Tiger200627/anavada/blob/master/src/fboardreply/controller/FboardReplyDeleteServlet.java)

#### 관리자 [Code](https://github.com/Tiger200627/anavada/tree/master/src/admin/fboard/controller)
- 공공데이터 와 서버에 저장된 축제 정보 비교하여 출력
[Code - 공공데이터 출력](https://github.com/Tiger200627/anavada/blob/master/src/admin/fboard/controller/FestivalAPIListServlet.java)&nbsp;&nbsp;
[Code - 서버데이터 ](https://github.com/Tiger200627/anavada/blob/master/src/admin/fboard/controller/FboardAdminListServlet.java)&nbsp;&nbsp; 
[View](https://github.com/Tiger200627/anavada/blob/master/web/views/admin/fboard/adminfboardList.jsp)
  - 축제번호 비교 후 없는 축제 정보 서버에 저장 [Code](https://github.com/Tiger200627/anavada/blob/master/src/admin/fboard/controller/FboardAdminInsertServlet.java)
  - 축제수정일 비교 후 바뀐 경우 해당 축제 수정 [Code](https://github.com/Tiger200627/anavada/blob/master/src/admin/fboard/controller/FboardAdminUpdateServlet.java)
  - 연도가 지난 경우 지난 연도 축제 삭제 [Code](https://github.com/Tiger200627/anavada/blob/master/src/admin/fboard/controller/FboardAdminDeleteServlet.java) 
  / 서버에 저장된 축제 전체 삭제 [Code](https://github.com/Tiger200627/anavada/blob/master/src/admin/fboard/controller/FboardAdminDeleteAllServlet.java)

## 4. 구현 이미지
구현 이미지: 축제 리스트 페이지 상단(Kakao Map)
<img src="https://user-images.githubusercontent.com/67498192/103649769-62740900-4fa2-11eb-974e-c784dfee6626.png" width="100%">
구현 이미지: 축제 리스트 페이지 하단
<img src="https://user-images.githubusercontent.com/67498192/103650014-bbdc3800-4fa2-11eb-9f00-9fac4f6c18e1.png" width="100%">
구현 이미지: 축제 상세 페이지<br>
<img src="https://user-images.githubusercontent.com/67498192/103650124-e4643200-4fa2-11eb-92ca-51a3eb854805.png" width="60%">
<br>
구현 이미지: 축제 관리 페이지
<img src="https://user-images.githubusercontent.com/67498192/103650053-ca2a5400-4fa2-11eb-8cb7-52ccec449b44.png" width="100%">

## 5. 구현 영상
아직 촬영 전

## 6. 업데이트 현황

