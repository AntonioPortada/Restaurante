CREATE TABLE USUARIOS(
  ID_USER NUMERIC,
  USER_NAME NVARCHAR2(10),
  PASS NVARCHAR2(10),
  NIVEL NUMERIC,
  CONSTRAINT PK_ID_USER PRIMARY KEY(ID_USER)
);

SELECT * FROM USUARIOS;

INSERT INTO USUARIOS VALUES(1234, 'JA', 'JA', 1);
INSERT INTO USUARIOS VALUES(1235, 'MA', 'MA', 2);
INSERT INTO USUARIOS VALUES(1236, 'PA', 'PA', 3);