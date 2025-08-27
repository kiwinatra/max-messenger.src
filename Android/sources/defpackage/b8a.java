package defpackage;

import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.reflect.KProperty;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: b8a  reason: default package */
public final /* synthetic */ class b8a implements en {
    public final /* synthetic */ NeuroAvatarsScreen a;

    public /* synthetic */ b8a(NeuroAvatarsScreen neuroAvatarsScreen) {
        this.a = neuroAvatarsScreen;
    }

    public final void i(AppBarLayout appBarLayout, int i) {
        KProperty[] kPropertyArr = NeuroAvatarsScreen.K0;
        NeuroAvatarsScreen neuroAvatarsScreen = this.a;
        float interpolation = neuroAvatarsScreen.w0.getInterpolation(((float) Math.abs(i)) / ((float) neuroAvatarsScreen.c0().getTotalScrollRange()));
        KProperty[] kPropertyArr2 = NeuroAvatarsScreen.K0;
        ((ViewGroup) neuroAvatarsScreen.x.getValue(neuroAvatarsScreen, kPropertyArr2[2])).setAlpha(1.0f - interpolation);
        ((h3b) neuroAvatarsScreen.z.getValue(neuroAvatarsScreen, kPropertyArr2[4])).setTitleAlpha(interpolation);
    }
}
