# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table article (
  id                        bigint auto_increment not null,
  title                     varchar(255),
  content                   varchar(255),
  constraint pk_article primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table article;

SET FOREIGN_KEY_CHECKS=1;

