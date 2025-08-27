package defpackage;

import java.lang.ref.SoftReference;

/* renamed from: c5d  reason: default package */
public abstract class c5d implements gi7 {
    public SoftReference a;

    public final Object a(q4 q4Var) {
        SoftReference softReference = this.a;
        SoftReference softReference2 = null;
        Object obj = softReference != null ? softReference.get() : null;
        if (obj == null) {
            obj = b(q4Var);
            if (obj != null) {
                softReference2 = new SoftReference(obj);
            }
            this.a = softReference2;
        }
        return obj;
    }

    public abstract Object b(q4 q4Var);
}
