package defpackage;

import java.util.NoSuchElementException;

/* renamed from: cm0  reason: default package */
public final class cm0 {
    public final ata[] a;

    public cm0(ata[] ataArr) {
        this.a = ataArr;
    }

    public final Object a(sl0 sl0) {
        for (ata ata : this.a) {
            if (ata.c == sl0) {
                Object obj = ata.b;
                if (!(obj instanceof lm)) {
                    return obj;
                }
                return null;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
