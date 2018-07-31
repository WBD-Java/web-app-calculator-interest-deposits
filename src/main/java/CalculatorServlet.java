import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/Interest")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float deposits = Float.parseFloat(request.getParameter("deposits"));
        float monthly_interest_rate = Float.parseFloat(request.getParameter("rate"));
        int months = Integer.parseInt(request.getParameter("months"));

        float interest_money = deposits * monthly_interest_rate * months;

        PrintWriter writer = response.getWriter();

        if (deposits < 0 || monthly_interest_rate < 0 || months < 0) {
            writer.println("Deposits or monthly interest rate or months is invalid");
        } else {
            writer.println("<html>");
            writer.println("<h1>Result</h1>");
            writer.println("Deposits: " + deposits + "<br>");
            writer.println("Monthly interest rate: " + monthly_interest_rate + "<br>");
            writer.println("Months: " + months + "<br>");
            writer.println("Interest Money: " + interest_money);
            writer.println("</html>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
