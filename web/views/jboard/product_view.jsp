<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="../include/head.jsp" %>
<style>
    .swiper-container {
        width: 100%;
        height: 300px;
        margin-left: auto;
        margin-right: auto;
    }
    .swiper-slide {
        background-size: cover;
        background-position: center;
    }
    .gallery-top {
        height: 80%;
        width: 100%;
    }
    .gallery-thumbs {
        height: 20%;
        box-sizing: border-box;
        padding: 10px 0;
    }
    .gallery-thumbs .swiper-slide {
        width: 25%;
        height: 100%;
        opacity: 0.4;
    }
    .gallery-thumbs .swiper-slide-thumb-active {
        opacity: 1;
    }
</style>
<script>
    var galleryThumbs = new Swiper('.gallery-thumbs', {
        spaceBetween: 10,
        slidesPerView: 4,
        freeMode: true,
        watchSlidesVisibility: true,
        watchSlidesProgress: true,
    });
    var galleryTop = new Swiper('.gallery-top', {
        spaceBetween: 10,
        navigation: {
        nextEl: '.swiper-button-next',
        prevEl: '.swiper-button-prev',
    },
        thumbs: {
        swiper: galleryThumbs
        }
    });
</script>
</head>
<body oncontextmenu="return false" onselectstart="return false" ondragstart="return false">
    <div id="wrap">
        <%@ include file="../include/header.jsp" %>

        <!-- 컨텐츠 -->
        <div id="content">

            <!--서브 비주얼/타이틀-->
            <div class="visual-sub-vagas product-vagas">
                <div class="vsv-copy sub-title">
                   <div>
                        <ul class="navi">
                            <li><a href="#none">홈</a></li>
                            <li class="glyphicon glyphicon-menu-right"><a href="#none">중고거래</a></li>
                        </ul>
                    </div>
                    <h2><span>중고거래</span></h2>
                    <h3>우리의 이웃과 중고거래를 통해 변화되는 세상</h3>
                </div>
            </div>
            <!--서브 비주얼/타이틀 끝-->


            <!-- 뷰 -->
            <div class="product_view_area">
                <dl class="product_info">
                    <dt>
                        <div class="swiper-container gallery-top">
                            <ul class="swiper-wrapper">
                                <li class="swiper-slide"><img src="/anavada/resources/images/test/testImg.jpg"/></li>
                                <li class="swiper-slide"><img src="/anavada/resources/images/test/testImg.jpg"/></li>
                                <li class="swiper-slide"><img src="/anavada/resources/images/test/testImg.jpg"/></li>
                                <li class="swiper-slide"><img src="/anavada/resources/images/test/testImg.jpg"/></li>
                            </ul>
                            <!-- Add Arrows -->
                            <div class="swiper-button-next swiper-button-white"></div>
                            <div class="swiper-button-prev swiper-button-white"></div>
                        </div>
                        <div class="swiper-container gallery-thumbs">
                            <ol class="swiper-wrapper">
                                <li class="swiper-slide"><img src="/anavada/resources/images/test/testImg.jpg"/></li>
                                <li class="swiper-slide"><img src="/anavada/resources/images/test/testImg.jpg"/></li>
                                <li class="swiper-slide"><img src="/anavada/resources/images/test/testImg.jpg"/></li>
                                <li class="swiper-slide"><img src="/anavada/resources/images/test/testImg.jpg"/></li>
                            </ol>
                        </div>
    
                        <!-- Initialize Swiper -->
                        <script>
                            var galleryThumbs = new Swiper('.gallery-thumbs', {
                                spaceBetween: 10,
                                slidesPerView: 4,
                                freeMode: true,
                                watchSlidesVisibility: true,
                                watchSlidesProgress: true,
                            });
                            var galleryTop = new Swiper('.gallery-top', {
                                spaceBetween: 10,
                                navigation: {
                                nextEl: '.swiper-button-next',
                                prevEl: '.swiper-button-prev',
                                },
                                autoplay: {
                                    delay: 2000,
                                    disableOnInteraction: false,
                                },
                                thumbs: {
                                swiper: galleryThumbs
                                }
                            });
                        </script>
                    </dt>
                    <dd>
                        <dl>
                           <dt>[ 종로구 ]</dt>
                           <dd>
                               <button type="button" onclick="#none" class="lookup_btn">사기조회</button>
                               <button type="button" onclick="#none" class="lookup_btn">신고하기</button>
                           </dd>
                        </dl>
                        <div>
                            <i class="good_i glyphicon glyphicon-heart-empty">좋아요<span>+999</span></i>
                            <h2 class="product_name"><b>상품명 : </b><span>아나바다 피규어</span></h2>
                            <h3 class="product_price"><b>판매가격 : </b><span>7,000,000</span>원</h3>
                            <p class="view-ctn">
                                너 없는 지금도 눈부신 하늘과<br>
                                눈부시게 웃는 사람들<br>
                                나의 헤어짐을 모르는 세상은<br>
                                슬프도록 그대로인데<br><br>

                                시간마저 데려가지 못하게<br>
                                나만은 널 보내지 못했나봐<br>
                                가시처럼 깊게 박힌 기억은<br>
                                아파도 아픈 줄 모르고
                            </p>
                            <div>
                                <b>판매자 아이디 : </b>asdf123<br/>
                                <b>등록일자 : </b>2020.08.10&nbsp;&nbsp;&nbsp;/&nbsp;&nbsp;&nbsp;<b>최종수정일자 : </b>2020.08.16
                            </div>
                        </div>
                    </dd>
                </dl>
                <div class="view-btn">
                    <a href="#none" class="btn btn-prev">이전글</a>
                    <a href="product_list.jsp" class="btn btn-list">목록</a>
                    <a href="#none" class="btn btn-next">다음글</a>
                </div>
                
                <div class="cmt_wrap">
                    <form action="" method="">
                        <fieldset>
                            <div class="cmt_form">
                                <h4 class="cmt_head">댓글 77</h4>
                                <div class="cmt_body">
<textarea name="" style="resize: none; width:100%; min-height:100px; max-height:100px;" onfocus="this.value='';">비방글은 작성하실 수 없습니다.</textarea>
                                    <div class="cmt_ok"><input type="submit" value="등록"></div>
                                </div>
                            </div>
                        </fieldset>
                    </form>
                    <ul class="cmt_con">
                        <li>
                            <div>
                                <h4>user : asdf123</h4><span>2020.08.16. 12:12:00</span>
                            </div>
                            <p>가시가 되어 제발 가라고 아주 가라고 외쳐도 나는 그대로인데. 아주 사랑했던 나를 크게 두려웠던 나를 미치도록 너를 그리워했던 날 이제는 놓아줘. 보이지 않아. 내 안에 숨어. 잊으려 하면 할 수 록 더 다가와.</p>
                            <button>대댓글</button>
                            <div class="Subcmt_form">
                                <form action="" method="">
                                    <fieldset>
                                        <div class="cmt_form">
                                            <div class="cmt_body">
<textarea name="" style="resize: none; width:100%; min-height:100px; max-height:100px;" onfocus="this.value='';">비방글은 작성하실 수 없습니다.</textarea>
                                            <div class="cmt_ok"><input type="submit" value="등록"></div>
                                            </div>
                                        </div>
                                    </fieldset>
                                </form>
                            </div>
                        </li>
                        <li>
                            <div>
                                <h4>user : asdf123</h4><span>2020.08.16. 12:12:00</span>
                            </div>
                            <p>가시가 되어 제발 가라고 아주 가라고 외쳐도 나는 그대로인데. 아주 사랑했던 나를 크게 두려웠던 나를 미치도록 너를 그리워했던 날 이제는 놓아줘. 보이지 않아. 내 안에 숨어. 잊으려 하면 할 수 록 더 다가와.</p>
                            <button>대댓글</button>
                            <div class="Subcmt_form">
                                 <div>
                                    <h4>user : asdf123</h4><span>2020.08.16. 12:12:00</span>
                                </div>
                                <p>가시가 되어 제발 가라고 아주 가라고 외쳐도 나는 그대로인데. 아주 사랑했던 나를 크게 두려웠던 나를 미치도록 너를 그리워했던 날 이제는 놓아줘. 보이지 않아. 내 안에 숨어. 잊으려 하면 할 수 록 더 다가와.</p>
                            </div>
                        </li>
                        <li>
                            <div>
                                <h4>user : asdf123</h4><span>2020.08.16. 12:12:00</span>
                            </div>
                            <p>가시가 되어 제발 가라고 아주 가라고 외쳐도 나는 그대로인데. 아주 사랑했던 나를 크게 두려웠던 나를 미치도록 너를 그리워했던 날 이제는 놓아줘. 보이지 않아. 내 안에 숨어. 잊으려 하면 할 수 록 더 다가와.</p>
                            <button>대댓글</button>
                        </li>
                    </ul>
                    <button class="cmt_in">댓글 더보기 <i class="glyphicon glyphicon-menu-right"></i></button>
                </div>
            </div>
            <!-- 상세 끝 -->

        </div>
        <!-- 컨텐츠 끝 -->

        <%@ include file="../include/footer.jsp" %>
    </div>
</body>
</html>