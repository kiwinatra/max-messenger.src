package defpackage;

/* renamed from: e5g  reason: default package */
public final class e5g {
    public int a;
    public int b;
    public int c;
    public int d;
    public float e;
    public int f;
    public int g;
    public boolean h;

    public final f5g a() {
        boolean z = false;
        n79.m("Bitrate can not be set if enabling high quality targeting.", !this.h || this.a == -1);
        if (!this.h || this.b == 1) {
            z = true;
        }
        n79.m("Bitrate mode must be VBR if enabling high quality targeting.", z);
        return new f5g(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final void b() {
        this.h = false;
    }

    public final void c(int i) {
        this.a = i;
    }

    public final void d() {
        this.c = -1;
        this.d = -1;
    }
}
