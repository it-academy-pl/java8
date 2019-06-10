package pl.itacademy.api;

@FunctionalInterface
public interface ClassCreator<T> {
    T create();
}
