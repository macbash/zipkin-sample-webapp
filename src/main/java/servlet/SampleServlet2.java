package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sample2")
public class SampleServlet2 extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String result = HttpClient.get("http://localhost:8080/sample3");

        PrintWriter out = resp.getWriter();
        out.println(result);
        out.flush();
        out.close();
    }

}

