package defpackage;

import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import kotlin.TuplesKt;
import ru.ok.messages.settings.folders.filters.presentation.FolderFiltersFragment;
import ru.ok.messages.settings.folders.settings.presentation.FolderSettingsFragment;

/* renamed from: ly5  reason: default package */
public final /* synthetic */ class ly5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;

    public /* synthetic */ ly5(Bundle bundle, int i) {
        this.a = i;
        this.b = bundle;
    }

    public final void a(e9d e9d) {
        switch (this.a) {
            case 0:
                ed6 v = ((b) te8.w(e9d)).v();
                if (v.E("ru.ok.messages.settings.folders.settings.presentation.FolderSettingsFragment") == null) {
                    a a2 = ((m46) i66.a.getAccessor().g(m46.class)).a(te8.w(e9d).getClassLoader(), FolderSettingsFragment.class.getName());
                    a2.L2(this.b);
                    xe0 xe0 = new xe0(v);
                    xe0.c((String) null);
                    hd8.T(xe0, kad.b, kad.c);
                    xe0.h(gua.n, a2, "ru.ok.messages.settings.folders.settings.presentation.FolderSettingsFragment", 1);
                    xe0.e(false);
                    return;
                }
                return;
            default:
                ed6 v2 = ((b) te8.w(e9d)).v();
                a a3 = ((m46) i66.a.getAccessor().g(m46.class)).a(te8.w(e9d).getClassLoader(), FolderFiltersFragment.class.getName());
                a3.L2(o54.f(TuplesKt.to("extra.filter.folder.id", o54.N("id", this.b))));
                v2.getClass();
                xe0 xe02 = new xe0(v2);
                xe02.c((String) null);
                hd8.T(xe02, kad.b, kad.c);
                xe02.h(gua.n, a3, "ru.ok.messages.settings.folders.filters.presentation.FolderFiltersFragment", 1);
                xe02.e(false);
                return;
        }
    }
}
