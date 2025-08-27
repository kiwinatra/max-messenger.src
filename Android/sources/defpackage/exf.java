package defpackage;

/* renamed from: exf  reason: default package */
public final /* synthetic */ class exf implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kxf b;

    public /* synthetic */ exf(kxf kxf, int i) {
        this.a = i;
        this.b = kxf;
    }

    public final void run() {
        kxf kxf = this.b;
        switch (this.a) {
            case 0:
                z68.c("jxf", "getUploadFromRepository: upload not found in cache,  uploadData=%s", kxf);
                return;
            default:
                z68.a("jxf", "removeUploadFromRepository: finished for data=" + kxf);
                return;
        }
    }
}
