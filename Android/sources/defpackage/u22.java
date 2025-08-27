package defpackage;

/* renamed from: u22  reason: default package */
public final class u22 {
    public final String a;
    public final u22 b;
    public final int c;

    public u22(String str, u22 u22) {
        this.a = str;
        this.b = u22;
        this.c = u22 != null ? 1 + u22.c : 1;
    }
}
