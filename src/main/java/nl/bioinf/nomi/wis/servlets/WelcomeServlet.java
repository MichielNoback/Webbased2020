package nl.bioinf.nomi.wis.servlets;

import nl.bioinf.nomi.wis.config.WebConfig;
import org.thymeleaf.context.WebContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@WebServlet(name = "WelcomeServlet", urlPatterns = "/welcome")
public class WelcomeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //System.out.println(request.getParameter("foo"));

        final HttpSession session = request.getSession();
        session.setAttribute("Shoppingcart", List.of("Monitor", "macbook"));

        //this step is optional; standard settings also suffice
        WebConfig.configureResponse(response);
        WebContext ctx = new WebContext(
                request,
                response,
                request.getServletContext(),
                request.getLocale());
        ctx.setVariable("currentDate", new Date());
        WebConfig.createTemplateEngine(getServletContext())
                .process("welcome", ctx, response.getWriter());
    }
}
