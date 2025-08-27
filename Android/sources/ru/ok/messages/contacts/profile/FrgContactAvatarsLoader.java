package ru.ok.messages.contacts.profile;

import android.os.Bundle;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.messages.views.fragments.base.FrgBaseNonUi;

public class FrgContactAvatarsLoader extends FrgBaseNonUi {
    public long B1;
    public fo3 C1;
    public final ArrayList D1 = new ArrayList();
    public int E1;
    public int F1;
    public int G1;
    public long H1;
    public boolean I1;
    public sg6 J1;

    public final void h3() {
        int i = this.E1;
        if ((i == 0 || i < this.F1) && this.H1 == 0) {
            z68.c("ru.ok.messages.contacts.profile.FrgContactAvatarsLoader", "loadNext", new Object[0]);
            rl e = ((qra) ym.e()).e();
            jna jna = (jna) e;
            this.H1 = jna.z(jna, new lr3(this.E1, ((ltb) jna.D()).a.n(), this.B1));
        }
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        long j = this.x.getLong("ru.ok.tamtam.extra.CONTACT_ID", -1);
        this.B1 = j;
        if (j == -1) {
            fo3 fo3 = ((mo3) this.x.getParcelable("ru.ok.tamtam.extra.CONTACT_INFO")).a;
            this.C1 = fo3;
            if (fo3 != null) {
                this.B1 = fo3.a;
            } else {
                throw new IllegalArgumentException("contact_id or contact's SearchResult must be defined");
            }
        }
        if (!this.I1) {
            this.I1 = true;
            fo3 fo32 = this.C1;
            kl0 kl0 = kl0.v;
            kl0 kl02 = kl0.a;
            ArrayList arrayList = this.D1;
            if (fo32 != null) {
                List l = gsg.l(kl02, kl0, new rx2(21, this));
                if (!l.isEmpty()) {
                    arrayList.add(new AbstractMap.SimpleEntry(l, Long.valueOf(this.C1.w)));
                }
            } else {
                vk3 p = this.q1.i().p(this.B1, true);
                List createListBuilder = CollectionsKt.createListBuilder();
                for (kl0 kl03 : CollectionsKt.asReversed(nl0.a)) {
                    if (kl03.compareTo(kl02) >= 0 && kl03.compareTo(kl0) <= 0) {
                        jl0 jl0 = jl0.b;
                        String A = cjf.A(p.a.c.d, kl03, jl0);
                        if (A != null) {
                            createListBuilder.add(A);
                        }
                        jl0 jl02 = jl0.a;
                        vm3 vm3 = p.a;
                        String A2 = cjf.A(vm3.c.d, kl03, jl02);
                        if (A2 != null) {
                            createListBuilder.add(A2);
                        }
                        um3 um3 = vm3.c;
                        String A3 = cjf.A(um3.c, kl03, jl0);
                        if (A3 != null) {
                            createListBuilder.add(A3);
                        }
                        String A4 = cjf.A(um3.c, kl03, jl02);
                        if (A4 != null) {
                            createListBuilder.add(A4);
                        }
                    }
                }
                List build = CollectionsKt.build(createListBuilder);
                if (!build.isEmpty()) {
                    arrayList.add(new AbstractMap.SimpleEntry(build, Long.valueOf(p.a.c.e)));
                }
            }
            int size = arrayList.size();
            this.G1 = size;
            sg6 sg6 = this.J1;
            if (sg6 != null) {
                ((ActContactAvatars) sg6).W(size, arrayList);
            }
            h3();
        }
    }

    @oye
    public void onEvent(nr3 nr3) {
        List list;
        if (this.H1 == nr3.a && (list = nr3.b) != null) {
            this.H1 = 0;
            if (list.isEmpty()) {
                this.E1 = IntCompanionObject.MAX_VALUE;
                return;
            }
            z68.c("ru.ok.messages.contacts.profile.FrgContactAvatarsLoader", "onEvent = " + nr3, new Object[0]);
            this.E1 = list.size() + this.E1;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ArrayList arrayList = this.D1;
            linkedHashSet.addAll(arrayList);
            linkedHashSet.addAll(list);
            arrayList.clear();
            arrayList.addAll(linkedHashSet);
            int i = nr3.c;
            this.F1 = i;
            sg6 sg6 = this.J1;
            if (sg6 != null) {
                ((ActContactAvatars) sg6).W(i + this.G1, arrayList);
            }
        }
    }

    @oye
    public void onEvent(hj0 hj0) {
        if (this.H1 == hj0.a) {
            this.H1 = 0;
            h3();
        }
    }
}
