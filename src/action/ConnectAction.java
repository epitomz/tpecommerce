package action;

import metier.User;

import org.springframework.beans.factory.annotation.Autowired;

import service.IAdminCategoriesService;

import com.opensymphony.xwork2.ActionSupport;

public class ConnectAction extends ActionSupport {
	
	@Autowired
	public IAdminCategoriesService AdminCategoriesService;
	
	private User user;

	public String login() {
		return SUCCESS;
	}

	public String connect() {
		AdminCategoriesService.Authentifier(user);
		return SUCCESS;
	}
}
