package defpackage;

import org.webrtc.SessionDescription;

/* renamed from: abb  reason: default package */
public final /* synthetic */ class abb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fbb b;
    public final /* synthetic */ SessionDescription c;

    public /* synthetic */ abb(fbb fbb, SessionDescription sessionDescription, int i) {
        this.a = i;
        this.b = fbb;
        this.c = sessionDescription;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                fbb fbb = this.b;
                fbb.getClass();
                SessionDescription sessionDescription = this.c;
                String str = sessionDescription.description;
                cp5 cp5 = fbb.P0;
                if (cp5.c) {
                    cp5.b = 0;
                    cp5.a = 0;
                    cp5.c = false;
                }
                long a2 = cp5.a(str);
                cp5.b = a2;
                if (a2 != 0) {
                    long j = cp5.a;
                    if (j != 0) {
                        cp5.c = true;
                        cp5.d.c(j ^ a2);
                    }
                }
                ebb ebb = fbb.Y0;
                if (ebb != null) {
                    ebb.n(fbb, sessionDescription);
                    return;
                }
                return;
            default:
                fbb fbb2 = this.b;
                fbb2.getClass();
                SessionDescription sessionDescription2 = this.c;
                String str2 = sessionDescription2.description;
                cp5 cp52 = fbb2.P0;
                if (cp52.c) {
                    cp52.b = 0;
                    cp52.a = 0;
                    cp52.c = false;
                }
                long a3 = cp5.a(str2);
                cp52.a = a3;
                long j2 = cp52.b;
                if (!(j2 == 0 || a3 == 0)) {
                    cp52.c = true;
                    cp52.d.c(a3 ^ j2);
                }
                ebb ebb2 = fbb2.Y0;
                if (ebb2 != null) {
                    ebb2.b(fbb2, sessionDescription2);
                    return;
                }
                return;
        }
    }
}
