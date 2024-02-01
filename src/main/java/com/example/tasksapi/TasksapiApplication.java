package com.example.tasksapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//Условие:
//Вам предстоит создать приложение для управления списком задач с
// использованием Spring Boot и Spring Data JPA. Требуется
// реализовать следующие функции:
// Добавление задачи.
// Просмотр всех задач.
// Просмотр задач по статусу (например, "завершена", "в процессе", "не начата").
// Изменение статуса задачи.
// Удаление задачи.
// Структура задачи:
//ID (автоинкрементное)
//Описание (не может быть пустым)
//Статус (одно из значений: "не начата", "в процессе", "завершена")
//Дата создания (автоматически устанавливается при создании задачи)
@SpringBootApplication
public class TasksapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksapiApplication.class, args);
	}

}
