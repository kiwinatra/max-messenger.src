package defpackage;

import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import org.webrtc.RTCStats;

/* renamed from: a62  reason: default package */
public final /* synthetic */ class a62 implements qk3, h08, ReadOnlyProperty, nsb, zi6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ a62() {
        this.a = 6;
        this.b = "payloadType";
    }

    public void accept(Object obj) {
        i10 i10;
        String str = this.b;
        switch (this.a) {
            case 0:
                ((w62) obj).g = str;
                return;
            case 1:
                ((w62) obj).h = str;
                return;
            case 3:
                m20 m20 = (m20) obj;
                for (int i = 0; i < m20.b(); i++) {
                    if (ld8.x(str, m20.d(i).q)) {
                        if (i < 0 || i >= m20.b()) {
                            throw new IllegalArgumentException("index < 0 or index >= attaches.size()");
                        }
                        m20.a.remove(i);
                    }
                }
                return;
            case 4:
                Throwable th = (Throwable) obj;
                z68.e("fa9", "Can't update attach async localId = " + str);
                return;
            default:
                j10 j10 = (j10) obj;
                i10 i102 = j10.e;
                if (i102 == null) {
                    i102 = i10.j;
                }
                if (i102 != null) {
                    h10 a2 = i102.a();
                    a2.b = str;
                    i10 = new i10(a2);
                } else {
                    i10 = null;
                }
                j10.e = i10;
                return;
        }
    }

    public Object apply(Object obj) {
        dzf dzf = (dzf) obj;
        dzf.getClass();
        return new qa3(2, new czf(0, dzf, this.b));
    }

    public Object getValue(Object obj, KProperty kProperty) {
        RTCStats rTCStats = (RTCStats) obj;
        switch (this.a) {
            case 6:
                Object obj2 = rTCStats.getMembers().get(this.b);
                if (obj2 != null) {
                    return zoc.c(obj2);
                }
                return null;
            default:
                Object obj3 = rTCStats.getMembers().get(this.b);
                if (obj3 != null) {
                    return obj3.toString();
                }
                return null;
        }
    }

    public void invoke(Object obj) {
        ((sb5) obj).getClass();
        z68.c("sb5", "videoDebugListener.onVideoDecoderInitialized decoder = " + this.b, new Object[0]);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 8:
                String str = (String) obj;
                return !cvg.A(str) && ((qra) ym.e()).B().h(str, this.b);
            case 9:
                return ((sq0) obj).c.contains(this.b);
            case 10:
                return ((sq0) obj).c.equals(this.b);
            default:
                String str2 = ((vyf) obj).a;
                return str2 != null && str2.equals(this.b);
        }
    }

    public /* synthetic */ a62(sd sdVar, String str, long j, long j2) {
        this.a = 2;
        this.b = str;
    }

    public /* synthetic */ a62(String str, int i) {
        this.a = i;
        this.b = str;
    }
}
