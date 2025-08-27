package ru.ok.onechat.reactions.ui.badge;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\n*J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00058\u0006X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR,\u0010%\u001a\u00060\u001fj\u0002` 2\n\u0010\u0006\u001a\u00060\u001fj\u0002` 8\u0006@BX\u000e¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R,\u0010)\u001a\u00060\u001fj\u0002`&2\n\u0010\u0006\u001a\u00060\u001fj\u0002`&8\u0006@BX\u000e¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R$\u0010+\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ok/onechat/reactions/ui/badge/ReactionsBadgeView;", "Landroid/view/ViewGroup;", "Landroid/graphics/drawable/GradientDrawable;", "getBackground", "()Landroid/graphics/drawable/GradientDrawable;", "", "value", "", "setProgress", "(F)V", "Ljrc;", "o", "Ljrc;", "getOnWidthChangeListener", "()Ljrc;", "setOnWidthChangeListener", "(Ljrc;)V", "onWidthChangeListener", "Ljava/lang/Runnable;", "v", "Ljava/lang/Runnable;", "getOnFinishClearAction", "()Ljava/lang/Runnable;", "setOnFinishClearAction", "(Ljava/lang/Runnable;)V", "onFinishClearAction", "x", "F", "getCornerRadius", "()F", "cornerRadius", "", "Lru/ok/onechat/messagelist/LocalId;", "y", "J", "getMessageLocalId", "()J", "messageLocalId", "Lru/ok/onechat/messagelist/ServerId;", "z", "getMessageServerId", "messageServerId", "Lirc;", "onDoubleClickListener", "Lirc;", "getOnDoubleClickListener", "()Lirc;", "setOnDoubleClickListener", "(Lirc;)V", "reactions_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nReactionsBadgeView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactionsBadgeView.kt\nru/ok/onechat/reactions/ui/badge/ReactionsBadgeView\n+ 2 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,339:1\n24#2:340\n92#2:341\n60#2:342\n105#2:343\n96#2:344\n93#2:345\n61#2:346\n254#3:347\n254#3:348\n256#3,2:349\n310#3:365\n326#3,4:366\n311#3:370\n256#3,2:371\n91#4,14:351\n*S KotlinDebug\n*F\n+ 1 ReactionsBadgeView.kt\nru/ok/onechat/reactions/ui/badge/ReactionsBadgeView\n*L\n51#1:340\n52#1:341\n52#1:342\n52#1:343\n53#1:344\n69#1:345\n69#1:346\n125#1:347\n137#1:348\n170#1:349,2\n296#1:365\n296#1:366,4\n296#1:370\n310#1:371,2\n258#1:351,14\n*E\n"})
public final class ReactionsBadgeView extends ViewGroup {
    public final zrc a;
    public final int b;
    public float c;
    public jrc o;
    public Runnable v;
    public final GestureDetector w;
    public final float x;
    public final long y = -1;
    public final long z = -1;

    /* JADX WARNING: type inference failed for: r0v3, types: [android.view.View, zrc, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup] */
    @JvmOverloads
    public ReactionsBadgeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        c73 c73 = new c73((j4b) w63.N, 3);
        c73.C(true);
        float f = (float) 8;
        this.b = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        getContext().getResources().getDimensionPixelSize(xdc.onechat_react_counter_padding);
        int i = xdc.onechat_react_bubble_width_tension;
        Context context2 = getContext();
        TypedValue typedValue = new TypedValue();
        context2.getResources().getValue(i, typedValue, true);
        typedValue.getFloat();
        getResources().getInteger(ajc.onechat_react_add_duration);
        getResources().getInteger(ajc.onechat_react_remove_duration);
        getResources().getInteger(ajc.onechat_react_bubble_decrease_delay);
        float dimension = getContext().getResources().getDimension(xdc.onechat_react_badge_corners_radius);
        this.x = dimension;
        setBackground(i8b.P(Integer.valueOf(fu4.k.e(getContext()).f().a().e().a.c.b), (Integer) null, (Integer) null, new float[]{dimension, dimension, dimension, dimension, dimension, dimension, dimension, dimension}));
        setClipToPadding(false);
        setClipChildren(false);
        ? recyclerView = new RecyclerView(context, (AttributeSet) null);
        recyclerView.setId(kic.onechat_react_message_reaction_bubble);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        recyclerView.setHorizontalScrollBarEnabled(false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setClickable(false);
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        int roundToInt = MathKt.roundToInt(f * recyclerView.getContext().getResources().getDisplayMetrics().density);
        recyclerView.setPaddingRelative(roundToInt, 0, roundToInt, 0);
        recyclerView.setAdapter(c73);
        this.a = recyclerView;
        new src(recyclerView);
        addView(recyclerView, new ViewGroup.LayoutParams(-1, -2));
        setClickable(true);
        GestureDetector gestureDetector = new GestureDetector(context, new q00(20, this));
        this.w = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }

    private final void setProgress(float f) {
        this.c = f;
        zrc zrc = this.a;
        int roundToInt = MathKt.roundToInt((((float) 0) - this.c) + ((float) zrc.getPaddingStart()) + ((float) zrc.getPaddingEnd()));
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = roundToInt;
            setLayoutParams(layoutParams);
            jrc jrc = this.o;
            if (jrc != null) {
                ((gg9) jrc).setReactionsWidth(roundToInt);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final float getCornerRadius() {
        return this.x;
    }

    public final long getMessageLocalId() {
        return this.y;
    }

    public final long getMessageServerId() {
        return this.z;
    }

    public final irc getOnDoubleClickListener() {
        return null;
    }

    public final Runnable getOnFinishClearAction() {
        return this.v;
    }

    public final jrc getOnWidthChangeListener() {
        return this.o;
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        zrc zrc = this.a;
        if (zrc.getVisibility() == 0) {
            int measuredHeight = (getMeasuredHeight() - zrc.getMeasuredHeight()) / 2;
            zrc.layout(0, measuredHeight, zrc.getMeasuredWidth(), zrc.getMeasuredHeight() + measuredHeight);
        }
    }

    public final void onMeasure(int i, int i2) {
        zrc zrc = this.a;
        if (zrc.getVisibility() == 0) {
            zrc.measure(View.MeasureSpec.makeMeasureSpec(MathKt.roundToInt((((float) 0) - this.c) + ((float) zrc.getPaddingStart()) + ((float) zrc.getPaddingEnd())), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        }
        setMeasuredDimension(zrc.getMeasuredWidth(), this.b);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.w.onTouchEvent(motionEvent);
    }

    public final void setOnDoubleClickListener(irc irc) {
    }

    public final void setOnFinishClearAction(Runnable runnable) {
        this.v = runnable;
    }

    public final void setOnWidthChangeListener(jrc jrc) {
        this.o = jrc;
    }

    public GradientDrawable getBackground() {
        return (GradientDrawable) super.getBackground();
    }
}
