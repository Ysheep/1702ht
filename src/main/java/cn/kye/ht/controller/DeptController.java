package cn.kye.ht.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.kye.ht.pojo.Dept;
import cn.kye.ht.service.DeptService;

@Controller
public class DeptController {
	
	@Autowired
	private DeptService deptService;
	
	/**
	 * 这个方法是用来定位部门查询页面
	 * 对应的后台请求路径 /sysadmin/dept/list
	 * 对应的前台页面:/WEB-INF/pages/sysadmin/dept/jDeptList.jsp
	 * @return
	 * 通过Model  给前端返回数据
	 */
	@RequestMapping("/sysadmin/dept/list")
	public String list(Model model) {
		List<Dept> dataList = deptService.findAllDept();
		model.addAttribute("dataList", dataList);
		return "/sysadmin/dept/jDeptList";
	}
	/**
	 * 这个方法是转向部门新增页面，对应的后台请求路径:/sysadmin/dept/tocreate
	 * WEB-INF/pages/sysadmin/dept/jDeptCreate.jsp
	 * @return
	 * 部门新增的信息:
	 * 1.部门名称
	 * 2.部门的父部门信息
	 * 根据父部门信息，在转向新增页面时，要组织数据传给页面
	 */
			
	@RequestMapping("/sysadmin/dept/tocreate")
	public String toCreate(Model model){
		List<Dept> dataList = deptService.findAllDept();
		for(Dept list:dataList){
			System.out.println(list.getDeptId());
		}
		model.addAttribute("dataList",dataList);
		return "/sysadmin/dept/jDeptCreate";
	}
	/**
	 * 这个方法是用来实现这个保存的
	 * 对应的实现路径 /sysadmin/dept/insert
	 * @return
	 */
	@RequestMapping("/sysadmin/dept/insert")
//	public String save(String deptName,String parentId) {
//		System.out.println(deptName+","+parentId);
	// deptId  和 parentId  是Dept的私有属性  可以通过封装讲Dept对象传送过去
	public String save(Dept dept){
		deptService.insert(dept);
//		Dept dept = deptService.findDeptById(parentId);
//		deptService.save(deptName,dept.getDeptName());
		return "forward:/sysadmin/dept/list";
	}
	
	/**
	 * 这个方法是转向更新页面  对应的后台请求路径 /sysadmin/dept/toupdate
	 * WEB-INF/pages/sysadmin/dept/jDeptUpdate.jsp
	 * @return
	 * 1.要接受主键值
	 * 2.数据回显，根据主键值查出对应部门信息，
	 * 3.需要父部门的信息，所以要传所有父部门的信息
	 */
	@RequestMapping("/sysadmin/dept/toupdate")
	public String toUpdate(String deptId,Model model){
		Dept dept = deptService.findDeptById(deptId);
		List<Dept> dataList = deptService.findAllDept();
		model.addAttribute("dept", dept);
		model.addAttribute("dataList", dataList);
		return "/sysadmin/dept/jDeptUpdate";
	}
	
	/**
	 * 该方法是用于保存用户修改的信息  对应的后台请求路径 /sysadmin/dept/update
	 * @return
	 */
	@RequestMapping(" /sysadmin/dept/update")
	public String update(Dept dept) {
		deptService.update(dept);
		return "forward:/sysadmin/dept/list";
	}
	
}
