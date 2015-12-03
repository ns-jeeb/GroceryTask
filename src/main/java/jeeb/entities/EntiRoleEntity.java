package jeeb.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Jeeb on 10/26/2015.
 */
@Entity
@Table(name = "ROLE", schema = "PUBLIC", catalog = "PUBLIC")
public class EntiRoleEntity {
    @Id
    @GeneratedValue
    private int mId;
    private String mName;
    @ManyToMany
    private List<EntiUserEntity> mUsers;

    public List<EntiUserEntity> getUsers () {
        return mUsers;
    }

    public void setUsers (List<EntiUserEntity> users) {
        mUsers = users;
    }


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

        EntiRoleEntity that = (EntiRoleEntity) o;

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
}
