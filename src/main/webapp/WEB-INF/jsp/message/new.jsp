<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<div>

	<h3>CREATE NEW MESSAGE</h3>
	<%-- Using Springs new form binding library --%>
	<%-- No URL specified so will post to itself. I.e. the same URL (message/new) --%>

	<sf:form method="POST" modelAttribute="message" class="col-xs-6">
		<%-- TODO: Get username of logged in user. Set this in controller --%>
		<sf:input path="fromUser" type="hidden" id="fromUser" value="Computer" />
		
		<sf:label path="toUser">To:</sf:label>
		<sf:select path="toUser" items="${userList}" itemValue="username" itemLabel="fullName"></sf:select>
		<br />
		<sf:errors path="toUser" cssClass="error" />
		<br />
		<sf:label path="subject">Subject:</sf:label>
		<sf:input path="subject" size="15" id="subject" />
		<br />
		<sf:errors path="subject" cssClass="error" />
		<br />
		<sf:label path="message">Message:</sf:label>
		<sf:textarea path="message" size="15" id="message" />
		<br />
		<sf:errors path="message" cssClass="error" />
		<br />
		<input type="submit" value="Send"
			class="btn btn-wide btn-primary mrm" />
	</sf:form>
</div>

