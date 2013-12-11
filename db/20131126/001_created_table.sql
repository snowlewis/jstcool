drop table if exists `jstcool`.`redirect_mapping`;
create table  `jstcool`.`redirect_mapping` (
  `id` bigint(20) unsigned not null auto_increment ,
  `code` varchar(100) not null,
  `url` varchar(4000) not null,
  `request_cnt` bigint(20) unsigned not null,
  primary key  (`id`)
) engine=innodb default charset=utf8 comment='跳转映射关系表';
