import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException
	{
		RequestDispatcher dispatcher=req.getRequestDispatcher("login.html");
		dispatcher.forward(req,resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException
	{
		String rs="<button>Click here this is post request </button>";
		resp.getWriter().write(rs);
	}
	
}

	/*@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		HttpServletRequest request=(HttpServletRequest)req;
		String method=request.getMethod();
		
		System.out.println("login servlet called");
		String resp="";
		
		if(method.equals("POST"))
		{
			resp="<button>Click here this is post request </button>";
		}
		else if(method.equals("GET"))
		{
			resp="<button>Click here this is get request </button>";
		}
		PrintWriter writer= res.getWriter();
		writer.write(resp);
		writer.flush();
		writer.close();
	}
		
	

}*/
