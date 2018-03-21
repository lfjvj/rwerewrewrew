package service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.EmpDao;
import pojo.Emp1;
import service.EmpService;
@Service
@Transactional
public class EmpService1 implements EmpService {
   @Resource
	private EmpDao ed;
	@Override
	public List<Emp1> selectAll() {
       List<Emp1> el=ed.selectAll();
		
		return el;
	}

	
	
}
