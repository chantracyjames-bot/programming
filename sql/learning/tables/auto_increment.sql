/* auto increment field 
    - a numeric field that automatically generates a unique number
        - when a new record is inserted into a table
    - typically paired with the PRIMARY KEY field
        - automatically assigned a new unique number every time a new record is inserted
    - the default starting value of AUTO_INCREMENT is 1
        - and increments by 1 for each new record
        - it is possible to alter its starting value using ALTER TABLE
    - note when adding new records with a table that has the AUTO_INCREMENT field
        - the field that contains this field, the PRIMARY KEY
        - must not have any values specified into it
        - since a new unique value is applied to it automatically
*/

USE test;

-- AUTO_INCREMENT
CREATE TABLE IF NOT EXISTS incrementing (
    some_number int AUTO_INCREMENT PRIMARY KEY
);

-- change starting value
ALTER TABLE incrementing AUTO_INCREMENT = 100;