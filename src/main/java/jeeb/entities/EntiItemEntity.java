package jeeb.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

/**
 * Created by Jeeb on 10/26/2015.
 */
@Entity
@Table(name = "ITEM", schema = "PUBLIC", catalog = "PUBLIC")
public class EntiItemEntity {
    private int mId;
    private String mTitle;
    private String mDescription;
    private Date mPublisheddate;
    private String mLink;

    @Basic
    @Column(name = "ID", nullable = false, insertable = true, updatable = true)
    public int getId () {
        return mId;
    }

    public void setId (int id) {
        mId = id;
    }

    @Basic
    @Column(name = "TITLE", nullable = false, insertable = true, updatable = true, length = 1)
    public String getTitle () {
        return mTitle;
    }

    public void setTitle (String title) {
        mTitle = title;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = false, insertable = true, updatable = true, length = 1)
    public String getDescription () {
        return mDescription;
    }

    public void setDescription (String description) {
        mDescription = description;
    }

    @Basic
    @Column(name = "PUBLISHEDDATE", nullable = false, insertable = true, updatable = true)
    public Date getPublisheddate () {
        return mPublisheddate;
    }

    public void setPublisheddate (Date publisheddate) {
        mPublisheddate = publisheddate;
    }

    @Basic
    @Column(name = "LINK", nullable = false, insertable = true, updatable = true, length = 1)
    public String getLink () {
        return mLink;
    }

    public void setLink (String link) {
        mLink = link;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;

        EntiItemEntity that = (EntiItemEntity) o;

        if (mId != that.mId) return false;
        if (mTitle != null ? !mTitle.equals (that.mTitle) : that.mTitle != null) return false;
        if (mDescription != null ? !mDescription.equals (that.mDescription) : that.mDescription != null) return false;
        if (mPublisheddate != null ? !mPublisheddate.equals (that.mPublisheddate) : that.mPublisheddate != null)
            return false;
        if (mLink != null ? !mLink.equals (that.mLink) : that.mLink != null) return false;

        return true;
    }

    @Override
    public int hashCode () {
        int result = mId;
        result = 31 * result + (mTitle != null ? mTitle.hashCode () : 0);
        result = 31 * result + (mDescription != null ? mDescription.hashCode () : 0);
        result = 31 * result + (mPublisheddate != null ? mPublisheddate.hashCode () : 0);
        result = 31 * result + (mLink != null ? mLink.hashCode () : 0);
        return result;
    }
}
