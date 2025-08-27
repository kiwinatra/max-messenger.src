package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.TextView;

/* renamed from: mn  reason: default package */
public final class mn {
    public ColorStateList a = null;
    public PorterDuff.Mode b = null;
    public boolean c = false;
    public boolean d = false;
    public boolean e;
    public final TextView f;

    public /* synthetic */ mn(TextView textView) {
        this.f = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f;
        Drawable a2 = kd3.a(compoundButton);
        if (a2 == null) {
            return;
        }
        if (this.c || this.d) {
            Drawable mutate = a2.mutate();
            if (this.c) {
                ru4.h(mutate, this.a);
            }
            if (this.d) {
                ru4.i(mutate, this.b);
            }
            if (mutate.isStateful()) {
                mutate.setState(compoundButton.getDrawableState());
            }
            compoundButton.setButtonDrawable(mutate);
        }
    }

    public void b() {
        CheckedTextView checkedTextView = (CheckedTextView) this.f;
        Drawable checkMarkDrawable = checkedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable == null) {
            return;
        }
        if (this.c || this.d) {
            Drawable mutate = checkMarkDrawable.mutate();
            if (this.c) {
                ru4.h(mutate, this.a);
            }
            if (this.d) {
                ru4.i(mutate, this.b);
            }
            if (mutate.isStateful()) {
                mutate.setState(checkedTextView.getDrawableState());
            }
            checkedTextView.setCheckMarkDrawable(mutate);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|(2:6|7)|9|10|(1:14)|15|(1:17)|18|(1:20)|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0048 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(android.util.AttributeSet r12, int r13) {
        /*
            r11 = this;
            android.widget.TextView r11 = r11.f
            r0 = r11
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            android.content.Context r1 = r0.getContext()
            int[] r2 = defpackage.koc.CompoundButton
            r3 = 0
            g6d r1 = defpackage.g6d.w(r1, r12, r2, r13, r3)
            java.lang.Object r2 = r1.c
            android.content.res.TypedArray r2 = (android.content.res.TypedArray) r2
            r4 = r11
            android.widget.CompoundButton r4 = (android.widget.CompoundButton) r4
            android.content.Context r5 = r4.getContext()
            int[] r6 = defpackage.koc.CompoundButton
            java.util.WeakHashMap r11 = defpackage.gag.a
            java.lang.Object r11 = r1.c
            r8 = r11
            android.content.res.TypedArray r8 = (android.content.res.TypedArray) r8
            r10 = 0
            r7 = r12
            r9 = r13
            defpackage.bag.d(r4, r5, r6, r7, r8, r9, r10)
            int r11 = defpackage.koc.CompoundButton_buttonCompat     // Catch:{ all -> 0x0046 }
            boolean r11 = r2.hasValue(r11)     // Catch:{ all -> 0x0046 }
            if (r11 == 0) goto L_0x0048
            int r11 = defpackage.koc.CompoundButton_buttonCompat     // Catch:{ all -> 0x0046 }
            int r11 = r2.getResourceId(r11, r3)     // Catch:{ all -> 0x0046 }
            if (r11 == 0) goto L_0x0048
            android.content.Context r12 = r0.getContext()     // Catch:{ NotFoundException -> 0x0048 }
            android.graphics.drawable.Drawable r11 = defpackage.iq.D(r12, r11)     // Catch:{ NotFoundException -> 0x0048 }
            r0.setButtonDrawable(r11)     // Catch:{ NotFoundException -> 0x0048 }
            goto L_0x0063
        L_0x0046:
            r11 = move-exception
            goto L_0x008f
        L_0x0048:
            int r11 = defpackage.koc.CompoundButton_android_button     // Catch:{ all -> 0x0046 }
            boolean r11 = r2.hasValue(r11)     // Catch:{ all -> 0x0046 }
            if (r11 == 0) goto L_0x0063
            int r11 = defpackage.koc.CompoundButton_android_button     // Catch:{ all -> 0x0046 }
            int r11 = r2.getResourceId(r11, r3)     // Catch:{ all -> 0x0046 }
            if (r11 == 0) goto L_0x0063
            android.content.Context r12 = r0.getContext()     // Catch:{ all -> 0x0046 }
            android.graphics.drawable.Drawable r11 = defpackage.iq.D(r12, r11)     // Catch:{ all -> 0x0046 }
            r0.setButtonDrawable(r11)     // Catch:{ all -> 0x0046 }
        L_0x0063:
            int r11 = defpackage.koc.CompoundButton_buttonTint     // Catch:{ all -> 0x0046 }
            boolean r11 = r2.hasValue(r11)     // Catch:{ all -> 0x0046 }
            if (r11 == 0) goto L_0x0074
            int r11 = defpackage.koc.CompoundButton_buttonTint     // Catch:{ all -> 0x0046 }
            android.content.res.ColorStateList r11 = r1.o(r11)     // Catch:{ all -> 0x0046 }
            defpackage.jd3.c(r0, r11)     // Catch:{ all -> 0x0046 }
        L_0x0074:
            int r11 = defpackage.koc.CompoundButton_buttonTintMode     // Catch:{ all -> 0x0046 }
            boolean r11 = r2.hasValue(r11)     // Catch:{ all -> 0x0046 }
            if (r11 == 0) goto L_0x008b
            int r11 = defpackage.koc.CompoundButton_buttonTintMode     // Catch:{ all -> 0x0046 }
            r12 = -1
            int r11 = r2.getInt(r11, r12)     // Catch:{ all -> 0x0046 }
            r12 = 0
            android.graphics.PorterDuff$Mode r11 = defpackage.yu4.c(r11, r12)     // Catch:{ all -> 0x0046 }
            defpackage.jd3.d(r0, r11)     // Catch:{ all -> 0x0046 }
        L_0x008b:
            r1.x()
            return
        L_0x008f:
            r1.x()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn.c(android.util.AttributeSet, int):void");
    }
}
