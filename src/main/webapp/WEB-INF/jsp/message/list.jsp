<%@taglib prefix="joda" uri="http://www.joda.org/joda/time/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
	<h3>LIST MESSAGES</h3>
	
	<c:forEach var="message" items="${messages}" varStatus="loop">
			<c:if test="${loop.first}">
				<table class="table table-striped">
					<thead><tr><th>From</th><th>Subject</th><th>Sent date</th><th>Opened date</th><th>&nbsp;</th></tr></thead>
			</c:if>
			<tr><td>${message.fromUser}</td><td>${message.subject}</td><td><joda:format value="${message.sentDate}" style="MM" dateTimeZone="Europe/London" /></td><td><joda:format value="${message.openedDate}" style="MM" dateTimeZone="Europe/London" /></td><td><a href="/dating/messages/${message.id}">Open</a></td></tr>
			<c:if test="${loop.last}"></table></c:if>
	</c:forEach>
	
	<p><a href="/dating/messages/new" class="btn btn-wide btn-primary">Send a message</a></p>
</div>