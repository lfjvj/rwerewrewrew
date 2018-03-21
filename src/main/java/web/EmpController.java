package web;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.impl.EmpDao1;
import pojo.Emp1;
import service.EmpService;

@Controller
public class EmpController {
@Resource
private EmpService ds;
@RequestMapping("/list")
public String fn(){
	List<Emp1> selectAll = ds.selectAll();
	System.out.println("¹þà¶¹þà¶"+selectAll);
	return "emplist";
}





}












