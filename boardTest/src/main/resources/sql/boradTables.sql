CREATE TABLE users (
   id NUMBER GENERATED AS IDENTITY PRIMARY KEY,
   user_id VARCHAR2(50) NOT NULL UNIQUE,
   password VARCHAR2(64) NOT NULL,
   name VARCHAR2(15) NOT NULL,
   phone VARCHAR2(14),
   address VARCHAR2(100),
   email VARCHAR2(100) NOT NULL UNIQUE,
   git_address VARCHAR2(100),
   gender NUMBER(1),
   birth DATE,
   created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE boards (
   id NUMBER GENERATED AS IDENTITY PRIMARY KEY,
   user_id NUMBER,
   title VARCHAR2(100) NOT NULL,
   content CLOB NOT NULL,
   views NUMBER DEFAULT 0,
   created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
   is_withdrew NUMBER(1),
   FOREIGN KEY (user_id) REFERENCES users(id)
);

CREATE TABLE likes_and_hates (
   id NUMBER GENERATED AS IDENTITY PRIMARY KEY,
   user_id NUMBER, 
   board_id NUMBER, 
   likes_or_hates NUMBER(1),
   created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
   CONSTRAINT fk_user_lah FOREIGN KEY (user_id) REFERENCES users(id), 
   CONSTRAINT fk_board_lah FOREIGN KEY (board_id) REFERENCES boards(id)
);
