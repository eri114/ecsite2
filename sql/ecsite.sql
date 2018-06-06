set names utf8;
set foreign_key_checks = 0;
drop database if exists ecsite;

create database if not exists ecsite;
use ecsite;

drop table if exists login_user_transaction;

create table login_user_transaction(
	id int not null primary key auto_increment,
	login_ida varchar(16) unique, /*ログインID*/
	login_pass varchar(16),
	user_name1 varchar(50), /*苗字*/
	user_name2 varchar(50), /*名前*/
	user_address1 varchar(50), /*〒*/
	user_address2 varchar(50), /*都道府県*/
	user_address3 varchar(50), /*市区町村*/
	user_address4 varchar(50), /*続き*/
	user_sex varchar(50),
	user_mail varchar(50),
	user_tel varchar(50),
	insert_date datetime,
	updated_date datetime
);

drop table if exists item_info_transaction;

create table item_info_transaction(
	id int not null primary key auto_increment,
	item_name varchar(30),
	item_price int,
	item_stock int,
	insert_date datetime,
	update_date datetime
);

drop table if exists user_buy_item_transaction;

create table user_buy_item_transaction(
	id int not null primary key auto_increment,
	item_transaction_id int,
	total_price int,
	total_count int,
	user_master_id varchar(16),
	pay varchar(30),
	insert_date datetime,
	delete_date datetime
);

INSERT INTO item_info_transaction(item_name,item_price,item_stock) VALUES("ノートBook",100,50);

INSERT INTO login_user_transaction(login_id,login_pass,user_name1,user_name2,user_address1,user_address2,
user_address3,user_address4,user_sex,user_mail,user_tel)
VALUES("taro","123","山田","太郎","123-4567","東京都","渋谷区","渋谷","男","yamadataro@gmail.com","080-1234-5678");
