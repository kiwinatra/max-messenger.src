package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import ru.ok.messages.views.fragments.base.FrgBase;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: ij5  reason: default package */
public final /* synthetic */ class ij5 implements mx3, qk3, lp8, hy8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ ij5(np8 np8, Object obj, int i) {
        this.a = i;
        this.c = np8;
        this.o = obj;
        this.b = true;
    }

    public void accept(Object obj) {
        l20 I;
        long j;
        String str;
        int i;
        switch (this.a) {
            case 1:
                a89 a89 = (a89) obj;
                ll5 ll5 = (ll5) this.c;
                if (ll5.f() && ((w57) ll5.o).isActive() && ((FrgBase) ll5.c).X2() != null && (I = a89.a.x0.I(g20.X)) != null) {
                    if (((String) this.o).equals(I.q)) {
                        ll5.P(a89, I, (FrgBase) ll5.c, this.b, ll5.w0, ll5.v0, ll5.Z);
                        return;
                    }
                    return;
                }
                return;
            default:
                ehf ehf = (ehf) obj;
                xva xva = (xva) this.c;
                List list = null;
                for (vk3 vk3 : ((eu3) xva.e.getValue()).a.b.values()) {
                    if (TextUtils.equals(ehf.c, vk3.m())) {
                        if (list == null) {
                            list = new ArrayList();
                        }
                        list.add(vk3);
                    }
                }
                if (list == null) {
                    list = Collections.emptyList();
                }
                int size = list.size();
                LinkedHashSet<ta9> linkedHashSet = (LinkedHashSet) this.o;
                boolean z = false;
                if (size == 1) {
                    j = ((vk3) list.get(0)).r();
                    str = null;
                } else {
                    if (this.b || ehf.c.length() <= 1) {
                        str = null;
                    } else {
                        if (!(linkedHashSet instanceof Collection) || !linkedHashSet.isEmpty()) {
                            i = 0;
                            for (ta9 ta9 : linkedHashSet) {
                                String str2 = ta9.b;
                                if ((!(str2 == null || str2.length() == 0)) && (i = i + 1) < 0) {
                                    CollectionsKt.throwCountOverflow();
                                }
                            }
                        } else {
                            i = 0;
                        }
                        akd akd = (akd) ((bud) xva.f.getValue());
                        akd.getClass();
                        if (i < ((int) akd.r(PmsKey.mentions_entity_names_limit, (long) 3))) {
                            str = ehf.c;
                            if (str.charAt(0) == '@') {
                                str = str.substring(1);
                            }
                        } else {
                            return;
                        }
                    }
                    j = 0;
                }
                if (j != 0 || (str != null && str.length() != 0)) {
                    if (str == null || str.length() == 0) {
                        z = true;
                    }
                    String str3 = z ^ true ? str : null;
                    sa9 sa9 = sa9.a;
                    int i2 = ehf.a;
                    linkedHashSet.add(new ta9(j, str3, sa9, i2, ehf.b - i2, (Map) null));
                    return;
                }
                return;
        }
    }

    public void b(cx8 cx8) {
        iy8 iy8 = (iy8) this.c;
        iy8.getClass();
        byd q = iy8.w.q(cx8, tb7.t((ir8) this.o), -1, -9223372036854775807L);
        he heVar = new he((Object) iy8, (Object) cx8, this.b, 14);
        q.d(new uj6(0, q, heVar), dp4.a);
    }

    public void d(i67 i67, int i) {
        switch (this.a) {
            case 2:
                np8 np8 = (np8) this.c;
                np8.getClass();
                i67.e(np8.c, i, ((i30) this.o).c(), this.b);
                return;
            case 3:
                np8 np82 = (np8) this.c;
                np82.getClass();
                qb7 o2 = tb7.o();
                int i2 = 0;
                while (true) {
                    List list = (List) this.o;
                    if (i2 < list.size()) {
                        o2.a(((ir8) list.get(i2)).d(true));
                        i2++;
                    } else {
                        i67.J(np82.c, i, new gv0(o2.j()), this.b);
                        return;
                    }
                }
            default:
                np8 np83 = (np8) this.c;
                np83.getClass();
                i67.k0(np83.c, i, ((ir8) this.o).d(true), this.b);
                return;
        }
    }

    public Object n(Task task) {
        if (((Integer) task.f()).intValue() != 402) {
            return task;
        }
        boolean z = this.b;
        return ata.q((Context) this.c, (Intent) this.o, z).j(new fs(2), new ci5(18));
    }

    public /* synthetic */ ij5(xva xva, boolean z, LinkedHashSet linkedHashSet) {
        this.a = 6;
        this.c = xva;
        this.b = z;
        this.o = linkedHashSet;
    }

    public /* synthetic */ ij5(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.b = z;
    }
}
