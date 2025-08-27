package defpackage;

import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* renamed from: pf3  reason: default package */
public final class pf3 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ wf3 b;
    public final /* synthetic */ Lazy c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pf3(wf3 wf3, Lazy lazy, Continuation continuation) {
        super(2, continuation);
        this.b = wf3;
        this.c = lazy;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        pf3 pf3 = new pf3(this.b, this.c, continuation);
        pf3.a = obj;
        return pf3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pf3) create((see) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        see see = (see) this.a;
        if (see instanceof qee) {
            wf3 wf3 = this.b;
            try {
                Result.Companion companion = Result.Companion;
                String str2 = wf3.v;
                StringBuilder sb = new StringBuilder();
                int length = str2.length();
                for (int i = 0; i < length; i++) {
                    char charAt = (char) str2.charAt(i);
                    if (Character.isDigit((char) charAt)) {
                        sb.append(charAt);
                    }
                }
                String sb2 = sb.toString();
                int coerceAtLeast = RangesKt.coerceAtLeast(sb2.length() - 3, 3);
                str = Result.m23constructorimpl("+" + StringsKt.replaceRange((CharSequence) sb2, 3, coerceAtLeast, (CharSequence) StringsKt__StringsJVMKt.repeat("*", coerceAtLeast - 3)).toString());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                str = Result.m23constructorimpl(ResultKt.createFailure(th));
            }
            String str3 = this.b.v;
            if (Result.m29isFailureimpl(str)) {
                str = str3;
            }
            String str4 = (String) str;
            qee qee = (qee) see;
            v88 v88 = qee.a;
            if (v88 instanceof q88) {
                ((e24) this.c.getValue()).a((String) null, new y88(rae.p("Code: '", this.b.B0, "', Phone: '", str4, "'"), qee.a.b));
            } else if (v88 instanceof r88) {
                ((e24) this.c.getValue()).a((String) null, new y88(str4, 0));
            } else if (v88 instanceof s88) {
                ((e24) this.c.getValue()).a((String) null, new y88(str4, 1));
            } else if (!(v88 instanceof u88)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.b.B0 = null;
        return Unit.INSTANCE;
    }
}
