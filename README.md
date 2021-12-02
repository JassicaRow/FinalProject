# CoCoa Updates

****

21.11.29 추가

* 회원가입 (성공시 alert / 중복확인 / 비번일치확인)
* 로그인 (성공시 우측상단 변경 / 실패시 alert)
* 로그아웃 (성공시 우측상단 변경)
* 마이페이지는 아직 버튼만 존재
* home.jsp 중간에 카테고리 버튼 생성 * 테마 아직 적용 x
* loginForm, joinForm 테마 갈색으로 변경

***

21.11.30 추가

* 코치 글, 프로젝트 글 작성 *> db에 추가 구현
(아직 validation 부족 & 파일업로드 너무 복잡)
* 코치, 프로젝트 주제별 작성 버튼 show & hide
* coachWriteForm / projectWriteForm 완성

***

21.12.1 추가

* 코드 전체 리뷰 및 리팩토링
* Git으로 협업하는 법 완벽히 익히기
* 로그인 여부에 따라 [글 작성] 버튼 숨김 / 표시
* [/id/coachNO]로 dest 설정 : 같은 파일명 충돌 x
* db에서 임의로 삭제 후 새로 생성시 생기는 충돌은 삭제 로직에서 조절

***

21.12.2 추가

* coachInfo.jsp / projectInfo.jsp 생성
* 전체적인 css 보완