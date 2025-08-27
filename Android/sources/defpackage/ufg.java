package defpackage;

import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: ufg  reason: default package */
public final class ufg implements gi7 {
    public final /* synthetic */ int a;

    public /* synthetic */ ufg(int i) {
        this.a = i;
    }

    public final Object a(q4 q4Var) {
        switch (this.a) {
            case 0:
                return new vhg(yo7.d, q4Var.h(wfg.class), q4Var.h(d93.class));
            case 1:
                return new glg(q4Var.h(wfg.class));
            case 2:
                return new hhg(q4Var.h(wfg.class));
            case 3:
                return new wkg(yo7.d, q4Var.h(wfg.class), q4Var.h(d93.class));
            case 4:
                return new mgg(yo7.d, q4Var.h(wfg.class), q4Var.h(d93.class), q4Var.h(bud.class));
            case 5:
                return new rtd("Скачивание файла из мини-аппа", PmsKey.f53jsdownloaddelegate);
            default:
                return rlg.a;
        }
    }
}
