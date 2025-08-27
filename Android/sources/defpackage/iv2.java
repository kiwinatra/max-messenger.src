package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: iv2  reason: default package */
public final class iv2 extends SuspendLambda implements Function2 {
    public uu2 a;
    public long b;
    public int c;
    public /* synthetic */ Object o;
    public final /* synthetic */ ov2 v;
    public final /* synthetic */ String w;
    public final /* synthetic */ List x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iv2(ov2 ov2, String str, List list, Continuation continuation) {
        super(2, continuation);
        this.v = ov2;
        this.w = str;
        this.x = list;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        iv2 iv2 = new iv2(this.v, this.w, this.x, continuation);
        iv2.o = obj;
        return iv2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((iv2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        d14 d14;
        uu2 uu2;
        long j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 = (d14) this.o;
            if (!Intrinsics.areEqual((Object) ((vu2) this.v.C0.getValue()).b, (Object) this.w)) {
                return Unit.INSTANCE;
            }
            uu2 = this.x.isEmpty() ^ true ? uu2.o : uu2.v;
            long nanoTime = System.nanoTime();
            z68.i(this.v.H0, "chats search: start UI mapping", (Throwable) null);
            Iterable<Object> iterable = this.x;
            ov2 ov2 = this.v;
            jx3 a2 = e14.a(getContext());
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            for (Object hv2 : iterable) {
                arrayList.add(ev0.d(a2, (q04) null, new hv2(hv2, (Continuation) null, ov2), 3));
            }
            this.o = d14;
            this.a = uu2;
            this.b = nanoTime;
            this.c = 1;
            obj = j4b.g(arrayList, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            j = nanoTime;
        } else if (i == 1) {
            j = this.b;
            uu2 = this.a;
            d14 = (d14) this.o;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d14 d142 = d14;
        uu2 uu22 = uu2;
        d14 d143 = d142;
        List<ykd> list = (List) obj;
        String str = this.v.H0;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.v;
            Duration.Companion companion = Duration.Companion;
            a67.d(w78, str, a81.m("chats search: UI mapping finish: ", Duration.m1402toStringimpl(DurationKt.toDuration(System.nanoTime() - j, DurationUnit.NANOSECONDS))), (Throwable) null);
        }
        if (!Intrinsics.areEqual((Object) ((vu2) this.v.C0.getValue()).b, (Object) this.w)) {
            return Unit.INSTANCE;
        }
        z68.i(this.v.H0, "chats search: update_search_state", (Throwable) null);
        ArrayList arrayList2 = new ArrayList(list.size());
        jz9 jz9 = new jz9((Object) null);
        jz9 jz92 = new jz9((Object) null);
        jz9 jz93 = new jz9((Object) null);
        for (ykd ykd : list) {
            if (!e14.f(d143)) {
                break;
            }
            if (ykd instanceof pp2) {
                pp2 pp2 = (pp2) ykd;
                if (!jz9.a(pp2.c)) {
                    jz9.e(pp2.c);
                    arrayList2.add(ykd);
                }
            }
            if (ykd instanceof bs3) {
                bs3 bs3 = (bs3) ykd;
                if (!jz92.a(bs3.c)) {
                    jz92.e(bs3.c);
                    arrayList2.add(ykd);
                }
            }
            if (ykd instanceof ge9) {
                ge9 ge9 = (ge9) ykd;
                if (!jz93.a(ge9.v.a)) {
                    jz93.e(ge9.v.a);
                    arrayList2.add(ykd);
                }
            }
            arrayList2.add(ykd);
        }
        if (!e14.f(d143) || !Intrinsics.areEqual((Object) ((vu2) this.v.C0.getValue()).b, (Object) this.w)) {
            return Unit.INSTANCE;
        }
        if (arrayList2.size() != list.size()) {
            IllegalStateException illegalStateException = new IllegalStateException(wj6.h(list.size() - arrayList2.size(), "diff="));
            ((e24) this.v.B0.getValue()).a("ONEME-15837", illegalStateException);
            String str2 = this.v.H0;
            a67 a672 = z68.b;
            if (a672 != null && a672.c()) {
                a672.d(w78.w, str2, a81.m("found duplicates for ONEME-15837! ", illegalStateException.getMessage()), (Throwable) null);
            }
        }
        xme xme = this.v.C0;
        vu2 vu2 = (vu2) xme.getValue();
        z77 z77 = z77.d;
        if (((vu2) this.v.C0.getValue()).a == uu2.b) {
            z = false;
        }
        vu2 a3 = vu2.a(vu2, uu22, z77, arrayList2, z, 2);
        xme.getClass();
        xme.m((Object) null, a3);
        return Unit.INSTANCE;
    }
}
