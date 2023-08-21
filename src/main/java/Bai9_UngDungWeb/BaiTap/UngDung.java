package Bai9_UngDungWeb.BaiTap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "UngDung", value = "/product")
public class UngDung extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double price = Double.parseDouble(req.getParameter("price"));
        double discount = Double.parseDouble(req.getParameter("Discount"));
        double discountAmount = (price * discount * 0.01);
        double discountPrice = (price - discountAmount);
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h4> Discount Amount: " + discountAmount + "</h4>");
        writer.println("<h4> Discount Price: " + discountPrice + "</h4>");
        writer.println("</html>");
    }
}
