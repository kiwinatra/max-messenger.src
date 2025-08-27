package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002:\u0001&B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR/\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t8F@FX\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R/\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t8F@FX\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168BX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u0004\u0018\u00010\u001e8BX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0016\u0010%\u001a\u0004\u0018\u00010\u001e8BX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010 ¨\u0006'"}, d2 = {"Landroidx/appcompat/widget/TamAlertDialogLayout;", "Lyv7;", "Lwcf;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lrcf;", "<set-?>", "a", "Lkotlin/properties/ReadWriteProperty;", "getNeutralColor", "()Lrcf;", "setNeutralColor", "(Lrcf;)V", "neutralColor", "b", "getNegativeColor", "setNegativeColor", "negativeColor", "Landroidx/appcompat/widget/DialogTitle;", "getDialogTitle", "()Landroidx/appcompat/widget/DialogTitle;", "dialogTitle", "Landroid/widget/TextView;", "getDialogMessage", "()Landroid/widget/TextView;", "dialogMessage", "Landroid/widget/Button;", "getButtonPositive", "()Landroid/widget/Button;", "buttonPositive", "getButtonNegative", "buttonNegative", "getButtonNeutral", "buttonNeutral", "mz4", "material-dialogs_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTamAlertDialogLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TamAlertDialogLayout.kt\nandroidx/appcompat/widget/TamAlertDialogLayout\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 ThemeHelper.kt\nru/ok/tamtam/themes/ThemeHelper\n*L\n1#1,387:1\n33#2,3:388\n33#2,3:391\n49#3,2:394\n45#3:396\n*S KotlinDebug\n*F\n+ 1 TamAlertDialogLayout.kt\nandroidx/appcompat/widget/TamAlertDialogLayout\n*L\n51#1:388,3\n57#1:391,3\n91#1:394,2\n91#1:396\n*E\n"})
public final class TamAlertDialogLayout extends yv7 implements wcf {
    public static final mz4 c = new Object();
    public static final /* synthetic */ KProperty[] o;
    public final m9f a = new m9f(this, 0);
    public final m9f b = new m9f(this, 1);

    /* JADX WARNING: type inference failed for: r0v2, types: [mz4, java.lang.Object] */
    static {
        Class<TamAlertDialogLayout> cls = TamAlertDialogLayout.class;
        o = new KProperty[]{rae.s(cls, "neutralColor", "getNeutralColor()Lru/ok/tamtam/themes/TamTheme$ColorKey;", 0), rae.s(cls, "negativeColor", "getNegativeColor()Lru/ok/tamtam/themes/TamTheme$ColorKey;", 0)};
    }

    @JvmOverloads
    public TamAlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Delegates delegates = Delegates.INSTANCE;
        d1(this);
        setClipChildren(true);
        setClipToPadding(true);
        setClipToOutline(true);
        setOutlineProvider(new a42(this, 6));
    }

    /* access modifiers changed from: private */
    public final Button getButtonNegative() {
        return (Button) findViewById(16908314);
    }

    /* access modifiers changed from: private */
    public final Button getButtonNeutral() {
        return (Button) findViewById(16908315);
    }

    private final Button getButtonPositive() {
        return (Button) findViewById(16908313);
    }

    private final TextView getDialogMessage() {
        return (TextView) findViewById(16908299);
    }

    private final DialogTitle getDialogTitle() {
        return (DialogTitle) findViewById(egc.alertTitle);
    }

    public final void L0(scf scf) {
        setBackgroundColor(scf.n);
        DialogTitle dialogTitle = getDialogTitle();
        int i = scf.G;
        if (dialogTitle != null) {
            dialogTitle.setTextColor(i);
            ogf ogf = tr2.a;
            puf.c.b(dialogTitle, uy4.b);
        }
        TextView dialogMessage = getDialogMessage();
        if (dialogMessage != null) {
            dialogMessage.setTextColor(i);
            ogf ogf2 = tr2.a;
            puf.k.b(dialogMessage, uy4.b);
            dialogMessage.setMaxLines(100);
            dialogMessage.setSingleLine(false);
        }
        Button buttonPositive = getButtonPositive();
        if (buttonPositive != null) {
            buttonPositive.setTextColor(scf.l);
            ogf ogf3 = tr2.a;
            puf.A.b(buttonPositive, uy4.b);
            buttonPositive.setLetterSpacing(c44.DEFAULT_ASPECT_RATIO);
        }
        Button buttonNegative = getButtonNegative();
        if (buttonNegative != null) {
            f(buttonNegative, scf);
        }
        Button buttonNeutral = getButtonNeutral();
        if (buttonNeutral != null) {
            g(buttonNeutral, scf);
        }
    }

    public final void f(Button button, scf scf) {
        int i;
        rcf negativeColor = getNegativeColor();
        if (negativeColor != null) {
            Integer num = (Integer) ((Map) scf.f.T.getValue()).get(negativeColor);
            if (num != null) {
                i = num.intValue();
                button.setTextColor(i);
                ogf ogf = tr2.a;
                puf.A.b(button, uy4.b);
                button.setLetterSpacing(c44.DEFAULT_ASPECT_RATIO);
            }
        } else {
            scf.getClass();
        }
        i = scf.z;
        button.setTextColor(i);
        ogf ogf2 = tr2.a;
        puf.A.b(button, uy4.b);
        button.setLetterSpacing(c44.DEFAULT_ASPECT_RATIO);
    }

    public final void g(Button button, scf scf) {
        int i;
        rcf neutralColor = getNeutralColor();
        if (neutralColor != null) {
            Integer num = (Integer) ((Map) scf.f.T.getValue()).get(neutralColor);
            if (num != null) {
                i = num.intValue();
                button.setTextColor(i);
                ogf ogf = tr2.a;
                puf.A.b(button, uy4.b);
                button.setLetterSpacing(c44.DEFAULT_ASPECT_RATIO);
            }
        } else {
            scf.getClass();
        }
        i = scf.x;
        button.setTextColor(i);
        ogf ogf2 = tr2.a;
        puf.A.b(button, uy4.b);
        button.setLetterSpacing(c44.DEFAULT_ASPECT_RATIO);
    }

    public final rcf getNegativeColor() {
        return (rcf) this.b.getValue(this, o[1]);
    }

    public final rcf getNeutralColor() {
        return (rcf) this.a.getValue(this, o[0]);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewGroup r = f6e.r(this);
        if (r != null) {
            r.setBackgroundColor(0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        /*
            r10 = this;
            r11 = 1
            int r0 = r10.getPaddingLeft()
            int r14 = r14 - r12
            int r12 = r10.getPaddingRight()
            int r12 = r14 - r12
            int r14 = r14 - r0
            int r1 = r10.getPaddingRight()
            int r14 = r14 - r1
            int r1 = r10.getMeasuredHeight()
            int r2 = r10.getChildCount()
            int r3 = r10.getGravity()
            r4 = r3 & 112(0x70, float:1.57E-43)
            r5 = 8388615(0x800007, float:1.1754953E-38)
            r3 = r3 & r5
            r5 = 16
            if (r4 == r5) goto L_0x0043
            r5 = 48
            if (r4 == r5) goto L_0x003e
            r5 = 80
            if (r4 == r5) goto L_0x0035
            int r13 = r10.getPaddingTop()
            goto L_0x004d
        L_0x0035:
            int r4 = r10.getPaddingTop()
            int r4 = r4 + r15
            int r4 = r4 - r13
            int r13 = r4 - r1
            goto L_0x004d
        L_0x003e:
            int r13 = r10.getPaddingTop()
            goto L_0x004d
        L_0x0043:
            int r4 = r10.getPaddingTop()
            int r15 = r15 - r13
            int r15 = r15 - r1
            int r15 = r15 / 2
            int r13 = r15 + r4
        L_0x004d:
            android.graphics.drawable.Drawable r15 = r10.getDividerDrawable()
            r1 = 0
            if (r15 == 0) goto L_0x0059
            int r15 = r15.getIntrinsicHeight()
            goto L_0x005a
        L_0x0059:
            r15 = r1
        L_0x005a:
            if (r1 >= r2) goto L_0x00c0
            android.view.View r4 = r10.getChildAt(r1)
            if (r4 == 0) goto L_0x00be
            int r5 = r4.getVisibility()
            r6 = 8
            if (r5 == r6) goto L_0x00be
            int r5 = r4.getMeasuredWidth()
            int r6 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r7 = r4.getLayoutParams()
            xv7 r7 = (defpackage.xv7) r7
            int r8 = r7.gravity
            if (r8 >= 0) goto L_0x007d
            r8 = r3
        L_0x007d:
            java.util.WeakHashMap r9 = defpackage.gag.a
            int r9 = r10.getLayoutDirection()
            int r8 = android.view.Gravity.getAbsoluteGravity(r8, r9)
            r8 = r8 & 7
            if (r8 == r11) goto L_0x009e
            r9 = 3
            if (r8 == r9) goto L_0x009b
            r9 = 5
            if (r8 == r9) goto L_0x0095
            int r8 = r7.leftMargin
        L_0x0093:
            int r8 = r8 + r0
            goto L_0x00a9
        L_0x0095:
            int r8 = r12 - r5
            int r9 = r7.rightMargin
        L_0x0099:
            int r8 = r8 - r9
            goto L_0x00a9
        L_0x009b:
            int r8 = r7.leftMargin
            goto L_0x0093
        L_0x009e:
            int r8 = r14 - r5
            int r8 = r8 / 2
            int r8 = r8 + r0
            int r9 = r7.leftMargin
            int r8 = r8 + r9
            int r9 = r7.rightMargin
            goto L_0x0099
        L_0x00a9:
            boolean r9 = r10.hasDividerBeforeChildAt(r1)
            if (r9 == 0) goto L_0x00b0
            int r13 = r13 + r15
        L_0x00b0:
            int r9 = r7.topMargin
            int r13 = r13 + r9
            int r5 = r5 + r8
            int r9 = r13 + r6
            r4.layout(r8, r13, r5, r9)
            int r4 = r7.bottomMargin
            int r6 = r6 + r4
            int r6 = r6 + r13
            r13 = r6
        L_0x00be:
            int r1 = r1 + r11
            goto L_0x005a
        L_0x00c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.TamAlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == egc.topPanel) {
                    view = childAt;
                } else if (id == egc.buttonPanel) {
                    view2 = childAt;
                } else if ((id == egc.contentPanel || id == egc.customPanel) && view3 == null) {
                    view3 = childAt;
                } else {
                    super.onMeasure(i, i2);
                    return;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (view != null) {
            view.measure(i7, 0);
            paddingBottom += view.getMeasuredHeight();
            i3 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i3 = 0;
        }
        if (view2 != null) {
            view2.measure(i7, 0);
            c.getClass();
            i5 = mz4.v(view2);
            i4 = view2.getMeasuredHeight() - i5;
            paddingBottom += i5;
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
        }
        if (view3 != null) {
            view3.measure(i7, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            i6 = view3.getMeasuredHeight();
            paddingBottom += i6;
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        } else {
            i6 = 0;
        }
        int i9 = size - paddingBottom;
        if (view2 != null) {
            int i10 = paddingBottom - i5;
            int min = Math.min(i9, i4);
            if (min > 0) {
                i9 -= min;
                i5 += min;
            }
            view2.measure(i7, View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
            paddingBottom = i10 + view2.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        }
        if (view3 != null && i9 > 0) {
            view3.measure(i7, View.MeasureSpec.makeMeasureSpec(i6 + i9, mode));
            paddingBottom = (paddingBottom - i6) + view3.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        }
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8) {
                i11 = Math.max(i11, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + i11, i7, i3), View.resolveSizeAndState(paddingBottom, i2, 0));
        if (mode2 != 1073741824) {
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt3 = getChildAt(i13);
                if (childAt3.getVisibility() != 8) {
                    xv7 xv7 = (xv7) childAt3.getLayoutParams();
                    if (xv7.width == -1) {
                        int i14 = xv7.height;
                        xv7.height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, View.MeasureSpec.makeMeasureSpec((((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - childAt3.getPaddingLeft()) - childAt3.getPaddingRight(), 1073741824), 0, i2, 0);
                        xv7.height = i14;
                    }
                }
            }
        }
    }

    public final void onViewAdded(View view) {
        scf scf;
        if (isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context = getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context);
        }
        L0(scf);
    }

    public final void setNegativeColor(rcf rcf) {
        this.b.setValue(this, o[1], rcf);
    }

    public final void setNeutralColor(rcf rcf) {
        this.a.setValue(this, o[0], rcf);
    }
}
