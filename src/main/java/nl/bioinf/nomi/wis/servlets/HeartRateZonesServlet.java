package nl.bioinf.nomi.wis.servlets;

import nl.bioinf.nomi.wis.config.WebConfig;
import nl.bioinf.nomi.wis.hr_zones.HeartRateZonesCalculator;
import org.thymeleaf.context.WebContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@WebServlet(name = "HeartRateZondesServlet", urlPatterns = "/heart-rate-zones")
public class HeartRateZonesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int maximumHeartRate = Integer.parseInt(request.getParameter("max_hr"));
        System.out.println("maximumHeartRate = " + maximumHeartRate);

        //invoke model
        final List<String> heartrateZones = HeartRateZonesCalculator.calculateHeartrateZones(maximumHeartRate);

        WebConfig.configureResponse(response);
        WebContext ctx = new WebContext(
                request,
                response,
                request.getServletContext(),
                request.getLocale());
        ctx.setVariable("hr_zones", heartrateZones);
        WebConfig.createTemplateEngine(getServletContext())
                .process("hr_zones_out", ctx, response.getWriter());

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("foo=" + request.getParameter("foo"));

        //this step is optional; standard settings also suffice
        WebConfig.configureResponse(response);
        WebContext ctx = new WebContext(request, response, request.getServletContext(), request.getLocale());
        ctx.setVariable("number", 1234.56);
        WebConfig.createTemplateEngine(getServletContext()).process("hr_zones", ctx, response.getWriter());
    }
}
