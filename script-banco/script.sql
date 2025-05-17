use dbricardo;

/*
create table categoria(
categ_id integer primary key auto_increment,
categ_nome varchar(100) not null);

create table produto(
prod_id integer primary key auto_increment,
prod_nome varchar(100) not null,
prod_quantidade integer not null,
prod_preco decimal(10,2),
categ_id integer,
constraint categoria_produto FOREIGN KEY (categ_id) REFERENCES Categoria(categ_id));
*/

insert into categoria(categ_id,categ_nome) values(1,'Vinhos Nacionais');
insert into categoria(categ_id,categ_nome) values(2,'Vinhos Internacionais');
select * from categoria;

/* Nacionais */
insert into produto(prod_id,prod_nome, prod_quantidade,prod_preco,categ_id) values(1,'Don Laurindo Don Tannat',100,278.00,1);
insert into produto(prod_id,prod_nome, prod_quantidade,prod_preco,categ_id) values(2,'Amitié Chardonnay OAK Barrel',100,187.00,1);
insert into produto(prod_id,prod_nome, prod_quantidade,prod_preco,categ_id) values(3,'Valparaiso Vitale Sangiovese',300,128.00,1);
insert into produto(prod_id,prod_nome, prod_quantidade,prod_preco,categ_id) values(4,'Valparaiso Vitale Chardonnay',350,119.00,1);

/* Internacionais */
insert into produto(prod_id,prod_nome, prod_quantidade,prod_preco,categ_id) values(5,'Vinho Argentino Trivento Malbec 750ml',100,56.90,2);
insert into produto(prod_id,prod_nome, prod_quantidade,prod_preco,categ_id) values(6,'Vinho Chileno Reservado Malbec',100,26.90,2);
insert into produto(prod_id,prod_nome, prod_quantidade,prod_preco,categ_id) values(7,'Vinho Argentino Trivento Eolo Malbec',300,949.90,2);
insert into produto(prod_id,prod_nome, prod_quantidade,prod_preco,categ_id) values(8,'Vinho Argentino Trivento Golden Reserve Malbec 750ml 2019',350,159.00,2);

select * from produto;

Select cat.categ_id, cat.categ_nome as nomeCategoria, 
                           prod.prod_id,prod.prod_nome, prod.prod_preco, prod.prod_quantidade 
                           from categoria cat join produto prod on cat.categ_id = prod.categ_id;






 