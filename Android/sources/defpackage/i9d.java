package defpackage;

/* renamed from: i9d  reason: default package */
public final class i9d {
    public final zx3 a;
    public String b;
    public ey3 c;
    public ey3 d;
    public boolean e;
    public int f;

    public i9d(zx3 zx3, String str, ey3 ey3, ey3 ey32, boolean z, int i) {
        this.a = zx3;
        this.b = str;
        this.c = ey3;
        this.d = ey32;
        this.e = z;
        this.f = i;
    }

    public final void a(ey3 ey3) {
        if (!this.e) {
            this.d = ey3;
            return;
        }
        throw new RuntimeException(i9d.class.getSimpleName().concat("s can not be modified after being added to a Router."));
    }

    public final ey3 b() {
        ey3 overriddenPushHandler = this.a.getOverriddenPushHandler();
        return overriddenPushHandler == null ? this.c : overriddenPushHandler;
    }

    public final void c(ey3 ey3) {
        if (!this.e) {
            this.c = ey3;
            return;
        }
        throw new RuntimeException(i9d.class.getSimpleName().concat("s can not be modified after being added to a Router."));
    }

    public final void d(String str) {
        if (!this.e) {
            this.b = str;
            return;
        }
        throw new RuntimeException(i9d.class.getSimpleName().concat("s can not be modified after being added to a Router."));
    }
}
