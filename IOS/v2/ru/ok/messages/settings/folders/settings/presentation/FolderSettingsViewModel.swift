package ru.ok.messages.settings.folders.settings.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/ok/messages/settings/folders/settings/presentation/FolderSettingsViewModel;", "Lyag;", "f56", "y46", "x46", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class FolderSettingsViewModel extends yag {
    public final q46 c;
    public final j16 d;
    public final u82 e;
    public final fq f;
    public final nd g;
    public final gaf h;
    public final xme i;
    public final etc j;
    public final xme k;
    public final etc l;
    public String m;
    public Integer n;
    public x16 o;
    public final List p;

    public FolderSettingsViewModel(q46 q46, j16 j16, u82 u82, jua jua, fq fqVar, nd ndVar, gaf gaf) {
        this.c = q46;
        this.d = j16;
        this.e = u82;
        this.f = fqVar;
        this.g = ndVar;
        this.h = gaf;
        xme a = f6e.a(y46.d);
        this.i = a;
        this.j = new etc(a);
        xme a2 = f6e.a((Object) null);
        this.k = a2;
        this.l = new etc(a2);
        this.p = CollectionsKt.listOf(new xv3(lic.change_folder_action, nad.g0, jua.a.getString(qad.L2)), new xv3(lic.disable_folder_action, nad.P1, jua.a.getString(qad.f3)));
        bs0.K(bs0.F(new ps5(((ia2) u82).j(), new t46(this, (Continuation) null), 5), ((osa) gaf).a()), b0h.C(this));
    }

    public final void j(x16 x16, boolean z) {
        xme xme = this.i;
        y46 y46 = (y46) xme.getValue();
        if (y46.c != null) {
            y46 a = y46.a(y46);
            xme.getClass();
            xme.m((Object) null, a);
        }
        ev0.v(b0h.C(this), ((osa) this.h).a(), (f14) null, new a56(z, this, x16, (Continuation) null), 2);
    }

    public final void k() {
        xme xme = this.i;
        y46 y46 = (y46) xme.getValue();
        if (y46.c != null) {
            y46 a = y46.a(y46);
            xme.getClass();
            xme.m((Object) null, a);
            return;
        }
        o85 o85 = new o85(u46.a);
        xme xme2 = this.k;
        xme2.getClass();
        xme2.m((Object) null, o85);
    }
}
