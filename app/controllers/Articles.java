package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.articleList;
import views.html.index;

/**
 * Created by liqilei on 14-8-21.
 */
public class Articles extends Controller {

    public static Result list() {
        return ok(articleList.render());
    }

    public static Result save() {
        return redirect(routes.Articles.list());
    }
}
