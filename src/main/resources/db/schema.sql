
--USER SEQUENCE
CREATE SEQUENCE finance.seq_user
    START WITH 1 
    INCREMENT BY 1;

--USER TABLE
CREATE TABLE finance.user (
    id BIGINT PRIMARY KEY DEFAULT nextval('finance.seq_user'),
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
CREATE SEQUENCE finance.seq_transaction
    START WITH 1 
    INCREMENT BY 1;

--TRANSACTION TABLE
CREATE TABLE finance.transaction (
    id BIGINT PRIMARY KEY DEFAULT nextval('finance.seq_transaction'),
    version BIGINT NOT NULL,
    user_id BIGINT NOT NULL,
    category VARCHAR(255),
    type VARCHAR(20),
    amount DECIMAL(10, 2),
    status VARCHAR(20),
    description TEXT,
    created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    created_by VARCHAR(255),
    updated_date TIMESTAMP,
    updated_by VARCHAR(255),
    CONSTRAINT transaction_version_positive CHECK (version >= 0),
    FOREIGN KEY (user_id) REFERENCES finance.user(id) ON DELETE CASCADE
);

--ROLE SEQUENCE
CREATE SEQUENCE finance.seq_role
    START WITH 1 
    INCREMENT BY 1;

--ROLE TABLE
CREATE TABLE finance.role (
    id BIGINT PRIMARY KEY DEFAULT nextval('finance.seq_role'),
    role_name VARCHAR(255) UNIQUE NOT NULL,
    created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    created_by VARCHAR(255)
);

--TRANSACTION_HISTORY SEQUENCE
CREATE SEQUENCE finance.seq_transaction_history
    START WITH 1
    INCREMENT BY 1;

-- TRANSACTION_HISTORY TABLE
CREATE TABLE finance.transaction_history (
    id BIGINT PRIMARY KEY DEFAULT nextval('finance.seq_transaction_history'),
    transaction_id BIGINT NOT NULL,
    version BIGINT,
    user_id BIGINT NOT NULL,
    category VARCHAR(255),
    type VARCHAR(50),
    amount DECIMAL(10, 2),
    status VARCHAR(50),
    description TEXT,
    created_date TIMESTAMP,
    created_by VARCHAR(255),
    updated_date TIMESTAMP,
    history_created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    action_type VARCHAR(50) NOT NULL,
    FOREIGN KEY (transaction_id) REFERENCES finance.transaction(id) ON DELETE CASCADE,
    FOREIGN KEY (user_id) REFERENCES finance.user(id) ON DELETE CASCADE
);