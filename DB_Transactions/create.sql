/* Grunash 20181212 */
CREATE DATABASE curryDB;

CREATE TABLE User (
	Id int(6) primary key auto_increment,
    
    NickName varchar(255) not null unique,
    Password varchar(255) not null
);

CREATE TABLE Class (
	Id int(6) primary key auto_increment,
    
    Name varchar(255) not null unique
);

CREATE TABLE Race (
	Id int(6) primary key auto_increment,
    
    Name varchar(255) not null unique
);

CREATE TABLE Aligment (
	Id int(6) primary key auto_increment,
    
    Name varchar(255) not null unique
);

CREATE TABLE Deity (
	Id int(6) primary key auto_increment,
    AligmentId int(6) not null,
    Name varchar(255) not null,
    
    FOREIGN KEY (AligmentId) REFERENCES Aligment(Id)
);


CREATE TABLE Character_Sheet (
	Id int(6) primary key auto_increment,
    Name varchar(255) not null,
    UserId int(6) not null,
    ClassId int(6) not null,
    RaceId int(6) not null,
    AligmentId int(6) not null,
    DeityId int(6) not null,
    Strength int(3) not null,
    Dexterity int(3) not null,
    Constitution int(3) not null,
    Intelligence int(3) not null,
    Wisdom int(3) not null,
    Carisma int(3) not null,
    
    FOREIGN KEY (UserId) REFERENCES User(Id),
    FOREIGN KEY (ClassId) REFERENCES Class(Id),
    FOREIGN KEY (RaceId) REFERENCES Race(Id),
    FOREIGN KEY (AligmentId) REFERENCES Aligment(Id),
    FOREIGN KEY (DeityId) REFERENCES Deity(Id)
);