package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: yl5  reason: default package */
public final class yl5 extends qm implements lcf, hdb {
    public final long o;
    public final String v;
    public final long w;
    public final String x;
    public final String y = yl5.class.getName();

    public yl5(String str, String str2, long j, long j2, long j3) {
        super(j);
        this.o = j2;
        this.v = str;
        this.w = j3;
        this.x = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r0 = defpackage.qe9.DELETED;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b() {
        /*
            r4 = this;
            long r0 = r4.w
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x001a
            fa9 r4 = r4.o()
            ha9 r4 = r4.r(r0)
            if (r4 == 0) goto L_0x0018
            qe9 r0 = defpackage.qe9.DELETED
            qe9 r4 = r4.Y
            if (r4 != r0) goto L_0x001a
        L_0x0018:
            r4 = 3
            return r4
        L_0x001a:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl5.b():int");
    }

    public final void c() {
        s().d(this.a);
    }

    public final byte[] d() {
        Tasks.FileDownloadCmd fileDownloadCmd = new Tasks.FileDownloadCmd();
        fileDownloadCmd.requestId = this.a;
        fileDownloadCmd.fileId = this.o;
        fileDownloadCmd.fileName = this.v;
        fileDownloadCmd.messageId = this.w;
        String str = this.x;
        if (!(str == null || str.length() == 0)) {
            fileDownloadCmd.attachLocalId = str;
        }
        return ad9.toByteArray(fileDownloadCmd);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [odf, java.lang.Object] */
    public final void e(ibf ibf) {
        am5 am5 = (am5) ibf;
        String str = this.y;
        z68.c(str, "onSuccess %s", am5);
        k().c(new cm5(this.a, am5.c));
        fa9 o2 = o();
        long j = this.w;
        ha9 r = o2.r(j);
        if (r != null && r.Y != qe9.DELETED) {
            ? obj = new Object();
            obj.a = j;
            obj.b = this.x;
            obj.j = this.o;
            obj.k = this.v;
            obj.g = am5.c;
            obj.h = true;
            pdf pdf = new pdf(obj);
            z68.c(str, "fileAttachDownloader.downloadAttach(%s)", pdf);
            rm rmVar = this.c;
            if (rmVar == null) {
                rmVar = null;
            }
            ((uk5) rmVar.L.getValue()).a(pdf);
        }
    }

    public final int f() {
        return DurationKt.NANOS_IN_MILLIS;
    }

    public final fbf g() {
        return new np2(this.o, 15);
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_FILE_DOWNLOAD_CMD;
    }

    public final void h(qaf qaf) {
        String str;
        z68.h(this.y, qaf.v, "fail %s", qaf);
        ha9 r = o().r(this.w);
        long j = this.a;
        if (r == null || r.Y == qe9.DELETED || (str = this.x) == null) {
            c();
            k().c(new hj0(j, qaf));
            return;
        }
        boolean areEqual = Intrinsics.areEqual((Object) "file.not.found", (Object) qaf.b);
        o().x(r.b, str, new vz0(areEqual, 5));
        k().c(new twf(0, r.z, this.w));
        if (areEqual) {
            c();
            k().c(new hj0(j, qaf));
        }
    }
}
