CREATE TABLE IF NOT EXISTS Pigmento (
    id              INTEGER NOT NULL,
    idColor         TEXT,
    nombre          TEXT,
    color           TEXT,
    potencia        REAL,
    lambda          REAL,
    formula         TEXT,
    elementoQuimico TEXT,
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS Nota (
    id              INTEGER NOT NULL,
    titulo          TEXT,
    descripcion     TEXT,
    PRIMARY KEY(id, titulo),
    FOREIGN KEY (id) REFERENCES Pigmento (id)
);

CREATE TABLE IF NOT EXISTS Sinonimo (
    id              INTEGER NOT NULL,
    valor           TEXT,
    PRIMARY KEY(id, valor),
    FOREIGN KEY (id) REFERENCES Pigmento (id)
);

CREATE TABLE IF NOT EXISTS Infrarrojos (
    id              INTEGER NOT NULL,
    x               REAL,
    y               REAL,
    PRIMARY KEY(id, x, y),
    FOREIGN KEY (id) REFERENCES Pigmento (id)
);

CREATE TABLE IF NOT EXISTS RayosX (
    id              INTEGER NOT NULL,
    x               REAL,
    y               REAL,
    PRIMARY KEY(id, x, y),
    FOREIGN KEY (id) REFERENCES Pigmento (id)
);

CREATE TABLE IF NOT EXISTS Raman (
    id              INTEGER NOT NULL,
    x               REAL,
    y               REAL,
    PRIMARY KEY(id, x, y),
    FOREIGN KEY (id) REFERENCES Pigmento (id)
);

CREATE TABLE IF NOT EXISTS Colorimetria (
    id              INTEGER NOT NULL,
    x               REAL,
    y               REAL,
    z               REAL,
    l               REAL,
    a               REAL,
    b               REAL,
    PRIMARY KEY(id, l, a, b),
    FOREIGN KEY (id) REFERENCES Pigmento (id)
);