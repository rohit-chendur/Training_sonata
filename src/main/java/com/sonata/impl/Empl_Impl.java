package com.sonata.impl;

import com.sonata.model.Employee;
import com.sonata.intrf.Emp_intfr;

public class Empl_Impl implements Emp_intfr{

	@Override
	public double yearlySal(Employee e1) {
		double ySal;
		ySal = e1.getEmpSal()*12;
		return ySal;
	}

	@Override
	public double apprSal(Employee e1) {
		double aSal;
		if (e1.getEmpSal()<10000) {
			aSal = e1.getEmpSal()*0.1;
		} else {
			aSal = e1.getEmpSal()*0.05;
		}
		return aSal;
	}

}
