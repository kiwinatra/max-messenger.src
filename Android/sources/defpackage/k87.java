package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: k87  reason: default package */
public final /* synthetic */ class k87 implements rb6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k87(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a(ha7 ha7) {
        rb6 rb6;
        switch (this.a) {
            case 0:
                m87 m87 = (m87) ((WeakReference) ((l87) this.b).v).get();
                if (m87 != null) {
                    m87.w0.execute(new y86(14, (Object) m87));
                    return;
                }
                return;
            default:
                obd obd = (obd) this.b;
                synchronized (obd.c) {
                    try {
                        int i = obd.b - 1;
                        obd.b = i;
                        if (obd.a && i == 0) {
                            obd.close();
                        }
                        rb6 = (rb6) obd.w;
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                            break;
                        }
                    }
                }
                if (rb6 != null) {
                    rb6.a(ha7);
                    return;
                }
                return;
        }
    }
}
