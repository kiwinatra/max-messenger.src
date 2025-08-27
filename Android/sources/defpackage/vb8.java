package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.android.MainActivity;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: vb8  reason: default package */
public final class vb8 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MainActivity a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vb8(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.a = mainActivity;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new vb8(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vb8) create((w88) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        vc7 vc7 = (vc7) qra.a.getAccessor().g(vc7.class);
        vc7.getClass();
        mc7 mc7 = mc7.a;
        Class<doa> cls = doa.class;
        boolean e = ((doa) mc7.getAccessor().g(cls)).e();
        Class<uc7> cls2 = uc7.class;
        String str = vc7.b;
        if (!e) {
            boolean e2 = ((doa) mc7.getAccessor().g(cls)).e();
            z68.c(str, "InAppReviewManagersInitializer init() InAppReviewComponent.authStorage.isAuthorized:" + e2, new Object[0]);
        } else {
            cxe cxe = (cxe) mc7.getAccessor().g(cxe.class);
            akd akd = (akd) ((bud) mc7.getAccessor().g(bud.class));
            akd.getClass();
            int i = 0;
            boolean m = akd.m(PmsKey.f39fakeinappreview, false);
            boolean z = ((a33) ((x23) mc7.getAccessor().g(x23.class))).g.getBoolean("app.enable_in_app_review_not_from_market_build", false);
            ((vpa) mc7.getAccessor().g(vpa.class)).getClass();
            if (!m) {
                xt6 xt6 = (xt6) cxe;
                if (!xt6.a()) {
                    boolean a2 = xt6.a();
                    z68.c(str, "InAppReviewManagersInitializer init() builds.isMarketBuild:true, isInAppReviewEnabledNotFromMarketBuild:" + z + ", isFakeInAppReviewEnabled:" + m + ", storeServicesInfo.areServicesAvailable:" + a2, new Object[0]);
                }
            }
            long r = akd.r(PmsKey.f48inappreviewtriggers, 0);
            qc7 qc7 = new qc7(m, vc7.a.getSharedPreferences("app_crash_prefs", 0).getLong("pref_last_crash_time", 0));
            List createListBuilder = CollectionsKt.createListBuilder();
            for (Object next : nc7.Y) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                nc7 nc7 = (nc7) next;
                if (((1 & r) << i) != 0) {
                    createListBuilder.add(nc7);
                }
                i = i2;
            }
            List<nc7> build = CollectionsKt.build(createListBuilder);
            if (build.isEmpty()) {
                z68.c(str, "InAppReviewManagersInitializer init() conditions.isEmpty", new Object[0]);
            } else {
                for (nc7 put : build) {
                    qc7.h.put(put, new Object());
                }
                if (!((xt6) cxe).a()) {
                    boolean e3 = ((doa) mc7.a.getAccessor().g(cls)).e();
                    z68.c(str, "InAppReviewManagersInitializer init() storeServicesInfo.areServicesAvailable:" + e3, new Object[0]);
                } else {
                    mc7 mc72 = mc7.a;
                    ((uc7) mc72.getAccessor().g(cls2)).getClass();
                    uc7.b = (tc7) mc72.getAccessor().g(tc7.class);
                }
            }
            vc7.c = qc7;
        }
        MainActivity mainActivity = this.a;
        int ordinal = ((lv7) mainActivity.getLifecycle()).d.ordinal();
        if (ordinal == 3) {
            int i3 = MainActivity.E0;
            mainActivity.T();
        } else if (ordinal == 4) {
            int i4 = MainActivity.E0;
            mainActivity.T();
            qra qra = qra.a;
            ((uc7) qra.getAccessor().g(cls2)).getClass();
            tc7 tc7 = uc7.b;
            if (tc7 != null) {
                qc7 r2 = qra.r();
                if (r2 != null) {
                    r2.k = tc7.e;
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        qc7 r3 = qra.a.r();
        if (r3 != null) {
            List list = qc7.p;
            r3.e((Integer) null);
        }
        return Unit.INSTANCE;
    }
}
