import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PhoneNumberServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws IOException,ServletException
	{
		Random random=new Random();
		resp.setContentType("text/html");
		PrintWriter Writer=resp.getWriter();
		Writer.write("<ol>");
		for(int i=0;i<10;i++)
		{
			String Phone="+9198"+((random.nextDouble()+" ").substring(2,10));
			Writer.write("<li>"+Phone+"</li>");
		}
		Writer.write("</ol>");
		Writer.flush();
		Writer.close();
		
	}
}
