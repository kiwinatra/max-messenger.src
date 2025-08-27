package ru.ok.tamtam.markdown.ui.preview;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ok/tamtam/markdown/ui/preview/MarkdownMenuView;", "Landroid/widget/LinearLayout;", "Lbif;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "enabled", "", "setEnabled", "(Z)V", "Lff8;", "listener", "setListener", "(Lff8;)V", "markdown-ui_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMarkdownMenuView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarkdownMenuView.kt\nru/ok/tamtam/markdown/ui/preview/MarkdownMenuView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,222:1\n1567#2:223\n1598#2,3:224\n1601#2:231\n1863#2,2:233\n1872#2,3:235\n1557#2:268\n1628#2,3:269\n92#3:227\n60#3:228\n105#3:229\n24#3:230\n28#3:232\n30#4:238\n91#4,14:239\n30#4:253\n91#4,14:254\n*S KotlinDebug\n*F\n+ 1 MarkdownMenuView.kt\nru/ok/tamtam/markdown/ui/preview/MarkdownMenuView\n*L\n51#1:223\n51#1:224,3\n51#1:231\n86#1:233,2\n99#1:235,3\n210#1:268\n210#1:269,3\n61#1:227\n61#1:228\n61#1:229\n63#1:230\n179#1:232\n165#1:238\n165#1:239,14\n203#1:253\n203#1:254,14\n*E\n"})
@Deprecated(message = "Депрекейтед потому что внутри есть логика с тегами, которая не взлетит на флейворе автотестов.\n    | Если заходим пользоваться у нас в новом коде, проставление тегов надо будет поправить на оболочки из ViewTagsExt.kt")
public final class MarkdownMenuView extends LinearLayout implements bif {
    public static final /* synthetic */ int x = 0;
    public final ArrayList a;
    public final RectF b = new RectF();
    public int c;
    public final Paint o;
    public AnimatorSet v;
    public final float w;

    @JvmOverloads
    public MarkdownMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        paint.setAlpha(25);
        this.o = paint;
        setOrientation(1);
        setWillNotDraw(false);
        bf8.c.getClass();
        LinkedHashSet linkedHashSet = bf8.o;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(linkedHashSet, 10));
        int i = 0;
        for (Object next : linkedHashSet) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            bf8 bf8 = (bf8) next;
            cf8 cf8 = new cf8(context);
            cf8.setTag(bf8);
            cf8.setTitle(bf8.b);
            ct.G(cf8, 300, new h24(16, (Object) this, (Object) bf8));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, getContext().getResources().getDimensionPixelSize(zdc.markdown_button_size));
            layoutParams.gravity = 8388613;
            layoutParams.bottomMargin = i == ArraysKt.getLastIndex((T[]) bf8.values()) ? 0 : MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
            addView(cf8, layoutParams);
            cf8.a(i == this.c, false);
            arrayList.add(cf8);
            i = i2;
        }
        this.a = arrayList;
        c();
        this.w = vo4.c().getDisplayMetrics().density * 100.0f;
    }

    public final void a(int i, boolean z) {
        AnimatorSet animatorSet;
        cf8 cf8 = (cf8) this.a.get(i);
        boolean isInEditMode = isInEditMode();
        RectF rectF = this.b;
        if (isInEditMode || !z || kne.s(getContext()).p()) {
            rectF.left = (float) cf8.getLeft();
            rectF.top = (float) cf8.getTop();
            rectF.right = (float) cf8.getRight();
            rectF.bottom = (float) cf8.getBottom();
            invalidate();
            return;
        }
        ch s = kne.s(getContext());
        AnimatorSet animatorSet2 = this.v;
        if (!(animatorSet2 == null || !animatorSet2.isRunning() || (animatorSet = this.v) == null)) {
            animatorSet.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{rectF.top, (float) cf8.getTop()});
        ofFloat.addUpdateListener(new ef8(this, 0));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{rectF.left, (float) cf8.getLeft()});
        ofFloat2.addUpdateListener(new ef8(this, 1));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{rectF.right, (float) cf8.getRight()});
        ofFloat3.addUpdateListener(new ef8(this, 2));
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{rectF.bottom, (float) cf8.getBottom()});
        ofFloat4.addUpdateListener(new ef8(this, 3));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.v = animatorSet3;
        animatorSet3.setDuration(s.a.b());
        animatorSet3.setInterpolator(s.a.k());
        animatorSet3.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4});
        animatorSet3.addListener(new zg(this, i, 2));
        animatorSet3.start();
    }

    public final void c() {
        if (!isInEditMode()) {
            for (cf8 c2 : this.a) {
                c2.c();
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.v;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void onDraw(Canvas canvas) {
        RectF rectF = this.b;
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        Paint paint = this.o;
        float f5 = this.w;
        canvas.drawRoundRect(f, f2, f3, f4, f5, f5, paint);
        super.onDraw(canvas);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.b.isEmpty()) {
            a(0, false);
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            removeAllViews();
        }
    }

    public final void setListener(ff8 ff8) {
    }
}
