package defpackage;

/* renamed from: mv  reason: default package */
public final class mv extends o5a {
    public final /* synthetic */ nv j;

    public mv(nv nvVar) {
        this.j = nvVar;
    }

    public final boolean c(int i, int i2) {
        nv nvVar = this.j;
        Object obj = nvVar.a.get(i);
        Object obj2 = nvVar.b.get(i2);
        if (obj != null && obj2 != null) {
            return ((j4b) nvVar.v.b.c).e(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    public final boolean d(int i, int i2) {
        nv nvVar = this.j;
        Object obj = nvVar.a.get(i);
        Object obj2 = nvVar.b.get(i2);
        return (obj == null || obj2 == null) ? obj == null && obj2 == null : ((j4b) nvVar.v.b.c).f(obj, obj2);
    }

    public final Object n(int i, int i2) {
        nv nvVar = this.j;
        Object obj = nvVar.a.get(i);
        Object obj2 = nvVar.b.get(i2);
        if (obj != null && obj2 != null) {
            return ((j4b) nvVar.v.b.c).x(obj, obj2);
        }
        throw new AssertionError();
    }

    public final int s() {
        return this.j.b.size();
    }

    public final int t() {
        return this.j.a.size();
    }
}
