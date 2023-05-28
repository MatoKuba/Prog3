package ChatApplication.ChatApplication;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="user",uniqueConstraints=@UniqueConstraint(columnNames="email"))
public class User {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
@Column(name="first_Name")
private String firstname;
@Column(name="last_Name")
private String lastname;
@Column(name="email")
private String email;
@Column(nullable = false, length = 64)
private String password;

public User(String firstName,String lastName,String email,String Password)
{
super();
this.firstname=firstName;
this.lastname=lastName;
this.email=email;
this.password=Password;
}
public Long getId() {
	return id;
}
}
