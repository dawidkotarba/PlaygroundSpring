-- USER TABLE
INSERT INTO PUBLIC.USER(USERNAME, PASSWORD, ENABLED, ROLE) VALUES('admin', 'admin', true, 'ROLE_ADMIN');
INSERT INTO PUBLIC.USER(USERNAME, PASSWORD, ENABLED, ROLE) VALUES('user', 'user', true, 'ROLE_USER');

-- CAPITAL TABLE
INSERT INTO PUBLIC.CAPITAL(NAME, POPULATION) VALUES('Warsaw', 1735442);
INSERT INTO PUBLIC.CAPITAL(NAME, POPULATION) VALUES('Berlin', 3440991);
INSERT INTO PUBLIC.CAPITAL(NAME, POPULATION) VALUES('London', 8416535);
INSERT INTO PUBLIC.CAPITAL(NAME, POPULATION) VALUES('Moscow', 12100000);	
INSERT INTO PUBLIC.CAPITAL(NAME, POPULATION) VALUES('Amsterdam', 801200);

-- COUNTRY TABLE
INSERT INTO PUBLIC.COUNTRY(NAME, CAPITAL, AREA, POPULATION, CURRENCY) VALUES('Poland', 'Warsaw', 312685, 38000000, 'PLN');
INSERT INTO PUBLIC.COUNTRY(NAME, CAPITAL, AREA, POPULATION, CURRENCY) VALUES('Germany', 'Berlin', 357340, 81000000, 'EUR');
INSERT INTO PUBLIC.COUNTRY(NAME, CAPITAL, AREA, POPULATION, CURRENCY) VALUES('UK', 'London', 244820, 63000000, 'GBP');
INSERT INTO PUBLIC.COUNTRY(NAME, CAPITAL, AREA, POPULATION, CURRENCY) VALUES('Netherlands', 'Amsterdam', 41526, 16800000, 'EUR');