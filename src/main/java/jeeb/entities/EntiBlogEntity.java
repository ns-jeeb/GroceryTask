package jeeb.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Jeeb on 10/26/2015.
 */
@Entity
public class EntiBlogEntity {
    @Id
    @GeneratedValue
    private int mId;
    private String mUrl;
    private String mName;

    @ManyToOne
    private EntiUserEntity mUser;

    public EntiUserEntity getUser () {
        return mUser;
    }

    public void setUser (EntiUserEntity user) {
        mUser = user;
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
    @Column(name = "URL", nullable = false, insertable = true, updatable = true, length = 1)
    public String getUrl () {
        return mUrl;
    }

    public void setUrl (String url) {
        mUrl = url;
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

        EntiBlogEntity that = (EntiBlogEntity) o;

        if (mId != that.mId) return false;
        if (mUrl != null ? !mUrl.equals (that.mUrl) : that.mUrl != null) return false;
        if (mName != null ? !mName.equals (that.mName) : that.mName != null) return false;

        return true;
    }

    @Override
    public int hashCode () {
        int result = mId;
        result = 31 * result + (mUrl != null ? mUrl.hashCode () : 0);
        result = 31 * result + (mName != null ? mName.hashCode () : 0);
        return result;
    }
}
