package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: ipa  reason: default package */
public final class ipa implements s98 {
    public final /* synthetic */ q4 a;

    public ipa(q4 q4Var) {
        this.a = q4Var;
    }

    public final void a() {
        SharedPreferences.Editor edit = ((l15) fu4.k.e((Context) this.a.g(Context.class)).g).q().edit();
        k9a.a.getClass();
        edit.putString("nightmode", f9a.a(j9a.b));
        edit.apply();
    }
}
