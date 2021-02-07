#!/bin/bash
psql -v ON_ERROR_STOP=1 --username postgres <<-EOSQL

  CREATE USER antfarm WITH
  LOGIN
  NOSUPERUSER
  NOINHERIT
  NOCREATEDB
  NOCREATEROLE
  NOREPLICATION
  PASSWORD 'antfarm';

  CREATE DATABASE db_antfarm
    WITH OWNER = antfarm
         ENCODING = 'UTF8'
         TABLESPACE = pg_default
         LC_COLLATE = 'en_US.utf8'
         LC_CTYPE = 'en_US.utf8'
         CONNECTION LIMIT = -1;
  GRANT CONNECT, TEMPORARY ON DATABASE db_antfarm TO public;

  GRANT ALL ON DATABASE db_antfarm TO antfarm;

  create role antfarm_r with
    nologin
    nosuperuser
    inherit
    nocreatedb
    nocreaterole
    noreplication;

  create role antfarm_rw with
    nologin
    nosuperuser
    inherit
    nocreatedb
    nocreaterole
    noreplication;

EOSQL

psql -v ON_ERROR_STOP=1 --username postgres db_antfarm<<-EOSQL
  CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
EOSQL
