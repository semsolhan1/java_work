<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%@ include file="../include/header.jsp" %>
<section>
    <!--Toggleable / Dynamic Tabs긁어옴-->
    <div class="container">
        <div class="row">
            <div class="col-sm-12 col-md-10 col-lg-9 myInfo">
                <div class="titlebox">
                    MEMBER INFO
                </div>

                <ul class="nav nav-tabs tabs-style">
                    <li class="active"><a data-toggle="tab" href="#info">내정보</a></li>
                    <li><a data-toggle="tab" href="#myBoard">내글</a></li>
                    <li><a data-toggle="tab" href="#menu2">Menu 2</a></li>
                </ul>
                <div class="tab-content">
                    <div id="info" class="tab-pane fade in active">

                        <p>*표시는 필수 입력 표시입니다</p>
                        <form action="${pageContext.request.contextPath}/user/userUpdate" method="post"
                            name="updateForm">
                            <table class="table">
                                <tbody class="m-control">
                                    <tr>
                                        <td class="m-title">*ID</td>
                                        <td><input class="form-control input-sm" name="userId"
                                                value="${login}" readonly></td>
                                    </tr>
                                    <tr>
                                        <td class="m-title">*이름</td>
                                        <td><input class="form-control input-sm" name="userName"
                                                value="${userInfo.userName}"></td>
                                    </tr>
                                    <tr>
                                        <td class="m-title">*비밀번호</td>
                                        <td><input class="form-control input-sm" name="userPw"></td>
                                    </tr>
                                    <tr>
                                        <td class.="m-title">*비밀번호확인</td>
                                        <td><input class="form-control input-sm" name="userPwChk"></td>
                                    </tr>
                                    <tr>
                                        <td class="m-title">*E-mail</td>
                                        <td>
                                            <input class="form-control input-sm" id="userEmail1" name="userEmail1"
                                                value="${userInfo.userEmail1}">
                                            <select class="form-control input-sm sel" id="userEmail2" name="userEmail2">
                                                <option ${userInfo.userEmail2=='@naver.com' ? 'selected' : '' }>
                                                    @naver.com</option>
                                                <option ${userInfo.userEmail2=='@gmail.com' ? 'selected' : '' }>
                                                    @gmail.com</option>
                                                <option ${userInfo.userEmail2=='@daum.net' ? 'selected' : '' }>@daum.net
                                                </option>
                                            </select>
                                            <button type="button" id="mail-check-btn" class="btn btn-primary">이메일
                                                인증</button>
                                        </td>
                                    </tr>
                                    <tr id="mailAuth">
                                        <td>인증번호 입력란</td>
                                        <td>
                                            <input type="text" class="form-control mail-check-input"
                                                placeholder="인증번호 6자리를 입력하세요." maxlength="6" disabled="disabled">
                                            <button type="button" id="mail-auth-btn" class="btn btn-primary">인증
                                                확인</button>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="m-title">*휴대폰</td>
                                        <td>
                                            <select class="form-control input-sm sel" name="userPhone1">
                                                <option>${userInfo.userPhone1 == '010' ? 'selected' : '' }010</option>
                                                <option>${userInfo.userPhone1 == '011' ? 'selected' : '' }011</option>
                                                <option>${userInfo.userPhone1 == '017' ? 'selected' : '' }017</option>
                                                <option>${userInfo.userPhone1 == '018' ? 'selected' : '' }018</option>
                                            </select>
                                            <input class="form-control input-sm" name="userPhone2">
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="m-title">*우편번호</td>
                                        <td><input class="form-control input-sm" name="addrZipNum"
                                                value="${userInfo.addrZipNum}" readonly>
                                            <button type="button" class="btn btn-primary" id="addBtn">주소찾기</button>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="m-title">*주소</td>
                                        <td><input class="form-control input-sm add" name="addrBasic"
                                                value="${userInfo.addrBasic}"></td>
                                    </tr>
                                    <tr>
                                        <td class="m-title">*상세주소</td>
                                        <td><input class="form-control input-sm add" name="addrDetail"
                                                value="${userInfo.addrDetail}"></td>
                                    </tr>
                                </tbody>
                            </table>
                        </form>

                        <div class="titlefoot">
                            <button class="btn">수정</button>
                            <button class="btn">목록</button>
                        </div>
                    </div>
                    <!-- 첫번째 토글 끝 -->

                    <!-- 두번째 토글 메뉴의 시작 -->
                    <div id="myBoard" class="tab-pane fade">
                        <p>*내 게시글 관리</p>
                        <form>
                            <table class="table">
                                <thead>
                                    <tr>
                                        <td>번호</td>
                                        <td>제목</td>
                                        <td>작성일</td>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:if test="${fn:length(userInfo.userBoardList) > 0}">
                                        <c:forEach var="vo" items="${userInfo.userBoardList}">
                                            <tr>
                                                <td>${vo.bno}</td>
                                                <td><a href="##">${vo.title}</a></td>
                                                <td>
                                                    <fmt:parseDate value="${vo.regDate}" pattern="yyyy-MM-dd'T'HH:mm:ss"
                                                        var="parsedDate" type="both" />
                                                    <fmt:formatDate value="${parsedDate}"
                                                        pattern="yyyy년 MM월 dd일 HH:mm" />
                                                </td>
                                            </tr>
                                        </c:forEach>
                                        <div class="text-center">
                                            <hr>
                                            <ul id="pagination" class="pagination pagination-sm">
                                                <c:if test="${pc.prev}">
                                                    <li><a href="#" data-pagenum="${pc.beginPage-1}">이전</a></li>
                                                </c:if>

                                                <c:forEach var="num" begin="${pc.beginPage}" end="${pc.endPage}">
                                                    <li class="${pc.paging.pageNum == num ? 'active' : ''}">
                                                        <a href="#" data-pagenum="${num}">${num}</a>
                                                    </li>
                                                </c:forEach>

                                                <c:if test="${pc.next}">
                                                    <li><a href="#" data-pagenum="${pc.endPage+1}">다음</a></li>
                                                </c:if>
                                            </ul>
                                        </div>
                                    </c:if>
                                    <c:if test="${fn:length(userInfo.userBoardList) <= 0 }">
                                    	<h2>아직 글을 작성하지 않았습니다.</h2>
                                    </c:if>
                                </tbody>
                            </table>
                        </form>
                    </div>
                    <!-- 두번째 토글 끝 -->
                    <div id="menu2" class="tab-pane fade">
                        <h3>Menu 2</h3>
                        <p>Some content in menu 2.</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<%@ include file="../include/footer.jsp" %>