<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<div>
		
	<h3>NEW USER REGISTRATION PAGE</h3>
		<%-- Using Springs new form binding library --%>
		<%-- No URL specified so will post to itself. I.e. the same URL (user/register) --%>
		<sf:form method="POST" modelAttribute="user" class="col-xs-6">
		
			<div class="form-group">
			  <div class="input-group">
			    <span class="input-group-addon">Username</span>
			    <input type="text" name="username" class="form-control" />
			  </div>  
			</div>
			
			<div class="form-group">
			  <div class="input-group">
			    <span class="input-group-addon">Password</span>
			    <input type="password" name="password" class="form-control" />
			  </div>  
			</div>

			<sf:label path="firstName">First Name:</sf:label>
			<sf:input path="firstName" size="15" id="firstName"/>
			<br/>
			<sf:label path="lastName">Last Name:</sf:label>
			<sf:input path="lastName" size="15" id="lastName"/>
			<br/>
			
			<sf:label path="gender">Gender:</sf:label>
			<label class="radio">
			  <input type="radio" name="gender" value="male" data-toggle="radio">
			  Male
			</label>
			
			<label class="radio">
			  <input type="radio" name="gender" value="female" data-toggle="radio" checked>
			  Female
			</label>
			
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
			<input type="submit" value="Submit" class="btn btn-wide btn-primary mrm" />
			
			<br><br>
		</sf:form>

</div>

