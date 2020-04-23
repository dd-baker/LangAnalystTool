package natomicsLab.narremeSpace.modules;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = 'user')
public class Users {
    @ID
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = 'user_id')
    private int id;
    @Column(name = 'active')
    private int active;
    @Column(name = 'user_name')
    private String user_name;
    @Column(name = 'password')
    private String password;
    @Column(name = 'email')
    private String email;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER);
    @JoinTable(name = 'user_role', joinColumns = @JoinColumn(name = 'user_id'))
    private Set<Role> roles;

    public Users() {
    }

    public Users(Users users){
        this.active = users.getActive();
        this.email = users.getEmail();
        this.roles = users.getRoles();
        this.user_name = users.getUser_name();
        this.id = users.getId();
        this.password = users.getPassword();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
