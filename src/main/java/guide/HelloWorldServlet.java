package guide;
// from web
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// from twilio 
// import javax.servlet.http.HttpServlet;
// import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// import java.io.IOException;

public class HelloWorldServlet extends HttpServlet {
    private String mymsg; 
    public void init() throws ServletException {      
       mymsg = "Http Servlet Demo";   
    }
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse response) throws IOException {
        // Setting up the content type of web page      
        response.setContentType("text/html");
        // Writing the message on the web page      
        PrintWriter out = response.getWriter();      
        out.println("<h1>" + mymsg + "</h1>");      
        out.println("<p>" + "Hello fools!" + "</p>");   

    }
}
