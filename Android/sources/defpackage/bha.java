package defpackage;

import java.lang.ref.SoftReference;
import java.util.LinkedList;

/* renamed from: bha  reason: default package */
public final class bha extends ft0 {
    public LinkedList f;

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, aha] */
    public final void a(Object obj) {
        aha aha = (aha) this.f.poll();
        aha aha2 = aha;
        if (aha == null) {
            ? obj2 = new Object();
            obj2.a = null;
            obj2.b = null;
            obj2.c = null;
            aha2 = obj2;
        }
        aha2.a = new SoftReference(obj);
        aha2.b = new SoftReference(obj);
        aha2.c = new SoftReference(obj);
        this.c.add(aha2);
    }

    public final Object b() {
        aha aha = (aha) this.c.poll();
        aha.getClass();
        SoftReference softReference = aha.a;
        Object obj = softReference == null ? null : softReference.get();
        SoftReference softReference2 = aha.a;
        if (softReference2 != null) {
            softReference2.clear();
            aha.a = null;
        }
        SoftReference softReference3 = aha.b;
        if (softReference3 != null) {
            softReference3.clear();
            aha.b = null;
        }
        SoftReference softReference4 = aha.c;
        if (softReference4 != null) {
            softReference4.clear();
            aha.c = null;
        }
        this.f.add(aha);
        return obj;
    }
}
