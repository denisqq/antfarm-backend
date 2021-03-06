--liquibase formatted sql


--changeset tretyakov-da:2021027-01 failOnError:true runAlways:true
--comment: Какие-то тестовые фермы
--validCheckSum: ANY
--preconditions onFail:MARK_RAN onError:HALT
insert into antfarm.farm(id, created_at, updated_at, version)
VALUES ('5bc35887-a29f-4674-8ab3-f25c9c08e69b', '2021-02-07 19:07:36.589000', '2021-02-07 19:07:36.589000', '2021-02-07 19:07:36.589000');

insert into antfarm.colony (created_at, updated_at, version, population, farm_id)
values ('2021-02-07 19:07:36.589000', '2021-02-07 19:07:36.589000', '2021-02-07 19:07:36.589000', 1, '5bc35887-a29f-4674-8ab3-f25c9c08e69b');

insert into antfarm.ant (id, ant_type, name)
values ('14440c5f-afba-459e-84e6-852032c2e25e', 'BIG_MOTHER', 'Большая мамочка');

insert into antfarm.ant_colony_population (id, created_at, updated_at, version, population, ant_id, colony_farm_id)
values ('d88c2df7-b33c-471f-a582-0667f4aeaa5a', '2021-02-07 20:11:36.062000', '2021-02-07 20:11:36.062000', '2021-02-07 20:11:36.062000', 1, '14440c5f-afba-459e-84e6-852032c2e25e', '5bc35887-a29f-4674-8ab3-f25c9c08e69b');

insert into antfarm.product (type, id, name, ant_id)
values ('ANT', '25991323-4caf-4d7c-91f3-654774703c3b', 'Большая мамочка по самой выгодной цене', '14440c5f-afba-459e-84e6-852032c2e25e');

insert into antfarm.market_product (id, quantity, product_id, market_product_prices)
values ('c65d5447-2f79-49a3-a895-c709557b5e4f', 1, '25991323-4caf-4d7c-91f3-654774703c3b', '[{"currency": "MONEY", "price": 100500}]');