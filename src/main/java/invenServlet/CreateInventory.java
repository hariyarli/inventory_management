package invenServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import invenDto.InvenDto;

@WebServlet(name = "CreateInventory", urlPatterns = "/create")
public class CreateInventory extends HttpServlet {
	 public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		 response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
	 
		 String name = request.getParameter("item_name");
		 String cprice = request.getParameter("c_price");
		 Double c_price = Double.parseDouble(cprice);
		 String sprice = request.getParameter("s_price");
		 Double s_price = Double.parseDouble(sprice);
		 
		 InvenDto inventory = new InvenDto();
		 
		 inventory.setItem_name(name);
		 inventory.setC_price(c_price);
		 inventory.setS_price(s_price);
		 out.print("Added");
		 out.close();
	 }

}
