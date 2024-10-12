
--USER SEQUENCE
CREATE SEQUENCE finance.SEQ_USER 
    START WITH 1 
    INCREMENT BY 1;

--USER TABLE
CREATE TABLE finance.user (
    id BIGINT PRIMARY KEY DEFAULT nextval('finance.SEQ_USER'),
    version BIGINT NOT NULL,
    user_name VARCHAR(255) UNIQUE NOT NULL,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    email VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    status VARCHAR(50),
    role VARCHAR(255),
    created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    created_by VARCHAR(255),
    updated_date TIMESTAMP,
    updated_by VARCHAR(255),
    CONSTRAINT user_version_positive CHECK (version >= 0)
);

-- TRANSACTION SEQUENCE
CREATE SEQUENCE finance.SEQ_TRANSACTION 
    START WITH 1 
    INCREMENT BY 1;

--TRANSACTION TABLE
CREATE TABLE finance.transaction (
    id BIGINT PRIMARY KEY DEFAULT nextval('finance.SEQ_TRANSACTION'),
    version BIGINT NOT NULL,
    user_id BIGINT REFERENCES finance.user(id) ON DELETE CASCADE,
    category VARCHAR(255),
    amount DECIMAL(10, 2),
    description TEXT,
    type VARCHAR(20),
    status VARCHAR(20),
    created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    created_by VARCHAR(255),
    updated_date TIMESTAMP,
    updated_by VARCHAR(255),
    CONSTRAINT transaction_version_positive CHECK (version >= 0)
);

--ROLE SEQUENCE
CREATE SEQUENCE finance.SEQ_ROLE 
    START WITH 1 
    INCREMENT BY 1;

--ROLE TABLE
CREATE TABLE finance.role (
    id BIGINT PRIMARY KEY DEFAULT nextval('finance.SEQ_ROLE'),
    role_name VARCHAR(255) UNIQUE NOT NULL,
    created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    created_by VARCHAR(255)
);