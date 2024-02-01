# Getting Started

### Run dockerfile
docker build -t tasksdb . <br>
docker run --name tasksdb -p 5432:5432 -d tasksdb

### To check
docker exec -it tasksdb bash <br>
psql -l <br>
psql -d tasks <br>
SELECT * FROM tasks; <br>


### To add date
INSERT INTO tasks (description, status, date) 
VALUES ('clean', 1, '2022-03-22');

GET http://localhost:8080/api/tasks/status/DONE