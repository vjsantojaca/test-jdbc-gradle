package relevante.test.war;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

import relevante.test.bd.ConnectionBD;

@WebServlet(name = "HelloServlet", urlPatterns = {"/helloServlet"})
public class HelloServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	/**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.getWriter().write("Hello Servlet");
    }
    
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	ConnectionBD.createConexionBD();
    	try(Connection connection = (Connection) ConnectionBD.getConexion();)
    	{
            response.getWriter().write("Hello Servlet");
    		
    	} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | SQLException e) {
			e.printStackTrace();
		}
    }
}