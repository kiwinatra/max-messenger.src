package defpackage;

/* renamed from: qnd  reason: default package */
public final class qnd {
    public final wnd a;
    public final wnd b;

    public qnd(wnd wnd, wnd wnd2) {
        this.a = wnd;
        this.b = wnd2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qnd.class != obj.getClass()) {
            return false;
        }
        qnd qnd = (qnd) obj;
        return this.a.equals(qnd.a) && this.b.equals(qnd.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        wnd wnd = this.a;
        sb.append(wnd);
        wnd wnd2 = this.b;
        if (wnd.equals(wnd2)) {
            str = "";
        } else {
            str = ", " + wnd2;
        }
        return wj6.n(sb, str, "]");
    }
}
