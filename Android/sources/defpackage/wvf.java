package defpackage;

import java.util.Iterator;

/* renamed from: wvf  reason: default package */
public abstract class wvf implements Iterator {
    public final /* synthetic */ int a;

    public /* synthetic */ wvf(int i) {
        this.a = i;
    }

    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
