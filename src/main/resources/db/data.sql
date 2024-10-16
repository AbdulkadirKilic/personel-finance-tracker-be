--ROLE TABLE INSERTS
INSERT INTO finance.role (id, version, name, description, created_date, created_by) VALUES
  (nextval('finance.seq_role'), 0, 'ADMIN','Has admin privileges.', CURRENT_TIMESTAMP, 'system'),
  (nextval('finance.seq_role'), 0, 'USER','Has standard user privileges.', CURRENT_TIMESTAMP, 'system');