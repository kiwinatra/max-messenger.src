package defpackage;

import java.io.File;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.time.DurationKt;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: nj7  reason: default package */
public final class nj7 extends or3 implements hdb {
    public static final /* synthetic */ int z = 0;
    public final String x;
    public final pdf y;

    public nj7(long j, String str, long j2, long j3, pdf pdf) {
        super(1, j, j2, CollectionsKt.listOf(Long.valueOf(j3)));
        this.x = str;
        this.y = pdf;
    }

    public final int b() {
        fa9 o = o();
        pdf pdf = this.y;
        ha9 r = o.r(pdf.a);
        if (r != null && r.Y != qe9.DELETED && r.w()) {
            return 1;
        }
        StringBuilder sb = new StringBuilder("onPreExecute: messageId ");
        long j = pdf.a;
        sb.append(j);
        sb.append(" is wrong");
        z68.c("nj7", sb.toString(), new Object[0]);
        v(r);
        k().c(new ft4(j));
        return 3;
    }

    public final void c() {
        z68.c("nj7", "onMaxFailCount", new Object[0]);
        s().d(this.a);
        fa9 o = o();
        pdf pdf = this.y;
        v(o.r(pdf.a));
        k().c(new ft4(pdf.a));
    }

    public final byte[] d() {
        Tasks.FileDownload fileDownload = new Tasks.FileDownload();
        pdf pdf = this.y;
        fileDownload.messageId = pdf.a;
        fileDownload.attachId = pdf.b;
        fileDownload.videoId = pdf.c;
        fileDownload.audioId = pdf.d;
        fileDownload.mp4GifId = pdf.e;
        fileDownload.stickerId = pdf.f;
        fileDownload.fileId = pdf.j;
        fileDownload.fileName = pdf.k;
        fileDownload.url = pdf.g;
        fileDownload.notifyProgress = pdf.h;
        fileDownload.checkAutoloadConnection = pdf.i;
        fileDownload.invalidateCount = pdf.l;
        fileDownload.useOriginalExtension = pdf.m;
        fileDownload.notCopyVideoToGallery = pdf.n;
        Tasks.InvalidateAndDownloadAudio invalidateAndDownloadAudio = new Tasks.InvalidateAndDownloadAudio();
        invalidateAndDownloadAudio.requestId = this.a;
        invalidateAndDownloadAudio.outputPath = this.x;
        invalidateAndDownloadAudio.chatServerId = this.v;
        invalidateAndDownloadAudio.serverMessageId = ((Number) ((List) this.w).get(0)).longValue();
        invalidateAndDownloadAudio.fileDownload = fileDownload;
        return ad9.toByteArray(invalidateAndDownloadAudio);
    }

    public final int f() {
        return DurationKt.NANOS_IN_MILLIS;
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_INVALIDATE_AND_DOWNLOAD_AUDIO;
    }

    public final void h(qaf qaf) {
        super.h(qaf);
        if (!m58.A(qaf.b)) {
            z68.f("nj7", "Can't update msg", (Throwable) null);
            c();
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [odf, java.lang.Object] */
    /* renamed from: t */
    public final void e(qv9 qv9) {
        String str;
        super.t(qv9);
        z68.c("nj7", "Receive msg get response", new Object[0]);
        fa9 o = o();
        pdf pdf = this.y;
        ha9 r = o.r(pdf.a);
        rm rmVar = null;
        if (r == null || !r.w()) {
            z68.f("nj7", "No message after msg get", (Throwable) null);
            c();
            return;
        }
        ha9 ha9 = r.q() ? r.A0 : null;
        z68.c("nj7", "messageDb = " + r + ", forwardLink = " + ha9, new Object[0]);
        i10 c = r.c();
        if (c != null && (str = c.b) != null) {
            ? obj = new Object();
            obj.a = pdf.a;
            obj.b = pdf.b;
            obj.c = pdf.c;
            obj.d = pdf.d;
            obj.e = pdf.e;
            obj.f = pdf.f;
            obj.j = pdf.j;
            obj.k = pdf.k;
            obj.h = pdf.h;
            obj.i = pdf.i;
            obj.m = pdf.m;
            obj.n = pdf.n;
            obj.l = pdf.l + 1;
            obj.g = str;
            pdf pdf2 = new pdf(obj);
            rm rmVar2 = this.c;
            if (rmVar2 != null) {
                rmVar = rmVar2;
            }
            ((uk5) rmVar.L.getValue()).a(pdf2);
        }
    }

    public final void v(ha9 ha9) {
        if (ha9 != null && ha9.Y != qe9.DELETED) {
            pdf pdf = this.y;
            l20 B = ld8.B(ha9, pdf.b);
            if (B == null) {
                return;
            }
            if (B.n.a()) {
                rm rmVar = this.c;
                if (rmVar == null) {
                    rmVar = null;
                }
                ((w47) rmVar.K.getValue()).a.a(new File(this.x), pdf.b);
                return;
            }
            o().x(ha9.b, B.q, new n77(4));
            k().c(new twf(0, ha9.z, ha9.b));
        }
    }
}
