# servlet-practices

### 1. Maven War project 만들기

1. Maven project 생성 : war로 만들기 pom.xml에서 packaging => war
2. Project 선택 ( 오른쪽 클릭 -> JAVA EE Tools -> generate Deployment Descriptor Stub
3. Web-INF 에서 web.xml 에서 
	xmlns
	xmlns="http://JAVA.sun.com/xml/ns/javaee" 로 수정
4.pom.xml 설정 (helloweb 참고)