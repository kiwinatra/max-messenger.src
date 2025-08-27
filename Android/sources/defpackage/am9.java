package defpackage;

import java.util.EnumSet;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: am9  reason: default package */
public final class am9 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ en9 c;
    public final /* synthetic */ List o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public am9(en9 en9, List list, Continuation continuation) {
        super(2, continuation);
        this.c = en9;
        this.o = list;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        am9 am9 = new am9(this.c, this.o, continuation);
        am9.b = obj;
        return am9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((am9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        String[] strArr;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 d14 = (d14) this.b;
            EnumSet<E> noneOf = EnumSet.noneOf(z93.class);
            KProperty[] kPropertyArr = en9.A1;
            en9 en9 = this.c;
            akd akd = (akd) ((bud) en9.C0.getValue());
            akd.getClass();
            List g = akd.g(PmsKey.f10availablecomplaints.name(), (List) null);
            if (g == null || (strArr = (String[]) g.toArray(new String[0])) == null) {
                strArr = new String[0];
            }
            for (String str : strArr) {
                try {
                    Result.Companion companion = Result.Companion;
                    obj2 = Result.m23constructorimpl(z93.a(str));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj2 = Result.m23constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m29isFailureimpl(obj2)) {
                    obj2 = null;
                }
                z93 z93 = (z93) obj2;
                if (z93 != null) {
                    noneOf.add(z93);
                }
            }
            if (!noneOf.isEmpty()) {
                pg3 pg3 = d89.a;
                igf igf = new igf(ewa.x);
                igf igf2 = new igf(ewa.w);
                List createListBuilder = CollectionsKt.createListBuilder();
                if (noneOf.contains(z93.SPAM)) {
                    createListBuilder.add(new pg3(cwa.k, new igf(ewa.C), og3.c));
                }
                if (noneOf.contains(z93.PORNO)) {
                    createListBuilder.add(new pg3(cwa.j, new igf(ewa.B), og3.c));
                }
                if (noneOf.contains(z93.FAKE)) {
                    createListBuilder.add(new pg3(cwa.h, new igf(ewa.z), og3.c));
                }
                if (noneOf.contains(z93.EXTREMISM)) {
                    createListBuilder.add(new pg3(cwa.g, new igf(ewa.y), og3.c));
                }
                if (noneOf.contains(z93.THREAT)) {
                    createListBuilder.add(new pg3(cwa.l, new igf(ewa.D), og3.c));
                }
                if (noneOf.contains(z93.OTHER)) {
                    createListBuilder.add(new pg3(cwa.i, new igf(ewa.A), og3.c));
                }
                createListBuilder.add(d89.a);
                Unit unit = Unit.INSTANCE;
                xag.h(en9.q1, new h8e(this.o, igf, igf2, CollectionsKt.build(createListBuilder)));
            } else {
                gc8 c2 = ((osa) en9.w).c();
                zl9 zl9 = new zl9(en9, (Continuation) null);
                this.a = 1;
                if (ev0.I(c2, zl9, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
