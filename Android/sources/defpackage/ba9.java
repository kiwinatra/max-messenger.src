package defpackage;

import kotlin.collections.CollectionsKt;

/* renamed from: ba9  reason: default package */
public final /* synthetic */ class ba9 implements x6 {
    public final /* synthetic */ fa9 a;
    public final /* synthetic */ a89 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ rf9 d;

    public /* synthetic */ ba9(fa9 fa9, a89 a89, String str, rf9 rf9) {
        this.a = fa9;
        this.b = a89;
        this.c = str;
        this.d = rf9;
    }

    public final void run() {
        fa9 fa9 = this.a;
        fa9.getClass();
        a89 a89 = this.b;
        int G = a89.a.x0.G();
        String str = this.c;
        ha9 ha9 = a89.a;
        if (G == 1) {
            long j = ha9.z;
            CollectionsKt.emptyList();
            bk3 bk3 = bl4.o;
            fa9.e.a(new nud(j, CollectionsKt.listOf(Long.valueOf(ha9.b)), (z93) null, true, ha9.S0));
        } else {
            ((a74) fa9.a).c.n(ha9.b, new a62(str, 3));
        }
        long j2 = ha9.b;
        gl5 gl5 = (gl5) this.d.c.getValue();
        gl5.getClass();
        StringBuilder sb = new StringBuilder("UploadFileAttachWorker:");
        long j3 = ha9.z;
        sb.append(j3);
        tr1.v(sb, ":", j2, ":");
        sb.append(str);
        gl5.a.c(sb.toString());
        fa9.b.c(new twf(0, j3, ha9.b));
    }
}
