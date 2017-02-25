package cn.kye.ht.mapper;

import java.util.List;

import cn.kye.ht.pojo.Dept;

public interface DeptMapper {
	
	public List<Dept> findAllDept();
	
	public void insert(Dept dept);

	public Dept findDeptById(String deptId);

	public void update(Dept dept);
}
