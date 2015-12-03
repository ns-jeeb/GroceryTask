package jeeb.entities;

import javax.management.relation.Role;
import javax.persistence.*;
import java.util.List;

/**
 * Created by Jeeb on 10/26/2015.
 */
@Entity
@Table(name = "USER", schema = "PUBLIC", catalog = "PUBLIC")
public class EntiUserEntity {
    @Id
    @GeneratedValue
    private int mId;


    private String mName;
    private String mEmail;
    private String mPassword;

    @ManyToMany
    @JoinTable
    private List<EntiRoleEntity> mRoles;

    public List<EntiRoleEntity> getRoles () {
        return mRoles;
    }

    public void setRoles (List<EntiRoleEntity> roles) {
        mRoles = roles;
    }

    @Id
    @Basic
    @Column(name = "ID", nullable = false, insertable = true, updatable = true)
    public int getId () {
        return mId;
    }

    public void setId (int id) {
        mId = id;
    }

    @Basic
    @Column(name = "NAME", nullable = false, insertable = true, updatable = true, length = 1)
    public String getName () {
        return mName;
    }

    public void setName (String name) {
        mName = name;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;

        EntiUserEntity that = (EntiUserEntity) o;

        if (mId != that.mId) return false;
        if (mName != null ? !mName.equals (that.mName) : that.mName != null) return false;

        return true;
    }

    @Override
    public int hashCode () {
        int result = mId;
        result = 31 * result + (mName != null ? mName.hashCode () : 0);
        return result;
    }

    @Basic
    @Column(name = "EMAIL", nullable = false, insertable = true, updatable = true, length = 1)
    public String getEmail () {
        return mEmail;
    }

    public void setEmail (String email) {
        mEmail = email;
    }

    @Basic
    @Column(name = "PASSWORD", nullable = false, insertable = true, updatable = true, length = 1)
    public String getPassword () {
        return mPassword;
    }

    public void setPassword (String password) {
        mPassword = password;
    }
}
