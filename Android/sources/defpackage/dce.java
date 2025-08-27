package defpackage;

/* renamed from: dce  reason: default package */
public abstract class dce implements gi7 {
    public volatile Object a = o5a.e;

    public final Object a(q4 q4Var) {
        Object obj;
        Object obj2 = this.a;
        Object obj3 = o5a.e;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.a;
            if (obj == obj3) {
                obj = b(q4Var);
                this.a = obj;
            }
        }
        return obj;
    }

    public abstract Object b(q4 q4Var);
}
