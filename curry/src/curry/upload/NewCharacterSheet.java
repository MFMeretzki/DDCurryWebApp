package curry.upload;

import java.io.IOException;

import javax.print.attribute.standard.PrinterLocation;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import curry.constants.Url;
import curry.model.Character_Sheet;
import curry.core.HibernateUtil;

/**
 * Servlet implementation class NewCharacterSheet
 */
@WebServlet("/NewCharacterSheet")
public class NewCharacterSheet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewCharacterSheet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Hola!");
	    Session session = null;
	    Transaction transaction = null;
	    try {
	      session = HibernateUtil.getSessionFactory().openSession();
	      transaction = session.beginTransaction();
	      transaction.begin();

	      /*
	      Character_Sheet caracterSheet = new Character_Sheet();
	      caracterSheet.setId(2l);
	      caracterSheet.setName("Joe");
	      session.persist(caracterSheet);
	      */

	      transaction.commit();
	    } catch (Exception e) {
	      if (transaction != null) {
	        transaction.rollback();
	      }
	      e.printStackTrace();
	    } finally {
	      if (session != null) {
	        session.close();
	      }
	    }

	    //HibernateUtil.shutdown();
	}

}
