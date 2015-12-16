CREATE DATABASE demo; 

USE demo;

CREATE TABLE IF NOT EXISTS employee  
(id_employee INT(10) NOT NULL AUTO_INCREMENT, name varchar(75), 
 password varchar(100) NOT NULL, PRIMARY KEY(id_employee)) Engine=InnoDB;
 
CREATE TABLE IF NOT EXISTS menu
(id_menu INT(10) NOT NULL AUTO_INCREMENT,
 employeeid_employee INT(10) NOT NULL, PRIMARY KEY(id_menu))Engine=InnoDB;

CREATE TABLE IF NOT EXISTS menu_dish
(id_menudish INT(10) NOT NULL AUTO_INCREMENT, menuid_menu INT(10) NOT NULL,
 dishid_dish INT(10) NOT NULL, PRIMARY KEY(id_menudish))Engine=InnoDB;

CREATE TABLE IF NOT EXISTS dish
(id_dish INT(10) NOT NULL AUTO_INCREMENT, name varchar(100), 
size varchar(30), description varchar(100), timesserved INT(10), PRIMARY KEY(id_dish))Engine=InnoDB;

CREATE TABLE IF NOT EXISTS dish_ingredients
(id_dishingredients INT(10) NOT NULL AUTO_INCREMENT, dishid_dish INT(10) NOT NULL, ingredientsid_ingredient INT(10) 
NOT NULL, quantity INT(10), PRIMARY KEY(id_dishingredients))Engine=InnoDB;

CREATE TABLE IF NOT EXISTS ingredients
(id_ingredient INT(10) NOT NULL AUTO_INCREMENT, name varchar(100), 
calories INT(10),PRIMARY KEY(id_ingredient))Engine=InnoDB;

CREATE TABLE IF NOT EXISTS supplier_ingredients
(id_supplieringredients INT(10) NOT NULL AUTO_INCREMENT, ingredientsid_ingredients INT(10) NOT NULL,
 supplierid_supplier INT(10) NOT NULL, PRIMARY KEY(id_supplieringredients))Engine=InnoDB;

CREATE TABLE IF NOT EXISTS supplier
(id_supplier INT(10) NOT NULL AUTO_INCREMENT, name VARCHAR(150), PRIMARY KEY(id_supplier))Engine=InnoDB;

CREATE TABLE IF NOT EXISTS supplier_contact
(id_supplier_contact INT(10) NOT NULL AUTO_INCREMENT, email VARCHAR(50), email_type VARCHAR(50), phone INT(10), phone_type VARCHAR(50), 
supplierid_supplier INT(10), PRIMARY KEY(id_supplier_contact)) Engine=InnoDB;

ALTER TABLE dish_ingredients ADD FOREIGN KEY(dishid_dish) REFERENCES dish(id_dish);
ALTER TABLE dish_ingredients ADD FOREIGN KEY(ingredientsid_ingredient) REFERENCES ingredients(id_ingredient);
ALTER TABLE menu ADD FOREIGN KEY(employeeid_employee) REFERENCES employee(id_employee);
ALTER TABLE menu_dish ADD FOREIGN KEY(menuid_menu) REFERENCES dish(id_dish);
ALTER TABLE menu_dish ADD FOREIGN KEY(dishid_dish) REFERENCES menu(id_menu);
ALTER TABLE supplier_ingredients ADD FOREIGN KEY(ingredientsid_ingredients) REFERENCES ingredients(id_ingredient);
ALTER TABLE supplier_ingredients ADD FOREIGN KEY(supplierid_supplier) REFERENCES supplier(id_supplier);
ALTER TABLE supplier_contact ADD FOREIGN KEY(supplierid_supplier) REFERENCES supplier(id_supplier);
