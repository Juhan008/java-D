CREATE TABLE boards (
		"id" NUMBER generated as identity PRIMARY KEY, 
		"user_id" NUMBER,
        "title" VARCHAR2(100) NOT NULL, 
        "content" LONG NOT NULL, 
        "views" NUMBER DEFAULT 0, 
        "created_at" TIMESTAMP default current_timestamp,
        "is_withdrew" NUMBER(1),
        FOREIGN KEY (user_id) REFERENCES users(id)
        );

CREATE TABLE users (
	   "id" NUMBER generated as identity PRIMARY KEY,
       "user_id" VARCHAR2(50) NOT NULL UNIQUE,
       "password" VARCHAR2(64) NOT NULL,
       "name" VARCHAR2(15) NOT NULL, 
       "phone" VARCHAR2(14) NOT NULL,
       "address" VARCHAR2(100),
       "email" VARCHAR2(100) NOT NULL UNIQUE,
       "git_address" VARCHAR2(100),
       "gender" NUMBER(1),birth DATE,
       "created_at" TIMESTAMP);
       
CREATE TABLE likes_and_hates (
		"id" NUMBER generated as identity PRIMARY KEY,
		"user_id" NUMBER, 
		"board_id" NUMBER, 
		"likes_or_hates" NUMBER(1),
		constraint fk_user_lah FOREIGN KEY (user_id) REFERENCES users(id), 
		constraint fk_board_lah FOREIGN KEY (board_id) REFERENCES boards(id)
		);       