package defpackage;

/* renamed from: kd5  reason: default package */
public final class kd5 {
    public final spf a;
    public final int[] b;

    public kd5(spf spf, int[] iArr) {
        if (iArr.length == 0) {
            i8b.p("Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = spf;
        this.b = iArr;
    }
}
