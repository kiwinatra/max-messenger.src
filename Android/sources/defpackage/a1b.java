package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.uikit.common.button.OneMeButton;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: a1b  reason: default package */
public final /* synthetic */ class a1b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ a1b(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                q14 q14 = new q14(this.b, (AttributeSet) null);
                q14.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                return q14;
            case 1:
                OneMeButton oneMeButton = new OneMeButton(this.b, (AttributeSet) null);
                oneMeButton.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                oneMeButton.setSize(aqa.a);
                oneMeButton.setAppearance(xpa.v);
                return oneMeButton;
            case 2:
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.b, (AttributeSet) null);
                appCompatTextView.setLayoutParams(new fj3(MathKt.roundToInt(((float) 0) * vo4.c().getDisplayMetrics().density), -2));
                puf.m.b(appCompatTextView, uy4.b);
                fu4.k.e(appCompatTextView.getContext()).f().getText().getClass();
                appCompatTextView.setTextColor(-1);
                appCompatTextView.setMaxLines(2);
                return appCompatTextView;
            case 3:
                TextView textView = new TextView(this.b);
                textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                puf.m.b(textView, uy4.b);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setSingleLine();
                textView.setTextColor(l2b.i.e);
                return textView;
            case 4:
                TextView textView2 = new TextView(this.b);
                textView2.setId(dad.x0);
                puf.i.b(textView2, uy4.b);
                textView2.setLetterSpacing(c44.DEFAULT_ASPECT_RATIO);
                textView2.setSingleLine(true);
                gsg.h(textView2);
                return textView2;
            case 5:
                ImageView imageView = new ImageView(this.b);
                imageView.setId(dad.v0);
                return imageView;
            case 6:
                wsa wsa = new wsa(this.b);
                wsa.setId(dad.w0);
                return wsa;
            case 7:
                PopupWindow popupWindow = new PopupWindow(this.b);
                popupWindow.setBackgroundDrawable((Drawable) null);
                popupWindow.setElevation(vo4.c().getDisplayMetrics().density * 12.0f);
                popupWindow.setFocusable(true);
                return popupWindow;
            case 8:
                Context context = this.b;
                MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(context, "pip-media-session", new ComponentName(context, omb.class), (PendingIntent) null);
                mediaSessionCompat.setMetadata(new MediaMetadataCompat.Builder().putLong(MediaMetadataCompat.METADATA_KEY_DURATION, -1).build());
                return mediaSessionCompat;
            case 9:
                return ew3.b(this.b, nad.H0);
            case 10:
                return ew3.b(this.b, nad.G0);
            case 11:
                return ew3.b(this.b, nad.I0);
            case 12:
                wsa wsa2 = new wsa(this.b);
                wsa2.setAppearance(qsa.b);
                return wsa2;
            case 13:
                ImageView imageView2 = new ImageView(this.b);
                float f = (float) 36;
                imageView2.setLayoutParams(new ViewGroup.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
                imageView2.setImageTintList(ColorStateList.valueOf(fu4.k.e(imageView2.getContext()).f().getIcon().h));
                int roundToInt = MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density);
                imageView2.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
                return imageView2;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                TextView textView3 = new TextView(this.b);
                textView3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                textView3.setTextSize(32.0f);
                textView3.setTextAlignment(4);
                textView3.setGravity(17);
                textView3.setMaxLines(1);
                return textView3;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new ContextThemeWrapper(this.b, hnc.Theme_MaterialComponents);
            case 16:
                ViewStub viewStub = new ViewStub(this.b);
                viewStub.setId(qqa.m0);
                viewStub.setVisibility(8);
                return viewStub;
            case LangUtils.HASH_SEED /*17*/:
                ViewStub viewStub2 = new ViewStub(this.b);
                viewStub2.setId(qqa.o0);
                return viewStub2;
            case 18:
                ImageView imageView3 = new ImageView(this.b);
                imageView3.setId(qqa.n0);
                return imageView3;
            case 19:
                TextView textView4 = new TextView(this.b);
                textView4.setId(qqa.m0);
                textView4.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                l2b.i.getClass();
                textView4.setTextColor(-1);
                puf.a.b(textView4, uy4.b);
                float f2 = (float) 0;
                textView4.setPadding(MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
                textView4.setVisibility(8);
                textView4.setGravity(17);
                return textView4;
            case 20:
                TextView textView5 = new TextView(this.b);
                textView5.setId(qqa.o0);
                textView5.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                textView5.setTextColor(l2b.i.e);
                puf.o.b(textView5, uy4.b);
                textView5.setVisibility(8);
                textView5.setGravity(17);
                return textView5;
            case 21:
                return o5a.R(this.b);
            case 22:
                return this.b.getResources().getStringArray(wcc.oneme_prefs_saved_messages_aliases);
            case 23:
                return new cq0(this.b);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new cq0(this.b);
            case 25:
                m3g m3g = new m3g(this.b);
                m3g.setBackgroundEnabled(true);
                m3g.setDrawableEnabled(false);
                return m3g;
            case 26:
                m3g m3g2 = new m3g(this.b);
                m3g2.setBackgroundEnabled(true);
                m3g2.setDrawableEnabled(false);
                return m3g2;
            case 27:
                TextView textView6 = new TextView(this.b);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                layoutParams.setMarginStart(MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density));
                textView6.setLayoutParams(layoutParams);
                puf.A.b(textView6, uy4.b);
                b0h.H(textView6, new ra(3, (Continuation) null, 24));
                textView6.setGravity(17);
                return textView6;
            default:
                return new u87(this.b);
        }
    }
}
