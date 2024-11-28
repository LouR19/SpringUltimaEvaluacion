package com.tarea.crud.Mappers;

public interface Mapper<A, B> {

    B mapTo(A a);

    A mapFrom(B b);
}
