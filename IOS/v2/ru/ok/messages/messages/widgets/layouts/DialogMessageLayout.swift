package ru.ok.messages.messages.widgets.layouts;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import ru.ok.messages.bots.InlineKeyboardAttachView;
import ru.ok.onechat.reactions.ui.badge.ReactionsBadgeView;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ok/messages/messages/widgets/layouts/DialogMessageLayout;", "Lkg9;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lgg9;", "", "setup", "(Lgg9;)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDialogMessageLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogMessageLayout.kt\nru/ok/messages/messages/widgets/layouts/DialogMessageLayout\n+ 2 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 MessageWithReplyLayout.kt\nru/ok/messages/messages/widgets/MessageWithReplyLayout\n*L\n1#1,144:1\n24#2:145\n24#2:148\n24#2:149\n24#2:150\n24#2:151\n24#2:154\n172#3,2:146\n256#3,2:152\n254#3:156\n254#3:160\n347#3:164\n375#3,2:166\n375#3,2:168\n375#3,2:172\n375#3,2:174\n347#3:176\n365#3:180\n347#3:188\n1317#4:155\n1318#4:157\n164#5,2:158\n167#5:161\n164#5,2:162\n167#5:165\n164#5,2:170\n167#5:177\n164#5,2:178\n167#5:181\n164#5,2:182\n164#5,4:184\n167#5:189\n*S KotlinDebug\n*F\n+ 1 DialogMessageLayout.kt\nru/ok/messages/messages/widgets/layouts/DialogMessageLayout\n*L\n24#1:145\n29#1:148\n30#1:149\n41#1:150\n42#1:151\n54#1:154\n24#1:146,2\n50#1:152,2\n60#1:156\n70#1:160\n80#1:164\n92#1:166,2\n94#1:168,2\n99#1:172,2\n101#1:174,2\n103#1:176\n114#1:180\n130#1:188\n59#1:155\n59#1:157\n69#1:158,2\n69#1:161\n75#1:162,2\n75#1:165\n98#1:170,2\n98#1:177\n112#1:178,2\n112#1:181\n125#1:182,2\n127#1:184,4\n125#1:189\n*E\n"})
public final class DialogMessageLayout extends kg9 {
    @JvmOverloads
    public DialogMessageLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int roundToInt = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
        setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
    }

    public final AppCompatImageView d() {
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), (AttributeSet) null);
        appCompatImageView.setId(lic.row_message_in_forward);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        float f = (float) 32;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        layoutParams.bottomMargin = MathKt.roundToInt(((float) 3) * vo4.c().getDisplayMetrics().density);
        Unit unit = Unit.INSTANCE;
        addView(appCompatImageView, layoutParams);
        return appCompatImageView;
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

    /* JADX WARNING: type inference failed for: r12v4, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            gg9 r4 = r9.getMessageView()
            int r10 = r9.getPaddingLeft()
            gg9 r11 = r9.getMessageView()
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            boolean r12 = r11 instanceof android.view.ViewGroup.MarginLayoutParams
            r13 = 0
            if (r12 == 0) goto L_0x001c
            android.view.ViewGroup$MarginLayoutParams r11 = (android.view.ViewGroup.MarginLayoutParams) r11
            int r11 = r11.getMarginStart()
            goto L_0x001d
        L_0x001c:
            r11 = r13
        L_0x001d:
            int r0 = r10 + r11
            int r1 = r9.getPaddingTop()
            int r10 = r9.getPaddingLeft()
            gg9 r11 = r9.getMessageView()
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            boolean r12 = r11 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r12 == 0) goto L_0x003a
            android.view.ViewGroup$MarginLayoutParams r11 = (android.view.ViewGroup.MarginLayoutParams) r11
            int r11 = r11.getMarginStart()
            goto L_0x003b
        L_0x003a:
            r11 = r13
        L_0x003b:
            int r10 = r10 + r11
            gg9 r11 = r9.getMessageView()
            int r11 = r11.getMeasuredWidth()
            int r2 = r11 + r10
            int r10 = r9.getPaddingTop()
            gg9 r11 = r9.getMessageView()
            int r11 = r11.getMeasuredHeight()
            int r3 = r11 + r10
            r5 = r9
            defpackage.iq.J(r0, r1, r2, r3, r4, r5)
            ru.ok.onechat.reactions.ui.badge.ReactionsBadgeView r10 = r9.getReactionsBadgeView()
            r11 = 0
            r12 = 8
            if (r10 == 0) goto L_0x00e3
            int r14 = r10.getVisibility()
            if (r14 == r12) goto L_0x00e3
            gg9 r14 = r9.getMessageView()
            int r14 = defpackage.ct.s(r14)
            gg9 r0 = r9.getMessageView()
            int r0 = r0.getPaddingStart()
            int r0 = r0 + r14
            android.view.ViewGroup$LayoutParams r14 = r10.getLayoutParams()
            boolean r1 = r14 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L_0x0087
            android.view.ViewGroup$MarginLayoutParams r14 = (android.view.ViewGroup.MarginLayoutParams) r14
            int r14 = r14.getMarginStart()
            goto L_0x0088
        L_0x0087:
            r14 = r13
        L_0x0088:
            int r0 = r0 + r14
            android.content.Context r14 = r9.getContext()
            boolean r14 = defpackage.ct.y(r14)
            if (r14 == 0) goto L_0x00bb
            gg9 r14 = r9.getMessageView()
            int r14 = r14.getRight()
            gg9 r0 = r9.getMessageView()
            int r0 = r0.getPaddingStart()
            int r14 = r14 - r0
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L_0x00b3
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r0 = r0.getMarginStart()
            goto L_0x00b4
        L_0x00b3:
            r0 = r13
        L_0x00b4:
            int r14 = r14 - r0
            int r0 = r10.getMeasuredWidth()
            int r0 = r14 - r0
        L_0x00bb:
            gg9 r14 = r9.getMessageView()
            int r14 = r14.getBottom()
            android.view.ViewGroup$LayoutParams r1 = r10.getLayoutParams()
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L_0x00ce
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto L_0x00cf
        L_0x00ce:
            r1 = r11
        L_0x00cf:
            if (r1 == 0) goto L_0x00d4
            int r1 = r1.topMargin
            goto L_0x00d5
        L_0x00d4:
            r1 = r13
        L_0x00d5:
            int r14 = r14 + r1
            int r1 = r10.getMeasuredWidth()
            int r1 = r1 + r0
            int r2 = r10.getMeasuredHeight()
            int r2 = r2 + r14
            r10.layout(r0, r14, r1, r2)
        L_0x00e3:
            androidx.appcompat.widget.AppCompatImageView r7 = r9.getForward()
            if (r7 == 0) goto L_0x012a
            int r10 = r7.getVisibility()
            if (r10 == r12) goto L_0x012a
            int r10 = r9.getMeasuredWidth()
            int r14 = r7.getMeasuredWidth()
            int r3 = r10 - r14
            gg9 r10 = r9.getMessageView()
            int r10 = r10.getBottom()
            int r14 = r7.getMeasuredHeight()
            int r10 = r10 - r14
            android.view.ViewGroup$LayoutParams r14 = r7.getLayoutParams()
            boolean r0 = r14 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0111
            android.view.ViewGroup$MarginLayoutParams r14 = (android.view.ViewGroup.MarginLayoutParams) r14
            goto L_0x0112
        L_0x0111:
            r14 = r11
        L_0x0112:
            if (r14 == 0) goto L_0x0117
            int r14 = r14.bottomMargin
            goto L_0x0118
        L_0x0117:
            r14 = r13
        L_0x0118:
            int r4 = r10 - r14
            int r10 = r7.getMeasuredWidth()
            int r5 = r10 + r3
            int r10 = r7.getMeasuredHeight()
            int r6 = r10 + r4
            r8 = r9
            defpackage.iq.J(r3, r4, r5, r6, r7, r8)
        L_0x012a:
            ru.ok.messages.bots.InlineKeyboardAttachView r10 = r9.getKeyboard()
            if (r10 == 0) goto L_0x018b
            int r14 = r10.getVisibility()
            if (r14 == r12) goto L_0x018b
            gg9 r14 = r9.getMessageView()
            int r14 = r14.getBottom()
            ru.ok.onechat.reactions.ui.badge.ReactionsBadgeView r0 = r9.getReactionsBadgeView()
            if (r0 == 0) goto L_0x014e
            int r1 = r0.getVisibility()
            if (r1 == r12) goto L_0x014e
            int r14 = r0.getBottom()
        L_0x014e:
            android.view.ViewGroup$LayoutParams r12 = r10.getLayoutParams()
            boolean r0 = r12 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0159
            r11 = r12
            android.view.ViewGroup$MarginLayoutParams r11 = (android.view.ViewGroup.MarginLayoutParams) r11
        L_0x0159:
            if (r11 == 0) goto L_0x015d
            int r13 = r11.topMargin
        L_0x015d:
            int r14 = r14 + r13
            gg9 r11 = r9.getMessageView()
            int r11 = r11.getLeft()
            android.content.Context r12 = r9.getContext()
            boolean r12 = defpackage.ct.y(r12)
            if (r12 == 0) goto L_0x017e
            gg9 r9 = r9.getMessageView()
            int r9 = r9.getRight()
            int r11 = r10.getMeasuredWidth()
            int r11 = r9 - r11
        L_0x017e:
            int r9 = r10.getMeasuredWidth()
            int r9 = r9 + r11
            int r12 = r10.getMeasuredHeight()
            int r12 = r12 + r14
            r10.layout(r11, r14, r9, r12)
        L_0x018b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.messages.widgets.layouts.DialogMessageLayout.onLayout(boolean, int, int, int, int):void");
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
        if (!(reactionsBadgeView == null || reactionsBadgeView.getVisibility() == 8 || reactionsBadgeView.getVisibility() != 0)) {
            measuredHeight += reactionsBadgeView.getMeasuredHeight() - getReactionsBadgeVerticalOffset();
        }
        InlineKeyboardAttachView keyboard = getKeyboard();
        if (!(keyboard == null || keyboard.getVisibility() == 8)) {
            keyboard.measure(View.MeasureSpec.makeMeasureSpec(getMessageView().getMeasuredWidth(), 1073741824), i2);
            int measuredHeight2 = keyboard.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = keyboard.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            measuredHeight += measuredHeight2 + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), getPaddingBottom() + measuredHeight);
    }

    public void setup(gg9 gg9) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(MathKt.roundToInt(((float) 3) * vo4.c().getDisplayMetrics().density));
        layoutParams.setMarginEnd(MathKt.roundToInt(((float) 30) * vo4.c().getDisplayMetrics().density));
        gg9.setLayoutParams(layoutParams);
    }
}
