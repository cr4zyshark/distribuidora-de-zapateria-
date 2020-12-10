DROP DATABASE IF EXISTS distribuidora;
CREATE DATABASE distribuidora;
Use distribuidora;


CREATE TABLE trabajador(
    id_trabajador INT AUTO_INCREMENT,
    nombre VARCHAR(30),
    contraseña VARCHAR(200),

    UNIQUE(nombre),

    PRIMARY KEY(id_trabajador)

);

CREATE TABLE tienda_asociada(
    id_tienda INT AUTO_INCREMENT,
    nombre VARCHAR(30),
    ciudad VARCHAR(30),


    PRIMARY KEY(id_tienda)




);


CREATE TABLE producto(
    id_producto INT AUTO_INCREMENT,
    tipo VARCHAR(30),
    marca VARCHAR(30),
    talla INT,
    traslado BIT,

    tienda_asociada_id_fk INT,

    PRIMARY KEY(id_producto),

    FOREIGN KEY(tienda_asociada_id_fk) REFERENCES tienda_asociada(id_tienda)


);


CREATE TABLE traslado_historial(
    id_traslado INT AUTO_INCREMENT,
    id_productot_fk INT,    -- producto traslado
    tipo VARCHAR(40),
    marca VARCHAR(40),
    talla VARCHAR(40),
    tienda_asociada INT,
    fecha_traslado DATETIME,

    PRIMARY KEY(id_traslado),

    FOREIGN KEY(id_productot_fk) REFERENCES producto(id_producto)

);


-- procedimiento


DELIMITER //

CREATE PROCEDURE agregar_producto(IN _tipo VARCHAR(30), IN _marca VARCHAR(30), IN _talla INT )

BEGIN

    DECLARE condicion INT;

    SET condicion = (SELECT COUNT(*)
    FROM producto
    WHERE tipo = _tipo and marca = _marca and talla = _talla);

        IF condicion = 0 THEN
        
        INSERT INTO producto VALUES(null,_tipo,_marca,_talla,0,null);
        SELECT'Producto ingresado' AS "mensaje";

        ELSE
            SELECT 'no se puede agregar este producto' AS "mensaje";
            END IF;

    END //

 DELIMITER ;



 -----------------------------------

 
DELIMITER //

CREATE PROCEDURE agregar_tienda(IN _nombre VARCHAR(30), IN _ciudad VARCHAR(30) )

BEGIN

    DECLARE condicion INT;

    SET condicion = (SELECT COUNT(*)
    FROM tienda_asociada
    WHERE nombre = _nombre);

        IF condicion = 0 THEN
        
        INSERT INTO tienda_asociada VALUES(null,_nombre,_ciudad);
        SELECT'tienda ingresada' AS "mensaje";

        ELSE
            SELECT 'no se puede agregar esta tienda' AS "mensaje";
            END IF;

    END //

 DELIMITER ;

--------------------------


DELIMITER //
CREATE PROCEDURE traslado_tienda(IN _id_producto INT, _id_tienda INT)
BEGIN
    DECLARE verificar INT;

    SET verificar = (SELECT COUNT(*) 
    FROM producto 
    WHERE id_producto = _id_producto);



    IF verificar = 1 THEN 
        UPDATE producto SET traslado = 1, tienda_asociada_id_fk = _id_tienda WHERE id_producto = _id_producto;
        SELECT 'Producto Trasladado' AS 'Mensaje';

    END IF;
END //
DELIMITER ;

-- trigger 


DELIMITER //
CREATE TRIGGER trasladacion AFTER UPDATE ON producto
    FOR EACH ROW
BEGIN
    IF NEW.traslado = 1 THEN
    INSERT INTO traslado_historial VALUES(NULL,NEW.id_producto, NEW.tipo, NEW.marca, NEW.talla ,NEW.tienda_asociada_id_fk,NOW());
    END IF;
END //
DELIMITER ;