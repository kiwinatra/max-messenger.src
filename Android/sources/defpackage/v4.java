package defpackage;

import android.accounts.AccountManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.InsetDrawable;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.tamtam.nano.Protos;

/* renamed from: v4  reason: default package */
public final /* synthetic */ class v4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ v4(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return AccountManager.get(this.b);
            case 1:
                return ew3.b(this.b, cad.q0);
            case 2:
                return new InsetDrawable(ew3.b(this.b, cad.O0), MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density));
            case 3:
                return new InsetDrawable(ew3.b(this.b, cad.K0), MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density));
            case 4:
                return (AudioManager) this.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            case 5:
                return new ccf(this.b);
            case 6:
                oq9 oq9 = new oq9(this.b);
                float f = (float) 28;
                oq9.setBounds(0, 0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
                return oq9;
            case 7:
                return te8.m(this.b);
            case 8:
                return te8.m(this.b);
            case 9:
                return te8.m(this.b);
            case 10:
                Space space = new Space(this.b);
                space.setId(View.generateViewId());
                space.setLayoutParams(new fj3(-1, 0));
                return space;
            case 11:
                Space space2 = new Space(this.b);
                space2.setId(View.generateViewId());
                space2.setLayoutParams(new fj3(-1, 0));
                return space2;
            case 12:
                return te8.m(this.b);
            case 13:
                TextView textView = new TextView(this.b);
                textView.setId(qqa.R0);
                textView.setGravity(17);
                puf.w.b(textView, uy4.b);
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(l2b.i.e);
                textView.setVisibility(8);
                textView.setLayoutParams(new fj3(-1, -2));
                return textView;
            case Protos.Attaches.Attach.LOCATION:
                p7e p7e = new p7e(this.b);
                o7e o7e = p7e.b;
                o7e.getClass();
                KProperty[] kPropertyArr = o7e.y0;
                o7e.x0.setValue(o7e, kPropertyArr[7], Boolean.FALSE);
                p7e.onThemeChanged(l2b.a);
                p7e.o = MathKt.roundToInt(((float) 30) * vo4.c().getDisplayMetrics().density);
                m7e m7e = m7e.b;
                o7e.X.setValue(o7e, kPropertyArr[2], m7e);
                o7e.Y.setValue(o7e, kPropertyArr[3], Long.valueOf(MultiFileUploader.UPLOAD_NEXT_INTERVAL));
                return p7e;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                TextView textView2 = new TextView(this.b);
                textView2.setId(qqa.S0);
                textView2.setGravity(17);
                textView2.setMaxLines(2);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                puf.m.b(textView2, uy4.b);
                textView2.setTextColor(l2b.i.g);
                textView2.setVisibility(8);
                textView2.setLayoutParams(new fj3(-1, -2));
                return textView2;
            case 16:
                jk1 jk1 = new jk1(this.b, (AttributeSet) null);
                jk1.setId(qqa.X0);
                jk1.setLayoutParams(new fj3(-1, -2));
                jk1.setVisibility(8);
                return jk1;
            case LangUtils.HASH_SEED:
                p8d p8d = new p8d(this.b, (AttributeSet) null);
                p8d.setId(qqa.V0);
                p8d.setMode(k8d.b);
                float f2 = (float) 60;
                p8d.setImageSize(new l8d(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density)));
                p8d.setLayoutParams(new fj3(-2, -2));
                p8d.setButtonPadding(MathKt.roundToInt(((float) 5) * vo4.c().getDisplayMetrics().density));
                p8d.setVisibility(8);
                return p8d;
            case 18:
                p8d p8d2 = new p8d(this.b, (AttributeSet) null);
                p8d2.setId(qqa.U0);
                p8d2.setMode(k8d.a);
                float f3 = (float) 60;
                p8d2.setImageSize(new l8d(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density)));
                p8d2.setLayoutParams(new fj3(-2, -2));
                p8d2.setButtonPadding(MathKt.roundToInt(((float) 5) * vo4.c().getDisplayMetrics().density));
                p8d2.setVisibility(8);
                return p8d2;
            case 19:
                return ew3.b(this.b, pqa.o);
            case 20:
                return ew3.b(this.b, pqa.G);
            case 21:
                return ew3.b(this.b, pqa.M);
            case 22:
                return ew3.b(this.b, pqa.D);
            case 23:
                ImageView imageView = new ImageView(this.b);
                imageView.setId(qqa.Z);
                float f4 = (float) 26;
                imageView.setLayoutParams(new FrameLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4), MathKt.roundToInt(f4 * vo4.c().getDisplayMetrics().density)));
                int roundToInt = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
                imageView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
                imageView.setImageResource(pqa.o);
                return imageView;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                s11 s11 = new s11(this.b);
                s11.setLayoutParams(new fj3(-1, -1));
                s11.setVisibility(8);
                return s11;
            case 25:
                AppCompatImageView appCompatImageView = new AppCompatImageView(this.b, (AttributeSet) null);
                float f5 = (float) 32;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f5), MathKt.roundToInt(f5 * vo4.c().getDisplayMetrics().density));
                layoutParams.gravity = 8388629;
                appCompatImageView.setLayoutParams(layoutParams);
                appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                b0h.H(appCompatImageView, new sx1(3, (Continuation) null, 0));
                int roundToInt2 = MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density);
                appCompatImageView.setPadding(roundToInt2, roundToInt2, roundToInt2, roundToInt2);
                return appCompatImageView;
            case 26:
                Context context = this.b;
                return new km5(context, new jm5(context));
            case 27:
                SharedPreferences sharedPreferences = this.b.getSharedPreferences("one.me.sdk.design.theme", 0);
                sharedPreferences.getAll();
                return sharedPreferences;
            case 28:
                return Boolean.valueOf(((InputMethodManager) this.b.getSystemService("input_method")).isActive());
            default:
                return ev0.i(this.b);
        }
    }
}
