SELECT * FROM bancoteste.usuarios;
CREATE DATABASE bancoteste;
USE bancoteste;

CREATE TABLE usuarios(
id_usuario INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
nome VARCHAR(45) NOT NULL,
email VARCHAR(45)NOT NULL,
senha VARCHAR(45) NOT NULL
);

# CRUD
INSERT INTO usuarios (nome, email, senha)
VALUES ('admin', 'admin@gmail.com','123');
SELECT * FROM bancoteste.usuarios;
UPDATE usuarios SET nome = 'duda' WHERE id_usuario = 7;
DELETE FROM usuarios WHERE id_usuario = 3;

CREATE TABLE downloads(
numero_downloads INT
);
DROP TABLE downloads;
SELECT * FROM downloads;

INSERT INTO downloads(numero_downloads) VALUES (1);