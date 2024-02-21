CREATE TABLE localizacao (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    latitude BIGINT,
    longitude BIGINT,
    nome_galaxia VARCHAR(255)
);

CREATE TABLE inventario (
    id BIGINT AUTO_INCREMENT PRIMARY KEY
);

CREATE TABLE item (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    quantidade INTEGER,
    pontos INTEGER
);

CREATE TABLE itens_inventario (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    inventario_id BIGINT,
    item_id BIGINT
);

CREATE TABLE rebelde (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    idade INTEGER,
    genero VARCHAR(255),
    localizacao_id BIGINT,
    inventario_id BIGINT,
    FOREIGN KEY (localizacao_id) REFERENCES localizacao (id),
    FOREIGN KEY (inventario_id) REFERENCES inventario (id)
);
