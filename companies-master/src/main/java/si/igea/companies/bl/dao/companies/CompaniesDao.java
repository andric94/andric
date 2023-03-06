package si.igea.companies.bl.dao.companies;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import si.igea.companies.bl.AbstractJDBCDao;
import si.igea.companies.model.Company;
import si.igea.companies.model.CompanyType;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Log4j2
@Component
public class CompaniesDao extends AbstractJDBCDao {
	
//	String jdbcURL = "jdbc:postgresql://localhost:5432/companies";
//	String username = "postgres";
//	String password = "password";
//	
//	Connection connection = DriverManager.getConnection(jdbcURL, username, password);
	
	
	
		

	public static List<Company> companies = new ArrayList<>(
			Arrays.asList(
					new Company(1, "Igea", 234L, "GEODESY"), 
					new Company(2, "Igea holding", 235L, "ECONOMICS"),
					new Company(3, "Andric", 236L, "ECONOMICS")));
	
	public static Company defaultCompany = new Company(0, "Default", 0L, "GEODESY");
	
	public List<Company> companyFilter = new ArrayList<>();
	public List<Company> defaultList = new ArrayList<>(
			Arrays.asList(defaultCompany)
			);
	
    public List<Company> list() {
    	getJdbcTemplate().queryForObject("select * from companies;", new CompaniesRowMapper());
        return companies;
    }
    
    public List<Company> filter(){
        return companyFilter;
    }

    public List<Company> get(Integer id) {
    	for (Company company : companies) {
    		if (company.getId().equals(id)) {
    			companyFilter.add(company);
    			return companyFilter;
    			
    		}
    	}
    	companyFilter.clear();
    	
    	return defaultList;
    }
    public List<Company> get(String name) {
    	for (Company company : companies) {
    		if (company.getName().equals(name)) {
    			companyFilter.add(company);
    			
    		}
    	}
    	return companyFilter;
    }
    public void clr() {
    	companyFilter.clear();
    }
    
    
    public void add() {
    	companies.add(defaultCompany);
    }
    public void add(Company company) {
    	companies.add(company);
    }
}