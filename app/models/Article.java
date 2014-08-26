package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by liqilei on 14-8-21.
 */
@Entity
public class Article extends Model {

    public static Finder<Long, Article>find = new Finder<>(Long.class, Article.class);

    @Id
    public Long id;
    public String title;
    public String content;
}
