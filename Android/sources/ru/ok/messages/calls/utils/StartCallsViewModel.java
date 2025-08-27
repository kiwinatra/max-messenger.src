package ru.ok.messages.calls.utils;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/messages/calls/utils/StartCallsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "hke", "k41", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nStartCallsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartCallsViewModel.kt\nru/ok/messages/calls/utils/StartCallsViewModel\n+ 2 SavedStateHandleExt.kt\nru/ok/tamtam/shared/lifecycle/SavedStateHandleExtKt\n+ 3 LiveDataExt.kt\nru/ok/tamtam/shared/lifecycle/LiveDataExtKt\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,509:1\n7#2,16:510\n7#2,16:526\n7#2,16:542\n7#2,16:558\n77#3:574\n77#3:575\n77#3:576\n77#3:577\n77#3:578\n77#3:579\n77#3:580\n77#3:581\n77#3:597\n77#3:598\n17#4:582\n19#4:586\n56#4:587\n59#4:591\n17#4:592\n19#4:596\n46#5:583\n51#5:585\n46#5:588\n51#5:590\n46#5:593\n51#5:595\n105#6:584\n105#6:589\n105#6:594\n*S KotlinDebug\n*F\n+ 1 StartCallsViewModel.kt\nru/ok/messages/calls/utils/StartCallsViewModel\n*L\n58#1:510,16\n60#1:526,16\n62#1:542,16\n64#1:558,16\n144#1:574\n150#1:575\n171#1:576\n189#1:577\n199#1:578\n227#1:579\n254#1:580\n280#1:581\n313#1:597\n406#1:598\n285#1:582\n285#1:586\n286#1:587\n286#1:591\n287#1:592\n287#1:596\n285#1:583\n285#1:585\n286#1:588\n286#1:590\n287#1:593\n287#1:595\n285#1:584\n286#1:589\n287#1:594\n*E\n"})
public final class StartCallsViewModel extends AndroidViewModel {
    public static final /* synthetic */ KProperty[] t;
    public static final String u = "StartCallsViewModel";
    public final Application d;
    public final doa e;
    public final w21 f;
    public final nd g;
    public final r62 h;
    public final gaf i;
    public final l34 j;
    public final m34 k;
    public final n34 l;
    public final o34 m;
    public final xme n;
    public final etc o;
    public final xme p;
    public final xme q;
    public final xme r;
    public final etc s;

    static {
        Class<StartCallsViewModel> cls = StartCallsViewModel.class;
        t = new KProperty[]{rae.s(cls, "lastStartCall", "getLastStartCall()Lru/ok/tamtam/calls/StartCall;", 0), rae.s(cls, "needCallDialog", "getNeedCallDialog()Z", 0), rae.s(cls, ApiProtocol.PARAM_IS_VIDEO, "isVideo()Z", 0), rae.s(cls, "isMuted", "isMuted()Z", 0)};
    }

    public StartCallsViewModel(Application application, hdd hdd, doa doa, w21 w21, nd ndVar, r62 r62, gaf gaf) {
        super(application);
        this.d = application;
        this.e = doa;
        this.f = w21;
        this.g = ndVar;
        this.h = r62;
        this.i = gaf;
        this.j = new l34(hdd, 1);
        this.k = new m34(hdd, 1);
        this.l = new n34(hdd, 1);
        this.m = new o34(hdd, 1);
        xme a = f6e.a((Object) null);
        this.n = a;
        this.o = new etc(a);
        xme a2 = f6e.a((Object) null);
        this.p = a2;
        kv0.j(a2, (CoroutineContext) null, 3);
        xme a3 = f6e.a((Object) null);
        this.q = a3;
        kv0.j(new etc(a3), (CoroutineContext) null, 3);
        xme a4 = f6e.a((Object) null);
        this.r = a4;
        this.s = new etc(a4);
    }

    public final boolean j() {
        return ((Boolean) this.m.getValue(this, t[3])).booleanValue();
    }

    public final boolean k() {
        return ((Boolean) this.l.getValue(this, t[2])).booleanValue();
    }

    public final void l(pje pje, boolean z) {
        this.f.getClass();
        f41 f41 = new f41(pje, false, z);
        KProperty[] kPropertyArr = t;
        this.j.setValue(this, kPropertyArr[0], pje);
        this.l.setValue(this, kPropertyArr[2], Boolean.valueOf(z));
        this.m.setValue(this, kPropertyArr[3], Boolean.FALSE);
        o85 o85 = new o85(new fke(f41));
        xme xme = this.n;
        xme.getClass();
        xme.m((Object) null, o85);
        if ((pje instanceof lje) && ((lje) pje).c) {
            kyd kyd = new kyd(new i21(new zjb(new on2(new etc(this.h.E), 28), pje, 7), this, pje, 5), 3);
            osa osa = (osa) this.i;
            bs0.K(bs0.F(new ps5(bs0.F(kyd, osa.a()), new lke(this, (Continuation) null), 5), osa.c()), b0h.C(this));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r6v4, types: [bke] */
    /* JADX WARNING: type inference failed for: r6v5, types: [ake] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m() {
        /*
            r12 = this;
            kotlin.reflect.KProperty[] r0 = t
            r1 = 0
            r2 = r0[r1]
            l34 r3 = r12.j
            java.lang.Object r2 = r3.getValue(r12, r2)
            pje r2 = (defpackage.pje) r2
            if (r2 != 0) goto L_0x0010
            return
        L_0x0010:
            r0 = r0[r1]
            r4 = 0
            r3.setValue(r12, r0, r4)
            boolean r0 = r2 instanceof defpackage.lje
            xme r3 = r12.p
            w21 r5 = r12.f
            if (r0 == 0) goto L_0x0036
            lje r2 = (defpackage.lje) r2
            r5.getClass()
            ake r0 = new ake
            boolean r10 = r12.k()
            boolean r11 = r12.j()
            w21 r7 = r12.f
            long r8 = r2.b
            r6 = r0
            r6.<init>(r7, r8, r10, r11)
            goto L_0x008f
        L_0x0036:
            boolean r0 = r2 instanceof defpackage.mje
            if (r0 == 0) goto L_0x0074
            doa r0 = r12.e
            boolean r6 = r0.e()
            if (r6 == 0) goto L_0x0049
            boolean r0 = r0.f()
            if (r0 != 0) goto L_0x0049
            r1 = 1
        L_0x0049:
            mje r2 = (defpackage.mje) r2
            d4g r0 = r2.a
            java.lang.String r2 = r0.b
            r5.getClass()
            if (r1 == 0) goto L_0x0066
            defpackage.hsg.l(r3)
            yje r1 = new yje
            boolean r2 = r12.k()
            boolean r6 = r12.j()
            r1.<init>(r5, r0, r2, r6)
        L_0x0064:
            r0 = r1
            goto L_0x008f
        L_0x0066:
            xje r1 = new xje
            boolean r2 = r12.k()
            boolean r5 = r12.j()
            r1.<init>(r0, r2, r5)
            goto L_0x0064
        L_0x0074:
            boolean r0 = r2 instanceof defpackage.oje
            if (r0 == 0) goto L_0x009f
            oje r2 = (defpackage.oje) r2
            r5.getClass()
            bke r0 = new bke
            boolean r10 = r12.k()
            boolean r11 = r12.j()
            w21 r7 = r12.f
            long r8 = r2.a
            r6 = r0
            r6.<init>(r7, r8, r10, r11)
        L_0x008f:
            defpackage.hsg.l(r3)
            o85 r1 = new o85
            r1.<init>(r0)
            xme r12 = r12.n
            r12.getClass()
            r12.m(r4, r1)
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.calls.utils.StartCallsViewModel.m():void");
    }
}
