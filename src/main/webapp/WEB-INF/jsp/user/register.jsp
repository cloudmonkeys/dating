<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<div>
	<div class="container body">
		<p>--START OF BODY</p>

		<h1>NEW USER REGISTRATION PAGE</h1>
			<%-- Using Springs new form binding library --%>
			<%-- No URL specified so will post to itself. I.e. the same URL (user/register) --%>
			<sf:form method="POST" modelAttribute="user">
				<sf:label path="username">Username:</sf:label>
				<sf:input path="username" size="15" id="username"/>
				<br/>
				<sf:label path="password">Password:</sf:label>
				<sf:input path="password" size="15" id="password"/>
				<br/>
				<sf:label path="firstName">First Name:</sf:label>
				<sf:input path="firstName" size="15" id="firstName"/>
				<br/>
				<sf:label path="lastName">Last Name:</sf:label>
				<sf:input path="lastName" size="15" id="lastName"/>
				<br/>
				<sf:label path="gender">Gender:</sf:label>
				<sf:radiobutton path="gender" value="Male"/>Male
				<sf:radiobutton path="gender" value="Female"/>Female
				<br/>
				<sf:label path="email">Email:</sf:label>
				<sf:input path="email" size="15" id="email"/>
				<br/>
				<sf:label path="profileFor">Profile for:</sf:label>
				<sf:select path="profileFor" items="${profileForList}"></sf:select>
				<br/>
				<sf:label path="ethnicity">Ethnicity:</sf:label>
				<sf:select path="ethnicity" items="${ethnicityList}"></sf:select>
				<br/>
				<sf:label path="religiousSect">Religious Sect:</sf:label>
				<sf:select path="religiousSect" items="${religiousSectList}"></sf:select>
				<br/>
				<sf:label path="communityLanguage">CommunityLanguage:</sf:label>
				<sf:select path="communityLanguage" items="${communityLanguageList}"></sf:select>
				<br/>
				<sf:label path="whereDidYouHearAboutUs">Where Did You Hear About Us?</sf:label>
				<sf:select path="whereDidYouHearAboutUs" items="${whereDidYouHearAboutUsList}"></sf:select>
				
				
				<br/><br/>
				<input type="submit" value="Submit" />
			</sf:form>

		<p>--END OF BODY</p>
	</div>
</div>