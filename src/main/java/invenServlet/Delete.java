package invenServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import invenSer.InvenServ;
import invenSer.InvenServImpl;

@WebServlet(name = "Delete", urlPatterns = "/delete")
public class Delete extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//response.setContentType("text/html");
		
		
		
		String id = request.getParameter("item_no");
		Integer item_id = Integer.parseInt(id);
		PrintWriter out = response.getWriter();
		InvenServ invserv = new InvenServImpl();
		
		/*try{
			//invserv.deleteItems(item_no);
			//int res = invserv.deleteItems(item_no);
		}catch(SQLException ex){
			ex.printStackTrace();
		}*/
		
		
	}

}
