# shop-samsam
3조 삼삼한 안경 쇼핑몰


# 👓안경 쇼핑몰 창고 관리 프로그램👓

## 프로젝트 소개
* 개발기간 : 2024.06.25 - 2024.05.28 (4일)
* 본사와 안경점 사장님 사이에 일어나는 제품 재고 관리를 도와주는 프로그램

*
##  팀원 구성
1. 서윤정 (yj0318)
2. 석현균 (gusrbstjr)
3. 이창연 (cylcoder)
4. 장윤지 (eliaaa)
5. 이정훈 (leejeonghun99)

##  개발 환경
* devtool : IntelliJ IDEA 2024.1.1 (Ultimate Edition)
* JAVA JDK: Temurin version '17.0.10'
* MySQL-connector-j : 8.0.33
* Mybatis : 3.5.6
* Build Tool : gradle
* Version Control : Git
* Communicate : Slack
* Collaboration Tool : Figma, Github, Notion

## 프로젝트 구조

````
📦samsam
 ┣ 📂gradle
 ┃ ┗ 📂wrapper
 ┃ ┃ ┣ 📜gradle-wrapper.jar
 ┃ ┃ ┗ 📜gradle-wrapper.properties
 ┣ 📂src
 ┃ ┣ 📂main
 ┃ ┃ ┣ 📂java
 ┃ ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┃ ┗ 📂ohgiraffers
 ┃ ┃ ┃ ┃ ┃ ┗ 📂samsam
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂board
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜QnAController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂model
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dao
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜QnAMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜BoardDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜QnAService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜QnAServiceImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂notice
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Board.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜NoticeController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜NoticeMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜NoticeService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂common
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂exception
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderException.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜WareHouseException.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂mybatis
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MybatisConfiguration.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂paging
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Pagenation.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂login
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜loginController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂model
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dao
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜loginMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜accountDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜loginService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜loginServiceImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂mail
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MailConfig.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MailController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MailMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MailRequest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MailService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂main
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MainController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂model
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dao
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SaleMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SaleDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜SaleImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SaleService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂member
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Member.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemberMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MemberService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂order
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderChangeController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜OrderFindController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂model
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dao
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderChangeMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜OrderFindMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderChangeDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderFindDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜StockDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderChangeImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderChangeService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderFindService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜OrderFindServiceImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂shoppingmall
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂product
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ProductController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂model
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dao
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ProductMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ImageDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ProductDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ProductService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ProductServiceImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂userinterface
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂purchase
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜PurchaseController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂model
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dao
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜PurchaseMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜PurchaseService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜PurchaseServiceImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜PurchaseDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂warehouse
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜StockController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜WareHouseController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂model
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dao
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜WareHouseMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜logDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜productDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜WareHouseDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜WareHouseLogDTO.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜WareHouseService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜WareHouseServiceImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SamsamApplication.java
 ┃ ┃ ┗ 📂resources
 ┃ ┃ ┃ ┣ 📂mappers
 ┃ ┃ ┃ ┃ ┣ 📜loginMapper.xml
 ┃ ┃ ┃ ┃ ┣ 📜MailMapper.xml
 ┃ ┃ ┃ ┃ ┣ 📜MemberMapper.xml
 ┃ ┃ ┃ ┃ ┣ 📜NoticeMapper.xml
 ┃ ┃ ┃ ┃ ┣ 📜OrderChangeMapper.xml
 ┃ ┃ ┃ ┃ ┣ 📜OrderFindMapper.xml
 ┃ ┃ ┃ ┃ ┣ 📜ProductMapper.xml
 ┃ ┃ ┃ ┃ ┣ 📜purchaseMapper.xml
 ┃ ┃ ┃ ┃ ┣ 📜QnAMapper.xml
 ┃ ┃ ┃ ┃ ┣ 📜SaleMapper.xml
 ┃ ┃ ┃ ┃ ┣ 📜Stock2Mapper.xml
 ┃ ┃ ┃ ┃ ┣ 📜StockMapper.xml
 ┃ ┃ ┃ ┃ ┗ 📜WareHouseMapper.xml
 ┃ ┃ ┃ ┣ 📂static
 ┃ ┃ ┃ ┃ ┣ 📂bootstrap
 ┃ ┃ ┃ ┃ ┃ ┗ 📂assets
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂css
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜style.css
 ┃ ┃ ┃ ┣ 📂templates
 ┃ ┃ ┃ ┃ ┣ 📂board
 ┃ ┃ ┃ ┃ ┃ ┣ 📜detail.html
 ┃ ┃ ┃ ┃ ┃ ┣ 📜new.html
 ┃ ┃ ┃ ┃ ┃ ┣ 📜notice.html
 ┃ ┃ ┃ ┃ ┃ ┣ 📜QnA.html
 ┃ ┃ ┃ ┃ ┃ ┗ 📜update.html
 ┃ ┃ ┃ ┃ ┣ 📂login
 ┃ ┃ ┃ ┃ ┃ ┗ 📜login.html
 ┃ ┃ ┃ ┃ ┣ 📂main
 ┃ ┃ ┃ ┃ ┃ ┗ 📜main.html
 ┃ ┃ ┃ ┃ ┣ 📂member
 ┃ ┃ ┃ ┃ ┃ ┣ 📜mail-form.html
 ┃ ┃ ┃ ┃ ┃ ┣ 📜mail-sent.html
 ┃ ┃ ┃ ┃ ┃ ┗ 📜members.html
 ┃ ┃ ┃ ┃ ┣ 📂order
 ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderChange.html
 ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderChangeSelect.html
 ┃ ┃ ┃ ┃ ┃ ┣ 📜OrderChangeStatus.html
 ┃ ┃ ┃ ┃ ┃ ┗ 📜OrderFind.html
 ┃ ┃ ┃ ┃ ┣ 📂product
 ┃ ┃ ┃ ┃ ┃ ┣ 📜delete.html
 ┃ ┃ ┃ ┃ ┃ ┣ 📜product.html
 ┃ ┃ ┃ ┃ ┃ ┣ 📜productRegister.html
 ┃ ┃ ┃ ┃ ┃ ┗ 📜update.html
 ┃ ┃ ┃ ┃ ┣ 📂sale
 ┃ ┃ ┃ ┃ ┃ ┗ 📜sale.html
 ┃ ┃ ┃ ┃ ┣ 📂userinterface
 ┃ ┃ ┃ ┃ ┃ ┣ 📜contact.php
 ┃ ┃ ┃ ┃ ┃ ┣ 📜index.html
 ┃ ┃ ┃ ┃ ┃ ┣ 📜license.html
 ┃ ┃ ┃ ┃ ┃ ┗ 📜shop-single.html
 ┃ ┃ ┃ ┃ ┣ 📂warehouse
 ┃ ┃ ┃ ┃ ┃ ┣ 📜InAndOut.html
 ┃ ┃ ┃ ┃ ┃ ┣ 📜list.html
 ┃ ┃ ┃ ┃ ┃ ┗ 📜WareHouseLog.html
 ┃ ┃ ┃ ┃ ┗ 📜customer-main.html
 ┃ ┃ ┃ ┣ 📜application.yml
 ┃ ┃ ┃ ┣ 📜logback.xml
 ┃ ┃ ┃ ┗ 📜schema.sql
                       








## 📋역할 분담

#### 서윤정
* 쇼핑몰 관리자
  1. 
  2. 
  3. 


#### 석현균
* 창고 관리자
  1. 재고 조회
  2. 로그 조회

#### 이창연
* 쇼핑몰 관리자
  1. 고객 목록 조회
  2. 메일 전송
  3. 공지사항

#### 장윤지
* 쇼핑몰 관리
  1. 
  2.

#### 이정훈
* 창고 관리자, 쇼핑몰 관리자, 로그인
  1. 
  2.

## 📕 프로젝트 후기

#### 서윤정
*
 
#### 석현균
* 본사와 안경점 사자임 사이에 일어나는 제품 재고 관리를 도와주는 프로그램주제로 추가할 기능들을 자유롭게 토론하여 기능들을 정하였다. 생각 했던거와 달리 기능들을 구현하는게 어려웠고, 팀 프로젝트인 만큼 팀원들과 소통이 중요하다는걸 다시 알게 되었다. 진행 도중 어려운 부분에서 막혔을때 팀원에게 도움을 받아 진행을 하였고 팀원 덕분에 이번 프로젝트를 통해 나의 부족한 점을 자세히 알게 되었고 실력 또한 팀원들의 도움 덕분에 많이 향상 시킬 수 있는 경험이 되었다. 다음 프로젝트때는 나도 도움을 줄 수 있게 노력해야 겠다고 생각한다.
 
#### 이창연
* 

#### 장윤지
* 
#### 이정훈
* 
