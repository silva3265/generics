package usando_curingas_generics;

public interface Colecao<T> {

    void colocar(T item);
    T retirar();

}
