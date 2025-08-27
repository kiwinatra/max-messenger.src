package defpackage;

import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.mediapicker.MediaPickerScreen;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;

/* renamed from: yt8  reason: default package */
public final /* synthetic */ class yt8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaPickerScreen b;

    public /* synthetic */ yt8(MediaPickerScreen mediaPickerScreen, int i) {
        this.a = i;
        this.b = mediaPickerScreen;
    }

    public final Object invoke() {
        View findViewById;
        MediaPickerScreen mediaPickerScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = MediaPickerScreen.z0;
                if (!(((gu8) mediaPickerScreen.y.getValue()).Z.a.getValue() instanceof qv3)) {
                    KProperty[] kPropertyArr2 = MediaPickerScreen.z0;
                    KProperty kProperty = kPropertyArr2[3];
                    ((oz1) mediaPickerScreen.X.getValue()).setVisibility(0);
                    KProperty kProperty2 = kPropertyArr2[7];
                    ((View) mediaPickerScreen.w0.getValue()).setVisibility(0);
                    KProperty kProperty3 = kPropertyArr2[2];
                    ReadOnlyProperty readOnlyProperty = mediaPickerScreen.z;
                    mz2 mz2 = (mz2) readOnlyProperty.getValue(mediaPickerScreen, kProperty3);
                    if (!Intrinsics.areEqual((Object) mz2.b(), (Object) "SELECT_ALBUM_WIDGET_TAG")) {
                        i9d i9d = new i9d(new SelectAlbumWidget(mediaPickerScreen.c, (DefaultConstructorMarker) null), (String) null, (ey3) null, (ey3) null, false, -1);
                        i9d.d("SELECT_ALBUM_WIDGET_TAG");
                        mz2.a.R(i9d);
                    }
                    zx3 a2 = ((mz2) readOnlyProperty.getValue(mediaPickerScreen, kPropertyArr2[2])).a();
                    SelectAlbumWidget selectAlbumWidget = a2 instanceof SelectAlbumWidget ? (SelectAlbumWidget) a2 : null;
                    if (selectAlbumWidget != null) {
                        View view = selectAlbumWidget.getView();
                        if (!(view == null || (findViewById = view.findViewById(sya.d)) == null)) {
                            int height = findViewById.getHeight();
                            KProperty kProperty4 = kPropertyArr2[4];
                            mediaPickerScreen.Y.b(mediaPickerScreen, Integer.valueOf(height));
                            b0h.H(findViewById, new v2(3, (Continuation) null, 2));
                        }
                        selectAlbumWidget.f0();
                    }
                }
                return Unit.INSTANCE;
            case 1:
                KProperty[] kPropertyArr3 = MediaPickerScreen.z0;
                return new opd((s48) ut8.a.getAccessor().g(s48.class), new cpd(mediaPickerScreen.d0().y, false));
            case 2:
                KProperty[] kPropertyArr4 = MediaPickerScreen.z0;
                return new gu8(mediaPickerScreen.d0(), (opd) mediaPickerScreen.x.getValue(), (om6) mediaPickerScreen.w.getValue());
            case 3:
                KProperty[] kPropertyArr5 = MediaPickerScreen.z0;
                FrameLayout frameLayout = new FrameLayout(mediaPickerScreen.getContext());
                frameLayout.setId(sva.a);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setVisibility(8);
                return frameLayout;
            case 4:
                KProperty[] kPropertyArr6 = MediaPickerScreen.z0;
                FrameLayout frameLayout2 = new FrameLayout(mediaPickerScreen.getContext());
                frameLayout2.setId(sva.b);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                frameLayout2.setLayoutParams(layoutParams);
                return frameLayout2;
            case 5:
                KProperty[] kPropertyArr7 = MediaPickerScreen.z0;
                h3b d = o54.d(mediaPickerScreen.getContext(), (AttributeSet) null);
                d.setId(sva.e);
                d.setTitle(tva.a);
                d.setLeftActions(new p2b(new vq7(10, (Object) mediaPickerScreen)));
                d.setTitleClickListener(new yt8(mediaPickerScreen, 0));
                d.setShowDropdown(true);
                return d;
            case 6:
                KProperty[] kPropertyArr8 = MediaPickerScreen.z0;
                View view2 = new View(mediaPickerScreen.getContext());
                view2.setId(sva.d);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, MathKt.roundToInt(((float) 1) * vo4.c().getDisplayMetrics().density));
                layoutParams2.gravity = 48;
                view2.setLayoutParams(layoutParams2);
                b0h.H(view2, new v2(3, (Continuation) null, 1));
                view2.setVisibility(8);
                return view2;
            default:
                KProperty[] kPropertyArr9 = MediaPickerScreen.z0;
                TextView textView = new TextView(mediaPickerScreen.getContext());
                textView.setText(tva.c);
                puf.r.b(textView, uy4.b);
                textView.setGravity(17);
                b0h.H(textView, new ra(3, (Continuation) null, 17));
                ((FrameLayout) mediaPickerScreen.x0.getValue(mediaPickerScreen, MediaPickerScreen.z0[8])).addView(textView);
                return textView;
        }
    }
}
