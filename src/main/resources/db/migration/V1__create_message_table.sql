CREATE TABLE "url" (
                        id   VARCHAR(255) PRIMARY KEY,
                        url VARCHAR(255) NOT NULL UNIQUE,
                        times_processed INTEGER,
                        contentType VARCHAR(50),
                        last_processed DATE,
                        created_date DATE

);

