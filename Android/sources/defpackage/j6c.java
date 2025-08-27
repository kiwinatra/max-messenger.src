package defpackage;

/* renamed from: j6c  reason: default package */
public final class j6c {
    public final int a;
    public final int b;
    public final CharSequence c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public j6c(int i, String str, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = i3;
        this.e = false;
        this.f = false;
        this.g = true;
    }

    public static j6c a() {
        return new j6c(lic.fat_divider, "", 0, 0);
    }

    public static j6c b(int i, int i2, String str) {
        return new j6c(i, str, i2, 0);
    }

    public j6c(int i, int i2, CharSequence charSequence, int i3, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = i2;
        this.c = charSequence;
        this.d = i3;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }
}
