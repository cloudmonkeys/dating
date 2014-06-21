<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
		
	<h1>Find your Asian amigo today!</h1>
	
	<p class="lead">Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.</p>
			
	<c:forEach var="user" items="${users}" varStatus="loop">
			<c:if test="${loop.first}">
				<table class="table table-striped">
					<thead><tr><th>Name</th><th>Ethnicity</th><th>Gender</th><th>Email</th></tr></thead>
			</c:if>
			<tr><td>${user.firstName} ${user.lastName}</td><td>${user.ethnicity}</td><td>${user.gender}</td><td>${user.email}</td></tr>
			<c:if test="${loop.last}"></table></c:if>
	</c:forEach>
		
	<p>
		<span class="fui-user"></span> <a href="/matrimonial/user">Add user</a>
	</p>
	
	<hr />
	
	<div class="row-fluid clearfix">
        <div class="col-md-3">
          <div class="tile">
            <img src="<c:url value="/resources/images/icons/svg/compas.svg" />" alt="Compas" class="tile-image big-illustration">
            <h3 class="tile-title">Connect Globally</h3>
            <p>Cum sociis natoque penatibus et magnis</p>
          </div>
        </div>

        <div class="col-md-3">
          <div class="tile">
            <img src="<c:url value="/resources/images/icons/svg/loop.svg" />" alt="Infinity-Loop" class="tile-image">
            <h3 class="tile-title">Limitless new Links</h3>
            <p>Cum sociis natoque penatibus et magnis</p>
          </div>
        </div>

        <div class="col-md-3">
          <div class="tile">
            <img src="<c:url value="/resources/images/icons/svg/gift-box.svg" />" alt="Gift box" class="tile-image">
            <h3 class="tile-title">Present Gifts</h3>
            <p>Cum sociis natoque penatibus et magnis</p>
          </div>
        </div>

        <div class="col-md-3">
          <div class="tile">
            <img src="<c:url value="/resources/images/icons/svg/chat.svg" />" alt="Chat" class="tile-image">
            <h3 class="tile-title">Get Social</h3>
            <p>Cum sociis natoque penatibus et magnis</p>
          </div>
        </div>
        
      </div>
      
      <br>
      
      <blockquote>
        <p>Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec ullamcorper nulla non metus auctor fringilla. Duis mollis, est non commodo luctus.</p>
        <small>Steve Jobs, CEO Apple</small>
      </blockquote>
 </div>