package ru.ok.messages.messages.widgets.layouts;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import ru.ok.messages.bots.InlineKeyboardAttachView;
import ru.ok.onechat.reactions.ui.badge.ReactionsBadgeView;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00108BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00108BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00108BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00108BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014¨\u0006\u001f"}, d2 = {"Lru/ok/messages/messages/widgets/layouts/OutgoingMessageLayout;", "Lkg9;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lgg9;", "", "setup", "(Lgg9;)V", "", "isDarkTheme", "setDarkTheme", "(Z)V", "Landroid/graphics/drawable/Drawable;", "B0", "Lkotlin/Lazy;", "getSendCheckMark", "()Landroid/graphics/drawable/Drawable;", "sendCheckMark", "C0", "getReadCheckMark", "readCheckMark", "D0", "getSendingIcon", "sendingIcon", "E0", "getErrorIcon", "errorIcon", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nOutgoingMessageLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutgoingMessageLayout.kt\nru/ok/messages/messages/widgets/layouts/OutgoingMessageLayout\n+ 2 LazyExt.kt\nru/ok/tamtam/shared/utils/LazyExtKt\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 MessageWithReplyLayout.kt\nru/ok/messages/messages/widgets/MessageWithReplyLayout\n*L\n1#1,162:1\n8#2:163\n8#2:164\n8#2:165\n8#2:166\n24#3:167\n24#3:170\n24#3:173\n148#4,2:168\n256#4,2:171\n254#4:175\n375#4,2:187\n375#4,2:189\n347#4:198\n1317#5:174\n1318#5:176\n164#6,4:177\n164#6,4:181\n164#6,2:185\n167#6:191\n164#6,2:192\n164#6,4:194\n167#6:199\n*S KotlinDebug\n*F\n+ 1 OutgoingMessageLayout.kt\nru/ok/messages/messages/widgets/layouts/OutgoingMessageLayout\n*L\n26#1:163\n27#1:164\n28#1:165\n29#1:166\n32#1:167\n37#1:170\n72#1:173\n32#1:168,2\n69#1:171,2\n85#1:175\n126#1:187,2\n128#1:189,2\n146#1:198\n84#1:174\n84#1:176\n94#1:177,4\n98#1:181,4\n125#1:185,2\n125#1:191\n141#1:192,2\n143#1:194,4\n141#1:199\n*E\n"})
public final class OutgoingMessageLayout extends kg9 {
    public static final /* synthetic */ int F0 = 0;
    public final Lazy B0;
    public final Lazy C0;
    public final Lazy D0;
    public final Lazy E0;

    @JvmOverloads
    public OutgoingMessageLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        x5b x5b = new x5b(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.B0 = LazyKt.lazy(lazyThreadSafetyMode, x5b);
        this.C0 = LazyKt.lazy(lazyThreadSafetyMode, new x5b(this, 1));
        this.D0 = LazyKt.lazy(lazyThreadSafetyMode, new x5b(this, 2));
        this.E0 = LazyKt.lazy(lazyThreadSafetyMode, new x5b(this, 3));
        float f = (float) 8;
        setPaddingRelative(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
    }

    private final Drawable getErrorIcon() {
        return (Drawable) this.E0.getValue();
    }

    private final Drawable getReadCheckMark() {
        return (Drawable) this.C0.getValue();
    }

    private final Drawable getSendCheckMark() {
        return (Drawable) this.B0.getValue();
    }

    private final Drawable getSendingIcon() {
        return (Drawable) this.D0.getValue();
    }

    public final void c(a89 a89) {
        if (a89.a.X == oa9.SENDING) {
            getMessageView().g(getSendingIcon(), false);
        }
    }

    public final InlineKeyboardAttachView e() {
        InlineKeyboardAttachView inlineKeyboardAttachView = new InlineKeyboardAttachView(getContext(), (AttributeSet) null);
        inlineKeyboardAttachView.setId(lic.row_message__ik_keyboard);
        inlineKeyboardAttachView.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = MathKt.roundToInt(((float) 1) * vo4.c().getDisplayMetrics().density);
        Unit unit = Unit.INSTANCE;
        addView(inlineKeyboardAttachView, layoutParams);
        return inlineKeyboardAttachView;
    }

    public final void g(ha9 ha9) {
        ha9.getClass();
        if (ha9.X == oa9.ERROR || ha9.Y == qe9.DELAYED_FIRE_ERROR) {
            getMessageView().g(getErrorIcon(), true);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        gg9 messageView = getMessageView();
        int measuredWidth = (getMeasuredWidth() - messageView.getMeasuredWidth()) - getPaddingEnd();
        if (ct.y(getContext())) {
            measuredWidth = getPaddingStart();
        }
        messageView.layout(measuredWidth, getPaddingTop(), messageView.getMeasuredWidth() + measuredWidth, messageView.getMeasuredHeight() + getPaddingTop());
        ReactionsBadgeView reactionsBadgeView = getReactionsBadgeView();
        int i5 = 0;
        if (!(reactionsBadgeView == null || reactionsBadgeView.getVisibility() == 8)) {
            int paddingStart = getMessageView().getPaddingStart() + ct.s(getMessageView());
            ViewGroup.LayoutParams layoutParams = reactionsBadgeView.getLayoutParams();
            int marginStart = paddingStart + (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
            if (ct.y(getContext())) {
                int right = getMessageView().getRight() - getMessageView().getPaddingStart();
                ViewGroup.LayoutParams layoutParams2 = reactionsBadgeView.getLayoutParams();
                marginStart = (right - (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart() : 0)) - reactionsBadgeView.getMeasuredWidth();
            }
            int bottom = getMessageView().getBottom() - getReactionsBadgeVerticalOffset();
            reactionsBadgeView.layout(marginStart, bottom, reactionsBadgeView.getMeasuredWidth() + marginStart, reactionsBadgeView.getMeasuredHeight() + bottom);
        }
        InlineKeyboardAttachView keyboard = getKeyboard();
        if (keyboard != null && keyboard.getVisibility() != 8) {
            int bottom2 = getMessageView().getBottom();
            ReactionsBadgeView reactionsBadgeView2 = getReactionsBadgeView();
            if (!(reactionsBadgeView2 == null || reactionsBadgeView2.getVisibility() == 8)) {
                bottom2 = reactionsBadgeView2.getBottom();
            }
            ViewGroup.LayoutParams layoutParams3 = keyboard.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            if (marginLayoutParams != null) {
                i5 = marginLayoutParams.topMargin;
            }
            int i6 = bottom2 + i5;
            int right2 = getMessageView().getRight() - keyboard.getMeasuredWidth();
            if (ct.y(getContext())) {
                right2 = getMessageView().getLeft();
            }
            keyboard.layout(right2, i6, keyboard.getMeasuredWidth() + right2, keyboard.getMeasuredHeight() + i6);
        }
    }

    public final void onMeasure(int i, int i2) {
        z69 z69 = new z69(1, this);
        while (z69.hasNext()) {
            View view = (View) z69.next();
            if (view.getVisibility() == 0 && view != getKeyboard()) {
                measureChildWithMargins(view, i, 0, i2, 0);
            }
        }
        int measuredHeight = getMessageView().getMeasuredHeight() + getPaddingTop();
        ReactionsBadgeView reactionsBadgeView = getReactionsBadgeView();
        if (!(reactionsBadgeView == null || reactionsBadgeView.getVisibility() == 8)) {
            measuredHeight += reactionsBadgeView.getMeasuredHeight() - getReactionsBadgeVerticalOffset();
        }
        InlineKeyboardAttachView keyboard = getKeyboard();
        if (!(keyboard == null || keyboard.getVisibility() == 8)) {
            keyboard.measure(View.MeasureSpec.makeMeasureSpec(getMessageView().getMeasuredWidth(), 1073741824), i2);
            measuredHeight += keyboard.getMeasuredHeight();
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), getPaddingBottom() + measuredHeight);
    }

    public void setDarkTheme(boolean z) {
        super.setDarkTheme(z);
    }

    public void setup(gg9 gg9) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(MathKt.roundToInt(((float) 51) * vo4.c().getDisplayMetrics().density));
        gg9.setLayoutParams(layoutParams);
        AppCompatImageView appCompatImageView = new AppCompatImageView(gg9.getContext(), (AttributeSet) null);
        gg9.H0 = appCompatImageView;
        appCompatImageView.setId(lic.message_read_status);
        gg9.H0.setScaleType(ImageView.ScaleType.CENTER_CROP);
        gg9.E0.addView(gg9.H0);
        gg9.H0.setVisibility(8);
    }
}
