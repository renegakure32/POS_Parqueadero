SELECT
     count(CLIENTES."TIPO_VEHICULO")
FROM
     "ADMINISTRADOR"."CLIENTES" CLIENTES
WHERE
     TIPO_VEHICULO LIKE 'Motocicleta' AND TIEMPO=0