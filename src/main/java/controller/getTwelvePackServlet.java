package controller;

/**
 * @author Dennis Bowen - dmbowen
 * CIS175 - Fall 2022
 * Sep 22, 2022
 */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.SodaCalculator;

/**
 * Servlet implementation class getTwelvePackServlet
 */
@WebServlet("/getTwelvePackServlet")
public class getTwelvePackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getTwelvePackServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String numberOfPeople = request.getParameter("numberOfPeople");
		String numberOfTwelvePacks = request.getParameter("numberOfTwelvePacks");
		
		SodaCalculator userSodaCalculator = new SodaCalculator(Integer.parseInt(numberOfPeople), Integer.parseInt(numberOfTwelvePacks));
		
		request.setAttribute("userSodaCalculator", userSodaCalculator);
		
		getServletContext().getRequestDispatcher("/sodaCalculatorResult.jsp").forward(request, response);
		
		PrintWriter writer = response.getWriter();
		writer.println(userSodaCalculator.toString());
		writer.close();
	}

}
