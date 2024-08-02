package New._31_07_24;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
public class Storage<T extends Number> {

    private List<T> storage;

    public void add(T obj) {

        storage.add(obj);
    }

    public void remove(T obj) {
        if (!storage.contains(obj)) {
            throw new IllegalArgumentException("index not found!");
        }
        storage.remove(obj);
    }

    public T getObject(int index) {
        if (index < 0 || index >= storage.size()) {
            throw new IllegalArgumentException("index not found");
        }
        return storage.get(index);
    }

    public double sumAllNumbers() {
        if (storage.isEmpty()){
            throw new EmptyStorageException("Storage is empty");
        }
        double count = 0;
        for (T t : storage) {
            count += t.doubleValue();
        }
        return count;
    }

    public void addProducerToStorage(List<? extends Number> listOfProducers){
        for (int i = 0; i < listOfProducers.size(); i++) {
            storage.add((T) listOfProducers.get(i));
        }
    }

    public void addConsumerToStorage(List<? super Number> listOfConsumers){
        for (int i = 0; i < storage.size(); i++) {
            listOfConsumers.add((T) storage.get(i));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Storage<?> storage1 = (Storage<?>) o;
        return Objects.equals(storage, storage1.storage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storage);
    }
}

class EmptyStorageException extends RuntimeException {
   public EmptyStorageException (String message){
       super(message);
   }
}