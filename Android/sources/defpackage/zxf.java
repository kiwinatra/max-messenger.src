package defpackage;

import java.io.File;
import ru.ok.tamtam.upload.workers.UploadExternalGifWorker;

/* renamed from: zxf  reason: default package */
public final class zxf implements v47 {
    public final /* synthetic */ UploadExternalGifWorker a;

    public zxf(UploadExternalGifWorker uploadExternalGifWorker) {
        this.a = uploadExternalGifWorker;
    }

    public final void a() {
        z68.f("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadFailed", (Throwable) null);
        this.a.x0 = o9a.x;
    }

    public final void d() {
        z68.f("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onUrlExpired", (Throwable) null);
        ((uta) ((m95) this.a.Z.getValue())).c(new Exception("Tenor gif url expired"), true);
        this.a.x0 = s9a.x;
    }

    public final void e(long j, float f) {
        z68.c("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadProgress progress = %s " + f, new Object[0]);
        long nanoTime = System.nanoTime();
        if ((f > c44.DEFAULT_ASPECT_RATIO || f < 100.0f) && Math.abs(nanoTime - this.a.w0) < 500000000) {
            z68.c("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "Skip progress", new Object[0]);
            return;
        }
        UploadExternalGifWorker uploadExternalGifWorker = this.a;
        uploadExternalGifWorker.w0 = nanoTime;
        ha9 r = ((fa9) uploadExternalGifWorker.o.getValue()).r(this.a.d().d);
        if (r == null || r.Y == qe9.DELETED) {
            z68.c("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadProgress: Message was deleted", new Object[0]);
            ((w47) this.a.w.getValue()).a(((po5) ((ln5) this.a.c.getValue())).n(this.a.d().f), this.a.d().f);
            ((eef) this.a.y.getValue()).d(this.a.d().a);
            UploadExternalGifWorker.c(this.a);
            return;
        }
        this.a.x0 = new wxf(r.o, f);
    }

    public final String getDownloadContext() {
        UploadExternalGifWorker uploadExternalGifWorker = this.a;
        long j = uploadExternalGifWorker.d().d;
        String str = uploadExternalGifWorker.d().c;
        return j + "_" + str;
    }

    public final void h() {
        z68.c("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadCancelled", new Object[0]);
        this.a.x0 = js9.x;
    }

    public final void j(File file) {
        z68.c("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadCompleted", new Object[0]);
        ((eef) this.a.y.getValue()).d(this.a.d().a);
        UploadExternalGifWorker.c(this.a);
        ha9 r = ((fa9) this.a.o.getValue()).r(this.a.d().d);
        if (r == null || r.Y == qe9.DELETED) {
            z68.c("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadCompleted: Message was deleted", new Object[0]);
            this.a.x0 = vxf.a;
            return;
        }
        File l = ((po5) ((ln5) this.a.c.getValue())).l(this.a.d().f);
        if (!cjf.o(l)) {
            ((wj0) ((ou8) this.a.z.getValue())).b(file, l);
        }
        this.a.x0 = new uxf(new df5(0, 0, file.getAbsolutePath(), (String) null, (String) null, (String) null));
    }

    public final void l() {
        z68.f("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadInterrupted: Can't download video", (Throwable) null);
        ((eef) this.a.y.getValue()).n(this.a.d().a, gef.WAITING);
        this.a.x0 = p9a.y;
    }
}
