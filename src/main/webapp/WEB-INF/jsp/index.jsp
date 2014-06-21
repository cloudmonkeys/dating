<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
	<div class="container body">
		<p>--START OF BODY</p>

		<h1>Showing Users</h1>
		<c:forEach var="user" items="${users}" varStatus="loop">
				<p>${user.firstName} ${user.lastName}</p>
		</c:forEach>
		<p>--END OF BODY</p>
	</div>
</div>