package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.function.UnaryOperator;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: n01  reason: default package */
public final /* synthetic */ class n01 implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n01(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, ru.ok.android.externcalls.sdk.audio.CallsAudioManager$DisabledAudioDeviceUsagePolicy] */
    /* JADX WARNING: type inference failed for: r6v2, types: [sb0, java.lang.Object] */
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                CallsAudioManager callsAudioManager = (CallsAudioManager) obj;
                if (callsAudioManager != null) {
                    return callsAudioManager;
                }
                oo1 oo1 = ((o01) this.b).a;
                oo1.getClass();
                CallsAudioManager.Builder disabledAudioDeviceUsagePolicy = new CallsAudioManager.Builder().setContext((Context) oo1.a.getValue()).setProximityTracker(oo1.c).setVideoTracker(new d9d(23, new mo1(0, oo1.b.getValue()))).setDisabledAudioDeviceUsagePolicy(new Object());
                ((vpa) oo1.d.getValue()).getClass();
                if (((akd) ((bud) oo1.e.getValue())).n() == 3) {
                    disabledAudioDeviceUsagePolicy.setLogger((lo1) oo1.f.getValue());
                }
                return disabledAudioDeviceUsagePolicy.build();
            case 1:
                bd2 bd2 = (bd2) obj;
                return (bd2) this.b;
            case 2:
                String str = (String) obj;
                return ((hr8) this.b).v();
            case 3:
                os8 os8 = (os8) obj;
                return (os8) this.b;
            case 4:
                une une = (une) obj;
                return (une) this.b;
            case 5:
                n78 n78 = (n78) obj;
                return (n78) this.b;
            case 6:
                h8b h8b = (h8b) obj;
                return (h8b) this.b;
            case 7:
                Set mutableSet = CollectionsKt.toMutableSet((Set) obj);
                mutableSet.add((dkb) this.b);
                return mutableSet;
            case 8:
                Long l = (Long) obj;
                return Long.valueOf(((fre) ((mmd) this.b)).v);
            default:
                xvd xvd = (xvd) obj;
                zbf zbf = (zbf) this.b;
                if (xvd != null) {
                    zbf.getClass();
                    xvd.d(false);
                }
                kwd kwd = zbf.a;
                cud cud = ((ltb) ((jtb) zbf.b.get())).b;
                cud.getClass();
                ? obj2 = new Object();
                obj2.b = (jwd) kwd.a;
                obj2.c = (mxd) ((Lazy) kwd.f).getValue();
                obj2.d = (ajd) ((Lazy) kwd.d).getValue();
                obj2.e = (fba) ((Lazy) kwd.c).getValue();
                obj2.f = (yh3) ((Lazy) kwd.b).getValue();
                obj2.g = (dpa) ((Lazy) kwd.e).getValue();
                obj2.a = (int) cud.r(PmsKey.f104sendqueuesize, (long) 30);
                return new xvd(obj2);
        }
    }
}
