import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public final class NewListBasedArrayList<E> extends ArrayList<E> {
    @Override
    public E remove(int index){
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object obj){
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear(){
        throw new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex){
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c){
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c){
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeIf(Predicate<? super E> filter){
        throw new UnsupportedOperationException();
    }

}
