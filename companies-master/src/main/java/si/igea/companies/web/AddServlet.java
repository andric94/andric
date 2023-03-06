package si.igea.companies.web;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import si.igea.companies.model.Company;

public class AddServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int newCompanyId = Integer.parseInt(req.getParameter("ncId"));
		String newCompanyName = req.getParameter("ncName");
		Long newCompanyPIB = Long.parseLong(req.getParameter("ncPib"));
		String newCompanyType = req.getParameter("ncType");
		
		Company newComp = new Company(newCompanyId,newCompanyName, newCompanyPIB,newCompanyType);
		
		
		
		
		
	}
	
}
