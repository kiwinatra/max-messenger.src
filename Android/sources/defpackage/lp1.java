package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: lp1  reason: default package */
public final class lp1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ sf1 b;
    public final /* synthetic */ mp1 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lp1(sf1 sf1, mp1 mp1, Continuation continuation) {
        super(2, continuation);
        this.b = sf1;
        this.c = mp1;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        lp1 lp1 = new lp1(this.b, this.c, continuation);
        lp1.a = obj;
        return lp1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lp1) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [java.lang.Object, nl] */
    public final Object invokeSuspend(Object obj) {
        Conversation a2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        d14 d14 = (d14) this.a;
        sf1 sf1 = this.b;
        int i = (sf1.b > 0 ? 1 : (sf1.b == 0 ? 0 : -1));
        boolean z = false;
        mp1 mp1 = this.c;
        if (i != 0) {
            vj5 vj5 = (vj5) ((uj5) mp1.w.getValue());
            vj5.getClass();
            if (!vj5.m(PmsKey.gce, false)) {
                z68.c("CallEngineTag", "ignore group call push=" + sf1, new Object[0]);
                return Unit.INSTANCE;
            }
        }
        z68.c("CallEngineTag", d14 + " showIncomingCall " + sf1, new Object[0]);
        long j = sf1.a;
        String str = null;
        if (((km3) mp1.C.getValue()).u(j)) {
            ev0.v(d14, ((osa) ((gaf) mp1.s.getValue())).a(), (f14) null, new kp1(mp1, j, (Continuation) null), 2);
        }
        Conversation a3 = mp1.m().a();
        boolean z2 = a3 == null || !a3.isDestroyed();
        Conversation a4 = mp1.m().a();
        if (a4 != null) {
            z = a4.isAnswered();
        }
        s44 i2 = mp1.i();
        String str2 = i2.c;
        ld9 ld9 = i2.a;
        fl1 fl1 = ld9 instanceof fl1 ? (fl1) ld9 : null;
        Long boxLong = fl1 != null ? Boxing.boxLong(fl1.r) : null;
        String str3 = sf1.c;
        String str4 = i2.c;
        if (str4 != null && !StringsKt.isBlank(str4)) {
            if (Intrinsics.areEqual((Object) str2, (Object) str3) && z2) {
                z68.c("CallEngineTag", d14 + " ignore repetitive push " + str3 + " current id " + str2, new Object[0]);
                return Unit.INSTANCE;
            } else if (z2 && boxLong != null && j == boxLong.longValue() && (a2 = mp1.m().a()) != null && a2.isCaller()) {
                z68.c("CallEngineTag", d14 + " same incoming call userId=" + j + " answered=" + z, new Object[0]);
                if (!z) {
                    mp1.d();
                }
                return Unit.INSTANCE;
            } else if (!Intrinsics.areEqual((Object) str2, (Object) str3)) {
                z68.c("CallEngineTag", d14 + " ignore incoming conversation " + str3 + " we have an active one=" + str2 + " " + sf1, new Object[0]);
                sp1.a(mp1.c).hangup(nw6.b, str3);
                return Unit.INSTANCE;
            }
        }
        z68.c("CallEngineTag", d14 + " create conversation for answer " + sf1, new Object[0]);
        mp1.h(sf1);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (str3 != null) {
            str = str3;
        }
        Unit unit = Unit.INSTANCE;
        if (str != null) {
            long j2 = sf1.a;
            boolean z3 = sf1.f;
            String str5 = sf1.g;
            ? obj2 = new Object();
            obj2.a = j2;
            obj2.b = str;
            obj2.c = str5;
            ep1 ep1 = new ep1(d14, objectRef, mp1, 1);
            f fVar = new f(4, (Object) mp1);
            c31 c31 = mp1.b;
            T b31 = new b31(sp1.a(c31.a).answer(new a31(obj2, c31.c(), c31, ep1, fVar)), new fl1(j2, z3), true, true);
            mp1.g(b31);
            objectRef.element = b31;
            return Unit.INSTANCE;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
