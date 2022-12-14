package controller;

/**
 * @author Dennis Bowen - dmbowen
 * CIS175 - Fall 2022
 * Sep 20, 2022
 */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PizzaSliceCalculator;

/**
 * Servlet implementation class getPizzaSlicesServlet
 */
@WebServlet("/getPizzaSlicesServlet")
public class getPizzaSlicesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getPizzaSlicesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String numberOfPeople = request.getParameter("numberOfPeople");
		String numberOfPizzaPies = request.getParameter("numberOfPizzaPies");
		
		PizzaSliceCalculator userPizzaParty = new PizzaSliceCalculator(Integer.parseInt(numberOfPeople), Integer.parseInt(numberOfPizzaPies));
		
		request.setAttribute("userPizzaCalculator", userPizzaParty);
		
		getServletContext().getRequestDispatcher("/pizzaSliceCalculatorResult.jsp").forward(request, response);
		
		//PrintWriter writer = response.getWriter();
		//writer.println(userPizzaParty.toString());
		//writer.close();
	}

}
