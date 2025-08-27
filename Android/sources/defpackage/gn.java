package defpackage;

import android.content.Context;
import android.view.LayoutInflater;

/* renamed from: gn  reason: default package */
public final class gn implements kma {
    public final /* synthetic */ hn a;

    public gn(hn hnVar) {
        this.a = hnVar;
    }

    public final void a(Context context) {
        hn hnVar = this.a;
        rn A = hnVar.A();
        eo eoVar = (eo) A;
        LayoutInflater from = LayoutInflater.from(eoVar.Y);
        if (from.getFactory() == null) {
            from.setFactory2(eoVar);
        } else {
            boolean z = from.getFactory2() instanceof eo;
        }
        hnVar.getSavedStateRegistry().a("androidx:appcompat");
        A.c();
    }
}
