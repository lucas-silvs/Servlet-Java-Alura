package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/oi")
public class OiMundo extends HttpServlet{
	
	@Override
	
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("<html>");
		printWriter.println("<body>");
		printWriter.println("oi mundo, parabens vc escreveu o primeiro servlets.");
		printWriter.println("</body>");
		printWriter.println("</html>");
		
		System.out.println("saindo no terminal");
	}

}
