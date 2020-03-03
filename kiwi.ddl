-- Generated by Oracle SQL Developer Data Modeler 19.1.0.081.0911
--   at:        2020-03-03 09:11:45 BRT
--   site:      Oracle Database 11g
--   type:      Oracle Database 11g



CREATE TABLE tb_fornecedor (
    nr_cnpj_empresa         NUMBER(15) NOT NULL,
    nm_empresa              VARCHAR2(50 BYTE) NOT NULL,
    ds_email                VARCHAR2(80 BYTE) NOT NULL,
    nr_inscricao_estadual   NUMBER(8) NOT NULL,
    nr_telefone             NUMBER(12) NOT NULL,
    nm_contato              VARCHAR2(50 BYTE) NOT NULL
);

ALTER TABLE tb_fornecedor ADD CONSTRAINT tb_fornecedor_pk PRIMARY KEY ( nr_cnpj_empresa );

CREATE TABLE tb_funcionario (
    cd_funcionario       NUMBER(5) NOT NULL,
    nm_funcionario       VARCHAR2(50 BYTE) NOT NULL,
    nr_rg_funcionario    NUMBER(11) NOT NULL,
    dt_nascimento        DATE NOT NULL,
    nr_cpf_funcionario   NUMBER(11) NOT NULL
);

ALTER TABLE tb_funcionario ADD CONSTRAINT tb_funcionario_pk PRIMARY KEY ( cd_funcionario );

CREATE TABLE tb_movimento (
    cd_movimento                    NUMBER(5) NOT NULL,
    tb_funcionario_cd_funcionario   NUMBER(5) NOT NULL,
    tb_produto_cd_produto           NUMBER(5) NOT NULL,
    qt_movimentos                   NUMBER(7) NOT NULL,
    tp_movimento                    CHAR(1 BYTE) NOT NULL
);

ALTER TABLE tb_movimento ADD CONSTRAINT tb_movimento_pk PRIMARY KEY ( cd_movimento );

CREATE TABLE tb_produto (
    cd_produto                      NUMBER(5) NOT NULL,
    tb_fornecedor_nr_cnpj_empresa   NUMBER(15) NOT NULL,
    nm_produto                      VARCHAR2(30 BYTE) NOT NULL,
    qt_produto                      NUMBER(8) NOT NULL
);

ALTER TABLE tb_produto ADD CONSTRAINT tb_produto_pk PRIMARY KEY ( cd_produto );

ALTER TABLE tb_movimento
    ADD CONSTRAINT tb_movimento_tb_funcionario_fk FOREIGN KEY ( tb_funcionario_cd_funcionario )
        REFERENCES tb_funcionario ( cd_funcionario );

ALTER TABLE tb_movimento
    ADD CONSTRAINT tb_movimento_tb_produto_fk FOREIGN KEY ( tb_produto_cd_produto )
        REFERENCES tb_produto ( cd_produto );

ALTER TABLE tb_produto
    ADD CONSTRAINT tb_produto_tb_fornecedor_fk FOREIGN KEY ( tb_fornecedor_nr_cnpj_empresa )
        REFERENCES tb_fornecedor ( nr_cnpj_empresa );



-- Oracle SQL Developer Data Modeler Summary Report: 
-- 
-- CREATE TABLE                             4
-- CREATE INDEX                             0
-- ALTER TABLE                              7
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0