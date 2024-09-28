create database BD1_Apellido;
use BD1_Apellido;

CREATE TABLE clientes (
    id_cliente INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100),
    direccion VARCHAR(255)
);

-- Registros de prueba
INSERT INTO clientes (nombre, direccion) VALUES ('Juan Pérez', 'Calle 123');
INSERT INTO clientes (nombre, direccion) VALUES ('Ana Gómez', 'Avenida 456');
INSERT INTO clientes (nombre, direccion) VALUES ('Luis Martínez', 'Boulevard 789');
--------------------------------------------------
CREATE TABLE productos (
    id_prod INT PRIMARY KEY AUTO_INCREMENT,
    nom_prod VARCHAR(100),
    precio DECIMAL(10, 2),
    stock_actual INT
);

-- Registros de prueba
INSERT INTO productos (nom_prod, precio, stock_actual) VALUES ('Producto A', 10.50, 100);
INSERT INTO productos (nom_prod, precio, stock_actual) VALUES ('Producto B', 20.00, 50);
INSERT INTO productos (nom_prod, precio, stock_actual) VALUES ('Producto C', 15.75, 75);
--------------------------------------------------
CREATE TABLE factura (
    nro_factura INT PRIMARY KEY AUTO_INCREMENT,
    fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    iestado VARCHAR(50),
    d_cliente INT,
	id_pro INT,
    total DECIMAL(10, 2),
    FOREIGN KEY (d_cliente) REFERENCES clientes(id_cliente),
    FOREIGN KEY (id_pro) REFERENCES productos(id_pro)
);
--------------------------------------------------
CREATE TABLE detallefact (
    nro_factura INT,
    id_prod INT,
    cantidad INT,
    PRIMARY KEY (nro_factura, id_prod),
    FOREIGN KEY (nro_factura) REFERENCES factura(nro_factura),
    FOREIGN KEY (id_prod) REFERENCES productos(id_prod)
);
