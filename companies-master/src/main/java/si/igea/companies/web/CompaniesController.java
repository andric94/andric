package si.igea.companies.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import si.igea.companies.bl.dao.companies.CompaniesDao;
import si.igea.companies.model.Company;

import java.util.List;

@Controller
@RequestMapping("/companies")
public class CompaniesController {

    @Autowired
    private CompaniesDao companiesDao;

    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String listCompanies(Model model) {

        List<Company> companyList = companiesDao.list();
        model.addAttribute("companies", companyList);

        return "companies/companies";
    }
    
    
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addCompany(@RequestParam("ncId") int newCompanyId,@RequestParam("ncName") String newCompanyName, @RequestParam("ncPib") Long newCompanyPIB, @RequestParam("ncType") String newCompanyType, Model model) {
    	
    	Company newComp = new Company(newCompanyId,newCompanyName, newCompanyPIB,newCompanyType);
    	

        companiesDao.add(newComp);
        model.addAttribute("companies",companiesDao.list());

        return "companies/companies";
    }
    
   
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getCompany(@RequestParam("srch") String searchName, Model model) {

     
        List<Company> companyFilt = companiesDao.get(searchName);
        System.out.println(companyFilt);
        model.addAttribute("companies", companyFilt);
        companiesDao.clr();
        System.out.println(companiesDao.get(searchName));
        System.out.println(companyFilt);

        
        
        
        return "companies/companies";
     
    }

}
