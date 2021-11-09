import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", value = "/Calculator")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float first = Float.parseFloat(request.getParameter("11"));
        float second = Float.parseFloat(request.getParameter("22"));
        String operator = request.getParameter("operator");
        float calculator = Culculatorr.calculator(first,second,operator);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1> ket qua: "+ calculator +"</h1>");
        writer.println("</html>");

    }
}
