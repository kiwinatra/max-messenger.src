package ru.ok.messages.stickers;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.messages.views.fragments.base.FrgBaseNonUi;
import ru.ok.tamtam.android.prefs.PmsKey;

public class FrgStickersLoader extends FrgBaseNonUi {
    public final HashSet B1 = new HashSet();
    public long C1;
    public List D1 = new CopyOnWriteArrayList();
    public boolean E1 = false;
    public long F1;
    public long G1;
    public long H1;
    public long I1;
    public st J1;
    public long K1;
    public boolean L1;
    public String M1;

    public final void h3() {
        z68.c("ru.ok.messages.stickers.FrgStickersLoader", "loadInitial", new Object[0]);
        l3();
        this.E1 = false;
        a32 a32 = null;
        this.M1 = null;
        z68.c("ru.ok.messages.stickers.FrgStickersLoader", "updateStickersFromCache", new Object[0]);
        this.D1.clear();
        if (this.C1 > 0) {
            a32 = this.q1.g().G(this.C1);
        }
        if (a32 == null) {
            moe x = this.q1.x();
            x.getClass();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : x.b.entrySet()) {
                mmd mmd = (mmd) entry.getValue();
                if (mmd.a == 2 && !((String) entry.getKey()).equals("ONBOARDING")) {
                    arrayList.add((vte) mmd);
                }
            }
            this.D1 = arrayList;
        } else {
            ArrayList b = this.q1.x().b(a32, a32.b.z, false);
            if (b.isEmpty()) {
                moe x2 = this.q1.x();
                cud cud = ym.v.c().b;
                cud.getClass();
                b = x2.b(a32, cud.v(PmsKey.f107stickersections, akd.p), true);
            }
            this.D1.addAll(b);
        }
        if (this.D1.isEmpty()) {
            this.G1 = ((jna) ((qra) ym.e()).e()).h(0, 0);
            return;
        }
        for (int size = this.D1.size() - 1; size >= 0; size--) {
            if (((vte) this.D1.get(size)).v > 0) {
                this.K1 = ((vte) this.D1.get(size)).v;
            }
        }
        this.L1 = true;
        k3();
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        z68.a("ru.ok.messages.stickers.FrgStickersLoader", "onCreate");
        this.C1 = this.x.getLong("ru.ok.tamtam.extra.CHAT_ID");
    }

    public final void i3() {
        if (this.F1 == 0) {
            z68.c("ru.ok.messages.stickers.FrgStickersLoader", "loadNext", new Object[0]);
            rl e = ((qra) ym.e()).e();
            long j = this.K1;
            jna jna = (jna) e;
            this.F1 = jna.z(jna, new bu(((ltb) jna.D()).a.n(), this.M1, j));
        }
    }

    public final void j3(st stVar) {
        List list = stVar.b.c;
        for (vte vte : this.D1) {
            Iterator it = vte.o.iterator();
            while (it.hasNext()) {
                Long l = (Long) it.next();
                l.getClass();
                list.remove(l);
            }
        }
        fu fuVar = stVar.b;
        z68.c("ru.ok.messages.stickers.FrgStickersLoader", "onAssetsGet, size = %d", Integer.valueOf(fuVar.c.size()));
        long j = fuVar.w;
        this.K1 = j;
        this.L1 = j != 0;
        if (this.D1.isEmpty()) {
            this.D1.add(new vte("", (String) null, fuVar.c, 0));
        } else {
            ((vte) a81.i(1, this.D1)).o.addAll(fuVar.c);
        }
        k3();
        l3();
    }

    public final void k3() {
        Iterator it = this.B1.iterator();
        while (it.hasNext()) {
            pse pse = (pse) it.next();
            if (pse != null) {
                pse.v(this.D1);
            }
        }
    }

    public final void l3() {
        z68.a("ru.ok.messages.stickers.FrgStickersLoader", "resetRequestIds");
        this.I1 = 0;
        this.H1 = 0;
        this.F1 = 0;
        this.G1 = 0;
    }

    public final void m3(String str) {
        z68.c("ru.ok.messages.stickers.FrgStickersLoader", "search = %s", str);
        if (TextUtils.equals(this.M1, str)) {
            k3();
            return;
        }
        this.M1 = str;
        l3();
        this.D1.clear();
        this.L1 = false;
        this.E1 = false;
        k3();
        n3();
    }

    public final void n3() {
        if (this.H1 == 0) {
            z68.c("ru.ok.messages.stickers.FrgStickersLoader", "searchNext", new Object[0]);
            rl e = ((qra) ym.e()).e();
            jna jna = (jna) e;
            this.H1 = jna.z(jna, new bu(((ltb) jna.D()).a.n(), this.M1, 0));
        }
    }

    public final void o3(ArrayList arrayList) {
        if (this.I1 == 0) {
            z68.c("ru.ok.messages.stickers.FrgStickersLoader", "assetsGetByIdsRequestId", new Object[0]);
            this.I1 = ((qra) ym.e()).e().c(2, arrayList);
        }
    }

    @oye
    public void onEvent(ru ruVar) {
        if (ruVar.a == this.G1 || ruVar.b == this.C1) {
            z68.a("ru.ok.messages.stickers.FrgStickersLoader", "onEvent: AssetsUpdateEvent");
            h3();
        }
    }

    @oye
    public void onEvent(st stVar) {
        long j = stVar.a;
        if (j == this.F1 || j == this.H1) {
            z68.c("ru.ok.messages.stickers.FrgStickersLoader", "onEvent: AssetGetEvent", new Object[0]);
            ArrayList f = this.q1.x().f(stVar.b.c);
            if (f.isEmpty()) {
                j3(stVar);
                return;
            }
            z68.c("ru.ok.messages.stickers.FrgStickersLoader", "onEvent: assets by ids", new Object[0]);
            this.J1 = stVar;
            o3(f);
        }
    }

    @oye
    public void onEvent(eu euVar) {
        if (euVar.a == this.I1) {
            j3(this.J1);
            this.J1 = null;
        }
    }

    @oye
    public void onEvent(hj0 hj0) {
        st stVar;
        long j = hj0.a;
        if (j == this.F1) {
            this.F1 = 0;
            i3();
        } else if (j == this.H1) {
            this.H1 = 0;
            n3();
        } else if (j == this.I1 && (stVar = this.J1) != null && stVar.b != null) {
            this.I1 = 0;
            o3(this.q1.x().f(this.J1.b.c));
        }
    }
}
