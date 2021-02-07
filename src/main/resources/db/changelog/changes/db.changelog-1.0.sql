--liquibase formatted sql


--changeset tretyakov-da:2021027-02 failOnError:true
--comment: Схема
--preconditions onFail:MARK_RAN onError:HALT
create schema if not exists "antfarm";

alter schema "antfarm" owner to antfarm;