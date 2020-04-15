<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: Pro
  Date: 05.03.2020
  Time: 20:15
  To change this template use File | Settings | File Templates.

  list.jsp — страничка для показа списка пользователей.

--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users list</title>
</head>
<body>
  <%-- page "Users list"--%>
  <ul>
      <%
          List<String> names = (List<String>) request.getAttribute("userNames");

          if (names != null && !names.isEmpty()) {
              out.println("<ui>");
              for (String s : names) {
                  out.println("<li>" + s + "</li>");
              }
              out.println("</ui>");
          } else {
              out.println("<p>There are no users yet!</p>");
          }
      %>
      <%--<%
          List<String> names = (List<String>) request.getAttribute("userNames");

          if (names != null && !names.isEmpty()) {
              for (String s : names) {
                  out.println("<li>" + s + "</li>");
              }
          }
      %>--%>
  </ul>
</body>
</html>
