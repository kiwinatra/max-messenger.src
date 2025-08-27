package defpackage;

import androidx.work.WorkRequest;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.reflect.KProperty;
import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;

/* renamed from: uk5  reason: default package */
public final class uk5 {
    public final ipg a;

    public uk5(ipg ipg) {
        this.a = ipg;
    }

    public final void a(pdf pdf) {
        pdf pdf2 = pdf;
        z68.c("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "start %s", pdf);
        StringBuilder sb = new StringBuilder("TaskAttachDownloadData{messageId=");
        long j = pdf2.a;
        sb.append(j);
        sb.append(", attachId='");
        String str = pdf2.b;
        sb.append(str);
        sb.append("', videoId=");
        long j2 = pdf2.c;
        sb.append(j2);
        sb.append(", audioId=");
        long j3 = pdf2.d;
        sb.append(j3);
        sb.append(", mp4GifId=");
        long j4 = pdf2.e;
        sb.append(j4);
        sb.append(", stickerId=");
        long j5 = pdf2.f;
        sb.append(j5);
        sb.append(", fileId=");
        long j6 = j5;
        long j7 = pdf2.j;
        sb.append(j7);
        sb.append(", fileName='");
        String str2 = pdf2.k;
        String m = a81.m("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker/", wj6.n(sb, str2, "'}"));
        v3b v3b = (v3b) ((v3b) ((v3b) new v3b(DownloadFileAttachWorker.class).setExpedited(t5b.a)).setBackoffCriteria(ag0.b, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS)).addTag("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker");
        pdf pdf3 = pdf;
        Pair[] pairArr = {TuplesKt.to("taskName", m), TuplesKt.to("messageId", Long.valueOf(j)), TuplesKt.to("attachId", str), TuplesKt.to("videoId", Long.valueOf(j2)), TuplesKt.to("audioId", Long.valueOf(j3)), TuplesKt.to("mp4GifId", Long.valueOf(j4)), TuplesKt.to("stickerId", Long.valueOf(j6)), TuplesKt.to("url", pdf3.g), TuplesKt.to("notifyProgress", Boolean.valueOf(pdf3.h)), TuplesKt.to("checkAutoLoadConnection", Boolean.valueOf(pdf3.i)), TuplesKt.to("fileId", Long.valueOf(j7)), TuplesKt.to("fileName", str2), TuplesKt.to("invalidateCount", Integer.valueOf(pdf3.l)), TuplesKt.to("useOriginalExtension", Boolean.valueOf(pdf3.m)), TuplesKt.to("notCopyVideoToGallery", Boolean.valueOf(pdf3.n))};
        xv1 xv1 = new xv1(15);
        for (int i = 0; i < 15; i++) {
            Pair pair = pairArr[i];
            xv1.w(pair.getSecond(), (String) pair.getFirst());
        }
        fb5 fb5 = fb5.b;
        KProperty[] kPropertyArr = ipg.n;
        sv7 b = this.a.b(m, fb5, (w3b) ((v3b) v3b.setInputData(xv1.m())).build(), false);
        b.v();
        kv0.i(b.x.H());
    }
}
