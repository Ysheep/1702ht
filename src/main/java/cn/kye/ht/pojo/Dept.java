package cn.kye.ht.pojo;

import java.io.Serializable;
import java.util.Date;

public class Dept implements Serializable {
	
	private static final long serialVersionUID = 4768097275673784106L;
	
	private String deptId;//部门主键
	private String parentId;//当前部门父部门的id
	private String deptName;//当前部门的名称
	private int orderNo;//部门的排序号
	private int state;//部门状态  1 启用  0 停用
	private String createBy;//创建者信息
	private String createDept;//创建部门信息
	private Date createTime;//部门创建时间
	private String updateBy;//更新者信息
	private Date updateTime;//部门更新时间
	//这个对象表示当前部门的父部门
	private Dept parent;
	
	
	public Dept getParent() {
		return parent;
	}
	public void setParent(Dept parent) {
		this.parent = parent;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getCreateDept() {
		return createDept;
	}
	public void setCreateDept(String createDept) {
		this.createDept = createDept;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	
}
