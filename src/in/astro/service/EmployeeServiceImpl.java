package in.astro.service;

import javax.sound.midi.Soundbank;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.astro.bo.EmployeeBO;
import in.astro.dao.IEmployeeDAO;
import in.astro.dto.EmployeeDTO;

@Service(value = "empService")
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private IEmployeeDAO dao;
	
	@Override
	public EmployeeDTO calculateHike(EmployeeDTO dto) {
		EmployeeBO bo = new EmployeeBO();
		BeanUtils.copyProperties(dto, bo);
		System.out.println(dto);
		System.out.println(bo);
		bo.setHikeAmount(bo.getEsalary() + 30000.0f);
		EmployeeBO empbo = dao.save(bo);
		EmployeeDTO employeeDTO  = new EmployeeDTO();
		BeanUtils.copyProperties(empbo, employeeDTO);
		return employeeDTO;
	}

	@Override
	public String toString() {
		return "EmployeeServiceImpl [dao=" + dao + "]";
	}
	
}
