package defpackage;

/* renamed from: sh3  reason: default package */
public final class sh3 extends ij0 {
    public final int b;
    public final mi3 c;
    public final boolean o;

    public sh3(int i, mi3 mi3, boolean z) {
        this.b = i;
        this.c = mi3;
        this.o = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectionInfoEvent{state=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", backgroundDataEnabled=");
        return wzf.l(sb, this.o, '}');
    }
}
