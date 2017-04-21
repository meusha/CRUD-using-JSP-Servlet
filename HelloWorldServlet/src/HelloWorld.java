import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by User on 4/19/2017.
 */
public class HelloWorld extends HttpServlet
{
    private String message;

    public void init() throws ServletException
    {
         message="HelloWorld";

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter printWriter= response.getWriter();
        printWriter.println("<h1>"+message+"</h1>");

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    public void destroy(){
        super.destroy();
    }
}
