<%@taglib prefix="joda" uri="http://www.joda.org/joda/time/tags" %>

<div>
	<h3>${message.subject}</h3>
	<p><joda:format value="${message.sentDate}" style="M-" /></p>
	<p>${message.message}</p>
	
	<p><a href="/dating/messages" class="btn btn-wide btn-primary">Back to inbox</a></p>
</div>