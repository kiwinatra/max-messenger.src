package defpackage;

/* renamed from: zc5  reason: default package */
public final class zc5 {
    public boolean a;
    public dob b;
    public int c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;

    public zc5(dob dob) {
        this.b = dob;
    }

    public final void a(int i) {
        this.a |= i > 0;
        this.c += i;
    }
}
