package ru.ok.messages.calls.views;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/messages/calls/views/AnimatedCirclesView;", "Landroid/widget/FrameLayout;", "bf", "ui-utils_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAnimatedCirclesView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedCirclesView.kt\nru/ok/messages/calls/views/AnimatedCirclesView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n1557#2:139\n1628#2,3:140\n*S KotlinDebug\n*F\n+ 1 AnimatedCirclesView.kt\nru/ok/messages/calls/views/AnimatedCirclesView\n*L\n48#1:139\n48#1:140,3\n*E\n"})
public final class AnimatedCirclesView extends FrameLayout {
    public final List a = CollectionsKt.emptyList();
    public final List b;

    @JvmOverloads
    public AnimatedCirclesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        new AnimatorSet();
        List listOf = CollectionsKt.listOf(Integer.valueOf(vdc.calls_circle_1), Integer.valueOf(vdc.calls_circle_3), Integer.valueOf(vdc.calls_circle_4), Integer.valueOf(vdc.calls_circle_2));
        this.b = listOf;
        Iterable<Number> iterable = listOf;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (Number intValue : iterable) {
            int intValue2 = intValue.intValue();
            bf bfVar = new bf(context);
            bfVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            bfVar.a.setColor(fw3.a(bfVar.getContext(), intValue2));
            addView(bfVar);
            arrayList.add(bfVar);
        }
        this.a = arrayList;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float measuredWidth = ((float) getMeasuredWidth()) * 0.1f;
        List<bf> list = this.a;
        float size = 360.0f / ((float) list.size());
        float measuredWidth2 = ((float) getMeasuredWidth()) / 2.0f;
        float measuredWidth3 = ((float) getMeasuredWidth()) / 2.0f;
        float f = c44.DEFAULT_ASPECT_RATIO;
        for (bf bfVar : list) {
            f += size;
            double d = ((double) f) * 0.017453292519943295d;
            PointF pointF = new PointF((((float) Math.cos(d)) * measuredWidth3 * 0.1f) + measuredWidth2, measuredWidth2 - ((((float) Math.sin(d)) * measuredWidth3) * 0.1f));
            PointF pointF2 = new PointF(((float) Math.sin(d)) * measuredWidth, ((float) Math.cos(d)) * measuredWidth);
            bfVar.setPivotX(pointF.x);
            bfVar.setPivotY(pointF.y);
            bfVar.setTranslationX(pointF2.x);
            bfVar.setTranslationY(pointF2.y);
        }
    }
}
