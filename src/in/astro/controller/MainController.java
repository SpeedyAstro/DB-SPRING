package in.astro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.astro.dto.EmployeeDTO;
import in.astro.service.IEmployeeService;
import in.astro.vo.EmployeeVO;

@Component
public class MainController {
	@Autowired
	private IEmployeeService service;
	
	public EmployeeVO getHike(EmployeeVO vo) {
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEid(Integer.parseInt(vo.getEid()));
		dto.setEaddress(vo.getEaddress());
		dto.setEname(vo.getEname());
		dto.setEage(Integer.parseInt(vo.getEage()));
		dto.setEsalary(Float.parseFloat(vo.getEsalary()));
		
		EmployeeDTO empDTO = service.calculateHike(dto);

		EmployeeVO employeeVO = new EmployeeVO();
		employeeVO.setEid(empDTO.getEid().toString());
		employeeVO.setEaddress(empDTO.getEaddress());
		employeeVO.setEage(empDTO.getEage().toString());
		employeeVO.setEname(empDTO.getEname());
		employeeVO.setEsalary(empDTO.getEsalary().toString());
		employeeVO.setHikeAmount(empDTO.getHikeAmount().toString());
		
		return employeeVO;
	}

	@Override
	public String toString() {
		return "MainController [service=" + service + "]";
	}
}
