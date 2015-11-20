
    alter table dish_ingredients 
        drop 
        foreign key FK_b0ydxx7dgl31jceacx4jf8p2c;

    alter table dish_ingredients 
        drop 
        foreign key FK_3p8987fu7d3km8agb1ml0acfa;

    alter table menu 
        drop 
        foreign key FK_3gsdbfvlilnrk2p40mxa729dx;

    alter table menu_dish 
        drop 
        foreign key FK_4staefqk4kxlf5e3uycgjqdje;

    alter table menu_dish 
        drop 
        foreign key FK_qywcmq7c8ob1xukcv69xu1qxe;

    alter table user_role 
        drop 
        foreign key FK_it77eq964jhfqtu54081ebtio;

    alter table user_role 
        drop 
        foreign key FK_apcc8lxk2xnug8377fatvbn04;

    drop table if exists app_user;

    drop table if exists dish;

    drop table if exists dish_ingredients;

    drop table if exists employee;

    drop table if exists ingredients;

    drop table if exists menu;

    drop table if exists menu_dish;

    drop table if exists role;

    drop table if exists user_role;

    create table app_user (
        id bigint not null auto_increment,
        account_expired bit not null,
        account_locked bit not null,
        address varchar(150),
        city varchar(50),
        country varchar(100),
        postal_code varchar(15),
        province varchar(100),
        credentials_expired bit not null,
        email varchar(255) not null,
        account_enabled bit,
        first_name varchar(50) not null,
        last_name varchar(50) not null,
        password varchar(255) not null,
        password_hint varchar(255),
        phone_number varchar(255),
        username varchar(50) not null,
        version integer,
        website varchar(255),
        primary key (id)
    ) ENGINE=InnoDB;

    create table dish (
        id_dish integer not null auto_increment,
        count integer,
        description varchar(100),
        name varchar(100),
        size varchar(30),
        totalcalories integer,
        primary key (id_dish)
    ) ENGINE=InnoDB;

    create table dish_ingredients (
        quantity integer,
        ingredientsid_ingredient integer not null,
        dishid_dish integer not null,
        primary key (ingredientsid_ingredient, dishid_dish)
    ) ENGINE=InnoDB;

    create table employee (
        id_employee integer not null auto_increment,
        lastname varchar(100),
        name varchar(75),
        password varchar(50),
        username varchar(50),
        primary key (id_employee)
    ) ENGINE=InnoDB;

    create table ingredients (
        id_ingredient integer not null auto_increment,
        calories integer,
        name varchar(100),
        primary key (id_ingredient)
    ) ENGINE=InnoDB;

    create table menu (
        id_menu integer not null auto_increment,
        employeeid_employee integer not null,
        primary key (id_menu)
    ) ENGINE=InnoDB;

    create table menu_dish (
        menuid_menu integer not null,
        dishid_dish integer not null,
        primary key (menuid_menu, dishid_dish)
    ) ENGINE=InnoDB;

    create table role (
        id bigint not null auto_increment,
        description varchar(64),
        name varchar(20),
        primary key (id)
    ) ENGINE=InnoDB;

    create table user_role (
        user_id bigint not null,
        role_id bigint not null,
        primary key (user_id, role_id)
    ) ENGINE=InnoDB;

    alter table app_user 
        add constraint UK_1j9d9a06i600gd43uu3km82jw  unique (email);

    alter table app_user 
        add constraint UK_3k4cplvh82srueuttfkwnylq0  unique (username);

    alter table dish_ingredients 
        add constraint FK_b0ydxx7dgl31jceacx4jf8p2c 
        foreign key (ingredientsid_ingredient) 
        references ingredients (id_ingredient);

    alter table dish_ingredients 
        add constraint FK_3p8987fu7d3km8agb1ml0acfa 
        foreign key (dishid_dish) 
        references dish (id_dish);

    alter table menu 
        add constraint FK_3gsdbfvlilnrk2p40mxa729dx 
        foreign key (employeeid_employee) 
        references employee (id_employee);

    alter table menu_dish 
        add constraint FK_4staefqk4kxlf5e3uycgjqdje 
        foreign key (menuid_menu) 
        references menu (id_menu);

    alter table menu_dish 
        add constraint FK_qywcmq7c8ob1xukcv69xu1qxe 
        foreign key (dishid_dish) 
        references dish (id_dish);

    alter table user_role 
        add constraint FK_it77eq964jhfqtu54081ebtio 
        foreign key (role_id) 
        references role (id);

    alter table user_role 
        add constraint FK_apcc8lxk2xnug8377fatvbn04 
        foreign key (user_id) 
        references app_user (id);
