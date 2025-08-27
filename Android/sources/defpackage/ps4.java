package defpackage;

import kotlin.jvm.functions.Function0;
import ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker;

/* renamed from: ps4  reason: default package */
public final /* synthetic */ class ps4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DownloadFileFromWebAppWorker b;

    public /* synthetic */ ps4(DownloadFileFromWebAppWorker downloadFileFromWebAppWorker, int i) {
        this.a = i;
        this.b = downloadFileFromWebAppWorker;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                t64 inputData = this.b.getInputData();
                long d = inputData.d("requestId", 0);
                long d2 = inputData.d("botId", 0);
                String e = inputData.e("fileName");
                String str = e == null ? "" : e;
                String e2 = inputData.e("fileUrl");
                return new ydf(e2 == null ? "" : e2, str, d, d2);
            case 1:
                DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.b;
                return Integer.valueOf((Long.hashCode(downloadFileFromWebAppWorker.c().b) * 31) + downloadFileFromWebAppWorker.c().c.hashCode());
            case 2:
                return ((sjd) this.b.getTamComponent()).m();
            case 3:
                return ((sjd) this.b.getTamComponent()).f();
            case 4:
                return (k4f) ((sjd) this.b.getTamComponent()).getAccessor().g(k4f.class);
            case 5:
                return (hm5) ((sjd) this.b.getTamComponent()).getAccessor().g(hm5.class);
            case 6:
                return ((sjd) this.b.getTamComponent()).n();
            case 7:
                return ((sjd) this.b.getTamComponent()).y();
            case 8:
                return (rh3) ((sjd) this.b.getTamComponent()).getAccessor().g(rh3.class);
            default:
                return (eu3) ((sjd) this.b.getTamComponent()).getAccessor().g(eu3.class);
        }
    }
}
