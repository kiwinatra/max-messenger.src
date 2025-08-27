package defpackage;

import kotlin.Lazy;

/* renamed from: qa2  reason: default package */
public final class qa2 {
    public final Lazy a;
    public final Lazy b;
    public final String c = qa2.class.getName();

    public qa2(Lazy lazy, Lazy lazy2) {
        this.a = lazy;
        this.b = lazy2;
    }

    public static void a(qa2 qa2, long j, long j2, long j3, long j4, bl4 bl4) {
        qa2 qa22 = qa2;
        qa2.getClass();
        StringBuilder k = i2a.k("from: chatId = ", j, ", time = ", iq.U(Long.valueOf(j3)));
        k.append(", chatAccessToken=");
        k.append(true);
        z68.c(qa22.c, k.toString(), new Object[0]);
        ocf.b((ocf) qa22.b.getValue(), new la2(((qjd) ((d3d) qa22.a.getValue())).n(), j, j2, j3, j4, (String) null, 0, 40, 0, bl4, 3776));
    }

    public static long b(qa2 qa2, long j, long j2, long j3, long j4, long j5, bl4 bl4) {
        qa2 qa22 = qa2;
        qa2.getClass();
        String U = iq.U(Long.valueOf(j3));
        String U2 = iq.U(Long.valueOf(j4));
        StringBuilder k = i2a.k("from-to: chatId = ", j, ", time = ", U);
        k.append(", backwardTime = ");
        k.append(U2);
        k.append(", chatAccessToken=");
        k.append(true);
        z68.c(qa22.c, k.toString(), new Object[0]);
        return ocf.b((ocf) qa22.b.getValue(), new la2(((qjd) ((d3d) qa22.a.getValue())).n(), j, j2, j3, j5, (String) null, 40, 40, j4, bl4, 3200));
    }

    public static long c(qa2 qa2, long j, long j2, long j3, long j4, long j5, bl4 bl4) {
        qa2 qa22 = qa2;
        qa2.getClass();
        String U = iq.U(Long.valueOf(j3));
        String U2 = iq.U(Long.valueOf(j4));
        StringBuilder k = i2a.k("to: chatId = ", j, ", time = ", U);
        k.append(", backwardTime = ");
        k.append(U2);
        k.append(", chatAccessToken=");
        k.append(true);
        z68.c(qa22.c, k.toString(), new Object[0]);
        return ocf.b((ocf) qa22.b.getValue(), new la2(((qjd) ((d3d) qa22.a.getValue())).n(), j, j2, j3, j5, (String) null, 0, 40, j4, bl4, 3264));
    }
}
