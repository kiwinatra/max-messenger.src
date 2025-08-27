package defpackage;

/* renamed from: tf7  reason: default package */
public final class tf7 extends ad9 {
    public int a = 0;

    public tf7() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int i = this.a;
        if (i != 0) {
            return j43.n(1, i);
        }
        return 0;
    }

    public final ad9 mergeFrom(i43 i43) {
        while (true) {
            int s = i43.s();
            if (s == 0) {
                break;
            } else if (s == 8) {
                this.a = i43.p();
            } else if (!i43.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(j43 j43) {
        int i = this.a;
        if (i != 0) {
            j43.G(1, i);
        }
    }
}
