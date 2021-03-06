package cn.tax.nswf.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Person implements Serializable{
	private Integer pid; // 标示符属性 在hibernate中根据标示符属性识别缓存中的对象
	private String name;
	private String sex;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Person() {
	}
	public Person(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}
}
