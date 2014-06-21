<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><tiles:insertAttribute name="title"/></title>
    </head>
    <body>
        <style type="text/css">
            body {
                margin: 0px;
                padding: 0px;
            }
            .container{
                width: 960px;
                margin: auto;
            }
            .fixed-logo{
                background-color: #66FF33;
            }
            .menu{
                background-color: #FF3366;
            }
            .slider{
                background-color: #CC66FF;
            }
            .content{
                background-color: #00CCFF;
            }
            .footer{
                background-color: orange;
            }
        </style>
        <tiles:insertAttribute name="header"/>
        <tiles:insertAttribute name="menu"/>
        <tiles:insertAttribute name="body"/>
        <tiles:insertAttribute name="footer"/>
    </body>
</html>