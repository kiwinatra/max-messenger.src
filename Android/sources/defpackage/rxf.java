package defpackage;

import kotlin.jvm.functions.Function0;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.upload.workers.UploadExternalGifWorker;

/* renamed from: rxf  reason: default package */
public final /* synthetic */ class rxf implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ UploadExternalGifWorker b;

    public /* synthetic */ rxf(UploadExternalGifWorker uploadExternalGifWorker, int i) {
        this.a = i;
        this.b = uploadExternalGifWorker;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                t64 inputData = this.b.getInputData();
                long d = inputData.d("requestId", 0);
                String e = inputData.e("externalUrl");
                String str = e == null ? "" : e;
                String e2 = inputData.e("attachLocalId");
                String str2 = e2 == null ? "" : e2;
                long d2 = inputData.d("messageId", 0);
                long d3 = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0);
                String e3 = inputData.e("stickerId");
                if (e3 == null) {
                    e3 = "";
                }
                return new txf(d, str, str2, d2, d3, e3);
            case 1:
                return (eef) ((sjd) this.b.getTamComponent()).getAccessor().g(eef.class);
            case 2:
                return (ou8) ((sjd) this.b.getTamComponent()).getAccessor().g(ou8.class);
            case 3:
                return (hm5) ((sjd) this.b.getTamComponent()).getAccessor().g(hm5.class);
            case 4:
                return (gl5) ((sjd) this.b.getTamComponent()).getAccessor().g(gl5.class);
            case 5:
                return ((sjd) this.b.getTamComponent()).l();
            case 6:
                return ((sjd) this.b.getTamComponent()).n();
            case 7:
                return Integer.valueOf(this.b.d().hashCode());
            case 8:
                return ((sjd) this.b.getTamComponent()).m();
            case 9:
                return ((sjd) this.b.getTamComponent()).r();
            case 10:
                return ((sjd) this.b.getTamComponent()).g();
            case 11:
                return (w47) ((sjd) this.b.getTamComponent()).getAccessor().g(w47.class);
            default:
                return (d6b) ((sjd) this.b.getTamComponent()).getAccessor().g(d6b.class);
        }
    }
}
