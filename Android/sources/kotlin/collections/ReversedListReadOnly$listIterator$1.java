package kotlin.collections;

import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000e\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\r\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\tJ\b\u0010\r\u001a\u00020\u000bH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000e"}, d2 = {"kotlin/collections/ReversedListReadOnly$listIterator$1", "", "delegateIterator", "getDelegateIterator", "()Ljava/util/ListIterator;", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "", "previous", "previousIndex", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ReversedListReadOnly$listIterator$1 implements ListIterator<T>, KMappedMarker {
    private final ListIterator<T> delegateIterator;
    final /* synthetic */ ReversedListReadOnly<T> this$0;

    public ReversedListReadOnly$listIterator$1(ReversedListReadOnly<? extends T> reversedListReadOnly, int i) {
        this.this$0 = reversedListReadOnly;
        this.delegateIterator = reversedListReadOnly.delegate.listIterator(CollectionsKt__ReversedViewsKt.reversePositionIndex$CollectionsKt__ReversedViewsKt(reversedListReadOnly, i));
    }

    public void add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final ListIterator<T> getDelegateIterator() {
        return this.delegateIterator;
    }

    public boolean hasNext() {
        return this.delegateIterator.hasPrevious();
    }

    public boolean hasPrevious() {
        return this.delegateIterator.hasNext();
    }

    public T next() {
        return this.delegateIterator.previous();
    }

    public int nextIndex() {
        return CollectionsKt__ReversedViewsKt.reverseIteratorIndex$CollectionsKt__ReversedViewsKt(this.this$0, this.delegateIterator.previousIndex());
    }

    public T previous() {
        return this.delegateIterator.next();
    }

    public int previousIndex() {
        return CollectionsKt__ReversedViewsKt.reverseIteratorIndex$CollectionsKt__ReversedViewsKt(this.this$0, this.delegateIterator.nextIndex());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void set(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
