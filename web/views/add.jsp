<%@ page import="app.dao.OracleDAOConnection" %>
<%@ page import="app.dao.DAOConnection" %>
<%@ page import="app.entities.Questions" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Pro
  Date: 05.03.2020
  Time: 20:15
  To change this template use File | Settings | File Templates.

  add.jsp — страничка для добавления пользователей;

--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Add new user</title>
    </head>

    <body>
        <div>
            <h1>Super app!</h1>
        </div>

        <div>

            <%
                if (request.getAttribute("userName") != null) {
                    out.println("<p>User '" + request.getAttribute("userName") + "' added!</p>");
                }
            %>
            <div>
                <div>
                    <h2>Add user</h2>
                </div>
                <%--<%
                    DAOConnection daoConnection = OracleDAOConnection.getInstance();
                    List<Questions> db;
                    db = daoConnection.selectAllQuestion();
                    if (db.size() == 0) {
                  %>  } else { <%--%>
                <%
                    DAOConnection daoConnection = OracleDAOConnection.getInstance();
                    if (false) {
                    } else {
                    try {
                        // читаем
                        List<Questions> db;
                        db = daoConnection.selectAllQuestion();
                        if (db.size() == 0) {
                %>
                <p>No Record Found!</p>
                <%      } else { %>
                <table border='1' cellpadding='2' width='100%'>
                    <tr>
                        <th>Id</th>        <th>QUESTION</th>        <th>ANSWER</th>
                    </tr>
                    <%
                        Questions currentQt = null;
                        int i = 0;
                        for (Questions qt : db) {
                            i++;
                            if ( i <= 5) {
                                currentQt = qt;
                    %>
                    <tr>
                        <td><%=currentQt.getId()%>        </td>
                        <td><%=currentQt.getQuestion()%>        </td>
                        <td><%=currentQt.getAnswer()%>        </td>

                    </tr>
                    <%
                            }
                        }
                    %>


                </table>
                <% }
                } catch (Exception e) { %>
                <p>Some problems ...</p>
                <% }
                } %>

                <form method="post">
                    <label>Name:
                        <input type="text" name="name"><br/>
                    </label>
                    <label>Password:
                        <input type="Answer" name="Answer"><br/>
                    </label>
                    <button type="submit">Submit</button>
                </form>
            </div>
        </div>

        <div>
            <button onclick="location.href='..'">Back to main</button>
        </div>
    </body>
</html>
