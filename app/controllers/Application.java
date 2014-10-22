package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

import java.sql.ResultSet;
import com.typesafe.plugin.*;

public class Application extends Controller {

    public static Result index(){
    MailerAPI mail = play.Play.application().plugin(MailerPlugin.class).email();
    mail.setSubject("simplest mailer test");
    mail.setRecipient("akshayadav@gmail.com");
    mail.setFrom("teamA3login@gmail.com");
    mail.send("A text only message");

    return ok(index.render("Your new application is ready."));
}

    public static Result commonlayout(){
        return ok(views.html.commonlayout.render());
    }

    public static Result signup(){
        return ok(views.html.signup.render());
    }

    public static Result login() {
        return ok(views.html.login.render());
    }

    public static Result activation() {
        return ok(views.html.activation.render());
    }


    public static Result accountindex() {
        return ok(accountindex.render());
    }

    public static Result adduser(){

        return TODO;
    }

    public static Result doactivation(){

        return TODO;
    }

    public static Result dologin(){

        return TODO;
    }

}

