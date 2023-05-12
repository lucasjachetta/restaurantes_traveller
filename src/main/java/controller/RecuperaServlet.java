package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

import model.Restaurantes;
@WebServlet("/detalhesRestaurante.do")
public class RecuperaServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, 
            HttpServletResponse response) 
         throws IOException, ServletException {
		
		ArrayList<Restaurantes> bd = new ArrayList<Restaurantes>();
		
		bd.add(new Restaurantes(1,"Pecorino",
				"Av. Ibirapuera, 3103 Shopping Ibirapuera Piso Jurupis - Indianópolis, São Paulo - SP, 04029-200", 10, "(11) 4440-1314", "Diversas", "Pecorino.com.br", "Almoço e Jantar", "R$100,00 - R$300,00"));
bd.add(new Restaurantes(2,"Figueira Rubaiyat",
                             "Rua Haddock Lobo, 1738 - Jardins, São Paulo - SP, 01414-002", 9, "(11) 3170-5100", "Diversas", "gruporubaiyat.com", "Almoço e Jantar", "R$ 98 - R$ 766"));
		bd.add(new Restaurantes(3,"Varanda Faria Lima", 
                             "Rua Prudente Correia, 432, Faria Lima, São Paulo - SP, 01450-030", 8, "(11) 3039-6500", "Steakhouse", "varandagrill.com.br", "Almoço e Jantar", "R$ 150 - R$ 170"));
		bd.add(new Restaurantes(4,"Dona Firmina Pizzaria", 
                             "Alameda dos Anapurus, 1491, São Paulo - SP, 04087-005", 9, " (11) 5093-0302", "Pizza", "donafirminapizzaria.com.br", "Almoço e Jantar", "R$ 50 - R$ 80"));
		
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		Restaurantes result = null;
		for(Restaurantes rest : bd) {
			
			if(rest.getId_restaurante() == id) {
				result = rest;
				break;
			}
		}
		String detalhesRestaurante = "";
		if(result !=null)
		{
			request.setAttribute("Restaurantes", result);
			detalhesRestaurante = "/info.jsp";
		}
		else {
			detalhesRestaurante = "/erro.jsp";
		}
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(detalhesRestaurante);
		dispatcher.forward(request, response);
		
	}
	
	
}
