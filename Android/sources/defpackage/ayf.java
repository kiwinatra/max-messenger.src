package defpackage;

import java.util.Collections;
import kotlin.jvm.functions.Function0;
import org.apache.http.cookie.ClientCookie;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* renamed from: ayf  reason: default package */
public final /* synthetic */ class ayf implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ UploadFileAttachWorker b;

    public /* synthetic */ ayf(UploadFileAttachWorker uploadFileAttachWorker, int i) {
        this.a = i;
        this.b = uploadFileAttachWorker;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, we8] */
    public final Object invoke() {
        p4g p4g;
        switch (this.a) {
            case 0:
                t64 inputData = this.b.getInputData();
                ? obj = new Object();
                String e = inputData.e(ClientCookie.PATH_ATTR);
                String str = "";
                if (e == null) {
                    e = str;
                }
                obj.b = e;
                String e2 = inputData.e("attachLocalId");
                if (e2 == null) {
                    e2 = str;
                }
                obj.f = e2;
                obj.a = inputData.d("lastModified", 0);
                long d = inputData.d("key.messageId", 0);
                long d2 = inputData.d("key.chatId", 0);
                String e3 = inputData.e("key.attachLocalId");
                obj.c = new xc9(d, e3 == null ? str : e3, d2);
                String e4 = inputData.e("uploadType");
                if (e4 == null) {
                    e4 = str;
                }
                obj.d = xyf.valueOf(e4);
                if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                    i20 i20 = new i20(1);
                    i20.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                    String e5 = inputData.e("messageUpload.videoConvertOptions.quality");
                    if (e5 != null) {
                        str = e5;
                    }
                    i20.a = qac.valueOf(str);
                    i20.b = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                    i20.c = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                    p4g = new p4g(i20);
                } else {
                    p4g = null;
                }
                obj.e = p4g;
                return new qf9(obj);
            case 1:
                return (gl5) ((sjd) this.b.getTamComponent()).getAccessor().g(gl5.class);
            case 2:
                return ((sjd) this.b.getTamComponent()).g();
            case 3:
                return (d6b) ((sjd) this.b.getTamComponent()).getAccessor().g(d6b.class);
            case 4:
                return (lyf) ((sjd) this.b.getTamComponent()).getAccessor().g(lyf.class);
            case 5:
                return (l5f) ((sjd) this.b.getTamComponent()).getAccessor().g(l5f.class);
            case 6:
                return ((sjd) this.b.getTamComponent()).n();
            case 7:
                return ((sjd) this.b.getTamComponent()).u();
            case 8:
                return ((sjd) this.b.getTamComponent()).y();
            case 9:
                return (h00) ((sjd) this.b.getTamComponent()).getAccessor().g(h00.class);
            case 10:
                return (rh3) ((sjd) this.b.getTamComponent()).getAccessor().g(rh3.class);
            case 11:
                return (yf9) ((sjd) this.b.getTamComponent()).getAccessor().g(yf9.class);
            case 12:
                return ((sjd) this.b.getTamComponent()).f();
            case 13:
                return ((sjd) this.b.getTamComponent()).r();
            default:
                return ((sjd) this.b.getTamComponent()).A();
        }
    }
}
