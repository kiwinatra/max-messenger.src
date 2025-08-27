package defpackage;

/* renamed from: fo1  reason: default package */
public final class fo1 extends g3 {
    public final /* synthetic */ go1 y;

    public fo1(go1 go1) {
        this.y = go1;
    }

    public final String g() {
        do1 do1 = (do1) this.y.a.get();
        if (do1 == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + do1.a + "]";
    }
}
