package defpackage;

/* renamed from: vb0  reason: default package */
public final class vb0 {
    public final qvb a;
    public final ha7 b;

    public vb0(qvb qvb, ha7 ha7) {
        if (qvb != null) {
            this.a = qvb;
            this.b = ha7;
            return;
        }
        throw new NullPointerException("Null processingRequest");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vb0)) {
            return false;
        }
        vb0 vb0 = (vb0) obj;
        return this.a.equals(vb0.a) && this.b.equals(vb0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "InputPacket{processingRequest=" + this.a + ", imageProxy=" + this.b + "}";
    }
}
