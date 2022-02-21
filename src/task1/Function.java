package task1;  //функциональный интерфейс
@FunctionalInterface
public interface Function<T,R> {
    T makeString(R [] arr);
}