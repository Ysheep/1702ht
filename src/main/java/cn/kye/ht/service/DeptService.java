package cn.kye.ht.service;

import java.util.List;

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
	
}
