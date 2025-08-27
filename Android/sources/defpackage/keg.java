package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: keg  reason: default package */
public final /* synthetic */ class keg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ meg b;
    public final /* synthetic */ String c;

    public /* synthetic */ keg(meg meg, String str, int i) {
        this.a = i;
        this.b = meg;
        this.c = str;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                meg meg = this.b;
                String str = this.c;
                synchronized (meg.b) {
                    try {
                        jlg jlg = meg.c;
                        if (jlg == null) {
                            meg.q.v("Socket is absent, waiting?");
                        } else {
                            ((ttc) jlg).g(str);
                            xe8 xe8 = meg.q;
                            if (((woc) xe8.c).shouldHideSensitiveInformation()) {
                                String n = hi7.n(str);
                                ((voc) xe8.b).log("OKWSSignaling", " -> " + n);
                            } else {
                                ((voc) xe8.b).log("OKWSSignaling", " -> ".concat(str));
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                meg meg2 = this.b;
                String e = meg.e(meg.e(meg2.h, ApiProtocol.KEY_TOKEN, this.c), "tgt", "retry");
                if (meg2.k) {
                    long j = meg2.l;
                    if (j > 0) {
                        e = meg.e(e, "recoverTs", String.valueOf(j));
                    }
                }
                meg2.q.v("transport.restart");
                synchronized (meg2.b) {
                    meg2.h = e;
                }
                synchronized (meg2.e) {
                    meg2.f = false;
                    meg2.a("restart");
                }
                return;
        }
    }
}
