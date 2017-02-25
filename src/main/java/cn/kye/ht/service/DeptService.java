package cn.kye.ht.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kye.ht.mapper.DeptMapper;
import cn.kye.ht.pojo.Dept;

@Service
public class DeptService {
	
	@Autowired
	private DeptMapper deptMapper;
	
	public List<Dept> findAllDept(){
		return deptMapper.findAllDept();
	}
	/**
	 * dept 现在封装了deptId parentId
	 * @param dept
	 */
	public void insert(Dept dept) {
		dept.setDeptId(UUID.randomUUID().toString());
		dept.setState(1);
		dept.setCreateTime(new Date());
		dept.setUpdateTime(dept.getCreateTime());
		deptMapper.insert(dept);
		
		
	}
	public Dept findDeptById(String deptId) {
		
		return deptMapper.findDeptById(deptId);
	}
	public void update(Dept dept) {
		//设置更新时间
		dept.setUpdateTime(new Date());
		dept.setState(1);
		deptMapper.update(dept);
	}
	
	
}
