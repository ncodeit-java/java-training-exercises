<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<a href="${pageContext.request.contextPath}/userPage">Ncodeit User</a> | 
<a href="${pageContext.request.contextPath}/adminPage">Ncodeit Admin</a> |
<a href="javascript:document.getElementById('logout').submit()">Logout</a>

<h3>Welcome to Ncodeit</h3>
<ul>
	<li>Java</li>
	<li>Spring</li>
	<li>Maven</li>
	<li>Jenkins</li>
</ul>

<c:url value="/logout" var="logoutUrl" />
<form id="logout" action="${logoutUrl}" method="post" >
  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
</form>
<c:if test="${pageContext.request.userPrincipal.name != null}">
	<a href="javascript:document.getElementById('logout').submit()">Logout</a>
</c:if>