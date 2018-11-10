<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String[] strs = (String[]) request.getAttribute("strs");
%>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
    </head>
    <body>
        <% for(String s:strs) { %>
            <p><%= s %></p>
        <% } %>
    </body>
</html>