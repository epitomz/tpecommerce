package action;

import java.util.Map;

import javax.servlet.http.HttpSession;

import metier.Role;
import metier.User;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import service.IAdminCategoriesService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ConnectAction extends ActionSupport {
	
	@Autowired
	public IAdminCategoriesService AdminCategoriesService;
	
	private User user;
	private Role role;

	public String login() {
		return SUCCESS;
	}

	public String connect() {
		AdminCategoriesService.Authentifier(user);
		Map session = ActionContext.getContext().getSession();
		session.put("logined","true");
		session.put("username", user.getUserName());
		session.put("role", user.getRole());	
		return SUCCESS;
	}
	
	public String logout() {
		AdminCategoriesService.Authentifier(user);
		Map session = ActionContext.getContext().getSession();
		session.remove("logined");
		session.remove("role");	
		return SUCCESS;
	}

	public IAdminCategoriesService getAdminCategoriesService() {
		return AdminCategoriesService;
	}

	public void setAdminCategoriesService(
		IAdminCategoriesService adminCategoriesService) {
		AdminCategoriesService = adminCategoriesService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
