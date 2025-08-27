package ru.ok.messages.media.audio;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import ru.ok.messages.views.widgets.audiowave.AudioWaveView;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u000bJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0017\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001f\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013R\u001b\u0010$\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ok/messages/media/audio/AudioListenView;", "Landroid/widget/LinearLayout;", "Lphf;", "Ld80;", "", "isScheduledSend", "", "setScheduledSend", "(Z)V", "playing", "setPlayButtonState", "Lf50;", "listener", "setListener", "(Lf50;)V", "Landroid/graphics/drawable/Drawable;", "z", "Lkotlin/Lazy;", "getPlayDrawable", "()Landroid/graphics/drawable/Drawable;", "playDrawable", "v0", "getPauseDrawable", "pauseDrawable", "Landroid/graphics/drawable/GradientDrawable;", "x0", "getInputBackgroundDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "inputBackgroundDrawable", "z0", "getArrowDrawable", "arrowDrawable", "Landroid/graphics/drawable/LayerDrawable;", "A0", "getSendIcon", "()Landroid/graphics/drawable/LayerDrawable;", "sendIcon", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAudioListenView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioListenView.kt\nru/ok/messages/media/audio/AudioListenView\n+ 2 LazyExt.kt\nru/ok/tamtam/shared/utils/LazyExtKt\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 ThemeHelper.kt\nru/ok/tamtam/themes/ThemeHelper\n+ 6 ContextExt.kt\none/me/common/ext/ContextExtKt\n*L\n1#1,207:1\n8#2:208\n8#2:209\n8#2:211\n8#2:212\n8#2:213\n24#3:210\n24#3:214\n24#3:217\n75#3:218\n44#3:219\n99#3:220\n24#3:224\n28#3:235\n24#3:237\n172#4,2:215\n172#4,2:225\n172#4,2:227\n256#4,2:229\n256#4,2:231\n49#5,2:221\n45#5:223\n26#6:233\n26#6:234\n26#6:236\n*S KotlinDebug\n*F\n+ 1 AudioListenView.kt\nru/ok/messages/media/audio/AudioListenView\n*L\n53#1:208\n54#1:209\n64#1:211\n73#1:212\n74#1:213\n61#1:210\n88#1:214\n90#1:217\n103#1:218\n103#1:219\n103#1:220\n142#1:224\n66#1:235\n81#1:237\n88#1:215,2\n142#1:225,2\n145#1:227,2\n157#1:229,2\n158#1:231,2\n141#1:221,2\n141#1:223\n53#1:233\n54#1:234\n73#1:236\n*E\n"})
public final class AudioListenView extends LinearLayout implements phf, d80 {
    public static final /* synthetic */ int B0 = 0;
    public final Lazy A0;
    public final AudioWaveView a;
    public final TextView b = ((TextView) findViewById(lic.view_audio_listen__tv_duration));
    public final ImageView c;
    public final ImageView o;
    public final ImageView v;
    public final Lazy v0;
    public final ProgressBar w;
    public final LayerDrawable w0;
    public f50 x;
    public final Lazy x0;
    public final GradientDrawable y;
    public final GradientDrawable y0;
    public final Lazy z;
    public final Lazy z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    @kotlin.jvm.JvmOverloads
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AudioListenView(android.content.Context r17, android.util.AttributeSet r18) {
        /*
            r16 = this;
            r6 = r16
            r0 = r17
            r7 = 2
            r8 = 1
            r9 = 0
            r1 = r18
            r6.<init>(r0, r1, r9)
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            r2 = 1120403456(0x42c80000, float:100.0)
            r1.setCornerRadius(r2)
            r6.y = r1
            d50 r3 = new d50
            r3.<init>(r6, r9)
            kotlin.LazyThreadSafetyMode r4 = kotlin.LazyThreadSafetyMode.NONE
            kotlin.Lazy r3 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r4, r3)
            r6.z = r3
            d50 r3 = new d50
            r3.<init>(r6, r8)
            kotlin.Lazy r3 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r4, r3)
            r6.v0 = r3
            android.graphics.drawable.LayerDrawable r3 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable r5 = r16.getPlayDrawable()
            android.graphics.drawable.Drawable[] r10 = new android.graphics.drawable.Drawable[r7]
            r10[r9] = r1
            r10[r8] = r5
            r3.<init>(r10)
            r5 = 4
            float r5 = (float) r5
            android.content.res.Resources r10 = defpackage.vo4.c()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r10 = r10 * r5
            int r12 = kotlin.math.MathKt.roundToInt((float) r10)
            android.content.res.Resources r10 = defpackage.vo4.c()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r10 = r10 * r5
            int r13 = kotlin.math.MathKt.roundToInt((float) r10)
            android.content.res.Resources r10 = defpackage.vo4.c()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r10 = r10 * r5
            int r14 = kotlin.math.MathKt.roundToInt((float) r10)
            android.content.res.Resources r10 = defpackage.vo4.c()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r5 = r5 * r10
            int r15 = kotlin.math.MathKt.roundToInt((float) r5)
            r11 = 1
            r10 = r3
            r10.setLayerInset(r11, r12, r13, r14, r15)
            r6.w0 = r3
            m r5 = new m
            r10 = 12
            r5.<init>(r10)
            kotlin.Lazy r5 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r4, r5)
            r6.x0 = r5
            android.graphics.drawable.GradientDrawable r5 = new android.graphics.drawable.GradientDrawable
            r5.<init>()
            r5.setCornerRadius(r2)
            r6.y0 = r5
            d50 r2 = new d50
            r2.<init>(r6, r7)
            kotlin.Lazy r2 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r4, r2)
            r6.z0 = r2
            d50 r2 = new d50
            r5 = 3
            r2.<init>(r6, r5)
            kotlin.Lazy r2 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r4, r2)
            r6.A0 = r2
            int r2 = defpackage.ujc.view_audio_listen
            android.view.View.inflate(r0, r2, r6)
            r0 = 6
            float r0 = (float) r0
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r0 = r0 * r2
            int r0 = kotlin.math.MathKt.roundToInt((float) r0)
            r6.setPadding(r0, r0, r0, r0)
            r6.setOrientation(r9)
            r0 = 36
            float r0 = (float) r0
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r0 = r0 * r2
            int r0 = kotlin.math.MathKt.roundToInt((float) r0)
            r6.setMinimumHeight(r0)
            int r0 = defpackage.lic.view_audio_listen__container
            android.view.View r0 = r6.findViewById(r0)
            int r2 = defpackage.lic.view_audio_listen__wave
            android.view.View r2 = r6.findViewById(r2)
            r10 = r2
            ru.ok.messages.views.widgets.audiowave.AudioWaveView r10 = (ru.ok.messages.views.widgets.audiowave.AudioWaveView) r10
            r6.a = r10
            int r2 = defpackage.lic.view_audio_listen__tv_duration
            android.view.View r2 = r6.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r6.b = r2
            int r2 = defpackage.lic.view_audio_listen__btn_play
            android.view.View r2 = r6.findViewById(r2)
            r11 = r2
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r6.c = r11
            int r2 = defpackage.lic.view_audio_listen__btn_close
            android.view.View r2 = r6.findViewById(r2)
            r12 = r2
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r6.o = r12
            int r2 = defpackage.lic.view_audio_listen__btn_send
            android.view.View r2 = r6.findViewById(r2)
            r13 = r2
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r6.v = r13
            int r2 = defpackage.lic.view_audio_listen__progress
            android.view.View r2 = r6.findViewById(r2)
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            r6.w = r2
            r2.setBackground(r1)
            android.graphics.drawable.GradientDrawable r1 = r16.getInputBackgroundDrawable()
            r0.setBackground(r1)
            r11.setImageDrawable(r3)
            android.content.Context r0 = r16.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 10
            float r1 = (float) r1
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            int r3 = kotlin.math.MathKt.roundToInt((float) r1)
            r0 = r3
            r1 = r3
            r2 = r3
            r4 = r16
            r5 = r11
            defpackage.b59.x(r0, r1, r2, r3, r4, r5)
            r10.setListener(r6)
            e50 r0 = new e50
            r0.<init>(r6, r9)
            defpackage.ct.G(r12, 300, r0)
            e50 r0 = new e50
            r0.<init>(r6, r8)
            defpackage.ct.G(r11, 300, r0)
            e50 r0 = new e50
            r0.<init>(r6, r7)
            defpackage.ct.G(r13, 300, r0)
            z20 r0 = new z20
            r0.<init>(r8, r6)
            r13.setOnLongClickListener(r0)
            js9 r0 = defpackage.fu4.k
            android.content.Context r1 = r16.getContext()
            fu4 r0 = r0.e(r1)
            k2b r0 = r0.f()
            r6.onThemeChanged(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.audio.AudioListenView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static LayerDrawable a(AudioListenView audioListenView) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{audioListenView.y0, audioListenView.getArrowDrawable()});
        float f = (float) 4;
        layerDrawable.setLayerInset(1, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        return layerDrawable;
    }

    private final Drawable getArrowDrawable() {
        return (Drawable) this.z0.getValue();
    }

    private final GradientDrawable getInputBackgroundDrawable() {
        return (GradientDrawable) this.x0.getValue();
    }

    private final Drawable getPauseDrawable() {
        return (Drawable) this.v0.getValue();
    }

    private final Drawable getPlayDrawable() {
        return (Drawable) this.z.getValue();
    }

    private final LayerDrawable getSendIcon() {
        return (LayerDrawable) this.A0.getValue();
    }

    public final void b(long j, String str, boolean z2, boolean z3) {
        AudioWaveView audioWaveView = this.a;
        audioWaveView.z = j;
        audioWaveView.v0 = z2;
        int i = 0;
        if (!z2) {
            audioWaveView.E0 = false;
        }
        audioWaveView.invalidate();
        this.b.setText(str);
        this.w.setVisibility(z3 ^ true ? 0 : 8);
        if (!z3) {
            i = 8;
        }
        this.c.setVisibility(i);
    }

    public final void d() {
        f50 f50 = this.x;
        if (f50 != null) {
            s60 s60 = (s60) f50;
            if (s60.m == r60.o) {
                s60.d();
            }
        }
    }

    public final void f(float f) {
        f50 f50 = this.x;
        if (f50 != null) {
            s60 s60 = (s60) f50;
            if (s60.m == r60.o && s60.l()) {
                long j = (long) (((float) s60.x) * f);
                s60.p.b(j, s60.h(j), s60.l(), s60.F);
            }
        }
    }

    public final void g(float f) {
        f50 f50 = this.x;
        if (f50 != null) {
            s60 s60 = (s60) f50;
            if (s60.m == r60.o && s60.l()) {
                z68.c("s60", "onStopSeek", new Object[0]);
                s60.c.c.v((long) (((float) s60.x) * f));
            }
        }
    }

    public final void onThemeChanged(k2b k2b) {
        js9 js9 = fu4.k;
        zqg f = js9.e(getContext()).f().a().f();
        setBackgroundColor(f.a.a);
        this.o.setColorFilter(k2b.getIcon().c);
        this.y.setColor(k2b.c().a.g);
        getInputBackgroundDrawable().setColor(k2b.c().i);
        getInputBackgroundDrawable().setStroke(4, j4b.l0(0.06f, f.d.b));
        ogf ogf = puf.o;
        TextView textView = this.b;
        ogf.b(textView, uy4.b);
        textView.setTextColor(js9.e(getContext()).f().getText().f);
        Drawable arrowDrawable = getArrowDrawable();
        k2b.getIcon().getClass();
        iq.a0(arrowDrawable, -1);
        k2b.c().a.getClass();
        this.y0.setColor(-16745729);
        iq.b0(this.w, k2b.getIcon().f);
        iq.a0(getPlayDrawable(), k2b.getIcon().f);
        iq.a0(getPauseDrawable(), k2b.getIcon().f);
        this.c.invalidate();
    }

    public final void setListener(f50 f50) {
        this.x = f50;
    }

    public final void setPlayButtonState(boolean z2) {
        int i;
        this.w0.setDrawable(1, z2 ? getPauseDrawable() : getPlayDrawable());
        this.c.invalidate();
        js9 js9 = fu4.k;
        if (z2) {
            js9.e(getContext()).f().getText().getClass();
            i = -16745729;
        } else {
            i = js9.e(getContext()).f().getText().f;
        }
        this.b.setTextColor(i);
    }

    public final void setScheduledSend(boolean z2) {
        scf scf;
        ImageView imageView = this.v;
        if (z2) {
            imageView.setImageResource(nad.i1);
            if (isInEditMode()) {
                scf = vi4.f0;
            } else {
                Context context = getContext();
                Lazy lazy = scf.b0;
                scf = j4b.k0(context);
            }
            imageView.setColorFilter(scf.l);
            int roundToInt = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
            imageView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
            return;
        }
        imageView.setImageDrawable(getSendIcon());
        imageView.setPadding(0, 0, 0, 0);
    }
}
