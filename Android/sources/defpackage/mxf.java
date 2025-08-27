package defpackage;

import java.util.Collections;
import kotlin.jvm.functions.Function0;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.upload.workers.UploadDraftMediaWorker;

/* renamed from: mxf  reason: default package */
public final /* synthetic */ class mxf implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ UploadDraftMediaWorker b;

    public /* synthetic */ mxf(UploadDraftMediaWorker uploadDraftMediaWorker, int i) {
        this.a = i;
        this.b = uploadDraftMediaWorker;
    }

    public final Object invoke() {
        p4g p4g;
        switch (this.a) {
            case 0:
                t64 inputData = this.b.getInputData();
                long d = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0);
                String e = inputData.e("attachLocalId");
                String str = "";
                if (e == null) {
                    e = str;
                }
                st4 st4 = new st4(d, e);
                String e2 = inputData.e("draft.path");
                String str2 = e2 == null ? str : e2;
                long d2 = inputData.d("draft.lastModified", 0);
                String e3 = inputData.e("draft.uploadType");
                if (e3 == null) {
                    e3 = str;
                }
                xyf valueOf = xyf.valueOf(e3);
                if (Collections.unmodifiableMap(inputData.a).get("draft.videoConvertOptions") != null) {
                    i20 i20 = new i20(1);
                    i20.d = inputData.b("draft.videoConvertOptions.mute", false);
                    String e4 = inputData.e("draft.videoConvertOptions.quality");
                    if (e4 != null) {
                        str = e4;
                    }
                    i20.a = qac.valueOf(str);
                    i20.b = inputData.c("draft.videoConvertOptions.startTrimPosition");
                    i20.c = inputData.c("draft.videoConvertOptions.endTrimPosition");
                    p4g = new p4g(i20);
                } else {
                    p4g = null;
                }
                return new au4(st4, str2, d2, valueOf, p4g);
            case 1:
                jbf z = ((sjd) this.b.getTamComponent()).z();
                z.getClass();
                return ((kbf) z).a();
            case 2:
                return ((sjd) this.b.getTamComponent()).n();
            case 3:
                return (gl5) ((sjd) this.b.getTamComponent()).getAccessor().g(gl5.class);
            case 4:
                return ((sjd) this.b.getTamComponent()).y();
            case 5:
                return (ju4) ((sjd) this.b.getTamComponent()).getAccessor().g(ju4.class);
            case 6:
                return ((sjd) this.b.getTamComponent()).A();
            case 7:
                return ((sjd) this.b.getTamComponent()).g();
            case 8:
                return (xt4) ((sjd) this.b.getTamComponent()).getAccessor().g(xt4.class);
            case 9:
                return (eef) ((sjd) this.b.getTamComponent()).getAccessor().g(eef.class);
            case 10:
                return ((sjd) this.b.getTamComponent()).d();
            default:
                return (lyf) ((sjd) this.b.getTamComponent()).getAccessor().g(lyf.class);
        }
    }
}
