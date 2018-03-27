package application.data.model;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "tbl_phone")
public class Phone{

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "phoneid")
    @Id
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "image")
    private String image;

    @Column(name = "short_desc")
    private String shortDesc;

    @Column(name = "created_date")
    private Date createdDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
