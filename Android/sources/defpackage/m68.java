package defpackage;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.time.DurationKt;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: m68  reason: default package */
public final class m68 extends qm implements hdb, lcf {
    public final long o;
    public final long v;
    public final String w = m68.class.getName();

    public m68(long j, long j2, long j3) {
        super(j);
        this.o = j2;
        this.v = j3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002b, code lost:
        r7 = o().k(r0.a, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0037, code lost:
        r0 = defpackage.qe9.DELETED;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onPreExecute: serverChatId = "
            r0.<init>(r1)
            long r1 = r7.o
            r0.append(r1)
            java.lang.String r3 = ", serverMessageId = "
            r0.append(r3)
            long r3 = r7.v
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = r7.w
            defpackage.z68.c(r5, r0, new java.lang.Object[0])
            r62 r0 = r7.l()
            a32 r0 = r0.D(r1)
            r1 = 3
            if (r0 != 0) goto L_0x002b
            return r1
        L_0x002b:
            fa9 r7 = r7.o()
            long r5 = r0.a
            ha9 r7 = r7.k(r5, r3)
            if (r7 == 0) goto L_0x0040
            qe9 r0 = defpackage.qe9.DELETED
            qe9 r7 = r7.Y
            if (r7 != r0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r7 = 1
            return r7
        L_0x0040:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m68.b():int");
    }

    public final void c() {
        z68.f(this.w, "onMaxFailCount", (Throwable) null);
        s().d(this.a);
    }

    public final byte[] d() {
        Tasks.LocationStop locationStop = new Tasks.LocationStop();
        locationStop.requestId = this.a;
        locationStop.chatId = this.o;
        locationStop.messageId = this.v;
        return ad9.toByteArray(locationStop);
    }

    public final void e(ibf ibf) {
        n68 n68 = (n68) ibf;
        a32 D = l().D(this.o);
        if (D != null) {
            fa9 o2 = o();
            b89 b89 = n68.c;
            long g = o2.g(D.a, ((ltb) q()).a.s(), b89);
            if (g != 0) {
                k().c(new twf(0, D.a, g));
                return;
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            z68.f(this.w, String.format(Locale.ENGLISH, "Can't insert message: response = %s", Arrays.copyOf(new Object[]{n68}, 1)), (Throwable) null);
        }
    }

    public final int f() {
        return DurationKt.NANOS_IN_MILLIS;
    }

    public final fbf g() {
        np2 np2 = new np2((x3b) null, 17);
        np2.p(this.o, ApiProtocol.PARAM_CHAT_ID);
        np2.p(this.v, "messageId");
        return np2;
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_LOCATION_STOP;
    }

    public final void h(qaf qaf) {
        k().c(new hj0(this.a, qaf));
        if (!m58.A(qaf.b)) {
            c();
        }
    }
}
