package cn.com.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity//表示是实体
@Table(name="user")//配置表名
public class User implements Serializable{
	@Id
	@Column(name="userid",unique=true)//列名，是否是唯一列
	@GeneratedValue(strategy=GenerationType.AUTO)//主键生成策略
	Integer userid;
	@Column(name="username")
	String username;
	@Column(name="password")
	String password;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(Integer userid, String username, String password) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
	}
	public User() {
		super();
	}
	
}
