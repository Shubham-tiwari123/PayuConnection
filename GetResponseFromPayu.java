package RestAPIs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.parser.JSONParser;

public class GetResponseFromPayu extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("hiii post");
        StringBuffer buffer = new StringBuffer();
        BufferedReader reader = request.getReader();
        String line;
        while((line = reader.readLine())!= null)
            buffer.append(line);
        String data = buffer.toString();
        JSONParser parser = new JSONParser();
        System.out.println("responseData:-"+data);
    }
}
