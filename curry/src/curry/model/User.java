package curry.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import curry.core.PasswordUtil;

@Entity
@Table(name = "User")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Id")
	private long _ID;
	
	@Column(name = "NickName")
	private String nickName;
	
	@Column(name = "Password")
	private String password;
	
	public long get_ID() {
		return _ID;
	}
	
	public String getNickName() {
		return nickName;
	}
	
	public void setNickName(String name) {
		this.nickName = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String pass) {
		this.password = pass;
	}
	
	public void setRawPassword(String pass) {
		String passCode = PasswordUtil.generateSecurePassword(pass);
		this.password = passCode;
	}
}
