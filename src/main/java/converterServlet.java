import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "converterCurrency", value = "/convert")
public class converterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float rate = Float.parseFloat(req.getParameter("rate"));
        float usd = Float.parseFloat(req.getParameter("usd"));

        float vnd = sum(rate, usd);
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<Html>");
        printWriter.println("<h1> Rate:"+ rate + "<h1/>");
        printWriter.println("<h1> usd:"+ usd + "<h1/>");
        printWriter.println("<h1> vnd:"+ vnd + "<h1/>");
        printWriter.println("</Html>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    public float sum(float a, float b) {
        float tich;
       return tich = a * b;
    }
}
