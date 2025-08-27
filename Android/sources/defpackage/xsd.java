package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: xsd  reason: default package */
public final class xsd implements Iterator, KMappedMarker {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ usd c;

    public xsd(usd usd, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = usd;
                this.b = usd.e();
                return;
            default:
                this.c = usd;
                this.b = usd.e();
                return;
        }
    }

    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b > 0;
            default:
                return this.b > 0;
        }
    }

    public final Object next() {
        switch (this.a) {
            case 0:
                usd usd = this.c;
                int e = usd.e();
                int i = this.b;
                this.b = i - 1;
                return usd.h(e - i);
            default:
                usd usd2 = this.c;
                int e2 = usd2.e();
                int i2 = this.b;
                this.b = i2 - 1;
                return usd2.f(e2 - i2);
        }
    }

    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
