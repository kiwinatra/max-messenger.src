package defpackage;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* renamed from: nn3  reason: default package */
public final class nn3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ pn3 b;
    public final /* synthetic */ oz4 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nn3(pn3 pn3, oz4 oz4, Continuation continuation) {
        super(2, continuation);
        this.b = pn3;
        this.c = oz4;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new nn3(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nn3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Unit unit;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            pn3 pn3 = this.b;
            zr3 zr3 = (zr3) pn3.w.getValue();
            oz4 oz4 = this.c;
            String str = oz4.c;
            String str2 = null;
            String obj2 = str != null ? StringsKt.trim((CharSequence) str).toString() : null;
            String str3 = oz4.f;
            String obj3 = str3 != null ? StringsKt.trim((CharSequence) str3).toString() : null;
            this.a = 1;
            zr3.getClass();
            String name = zr3.class.getName();
            StringBuilder sb = new StringBuilder("rename, id = ");
            long j = pn3.o;
            sb.append(j);
            sb.append(" => ");
            sb.append(obj2);
            sb.append(" ");
            sb.append(obj3);
            z68.c(name, sb.toString(), new Object[0]);
            Lazy lazy = zr3.a;
            vk3 p = ((km3) lazy.getValue()).p(j, false);
            if (p == null) {
                unit = Unit.INSTANCE;
            } else {
                pm3 pm3 = (pm3) CollectionsKt.firstOrNull(p.l());
                ((km3) lazy.getValue()).e(j, new im3(obj2, obj3, 1));
                Lazy lazy2 = zr3.d;
                ((sv0) lazy2.getValue()).c(new zu3(j));
                rl rlVar = (rl) zr3.c.getValue();
                String str4 = pm3 != null ? pm3.a : null;
                if (pm3 != null) {
                    str2 = pm3.b;
                }
                jna jna = (jna) rlVar;
                ts3 ts3 = r8;
                long j2 = j;
                ts3 ts32 = new ts3(5, ((ltb) jna.D()).a.n(), j, str4, str2, obj2, obj3);
                ocf.d(jna.E(), ts3, false, 0, 12);
                ((uu3) zr3.b.getValue()).b(CollectionsKt.listOf(Boxing.boxLong(j2)));
                ((sv0) lazy2.getValue()).c(new zu3(j2));
                unit = Unit.INSTANCE;
            }
            if (unit == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
