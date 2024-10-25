<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="false" %>  <%-- We don't need session in logout --%>
<!DOCTYPE html>
<html>
<head>
    <title>Logging Out</title>
</head>
<body>
<%
    // Get all cookies from the request
    Cookie[] cookies = request.getCookies();

    if (cookies != null) {
       
        for (Cookie cookie : cookies) {
            if ("user".equals(cookie.getName())) {
               
                cookie.setMaxAge(0);
                cookie.setPath("/");  
                response.addCookie(cookie);  
            }
        }
    }
    response.sendRedirect("index.jsp");
%>
</body>
</html>