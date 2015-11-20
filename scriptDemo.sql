CREATE DATABASE demo; 

USE demo;

CREATE TABLE IF NOT EXISTS employee  
(id_employee INT(10) NOT NULL, name varchar(75), 
lastname varchar(100), username varchar(50) NOT NULL,
 password varchar(50) NOT NULL) Engine=InnoDB;
 
CREATE TABLE IF NOT EXISTS menu
(id_menu INT(10) NOT NULL, service_date date,
 employeeid_employee INT(10) NOT NULL)Engine=InnoDB;

CREATE TABLE IF NOT EXISTS menu_dish
(menuid_menu INT(10) NOT NULL, dishid_dish INT(10) NOT NULL)Engine=InnoDB;

CREATE TABLE IF NOT EXISTS dish
(id_dish INT(10) NOT NULL, name varchar(100), 
size varchar(30), description varchar(100), totalcalories INT(10), 
count INT(10))Engine=InnoDB;

CREATE TABLE IF NOT EXISTS dish_ingredients
(dishid_dish INT(10) NOT NULL, ingredientsid_ingredient INT(10) 
NOT NULL, quantity INT(10))Engine=InnoDB;

CREATE TABLE IF NOT EXISTS ingredients
(id_ingredient INT(10) NOT NULL, name varchar(100), 
calories INT(10))Engine=InnoDB;

ALTER TABLE employee ADD PRIMARY KEY(id_employee);
ALTER TABLE menu ADD PRIMARY KEY(id_menu);
ALTER TABLE ingredients ADD PRIMARY KEY(id_ingredient);
ALTER TABLE dish ADD PRIMARY KEY(id_dish);
ALTER TABLE menu_dish ADD PRIMARY KEY(menuid_menu,dishid_dish);
ALTER TABLE dish_ingredients ADD PRIMARY KEY(dishid_dish,ingredientsid_ingredient);

ALTER TABLE dish_ingredients ADD FOREIGN KEY(dishid_dish) REFERENCES dish(id_dish);
ALTER TABLE dish_ingredients ADD FOREIGN KEY(ingredientsid_ingredient) REFERENCES ingredients(id_ingredient);
ALTER TABLE menu ADD FOREIGN KEY(employeeid_employee) REFERENCES employee(id_employee);
ALTER TABLE menu_dish ADD FOREIGN KEY(menuid_menu) REFERENCES dish(id_dish);
ALTER TABLE menu_dish ADD FOREIGN KEY(dishid_dish) REFERENCES menu(id_menu);