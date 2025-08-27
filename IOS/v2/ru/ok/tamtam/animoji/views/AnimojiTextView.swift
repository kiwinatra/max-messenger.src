package ru.ok.tamtam.animoji.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001R$\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/tamtam/animoji/views/AnimojiTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "value", "getAnimojiEnabled", "()Z", "setAnimojiEnabled", "(Z)V", "animojiEnabled", "animoji_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"WrongCall"})
public class AnimojiTextView extends AppCompatTextView {
    public final fl x;
    public Pair y;

    @JvmOverloads
    public AnimojiTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static Unit j(AnimojiTextView animojiTextView, CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        return Unit.INSTANCE;
    }

    public static Unit k(AnimojiTextView animojiTextView, Canvas canvas) {
        super.onDraw(canvas);
        return Unit.INSTANCE;
    }

    public final boolean getAnimojiEnabled() {
        fl flVar = this.x;
        if (flVar != null) {
            return flVar.d;
        }
        return false;
    }

    public void onDraw(Canvas canvas) {
        fl flVar = this.x;
        if (flVar != null) {
            boolean z = ii.b;
            if (z) {
                ii.a.getClass();
            }
            flVar.c.invoke(canvas);
            if (z) {
                ii.a.getClass();
            }
        }
    }

    public final void setAnimojiEnabled(boolean z) {
        fl flVar = this.x;
        if (flVar != null) {
            flVar.d = z;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0062, code lost:
        if (kotlin.Result.m29isFailureimpl(r2) == false) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setText(java.lang.CharSequence r12, android.widget.TextView.BufferType r13) {
        /*
            r11 = this;
            fl r0 = r11.x
            if (r0 != 0) goto L_0x000f
            super.setText(r12, r13)
            kotlin.Pair r12 = kotlin.TuplesKt.to(r12, r13)
            r11.y = r12
            goto L_0x00e1
        L_0x000f:
            kotlin.jvm.functions.Function2 r11 = r0.b
            if (r12 == 0) goto L_0x00de
            boolean r1 = kotlin.text.StringsKt.isBlank(r12)
            if (r1 == 0) goto L_0x001b
            goto L_0x00de
        L_0x001b:
            boolean r1 = r0.d
            if (r1 != 0) goto L_0x0021
            goto L_0x00de
        L_0x0021:
            fk r1 = defpackage.ii.c
            int r2 = r12.length()
            r3 = 0
            r4 = 0
            boolean r5 = r12 instanceof android.text.Spanned     // Catch:{ all -> 0x003b }
            if (r5 == 0) goto L_0x0031
            r5 = r12
            android.text.Spanned r5 = (android.text.Spanned) r5     // Catch:{ all -> 0x003b }
            goto L_0x0032
        L_0x0031:
            r5 = r4
        L_0x0032:
            if (r5 == 0) goto L_0x003b
            java.lang.Class<kuf> r6 = defpackage.kuf.class
            java.lang.Object[] r2 = r5.getSpans(r3, r2, r6)     // Catch:{ all -> 0x003b }
            goto L_0x003c
        L_0x003b:
            r2 = r4
        L_0x003c:
            if (r2 == 0) goto L_0x0044
            int r2 = r2.length
            if (r2 != 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r2 = r12
            goto L_0x0065
        L_0x0044:
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch:{ all -> 0x0053 }
            s15 r2 = defpackage.s15.a()     // Catch:{ all -> 0x0053 }
            java.lang.CharSequence r2 = r2.h(r12)     // Catch:{ all -> 0x0053 }
            java.lang.Object r2 = kotlin.Result.m23constructorimpl(r2)     // Catch:{ all -> 0x0053 }
            goto L_0x005e
        L_0x0053:
            r2 = move-exception
            kotlin.Result$Companion r5 = kotlin.Result.Companion
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r2 = kotlin.Result.m23constructorimpl(r2)
        L_0x005e:
            boolean r5 = kotlin.Result.m29isFailureimpl(r2)
            if (r5 == 0) goto L_0x0065
            goto L_0x0042
        L_0x0065:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 != 0) goto L_0x006e
            r11.invoke(r12, r13)
            goto L_0x00e1
        L_0x006e:
            java.util.List r12 = r1.b(r2)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x007d:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto L_0x00a8
            java.lang.Object r6 = r12.next()
            qi r6 = (defpackage.qi) r6
            java.lang.String r7 = r6.a
            java.util.concurrent.ConcurrentHashMap r8 = r1.c
            java.lang.Object r7 = r8.get(r7)
            one.me.rlottie.RLottieDrawable r7 = (one.me.rlottie.RLottieDrawable) r7
            if (r7 != 0) goto L_0x0097
            r8 = r4
            goto L_0x00a2
        L_0x0097:
            fsb r8 = new fsb
            java.lang.String r9 = r6.a
            int r10 = r6.c
            int r6 = r6.d
            r8.<init>(r9, r7, r10, r6)
        L_0x00a2:
            if (r8 == 0) goto L_0x007d
            r5.add(r8)
            goto L_0x007d
        L_0x00a8:
            boolean r12 = r2 instanceof android.text.Spannable
            if (r12 != 0) goto L_0x00ad
            goto L_0x00da
        L_0x00ad:
            android.view.View r12 = r0.a
            r1 = 1
            defpackage.ryg.e(r12, r1)
            boolean r4 = r5.isEmpty()
            r4 = r4 ^ r1
            r0.f = r4
            boolean r4 = r5.isEmpty()
            r1 = r1 ^ r4
            if (r1 == 0) goto L_0x00cf
            hk r1 = r0.e
            if (r1 != 0) goto L_0x00cf
            hk r1 = new hk
            r1.<init>(r12, r3)
            r0.e = r1
            r1.a()
        L_0x00cf:
            r12 = r2
            android.text.Spannable r12 = (android.text.Spannable) r12
            fk r0 = defpackage.ii.c
            defpackage.ryg.d(r12, r5, r0)
            defpackage.ryg.V(r2)
        L_0x00da:
            r11.invoke(r2, r13)
            goto L_0x00e1
        L_0x00de:
            r11.invoke(r12, r13)
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.animoji.views.AnimojiTextView.setText(java.lang.CharSequence, android.widget.TextView$BufferType):void");
    }

    public AnimojiTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.x = new fl(this, new r6(1, this), new l(9, this));
        Pair pair = this.y;
        if (pair != null) {
            setText((CharSequence) pair.getFirst(), (TextView.BufferType) pair.getSecond());
        }
        this.y = null;
    }
}
