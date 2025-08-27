package defpackage;

import one.me.sdk.transfer.exceptions.TamHttpErrorException;

/* renamed from: q47  reason: default package */
public final /* synthetic */ class q47 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s47 b;

    public /* synthetic */ q47(s47 s47, int i) {
        this.a = i;
        this.b = s47;
    }

    public final void run() {
        s47 s47 = this.b;
        switch (this.a) {
            case 0:
                if (!s47.w.get()) {
                    z68.f("t47", "onFileDownloadInterrupted", (Throwable) null);
                    s47.v.onError(new TamHttpErrorException("url expired", (u47) null));
                    s47.b(false);
                    return;
                }
                return;
            case 1:
                if (!s47.w.get()) {
                    z68.f("t47", "onFileDownloadFailed", (Throwable) null);
                    s47.v.onError(new TamHttpErrorException("onFileDownloadFailed", (u47) null));
                    s47.b(false);
                    return;
                }
                return;
            default:
                if (!s47.w.get()) {
                    z68.f("t47", "onFileDownloadInterrupted", (Throwable) null);
                    s47.v.onError(new TamHttpErrorException("onFileDownloadInterrupted", (u47) null));
                    s47.b(false);
                    return;
                }
                return;
        }
    }
}
