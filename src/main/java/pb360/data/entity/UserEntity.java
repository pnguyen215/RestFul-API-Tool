package pb360.data.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "UserEntity")
public class UserEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String username;
	private String password;

	public UserEntity() {
		super();
	}

	public UserEntity(@JsonProperty("id") String id, @JsonProperty("username") String username,
			@JsonProperty("password") String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

}
