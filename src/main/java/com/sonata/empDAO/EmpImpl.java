package com.sonata.empDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sonata.empIntf.EmpIntf;
import com.sonata.empBean.Employee;

public class EmpImpl implements EmpIntf{
		DBConnection db = new DBConnection();
	int row = 0;
	public int save(Object object) {
		Employee e1 = (Employee) object;
		try {
			PreparedStatement s1 = db.getConnection().prepareStatement("insert into employee values (?,?,?)");
			
			s1.setInt(1,e1.getEmpID());
			s1.setString(2,e1.getEmpName());
			s1.setDouble(3,e1.getEmpSal());
			row = s1.executeUpdate();
		} catch (SQLException e) {e.printStackTrace();}
	
	return row;

	}
	
}
