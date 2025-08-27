package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: rs  reason: default package */
public final class rs implements Iterator, Map.Entry {
    public int a;
    public int b = -1;
    public boolean c;
    public final /* synthetic */ ts o;

    public rs(ts tsVar) {
        this.o = tsVar;
        this.a = tsVar.c - 1;
    }

    public final boolean equals(Object obj) {
        if (!this.c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else if (!(obj instanceof Map.Entry)) {
            return false;
        } else {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.b;
            ts tsVar = this.o;
            return Intrinsics.areEqual(key, tsVar.f(i)) && Intrinsics.areEqual(entry.getValue(), tsVar.i(this.b));
        }
    }

    public final Object getKey() {
        if (this.c) {
            return this.o.f(this.b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object getValue() {
        if (this.c) {
            return this.o.i(this.b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final boolean hasNext() {
        return this.b < this.a;
    }

    public final int hashCode() {
        if (this.c) {
            int i = this.b;
            ts tsVar = this.o;
            Object f = tsVar.f(i);
            Object i2 = tsVar.i(this.b);
            int i3 = 0;
            int hashCode = f == null ? 0 : f.hashCode();
            if (i2 != null) {
                i3 = i2.hashCode();
            }
            return hashCode ^ i3;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object next() {
        if (hasNext()) {
            this.b++;
            this.c = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.c) {
            this.o.g(this.b);
            this.b--;
            this.a--;
            this.c = false;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object setValue(Object obj) {
        if (this.c) {
            return this.o.h(this.b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
