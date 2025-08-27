package defpackage;

import android.os.Process;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: leg  reason: default package */
public final class leg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ meg b;

    public /* synthetic */ leg(meg meg, int i) {
        this.a = i;
        this.b = meg;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                int threadPriority = Process.getThreadPriority(Process.myTid());
                try {
                    Process.setThreadPriority(10);
                    synchronized (this.b.b) {
                        meg meg = this.b;
                        jlg jlg = meg.c;
                        if (jlg != null) {
                            xe8 xe8 = meg.q;
                            y2d y2d = ((ttc) jlg).r;
                            xe8.getClass();
                            String y2d2 = y2d.toString();
                            if (((woc) xe8.c).shouldHideSensitiveInformation()) {
                                y2d2 = hi7.m(y2d2);
                            }
                            ((voc) xe8.b).log("OKWSSignaling", "May be ERROR, socket is already with " + y2d2);
                        }
                        meg meg2 = this.b;
                        xe8 xe82 = meg2.q;
                        String str = meg2.h;
                        if (((woc) xe82.c).shouldHideSensitiveInformation()) {
                            str = hi7.m(str);
                        }
                        ((voc) xe82.b).log("OKWSSignaling", "Connect to " + str);
                        hr6 hr6 = new hr6();
                        hr6.C(this.b.h);
                        y2d c = hr6.c();
                        meg meg3 = this.b;
                        meg3.c = meg3.o.c(c, new xga(12, this));
                    }
                    Process.setThreadPriority(threadPriority);
                    return;
                } catch (Throwable th) {
                    Process.setThreadPriority(threadPriority);
                    throw th;
                }
            default:
                synchronized (this.b.b) {
                    try {
                        this.b.q.v("transport.DISCONNECT");
                        jlg jlg2 = this.b.c;
                        if (jlg2 != null) {
                            ((ttc) jlg2).b(MultiFileUploader.MSG_TRY_UPLOAD_NEXT, "dispose");
                            this.b.c = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}
