--Populando banco de dados

INSERT INTO marca (nome) VALUES ('Fiat');
INSERT INTO marca (nome) VALUES ('Kia');
INSERT INTO marca (nome) VALUES ('BMW');
INSERT INTO marca (nome) VALUES ('Ford');


INSERT INTO carro (nome, cor, marca_id) VALUES ('Uno', 'VERMELHO', 'Fiat');
INSERT INTO carro (nome, cor, marca_id) VALUES ('Focus', 'PRETO', 'Ford');
INSERT INTO carro (nome, cor, marca_id) VALUES ('X6', 'BRANCO', 'BMW');