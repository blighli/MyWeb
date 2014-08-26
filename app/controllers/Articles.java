package controllers;


import models.Article;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.articleEdit;
import views.html.articleList;

import java.util.List;

/**
 * Created by liqilei on 14-8-21.
 */
public class Articles extends Controller {

    public static Result list() {
        List<Article> articles = Article.find.all();
        return ok(articleList.render(articles));
    }

    public static Result create() {
        Form<Article> form = Form.form(Article.class);
        return ok(articleEdit.render(form));
    }

    public static Result save() {
        Form<Article> form = Form.form(Article.class).bindFromRequest();
        Article article = form.get();
        article.save();
        return redirect(routes.Articles.list());
    }
}
