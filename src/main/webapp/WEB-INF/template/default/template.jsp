<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title><tiles:insertAttribute name="title"/></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="shortcut icon" href="<c:url value="/resources/images/favicon.ico" />">
	
 	<!-- Loading Bootstrap -->
    <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
    
    <!-- Loading Flat UI -->
    <link href="<c:url value="/resources/css/flat-ui.css" />" rel="stylesheet">
    
   </head>
   <body>
    
     <div class="container-fluid" style="padding-left: 5%; padding-right: 5%;">  
        <tiles:insertAttribute name="header"/>
        <tiles:insertAttribute name="menu"/>
        <tiles:insertAttribute name="body"/>
     </div>
     
     <tiles:insertAttribute name="footer"/>
       
        <!-- Load JS here for greater good =============================-->
	    <script src="<c:url value="/resources/js/jquery-1.8.3.min.js" />"></script>
	    <script src="<c:url value="/resources/js/jquery-ui-1.10.3.custom.min.js" />"></script>
	    <script src="<c:url value="/resources/js/jquery.ui.touch-punch.min.js" />"></script>
	    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
	    <script src="<c:url value="/resources/js/bootstrap-select.js" />"></script>
	    <script src="<c:url value="/resources/js/bootstrap-switch.js" />"></script>
	    <script src="<c:url value="/resources/js/flatui-checkbox.js" />"></script>
	    <script src="<c:url value="/resources/js/flatui-radio.js" />"></script>
	    <script src="<c:url value="/resources/js/jquery.tagsinput.js" />"></script>
	    <script src="<c:url value="/resources/js/jquery.placeholder.js" />"></script>
    </body>
</html>