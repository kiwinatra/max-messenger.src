package defpackage;

import android.content.SharedPreferences;

/* renamed from: gq  reason: default package */
public final /* synthetic */ class gq implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ hq a;
    public final /* synthetic */ lc5 b;

    public /* synthetic */ gq(hq hqVar, lc5 lc5) {
        this.a = hqVar;
        this.b = lc5;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        hq hqVar = this.a;
        hqVar.getClass();
        if (str != null && str.equals("app.messages.calls.menu.item")) {
            boolean c = hqVar.c("app.messages.calls.menu.item", true);
            xme xme = ((uc8) this.b.b).v;
            Boolean valueOf = Boolean.valueOf(c);
            xme.getClass();
            xme.m((Object) null, valueOf);
        }
    }
}
