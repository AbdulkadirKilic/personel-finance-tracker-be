--ROLE TABLE INSERTS
INSERT INTO finance.role (id, role_name, created_date, created_by) VALUES 
  (nextval('finance.seq_role'), 'ADMIN', CURRENT_TIMESTAMP, 'system'),
  (nextval('finance.seq_role'), 'USER', CURRENT_TIMESTAMP, 'system');