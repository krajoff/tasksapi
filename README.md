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

GET /api/tasks <br>
GET /api/tasks/{id} <br>
GET /api/tasks/status/{status} <br>
POST /api/tasks <br>
PUT /api/tasks/{id} <br>
DELETE /api/tasks/{id} <br>
============================= <br>

GET /api/doers <br>
GET /api/doers/{id} <br>
POST /api/doers <br>
PUT /api/doers/{id} <br>
DELETE /api/doers/{id} <br>
