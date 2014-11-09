<%--
  Created by IntelliJ IDEA.
  User: matvey
  Date: 01.11.14
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>_-`Stairway</title>
</head>
<body>
    <div id="header">
        <h2> Stairway Sounds _-` </h2>
    </div>

    <div id="content">
        <!-- Check list consistency -->
        <c:if test="${empty list}">
            list is empty
        </c:if>

        <dt>
            <c:forEach items="${list}"  var="item">

                <dl>
                    <p> <c:out value="${item.trackName}"/> </p>

                        <audio controls preload = "none">
                        <source src="<c:out value='${item.filePath}'/>"
                                type="audio/mp3">

                            Your browser don`t support "audio" teg
                        </audio>
                    <br>
                </dl>

            </c:forEach>
        </dt>
    </div>

<div id="footer">
    <address></address>
</div>
</body>
</html>
