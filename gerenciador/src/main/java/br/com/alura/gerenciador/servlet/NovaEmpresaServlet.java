package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeEmpresa = request.getParameter("nome");
		String data = request.getParameter("data");
		SimpleDateFormat dataformat = new SimpleDateFormat("dd/MM/yyyy");
		Empresa empresa = new Empresa();
		Date dataDate=null;
		try {
			dataDate = dataformat.parse(data);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataDate);
		
		Banco banco = new Banco();
		banco.adicionaEmpresa(empresa);
		
		response.sendRedirect("ListaEmpresas");
		
		//utilizando o request para chamar o JPS 
//		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/ListaEmpresas");
//		request.setAttribute("nomeEmpresa", nomeEmpresa);
//		requestDispatcher.forward(request, response);
//		
		
	}
}
