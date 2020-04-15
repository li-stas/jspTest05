package app.servlets;
import app.model.ModelDb;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * будет обрабатывать запросы, поступившие по адресу /list.
 */
public class ListServlet extends HttpServlet {


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        /*
        получить из модели список имен пользователей и передать их во вьюху,
        которая их получит и  отобразит.    воспользуемся объектом запроса, который мы получили от Tomcat.
        К этому объекту мы можем добавить атрибут, дав ему какое-то имя, и, собственно, сам объект,
        который бы мы хотели передать во view.

        Благодаря тому, что при передаче процесса выполнения из сервлета во вьюху мы передаем туда эти же
        объекты запроса и ответа, что получил сам сервлет, то и добавив наш список имен к объекту запроса
        мы потом из этого объекта запроса во вьюхе сможем наш список имен пользователей и получить.
         */

        ModelDb model = ModelDb.getInstance();
        List<String> names = model.list();
        req.setAttribute("userNames", names);
        /*
        управление из сервлетов в jsp

        - получаем из объекта запроса объект диспетчера запросов, куда передаем адрес jsp странички,
        которой мы хотим передать управление;
        - используя полученный объект — передаем управление в указанную jsp страницу,
        и не забываем вложить туда те объекты запроса и ответа, которые мы получили от Tomcat.
         */
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/list.jsp");
        requestDispatcher.forward(req, resp);
    }

}
