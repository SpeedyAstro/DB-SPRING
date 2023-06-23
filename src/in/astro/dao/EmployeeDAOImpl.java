package in.astro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.astro.bo.EmployeeBO;

@Repository(value = "dao")
public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String SQL_INSERT_QUERY = "insert into employee2 (eid,ename,eage,eaddress,esalary,hikeAmount) values (?,?,?,?,?,?);";
	@Autowired
	DataSource dataSource;
	@Override
	public EmployeeBO save(EmployeeBO emp) {
		try(Connection connection = dataSource.getConnection(); PreparedStatement pstmt = connection.prepareStatement(SQL_INSERT_QUERY) ){
			pstmt.setInt(1, emp.getEid());
			pstmt.setString(2, emp.getEname());
			pstmt.setInt(3, emp.getEage());
			pstmt.setString(4, emp.getEaddress());
			pstmt.setInt(5, Math.round(emp.getEsalary()));
			pstmt.setFloat(6, emp.getHikeAmount());
			pstmt.execute();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return emp;
	}
	@Override
	public String toString() {
		return "EmployeeDAOImpl [dataSource=" + dataSource + "]";
	}
	

}
