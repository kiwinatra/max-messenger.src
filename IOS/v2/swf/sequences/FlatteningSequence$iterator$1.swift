package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\t\u0010\u0011\u001a\u00020\u0010H\u0002J\u000e\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0013R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0004R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"kotlin/sequences/FlatteningSequence$iterator$1", "", "itemIterator", "getItemIterator", "()Ljava/util/Iterator;", "setItemIterator", "(Ljava/util/Iterator;)V", "iterator", "getIterator", "state", "", "getState", "()I", "setState", "(I)V", "ensureItemIterator", "", "hasNext", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FlatteningSequence$iterator$1 implements Iterator<E>, KMappedMarker {
    private Iterator<? extends E> itemIterator;
    private final Iterator<T> iterator;
    private int state;
    final /* synthetic */ FlatteningSequence<T, R, E> this$0;

    public FlatteningSequence$iterator$1(FlatteningSequence<T, R, E> flatteningSequence) {
        this.this$0 = flatteningSequence;
        this.iterator = flatteningSequence.sequence.iterator();
    }

    private final boolean ensureItemIterator() {
        Iterator<? extends E> it = this.itemIterator;
        if (it == null || !it.hasNext()) {
            while (this.iterator.hasNext()) {
                Iterator<? extends E> it2 = (Iterator) this.this$0.iterator.invoke(this.this$0.transformer.invoke(this.iterator.next()));
                if (it2.hasNext()) {
                    this.itemIterator = it2;
                    this.state = 1;
                    return true;
                }
            }
            this.state = 2;
            this.itemIterator = null;
            return false;
        }
        this.state = 1;
        return true;
    }

    public final Iterator<E> getItemIterator() {
        return this.itemIterator;
    }

    public final Iterator<T> getIterator() {
        return this.iterator;
    }

    public final int getState() {
        return this.state;
    }

    public boolean hasNext() {
        int i = this.state;
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        return ensureItemIterator();
    }

    public E next() {
        int i = this.state;
        if (i == 2) {
            throw new NoSuchElementException();
        } else if (i != 0 || ensureItemIterator()) {
            this.state = 0;
            return this.itemIterator.next();
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setItemIterator(Iterator<? extends E> it) {
        this.itemIterator = it;
    }

    public final void setState(int i) {
        this.state = i;
    }
}
