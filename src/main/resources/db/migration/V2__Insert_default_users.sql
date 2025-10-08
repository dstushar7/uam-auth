-- Initial password set to 1234
INSERT INTO users (username, first_name, last_name, email, password, role)
VALUES
    ('superadmin', 'Super', 'Admin', 'superadmin@example.com', '$2a$12$fQO4yrK/dzRQSD4H.lJFmuwbaHpqWMuaWQVsuctt4dX3.3CWhxh0W', 'SUPERADMIN'),
    ('admin', 'Site', 'Admin', 'admin@example.com', '$2a$12$fQO4yrK/dzRQSD4H.lJFmuwbaHpqWMuaWQVsuctt4dX3.3CWhxh0W', 'ADMIN');