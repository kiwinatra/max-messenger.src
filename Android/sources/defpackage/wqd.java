package defpackage;

import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: wqd  reason: default package */
public final class wqd extends pzc {
    public static final /* synthetic */ int J0 = 0;
    public final il8 D0;
    public final OneMeDraweeView E0;
    public final View F0;
    public tqd G0;
    public Uri H0;
    public Uri I0;

    public wqd(il8 il8, OneMeDraweeView oneMeDraweeView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, FrameLayout frameLayout) {
        super(frameLayout);
        this.D0 = il8;
        this.E0 = oneMeDraweeView;
        this.F0 = appCompatImageView2;
        ct.G(oneMeDraweeView, 300, new vqd(this, 0));
        ct.G(appCompatImageView, 300, new vqd(this, 1));
    }
}
