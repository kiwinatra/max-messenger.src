package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: wpa  reason: default package */
public final /* synthetic */ class wpa implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ OneMeButton c;

    public /* synthetic */ wpa(Context context, OneMeButton oneMeButton, int i) {
        this.a = i;
        this.b = context;
        this.c = oneMeButton;
    }

    public final Object invoke() {
        OneMeButton oneMeButton = this.c;
        Context context = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = OneMeButton.z0;
                aya aya = new aya(context);
                aya.setId(dad.h);
                oneMeButton.setGravity(17);
                u3b.a(aya, new tj7(16, aya, oneMeButton));
                y7e.c(oneMeButton, aya, Integer.valueOf(oneMeButton.getChildCount()));
                return aya;
            default:
                KProperty[] kPropertyArr2 = OneMeButton.z0;
                wsa wsa = new wsa(context);
                int i = dad.f;
                wsa.setId(i);
                oneMeButton.addView(wsa, oneMeButton.b(i));
                return wsa;
        }
    }
}
