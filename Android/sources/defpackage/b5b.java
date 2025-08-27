package defpackage;

import java.util.RandomAccess;
import kotlin.collections.AbstractList;

/* renamed from: b5b  reason: default package */
public final class b5b extends AbstractList implements RandomAccess {
    public static final /* synthetic */ int c = 0;
    public final vw0[] a;
    public final int[] b;

    public b5b(vw0[] vw0Arr, int[] iArr) {
        this.a = vw0Arr;
        this.b = iArr;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof vw0) {
            return super.contains((vw0) obj);
        }
        return false;
    }

    public final Object get(int i) {
        return this.a[i];
    }

    public final int getSize() {
        return this.a.length;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof vw0) {
            return super.indexOf((vw0) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof vw0) {
            return super.lastIndexOf((vw0) obj);
        }
        return -1;
    }
}
