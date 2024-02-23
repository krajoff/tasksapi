package com.example.tasksapi.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SpecialTaskFactory implements TaskFactory {


    @Override
    public ITask createTask(Long id) {
        Task.TaskBuilder taskBuilder = new Task.TaskBuilder();
        Doer.DoerBuilder doerBuilder = new Doer.DoerBuilder();
        List<Doer> doers = Collections.singletonList(doerBuilder.build());
        taskBuilder.description("Clean kitchen").status(Status.IN_PROSSES).doers(doers);
        return taskBuilder.build();
    }
}
