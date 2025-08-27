package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;

/* renamed from: i11  reason: default package */
public final class i11 extends xag {
    public final h11 X;
    public final eng b;
    public final ph1 c;
    public final Lazy o;
    public final Lazy v;
    public final Lazy w;
    public final i21 x;
    public final etc y;
    public final pc z;

    public i11(eng eng, ph1 ph1) {
        Lazy h = m21.a.getAccessor().h(edb.class);
        oh1 oh1 = oh1.a;
        Lazy h2 = oh1.getAccessor().h(ap1.class);
        Lazy h3 = oh1.getAccessor().h(tq1.class);
        this.b = eng;
        this.c = ph1;
        this.o = h2;
        this.v = h;
        this.w = h3;
        jj1 jj1 = (jj1) ph1;
        this.x = new i21((k6e) ((ap1) h2.getValue()).r.getValue(), jj1.G0, new c11(3, (Continuation) null, 0), 4);
        etc etc = jj1.C0;
        pc pcVar = new pc(etc, 8);
        aj8 aj8 = aj8.v;
        pr0 pr0 = new pr0(aj8, aj8, new s41(CallsAudioDeviceInfo.Companion.getNONE()));
        this.y = bs0.X(pcVar, this.a, z6e.a, pr0);
        this.z = new pc(etc, 9);
        this.X = new h11(new sbd(new ys5(TimeUnit.MILLISECONDS, (Continuation) null)), h2, 0);
    }

    public final ArrayList j() {
        Set<CallsAudioDeviceInfo> set;
        List<CallsAudioDeviceInfo> availableAudioDevices;
        CallsAudioManager callsAudioManager = (CallsAudioManager) ((o01) k().b).c.get();
        if (callsAudioManager == null || (availableAudioDevices = callsAudioManager.getAvailableAudioDevices()) == null || (set = CollectionsKt.toSet(availableAudioDevices)) == null) {
            set = SetsKt.emptySet();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
        for (CallsAudioDeviceInfo b2 : set) {
            arrayList.add(ke8.b(b2, ((jj1) this.c).n()));
        }
        return arrayList;
    }

    public final ap1 k() {
        return (ap1) this.o.getValue();
    }

    public final void l(aj8 aj8) {
        Lazy lazy = this.v;
        String[] strArr = edb.h;
        if (!((edb) lazy.getValue()).b(strArr)) {
            edb edb = (edb) lazy.getValue();
            int i = sqa.c;
            edb.getClass();
            int i2 = bmc.permissions_audio_title;
            int i3 = aza.e;
            eng eng = this.b;
            if (edb.i(eng, strArr)) {
                eng.c(strArr, 160, i2, i, i3);
            } else {
                edb.f(eng, strArr, 160);
            }
        } else {
            tq1 tq1 = (tq1) this.w.getValue();
            String str = k().b().c;
            aj8.a.getClass();
            boolean r = nfd.r(aj8);
            boolean z2 = k().b().h;
            tq1.getClass();
            tq1.a(tq1, "AUDIO_ENABLED", str, (String) null, Integer.valueOf(r ? 1 : 0), (String) null, (String) null, z2, 52);
            ap1 k = k();
            boolean r2 = nfd.r(aj8);
            ((o01) k.b).e(r2);
            if (r2) {
                ((sz9) k.p.getValue()).d(Boolean.FALSE);
            }
        }
    }

    public final boolean m() {
        Set set;
        Object obj;
        List<CallsAudioDeviceInfo> availableAudioDevices;
        ap1 k = k();
        o01 o01 = (o01) k.b;
        CallsAudioManager callsAudioManager = (CallsAudioManager) o01.c.get();
        if (callsAudioManager == null || (availableAudioDevices = callsAudioManager.getAvailableAudioDevices()) == null || (set = CollectionsKt.toSet(availableAudioDevices)) == null) {
            set = SetsKt.emptySet();
        }
        if (set.isEmpty()) {
            return false;
        }
        if (set.size() >= 3) {
            return true;
        }
        CallsAudioDeviceInfo b2 = o01.b();
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((CallsAudioDeviceInfo) obj).getDeviceType() != b2.getDeviceType()) {
                break;
            }
        }
        CallsAudioDeviceInfo callsAudioDeviceInfo = (CallsAudioDeviceInfo) obj;
        if (callsAudioDeviceInfo != null) {
            b2 = callsAudioDeviceInfo;
        }
        k.h(b2);
        return false;
    }

    public final void n(aj8 aj8) {
        Lazy lazy = this.v;
        boolean b2 = ((edb) lazy.getValue()).b(edb.l);
        Lazy lazy2 = this.w;
        if (!b2) {
            tq1 tq1 = (tq1) lazy2.getValue();
            String str = k().b().c;
            boolean z2 = k().b().h;
            tq1.getClass();
            tq1.a(tq1, "REQUEST_PERMISSION_CAM", str, "DURING_CALL", (Integer) null, (String) null, (String) null, z2, 56);
            ((edb) lazy.getValue()).h(this.b);
        } else if (!k().h.c()) {
            tq1 tq12 = (tq1) lazy2.getValue();
            String str2 = k().b().c;
            aj8.a.getClass();
            boolean r = nfd.r(aj8);
            boolean z3 = k().b().h;
            tq12.getClass();
            tq1.a(tq12, "VIDEO_ENABLED", str2, (String) null, Integer.valueOf(r ? 1 : 0), (String) null, (String) null, z3, 52);
            k().d(nfd.r(aj8));
        }
    }
}
