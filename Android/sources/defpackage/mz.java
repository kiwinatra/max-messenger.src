package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: mz  reason: default package */
public final class mz extends SuspendLambda implements Function2 {
    public final /* synthetic */ oz a;
    public final /* synthetic */ ha9 b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ boolean o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mz(oz ozVar, ha9 ha9, Long l, boolean z, Continuation continuation) {
        super(2, continuation);
        this.a = ozVar;
        this.b = ha9;
        this.c = l;
        this.o = z;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new mz(this.a, this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mz) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        l20 l20;
        String str;
        String A;
        x10 x10;
        Object obj2;
        boolean z;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        oz ozVar = this.a;
        ozVar.getClass();
        ha9 ha9 = this.b;
        if (ha9.q()) {
            ha9 = ha9.A0;
        }
        w28 w28 = ha9.x0;
        Integer num = null;
        if (w28 == null || w28.G() <= 0) {
            w28 = null;
        }
        boolean z2 = this.o;
        if (w28 == null) {
            return TuplesKt.to(null, z2 ? Integer.valueOf(had.d) : null);
        }
        Long l = this.c;
        int i = -1;
        if (l != null) {
            Iterator it = ((List) w28.b).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                l20 l202 = (l20) obj2;
                g20 g20 = l202.a;
                int i2 = g20 == null ? -1 : kz.$EnumSwitchMapping$0[g20.ordinal()];
                if (i2 == 1) {
                    x10 x102 = l202.b;
                    z = Intrinsics.areEqual((Object) x102 != null ? Long.valueOf(x102.y) : null, (Object) l);
                    continue;
                } else if (i2 == 2) {
                    k20 k20 = l202.d;
                    z = Intrinsics.areEqual((Object) k20 != null ? Long.valueOf(k20.a) : null, (Object) l);
                    continue;
                } else if (i2 == 3) {
                    c20 c20 = l202.g;
                    z = Intrinsics.areEqual((Object) c20 != null ? Long.valueOf(c20.a) : null, (Object) l);
                    continue;
                } else if (i2 == 4) {
                    s10 s10 = l202.j;
                    z = Intrinsics.areEqual((Object) s10 != null ? Long.valueOf(s10.a) : null, (Object) l);
                    continue;
                } else if (i2 == 5) {
                    i10 i10 = l202.e;
                    z = Intrinsics.areEqual((Object) i10 != null ? Long.valueOf(i10.a) : null, (Object) l);
                    continue;
                } else {
                    throw new IllegalStateException(("Attach with given id = " + l + " not found").toString());
                }
                if (z) {
                    break;
                }
            }
            if (obj2 != null) {
                l20 = (l20) obj2;
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            l20 = w28.F(0);
            if (l20 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        if (l20.f()) {
            x10 x103 = l20.b;
            if (x103.v) {
                str = x103.Y;
                if (str == null) {
                    str = x103.a();
                }
            } else {
                str = x103.a();
            }
        } else if (l20.i()) {
            str = l20.d.c;
        } else {
            if (l20.h()) {
                f20 f20 = l20.f;
                str = f20.h;
                if (cvg.A(str)) {
                    A = f20.b;
                }
            } else {
                if (l20.g()) {
                    c20 c202 = l20.g;
                    if (c202.a() && (x10 = c202.f) != null) {
                        str = x10.a();
                    }
                } else if (l20.c()) {
                    l20 l203 = l20.j.d;
                    if (l203 != null) {
                        g20 g202 = l203.a;
                        if (g202 != null) {
                            i = kz.$EnumSwitchMapping$0[g202.ordinal()];
                        }
                        if (i == 1) {
                            x10 x104 = l203.b;
                            if (!x104.v) {
                                String str2 = x104.b;
                                if (str2 == null || str2.length() == 0) {
                                    String str3 = x104.a;
                                    if (!(str3 == null || str3.length() == 0)) {
                                        A = cjf.A(str3, kl0.b, jl0.a);
                                    }
                                } else {
                                    A = str2;
                                }
                            }
                        } else if (i == 2) {
                            A = l203.d.c;
                        }
                        A = null;
                    }
                } else if (l20.b()) {
                    Lazy lazy = ozVar.h;
                    n10 n10 = l20.k;
                    str = ((bl3) lazy.getValue()).a(((bl3) lazy.getValue()).b(n10), n10);
                }
                str = null;
            }
            str = A;
        }
        if (l20.e()) {
            num = Integer.valueOf(had.b);
        } else if (l20.c()) {
            num = Integer.valueOf(had.a);
        } else if (l20.a()) {
            num = Integer.valueOf(had.c);
        } else if (z2) {
            num = Integer.valueOf(had.d);
        }
        return TuplesKt.to(str, num);
    }
}
