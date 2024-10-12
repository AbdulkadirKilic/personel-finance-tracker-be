--ROLE TABLE INSERTS
INSERT INTO finance.role (id, role_name, created_date, created_by) VALUES 
  (nextval('finance.SEQ_ROLE'), 'ADMIN', CURRENT_TIMESTAMP, 'system'),
  (nextval('finance.SEQ_ROLE'), 'USER', CURRENT_TIMESTAMP, 'system');