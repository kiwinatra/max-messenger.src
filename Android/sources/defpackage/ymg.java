package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import one.me.sdk.arch.Widget;

/* renamed from: ymg  reason: default package */
public final /* synthetic */ class ymg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ ymg(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    public final Object invoke(Object obj) {
        Widget widget = this.b;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(Widget.viewBinding$lambda$7(widget, (View) obj));
            default:
                iog iog = (iog) obj;
                int i = pq7.a;
                Context context = widget.getContext();
                int i2 = iog.a.f(8).d - iog.a.f(7).d;
                if (pq7.c != i2) {
                    String name = pq7.class.getName();
                    z68.c(name, "insets changed keyboard height=" + i2, new Object[0]);
                    if (pq7.b(i2)) {
                        String str = 1 == context.getResources().getConfiguration().orientation ? "pref_keyboard_height_portrait" : "pref_keyboard_height_landscape";
                        pq7.b.d(i2, str);
                        SharedPreferences sharedPreferences = pq7.d;
                        if (sharedPreferences == null) {
                            sharedPreferences = context.getApplicationContext().getSharedPreferences("keyboard_prefs", 0);
                        }
                        if (pq7.d == null) {
                            pq7.d = sharedPreferences;
                        }
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putInt(str, i2);
                        edit.apply();
                    }
                    boolean b2 = pq7.b(i2);
                    xme xme = pq7.e;
                    if (b2) {
                        Boolean bool = Boolean.TRUE;
                        xme.getClass();
                        xme.m((Object) null, bool);
                    } else if (pq7.b(pq7.c)) {
                        Boolean bool2 = Boolean.FALSE;
                        xme.getClass();
                        xme.m((Object) null, bool2);
                    }
                    pq7.c = i2;
                }
                return Unit.INSTANCE;
        }
    }
}
