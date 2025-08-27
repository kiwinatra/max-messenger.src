package defpackage;

import java.io.File;
import kotlin.Result;
import kotlin.ResultKt;

/* renamed from: nxf  reason: default package */
public final /* synthetic */ class nxf implements qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tf9 b;

    public /* synthetic */ nxf(tf9 tf9, int i) {
        this.a = i;
        this.b = tf9;
    }

    public final void accept(Object obj) {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        int i = -1;
        d20 d20 = d20.c;
        tf9 tf9 = this.b;
        j10 j10 = (j10) obj;
        switch (this.a) {
            case 0:
                j10.k = 100.0f;
                j10.i = d20;
                String str = tf9.a.b;
                j10.m = str;
                j10.u = cjf.C(str);
                g20 g20 = j10.a;
                if (g20 != null) {
                    i = oxf.$EnumSwitchMapping$0[g20.ordinal()];
                }
                bxf bxf = tf9.a;
                if (i == 1) {
                    x10 x10 = j10.b;
                    if (x10 == null) {
                        x10 = x10.Z;
                    }
                    w10 b2 = x10.b();
                    b2.g = bxf.h.a;
                    j10.b = new x10(b2);
                    return;
                } else if (i == 2) {
                    i10 i10 = j10.e;
                    if (i10 == null) {
                        i10 = i10.j;
                    }
                    h10 a2 = i10.a();
                    vyf vyf = bxf.h;
                    a2.e = vyf.a;
                    a2.a = vyf.b;
                    j10.e = new i10(a2);
                    return;
                } else if (i == 3) {
                    h20 a3 = j10.c().a();
                    vyf vyf2 = bxf.h;
                    a3.a = vyf2.b;
                    a3.h = vyf2.a;
                    j10.d = new k20(a3);
                    return;
                } else if (i == 4) {
                    r10 a4 = j10.b().a();
                    vyf vyf3 = bxf.h;
                    a4.a = vyf3.b;
                    a4.d = vyf3.a;
                    j10.r = new s10(a4);
                    return;
                } else if (i != 5) {
                    z68.f("UploadDraftMediaWorker", "Unknown attach type " + j10.a, (Throwable) null);
                    return;
                } else {
                    j10.f = qe8.s(tf9.b);
                    return;
                }
            case 1:
                j10.i = d20.v;
                bxf bxf2 = tf9.a;
                kxf kxf = bxf2.a;
                j10.m = kxf.a;
                j10.u = kxf.b;
                j10.k = bxf2.e;
                j10.o = bxf2.f;
                return;
            default:
                j10.k = 100.0f;
                j10.i = d20;
                g20 g202 = j10.a;
                if (g202 != null) {
                    i = byf.$EnumSwitchMapping$0[g202.ordinal()];
                }
                if (i == 1) {
                    String str2 = tf9.a.h.a;
                    x10 x102 = j10.b;
                    if (x102 == null) {
                        x102 = x10.Z;
                    }
                    w10 b3 = x102.b();
                    b3.g = str2;
                    j10.b = new x10(b3);
                    String str3 = tf9.a.b;
                    j10.m = str3;
                    try {
                        Result.Companion companion = Result.Companion;
                        l = Result.m23constructorimpl(Long.valueOf(new File(str3).lastModified()));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        l = Result.m23constructorimpl(ResultKt.createFailure(th));
                    }
                    if (Result.m29isFailureimpl(l)) {
                        l = 0L;
                    }
                    j10.u = ((Number) l).longValue();
                    return;
                } else if (i == 2) {
                    vyf vyf4 = tf9.a.h;
                    long j = vyf4.b;
                    i10 i102 = j10.e;
                    if (i102 == null) {
                        i102 = i10.j;
                    }
                    h10 a5 = i102.a();
                    a5.e = vyf4.a;
                    a5.a = j;
                    j10.e = new i10(a5);
                    String str4 = tf9.a.b;
                    j10.m = str4;
                    try {
                        Result.Companion companion3 = Result.Companion;
                        l2 = Result.m23constructorimpl(Long.valueOf(new File(str4).lastModified()));
                    } catch (Throwable th2) {
                        Result.Companion companion4 = Result.Companion;
                        l2 = Result.m23constructorimpl(ResultKt.createFailure(th2));
                    }
                    if (Result.m29isFailureimpl(l2)) {
                        l2 = 0L;
                    }
                    j10.u = ((Number) l2).longValue();
                    return;
                } else if (i == 3) {
                    vyf vyf5 = tf9.a.h;
                    long j2 = vyf5.b;
                    h20 a6 = j10.c().a();
                    a6.a = j2;
                    a6.h = vyf5.a;
                    j10.d = new k20(a6);
                    String str5 = tf9.a.b;
                    j10.m = str5;
                    try {
                        Result.Companion companion5 = Result.Companion;
                        l3 = Result.m23constructorimpl(Long.valueOf(new File(str5).lastModified()));
                    } catch (Throwable th3) {
                        Result.Companion companion6 = Result.Companion;
                        l3 = Result.m23constructorimpl(ResultKt.createFailure(th3));
                    }
                    if (Result.m29isFailureimpl(l3)) {
                        l3 = 0L;
                    }
                    j10.u = ((Number) l3).longValue();
                    return;
                } else if (i == 4) {
                    vyf vyf6 = tf9.a.h;
                    long j3 = vyf6.b;
                    r10 a7 = j10.b().a();
                    a7.a = j3;
                    a7.d = vyf6.a;
                    j10.r = new s10(a7);
                    String str6 = tf9.a.b;
                    j10.m = str6;
                    try {
                        Result.Companion companion7 = Result.Companion;
                        l4 = Result.m23constructorimpl(Long.valueOf(new File(str6).lastModified()));
                    } catch (Throwable th4) {
                        Result.Companion companion8 = Result.Companion;
                        l4 = Result.m23constructorimpl(ResultKt.createFailure(th4));
                    }
                    if (Result.m29isFailureimpl(l4)) {
                        l4 = 0L;
                    }
                    j10.u = ((Number) l4).longValue();
                    return;
                } else if (i == 5) {
                    j10.f = qe8.s(tf9.b);
                    String str7 = tf9.a.b;
                    j10.m = str7;
                    try {
                        Result.Companion companion9 = Result.Companion;
                        l5 = Result.m23constructorimpl(Long.valueOf(new File(str7).lastModified()));
                    } catch (Throwable th5) {
                        Result.Companion companion10 = Result.Companion;
                        l5 = Result.m23constructorimpl(ResultKt.createFailure(th5));
                    }
                    if (Result.m29isFailureimpl(l5)) {
                        l5 = 0L;
                    }
                    j10.u = ((Number) l5).longValue();
                    return;
                } else {
                    return;
                }
        }
    }
}
