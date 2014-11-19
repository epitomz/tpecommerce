package metier;

import java.io.Serializable;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class User implements Serializable{
	
	private Long idUser;
	private String userName;
	private String password;
	private boolean actived;
	@OneToOne
	@JoinColumn(name = "client", referencedColumnName = "idClient")
	private Client client;
	@ManyToOne
	@JoinColumn(name = "role", referencedColumnName ="idRole")
	private Role role;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActived() {
		return actived;
	}
	public void setActived(boolean actived) {
		this.actived = actived;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	

}
