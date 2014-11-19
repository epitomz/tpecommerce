package metier;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Role implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idRole;
	private String roleName;
	@OneToMany(mappedBy = "role")
	private Set<User> users;

}
