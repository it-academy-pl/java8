package pl.itacademy.api;

@FunctionalInterface
public interface Testable<T> {

    boolean test(T item);

}
