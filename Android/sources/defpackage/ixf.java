package defpackage;

import java.io.File;
import kotlin.Result;
import kotlin.ResultKt;

/* renamed from: ixf  reason: default package */
public final /* synthetic */ class ixf implements qk3, ice, zi6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kxf b;

    public /* synthetic */ ixf(kxf kxf, int i) {
        this.a = i;
        this.b = kxf;
    }

    public void accept(Object obj) {
        z68.f("jxf", "removeUploadFromRepository: failed, data=" + this.b, (Throwable) obj);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                dzf dzf = (dzf) obj;
                kxf kxf = this.b;
                String str = kxf.a;
                dzf.getClass();
                d7d a2 = d7d.a(3, "SELECT * FROM uploads WHERE path=? AND upload_type=? AND last_modified=? LIMIT 1");
                if (str == null) {
                    a2.X(1);
                } else {
                    a2.h(1, str);
                }
                a2.k(2, (long) kxf.c.a);
                a2.k(3, kxf.b);
                return new bi8(new azf(dzf, a2, 0));
            default:
                dzf dzf2 = (dzf) obj;
                kxf kxf2 = this.b;
                String str2 = kxf2.a;
                dzf2.getClass();
                return new qa3(2, new bzf(dzf2, str2, kxf2.c, kxf2.b));
        }
    }

    public void h(pbe pbe) {
        Long l;
        z68.c("jxf", "checkSourceFileChanged: started", new Object[0]);
        kxf kxf = this.b;
        String str = kxf.a;
        try {
            Result.Companion companion = Result.Companion;
            l = Result.m23constructorimpl(Long.valueOf(new File(str).lastModified()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            l = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m29isFailureimpl(l)) {
            l = 0L;
        }
        long longValue = ((Number) l).longValue();
        boolean z = (longValue == 0 || longValue == kxf.b) ? false : true;
        if (pbe.f()) {
            return;
        }
        if (z) {
            pbe.onError(new RuntimeException("failed to upload, file changed"));
            return;
        }
        z68.c("jxf", "checkSourceFileChanged: finished", new Object[0]);
        pbe.a(kxf);
    }
}
