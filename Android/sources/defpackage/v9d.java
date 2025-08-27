package defpackage;

/* renamed from: v9d  reason: default package */
public final class v9d implements u9d {
    public final voc a;

    public v9d(voc voc) {
        if (voc != null) {
            this.a = voc;
            return;
        }
        throw new IllegalArgumentException("Illegal 'logger' value: null");
    }

    public final void a(int i, byte[] bArr) {
        int i2 = ctg.a[tr1.y(i)];
        this.a.log("RtcNotifications", "<- ".concat(i2 != 1 ? i2 != 2 ? "<unknown>" : fy6.a(bArr) : new String(bArr)));
    }

    public final void b(t9d t9d) {
        this.a.log("RtcNotifications", "<- " + t9d);
    }

    public final void c(Throwable th) {
        this.a.log("RtcNotifications", "<- " + th);
    }
}
