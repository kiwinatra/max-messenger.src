package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.function.Predicate;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequencesKt;

/* renamed from: y96  reason: default package */
public final class y96 implements Collection, KMappedMarker {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    public y96(z96 z96) {
        this.b = z96.a;
    }

    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final void clear() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof zi8)) {
                    return false;
                }
                return ((ConcurrentSkipListSet) this.b).contains((zi8) obj);
            default:
                return ((aed) this.b).b(obj);
        }
    }

    public final boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                return ((ConcurrentSkipListSet) this.b).containsAll(collection);
            default:
                Iterable<Object> iterable = collection;
                if (((Collection) iterable).isEmpty()) {
                    return true;
                }
                for (Object b2 : iterable) {
                    if (!((aed) this.b).b(b2)) {
                        return false;
                    }
                }
                return true;
        }
    }

    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                return ((ConcurrentSkipListSet) this.b).isEmpty();
            default:
                return ((aed) this.b).d();
        }
    }

    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return ((ConcurrentSkipListSet) this.b).iterator();
            default:
                return SequencesKt.iterator(new zdd((aed) this.b, (Continuation) null));
        }
    }

    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final boolean removeIf(Predicate predicate) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final int size() {
        switch (this.a) {
            case 0:
                return ((ConcurrentSkipListSet) this.b).size();
            default:
                return ((aed) this.b).e;
        }
    }

    public final Object[] toArray() {
        switch (this.a) {
            case 0:
                return CollectionToArray.toArray(this);
            default:
                return CollectionToArray.toArray(this);
        }
    }

    public final Object[] toArray(Object[] objArr) {
        switch (this.a) {
            case 0:
                return CollectionToArray.toArray(this, objArr);
            default:
                return CollectionToArray.toArray(this, objArr);
        }
    }

    public y96(aed aed) {
        this.b = aed;
    }
}
