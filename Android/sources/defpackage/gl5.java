package defpackage;

import androidx.work.WorkRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KProperty;
import org.apache.http.cookie.ClientCookie;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* renamed from: gl5  reason: default package */
public final class gl5 {
    public final ipg a;
    public final hs7 b;
    public final hs7 c;

    public gl5(ipg ipg, hs7 hs7, hs7 hs72) {
        this.a = ipg;
        this.b = hs7;
        this.c = hs72;
    }

    public final void a(long j) {
        try {
            List<qf9> list = (List) new wh8(2, new yia(new oa3(1, new wh8(2, ((yf9) this.c.get()).b(), new c10(j, 29)), new q0a(0)), new p79(12), 3).B(), new p79(14)).c(CollectionsKt.emptyList());
            for (qf9 qf9 : list) {
                xc9 xc9 = qf9.a;
                long j2 = xc9.b;
                this.a.c("UploadFileAttachWorker:" + j2 + ":" + xc9.a + ":" + xc9.c);
            }
            z68.c("gl5", "success! cancel attach %d uploads", Integer.valueOf(list.size()));
        } catch (Throwable th) {
            z68.f("gl5", "failure to cancel attach uploads", th);
        }
    }

    public final void b(long j) {
        try {
            List<au4> list = (List) new wh8(2, new yia(new oa3(1, new wh8(2, ((ju4) this.b.get()).a(), new yl4(j, 1)), ekd.o), dbe.c, 3).B(), ece.c).b();
            if (list != null) {
                for (au4 au4 : list) {
                    st4 st4 = au4.a;
                    long j2 = st4.a;
                    this.a.c("UploadDraftMediaWorker/" + j2 + ":" + st4.b);
                }
            }
            z68.c("gl5", "success! cancel draft %d uploads", list != null ? Integer.valueOf(list.size()) : null);
        } catch (Exception e) {
            z68.f("gl5", "failure in cancelling draft uploads other workers", e);
        }
    }

    /* JADX WARNING: type inference failed for: r10v1, types: [java.lang.Object, we8] */
    public final void c(n2 n2Var, long j, long j2, String str) {
        p4g p4g;
        int i = n2Var.a;
        xyf xyf = i != 1 ? i != 2 ? i != 3 ? i != 7 ? i != 10 ? xyf.UNKNOWN : xyf.STICKER : xyf.FILE : xyf.VIDEO : xyf.AUDIO : n2Var instanceof df5 ? xyf.EXTERNAL_GIF : xyf.PHOTO;
        if (xyf == xyf.UNKNOWN) {
            z68.g("FileAttachUploader", "upload: failed, unknown media type = %s", Integer.valueOf(i));
            return;
        }
        xc9 xc9 = new xc9(j, str, j2);
        ? obj = new Object();
        obj.c = xc9;
        obj.d = xyf;
        obj.b = n2Var.a();
        obj.a = cjf.C(n2Var.a());
        if (!(n2Var instanceof q6g)) {
            p4g = null;
        } else {
            p4g p4g2 = ((q6g) n2Var).c;
            qac qac = p4g2.a;
            i20 i20 = new i20(1);
            i20.a = qac;
            i20.b = p4g2.b;
            i20.c = p4g2.c;
            i20.d = p4g2.d;
            p4g = new p4g(i20);
        }
        obj.e = p4g;
        d(new qf9(obj));
    }

    public final void d(qf9 qf9) {
        z68.c("UploadFileAttachWorker", "start %s", qf9);
        xc9 xc9 = qf9.a;
        StringBuilder n = tr1.n(xc9.b, "UploadFileAttachWorker:", ":");
        n.append(xc9.a);
        n.append(":");
        n.append(xc9.c);
        String sb = n.toString();
        v3b v3b = (v3b) ((v3b) ((v3b) new v3b(UploadFileAttachWorker.class).setExpedited(t5b.a)).setBackoffCriteria(ag0.b, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS)).addTag("UploadFileAttachWorker");
        HashMap hashMap = new HashMap();
        hashMap.put("workName", sb);
        xc9 xc92 = qf9.a;
        hashMap.put("key.messageId", Long.valueOf(xc92.a));
        hashMap.put("key.chatId", Long.valueOf(xc92.b));
        hashMap.put("key.attachLocalId", xc92.c);
        hashMap.put(ClientCookie.PATH_ATTR, qf9.b);
        hashMap.put("lastModified", Long.valueOf(qf9.c));
        hashMap.put("uploadType", qf9.d.name());
        hashMap.put("attachLocalId", qf9.f);
        p4g p4g = qf9.e;
        if (p4g != null) {
            hashMap.put("messageUpload.videoConvertOptions", true);
            hashMap.put("messageUpload.videoConvertOptions.quality", p4g.a.name());
            hashMap.put("messageUpload.videoConvertOptions.startTrimPosition", Float.valueOf(p4g.b));
            hashMap.put("messageUpload.videoConvertOptions.endTrimPosition", Float.valueOf(p4g.c));
            hashMap.put("messageUpload.videoConvertOptions.mute", Boolean.valueOf(p4g.d));
        }
        t64 t64 = new t64((Map) hashMap);
        t64.f(t64);
        fb5 fb5 = fb5.b;
        KProperty[] kPropertyArr = ipg.n;
        this.a.b(sb, fb5, (w3b) ((v3b) v3b.setInputData(t64)).build(), false).v();
    }
}
