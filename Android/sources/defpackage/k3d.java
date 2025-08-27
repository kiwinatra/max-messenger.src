package defpackage;

/* renamed from: k3d  reason: default package */
public final class k3d {
    public final rc0 a;
    public final k9f b;
    public final go1 c;
    public final go1 d;
    public do1 e;
    public do1 f;
    public boolean g = false;
    public boolean h = false;
    public zz7 i;

    public k3d(rc0 rc0, k9f k9f) {
        this.a = rc0;
        this.b = k9f;
        this.c = m5a.F(new j3d(this, 0));
        this.d = m5a.F(new j3d(this, 1));
    }

    public final void a() {
        bs0.r("The callback can only complete once.", !this.d.b.isDone());
        this.f.b((Object) null);
    }
}
