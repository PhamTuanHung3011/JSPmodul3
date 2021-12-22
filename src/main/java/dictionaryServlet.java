import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet (name = "dictionaryServlet", value ="/translate" )
public class dictionaryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Hello", "Xin chao");
        dictionary.put("Bey", "Tam biet");
        dictionary.put("Book", "Quyển sách");
        dictionary.put("Good morning", "Chào buổi sáng");
        dictionary.put("Computer", "Máy tính");
        dictionary.put("Girl", "Cô gái");
//        dictionary.put("女", "Nữ giới");
//        dictionary.put("携帯電話", "Điện thoại");
//        dictionary.put("コンピューター", "Máy tính");
//        dictionary.put("夢", "Giắc mơ");
//        dictionary.put("空", "Bầu trời");

        String search = req.getParameter("txtSearch");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<HTML>");

        String result = dictionary.get(search);
        if(result != null) {
            printWriter.println("Word: "+ search+ "</br>");
            printWriter.println("Result: "+ result);
        }
        else {
            printWriter.write("Khong tim thay");
        }
        printWriter.write("</HTML>");
    }
}
