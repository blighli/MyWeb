package controllers;

import controllers.*;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import views.html.index;

import java.io.File;

import static play.mvc.Http.*;
import static play.mvc.Http.MultipartFormData.*;

public class Application extends Controller {

    public static Result index() {
        return redirect(routes.Articles.list());
    }

    /*
    public static  Result upload()
    {
        MultipartFormData body = request().body().asMultipartFormData();
        FilePart filePart = body.getFile("file");
        if(filePart != null)
        {
            String fileName = filePart.getFilename();
            File file = filePart.getFile();

            return ok("File uploaded");
        }
        else
        {
            flash("error","Missing file");
            return redirect(routes.Application.index());
        }
    }*/

}
