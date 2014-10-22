package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * Created by Akshay on 10/19/2014.
 */


@Entity
public class User extends Model {
    @Id
    public String Id;

    public String FirstName;
    public String LastName;
    public String Email;
    public String Password;
    public String Role;


}
