-- filling the technical_condition table
INSERT INTO technical_condition (condition)
VALUES ('работает'), ('не работает');

-- filling the operation_status table
INSERT INTO operation_status (status)
VALUES ('эксплуатируется'), ('списан'), ('в ремонте');

-- filling the location table
INSERT INTO location (id, cabinet, building)
VALUES (1, '', 'СКЛАД'),
            (2, '401', 'ФЭТ'),
            (3, '301', 'ФЭТ'),
            (4, '201', 'ФЭТ'),
            (5, '101', 'РК'),
            (6, '201', 'ГК');

-- filling the person table
INSERT INTO person (id, first_name, second_name, patronymic, job_title)
VALUES (1, 'Юрий', 'Гриценко', 'Борисович', 'Доцент'),
            (2, 'Александр', 'Суханов', 'Яковлевич', 'Доцент'),
            (3, 'Анна ', 'Исакова', 'Ивановна', 'Доцент');

-- filling the ups table
INSERT INTO ups (id, name, manufacturer, person_id,
                     location_id, commissioning_date,
                     operation_status, technical_condition,
                     amortization_period, registration_date,
                     writeoff_date, power, max_run_time)
VALUES  (1, 'UT650EG', 'CyberPower', 1,
            1, TO_DATE('12/09/2022', 'DD/MM/YYYY'),
            'эксплуатируется', 'работает',
            5, TO_DATE('12/07/2022', 'DD/MM/YYYY'),
            null, 14, 4),
        (2, 'CYBERPOWER UTC650E', 'CyberPower', 2,
            2, TO_DATE('12/09/2022', 'DD/MM/YYYY'),
            'эксплуатируется', 'работает',
            5, TO_DATE('12/07/2022', 'DD/MM/YYYY'),
            null, 14, 4);