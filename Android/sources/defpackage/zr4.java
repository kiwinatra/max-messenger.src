package defpackage;

import kotlin.jvm.functions.Function0;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;

/* renamed from: zr4  reason: default package */
public final /* synthetic */ class zr4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DownloadFileAttachWorker b;

    public /* synthetic */ zr4(DownloadFileAttachWorker downloadFileAttachWorker, int i) {
        this.a = i;
        this.b = downloadFileAttachWorker;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [odf, java.lang.Object] */
    public final Object invoke() {
        switch (this.a) {
            case 0:
                t64 inputData = this.b.getInputData();
                ? obj = new Object();
                obj.a = inputData.d("messageId", 0);
                String e = inputData.e("attachId");
                String str = "";
                if (e == null) {
                    e = str;
                }
                obj.b = e;
                obj.c = inputData.d("videoId", 0);
                obj.d = inputData.d("audioId", 0);
                obj.e = inputData.d("mp4GifId", 0);
                obj.f = inputData.d("stickerId", 0);
                String e2 = inputData.e("url");
                if (e2 == null) {
                    e2 = str;
                }
                obj.g = e2;
                obj.h = inputData.b("notifyProgress", false);
                obj.i = inputData.b("checkAutoLoadConnection", false);
                obj.j = inputData.d("fileId", 0);
                String e3 = inputData.e("fileName");
                if (e3 != null) {
                    str = e3;
                }
                obj.k = str;
                Object obj2 = inputData.a.get("invalidateCount");
                obj.l = obj2 instanceof Integer ? ((Integer) obj2).intValue() : 0;
                obj.m = inputData.b("useOriginalExtension", false);
                obj.n = inputData.b("notCopyVideoToGallery", false);
                return new pdf(obj);
            case 1:
                return ((sjd) this.b.getTamComponent()).g();
            case 2:
                return (k4f) ((sjd) this.b.getTamComponent()).getAccessor().g(k4f.class);
            case 3:
                return (ou8) ((sjd) this.b.getTamComponent()).getAccessor().g(ou8.class);
            case 4:
                return ((sjd) this.b.getTamComponent()).u();
            case 5:
                return ((sjd) this.b.getTamComponent()).d();
            case 6:
                return ((sjd) this.b.getTamComponent()).l();
            case 7:
                return ((sjd) this.b.getTamComponent()).f();
            case 8:
                return (hm5) ((sjd) this.b.getTamComponent()).getAccessor().g(hm5.class);
            case 9:
                return ((sjd) this.b.getTamComponent()).n();
            case 10:
                return ((sjd) this.b.getTamComponent()).y();
            case 11:
                return (rh3) ((sjd) this.b.getTamComponent()).getAccessor().g(rh3.class);
            case 12:
                return (h00) ((sjd) this.b.getTamComponent()).getAccessor().g(h00.class);
            case 13:
                DownloadFileAttachWorker downloadFileAttachWorker = this.b;
                return Integer.valueOf((Long.hashCode(downloadFileAttachWorker.g().a) * 31) + downloadFileAttachWorker.g().b.hashCode());
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return ((sjd) this.b.getTamComponent()).m();
            default:
                return ((sjd) this.b.getTamComponent()).r();
        }
    }
}
