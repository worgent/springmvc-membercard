/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2015/8/3 15:53:20                            */
/*==============================================================*/


drop table if exists business;

drop table if exists coupons;

drop table if exists integral;

drop table if exists integral_exchange;

drop table if exists member;

drop table if exists message;

drop table if exists pay_order;

drop table if exists recharge_order;

drop table if exists sign;

/*==============================================================*/
/* Table: business                                              */
/*==============================================================*/
create table business
(
   id                   int not null auto_increment comment '商户ID',
   name                 varchar(100) default NULL comment '商户名称',
   tel                  varchar(15) default NULL comment '电话',
   addr                 varchar(100) default NULL comment '地址',
   account              varchar(100) comment '收款账号',
   primary key (id)
);

/*==============================================================*/
/* Table: coupons                                               */
/*==============================================================*/
create table coupons
(
   id                   int not null auto_increment comment '会员优惠ID',
   primary key (id)
);

/*==============================================================*/
/* Table: integral                                              */
/*==============================================================*/
create table integral
(
   id                   int not null comment '积分ID',
   member_id            int comment '会员ID',
   balance              int default 0 comment '积分余额',
   primary key (id)
);

/*==============================================================*/
/* Table: integral_exchange                                     */
/*==============================================================*/
create table integral_exchange
(
   id                   int not null comment '积分兑换ID',
   integrla_id          int comment '积分ID ',
   title                varchar(255) default NULL comment '兑换活动标题',
   end_time             datetime default NULL comment '活动结束时间',
   pic                  varchar(255) default NULL comment '活动内容介绍图片',
   introduction         varchar(255) default NULL comment '活动简介',
   Need_integral        int comment '兑换所需积分数',
   primary key (id)
);

/*==============================================================*/
/* Table: member                                                */
/*==============================================================*/
create table member
(
   id                   int not null auto_increment comment '会员信息ID',
   name                 varchar(255) default NULL comment '会员名称',
   addr                 varchar(255) default NULL comment '会员地址',
   tel                  varchar(15) default NULL comment '会员电话',
   account              varchar(100) default NULL comment '会员登陆账号',
   pwd                  varchar(100) default NULL comment '登录密码',
   type                 int default NULL comment '会员类型（普通会员，高级会员等',
   sex                  int default NULL comment '性别1男 0女',
   birthday             datetime default NULL comment '出生日期',
   status               smallint default 1 comment '会员状态1有效0无效',
   primary key (id)
);

/*==============================================================*/
/* Table: message                                               */
/*==============================================================*/
create table message
(
   id                   int not null comment '消息ID',
   member_id            int comment '会员ID',
   title                varchar(100) default NULL comment '消息标题',
   content              varchar(255) default NULL comment '消息内容',
   create_time          datetime default NULL comment '创建时间',
   read_time            datetime default NULL comment '阅读时间',
   type                 int default 1 comment '消息类型1系统0广播',
   primary key (id)
);

/*==============================================================*/
/* Table: pay_order                                             */
/*==============================================================*/
create table pay_order
(
   id                   int not null comment '支付订单ID',
   member_id            int comment '会员ID',
   bussiness_id         int comment '商户ID',
   money                decimal comment '支付金额',
   real_money           decimal comment '实际支付金额',
   create_time          datetime comment '下单时间',
   status               smallint comment '订单状态1已支付0未支付',
   pay_type             int default 1 comment '支付方式1微支付2余额支付3现金付款',
   pay_num              varchar(255) comment '订单号',
   coupons_type         int default 1 comment '优惠类型1无优惠2代金卷3优惠劵',
   primary key (id)
);

/*==============================================================*/
/* Table: recharge_order                                        */
/*==============================================================*/
create table recharge_order
(
   id                   int not null comment '充值订单ID',
   member_id            int comment '会员ID',
   business_id          int comment '商户ID',
   money                decimal comment '充值金额',
   money_before         decimal comment '充值前金额',
   money_after          decimal comment '充值后金额',
   type                 int comment '充值方式1微支付（目前只有微支付',
   caeate_time          datetime comment '下单时间',
   recharge_num         varchar(100) comment '订单号',
   status               smallint comment '订单状态1已支付0未支付',
   primary key (id)
);

/*==============================================================*/
/* Table: sign                                                  */
/*==============================================================*/
create table sign
(
   id                   int not null comment '签到ID',
   member_id            int comment '会员ID',
   status               smallint default 0 comment '签到状态0未签到1已签到',
   count                int default 0 comment '签到次数',
   sign_time            datetime comment '签到日期',
   integral_details     varchar(255) comment '签到记录中积分来源（签到所得积分',
   integral             varchar(255) comment '签到记录中记录积分+1',
   primary key (id)
);

alter table business type=InnoDB;

alter table coupons type=InnoDB;

alter table integral type=InnoDB;

alter table integral_exchange type=InnoDB;

alter table member type=InnoDB;

alter table message type=InnoDB;

alter table pay_order type=InnoDB;

alter table recharge_order type=InnoDB;

alter table sign type=InnoDB;

alter table integral add constraint FK_Reference_7 foreign key (member_id)
      references member (id);

alter table integral_exchange add constraint FK_Reference_8 foreign key (integrla_id)
      references integral (id);

alter table message add constraint FK_Reference_10 foreign key (member_id)
      references member (id);

alter table pay_order add constraint FK_Reference_5 foreign key (member_id)
      references member (id);

alter table pay_order add constraint FK_Reference_6 foreign key (bussiness_id)
      references business (id);

alter table recharge_order add constraint FK_Reference_11 foreign key (member_id)
      references member (id);

alter table recharge_order add constraint FK_Reference_12 foreign key (business_id)
      references business (id);

alter table sign add constraint FK_Reference_9 foreign key (member_id)
      references member (id);

