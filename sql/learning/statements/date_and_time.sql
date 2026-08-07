/* date and time */

-- MySQL Date and Time Data Types
    -- DATE
        -- YYYY-MM-DD
    -- DATETIME
        -- YYYY-MM-DD HH:MI:SS
        -- does not convert any time inpuys
    -- TIMESTAMP
        -- YYYY-MM-DD HH:MI:SS
        -- converts time inputs to UTC and back
    -- TIME
        -- HH:MI:SS
    -- YEAR
        -- YYYY or YY

-- Date with SELECT
SELECT * FROM DateRegistered WHERE DateRegistered='2026-08-07';