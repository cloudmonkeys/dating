<%@taglib prefix="joda" uri="http://www.joda.org/joda/time/tags" %>

<div>
	<h3>PROFILE VIEW PAGE</h3>
	<p>Hello <strong>${user.username}</strong></p>
	<p>${user.firstName} ${user.lastName}</p>
	<p><joda:format value="${user.dateOfBirth}" style="M-" /></p>
	<P>${user.gender}, ${user.ethnicity}</P>
	<p>${user.email}</p>
	
	<p><a href="/dating/user/${user.username}/edit" class="btn btn-wide btn-primary">Edit</a></p>
</div>