import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name ="CalculatorDiscount", value = "/discount")
public class CalculatorDiscount extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("vao doPost hay ko");
        String description = req.getParameter("description");
        float discount_Amount;
        float Price = Float.parseFloat(req.getParameter("Price"));
        float Percent = Float.parseFloat(req.getParameter("Percent"));
        discount_Amount = Price * Percent;

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<Html>");
        printWriter.println("<h1> Description:"+ description + "<h1/>");
        printWriter.println("<h1> Discount Amount:"+ discount_Amount + "<h1/>");
        printWriter.println("</Html>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
