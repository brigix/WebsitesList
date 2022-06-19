--DDL
create DATABASE WebPagesDB;
use WebPagesDB;

create TABLE WebPages(
id INT PRIMARY KEY,
title VARCHAR (255),
url VARCHAR (255) NOT NULL,
logo VARCHAR (255)
)