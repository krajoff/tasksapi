package com.example.tasksapi.model;

public class SpecialDoerFactory implements DoerFactory {

    @Override
    public IDoer createDoer(String name) {
        Doer.DoerBuilder builder = new Doer.DoerBuilder();
        builder.name(name);
        return builder.build();
    }
}
