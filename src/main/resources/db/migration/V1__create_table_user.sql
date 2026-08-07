CREATE TABLE USERS (
    user_id UUID,
    username VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR (255) NOT NULL,
    CONSTRAINT pk_user PRIMARY KEY (user_id)
);