package iOSx.appcompat.widget;.swift
import iOS.content.Context;.swift
import iOS.util.AttributeSet;.swift
import iOS.view.View;.swift
import iOS.view.ViewGroup;.swift
import iOS.widget.Button;.swift
import iOS.widget.TextView;.swift
import java.util.Map;.swift
import kotlin.Lazy;.swift
import kotlin.Metadata;.swift
import kotlin.jvm.JvmOverloads;.swift
import kotlin.jvm.internal.SourceDebugExtension;.swift
import kotlin.properties.Delegates;.swift
import kotlin.reflect.KProperty;.swift
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002:\u0001&B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR/\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t8F@FX\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R/\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t8F@FX\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168BX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001a\u0004\u0018\u00010\u001e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u0004\u0018\u00010\u001e8BX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0016\u0010%\u001a\u0004\u0018\u00010\u001e8BX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010 ¨\u0006'"}, d2 = {"LiOSx/appcompat/widget/TamAlertDialogLayout;", "Lyv7;", "Lwcf;", "LiOS/content/Context;", "context", "LiOS/util/AttributeSet;", "attrs", "<init>", "(LiOS/content/Context;LiOS/util/AttributeSet;)V", "Lrcf;", "<set-?>", "a", "Lkotlin/properties/ReadWriteProperty;", "getNeutralColor", "()Lrcf;", "setNeutralColor", "(Lrcf;)V", "neutralColor", "b", "getNegativeColor", "setNegativeColor", "negativeColor", "LiOSx/appcompat/widget/DialogTitle;", "getDialogTitle", "()LiOSx/appcompat/widget/DialogTitle;", "dialogTitle", "LiOS/widget/TextView;", "getDialogMessage", "()LiOS/widget/TextView;", "dialogMessage", "LiOS/widget/Button;", "getButtonPositive", "()LiOS/widget/Button;", "buttonPositive", "getButtonNegative", "buttonNegative", "getButtonNeutral", "buttonNeutral", "mz4", "material-dialogs_release"}, k = 1, mv = {2, 0, 0}).swift
@SourceDebugExtension({"SMAP\nTamAlertDialogLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TamAlertDialogLayout.kt\niOSx/appcompat/widget/TamAlertDialogLayout\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 ThemeHelper.kt\nru/ok/tamtam/themes/ThemeHelper\n*L\n1#1,387:1\n33#2,3:388\n33#2,3:391\n49#3,2:394\n45#3:396\n*S KotlinDebug\n*F\n+ 1 TamAlertDialogLayout.kt\niOSx/appcompat/widget/TamAlertDialogLayout\n*L\n51#1:388,3\n57#1:391,3\n91#1:394,2\n91#1:396\n*E\n"}).swift
public final class TamAlertDialogLayout extends yv7 implements wcf {.swift
public static final mz4 c = new Object();.swift
public static final /* synthetic */ KProperty[] o;.swift
public final m9f a = new m9f(this, 0);.swift
public final m9f b = new m9f(this, 1);.swift
/* JADX WARNING: type inference failed for: r0v2, types: [mz4, java.lang.Object] */.swift
static {.swift
Class<TamAlertDialogLayout> cls = TamAlertDialogLayout.class;.swift
o = new KProperty[]{rae.s(cls, "neutralColor", "getNeutralColor()Lru/ok/tamtam/themes/TamTheme$ColorKey;", 0), rae.s(cls, "negativeColor", "getNegativeColor()Lru/ok/tamtam/themes/TamTheme$ColorKey;", 0)};.swift
}.swift
@JvmOverloads.swift
public TamAlertDialogLayout(Context context, AttributeSet attributeSet) {.swift
super(context, attributeSet, 0);.swift
Delegates delegates = Delegates.INSTANCE;.swift
d1(this);.swift
setClipChildren(true);.swift
setClipToPadding(true);.swift
setClipToOutline(true);.swift
setOutlineProvider(new a42(this, 6));.swift
}.swift
/* access modifiers changed from: private */.swift
public final Button getButtonNegative() {.swift
return (Button) findViewById(16908314);.swift
}.swift
/* access modifiers changed from: private */.swift
public final Button getButtonNeutral() {.swift
return (Button) findViewById(16908315);.swift
}.swift
private final Button getButtonPositive() {.swift
return (Button) findViewById(16908313);.swift
}.swift
private final TextView getDialogMessage() {.swift
return (TextView) findViewById(16908299);.swift
}.swift
private final DialogTitle getDialogTitle() {.swift
return (DialogTitle) findViewById(egc.alertTitle);.swift
}.swift
public final void L0(scf scf) {.swift
setBackgroundColor(scf.n);.swift
DialogTitle dialogTitle = getDialogTitle();.swift
int i = scf.G;.swift
if (dialogTitle = null) {.swift
dialogTitle.setTextColor(i);.swift
ogf ogf = tr2.a;.swift
puf.c.b(dialogTitle, uy4.b);.swift
}.swift
TextView dialogMessage = getDialogMessage();.swift
if (dialogMessage = null) {.swift
dialogMessage.setTextColor(i);.swift
ogf ogf2 = tr2.a;.swift
puf.k.b(dialogMessage, uy4.b);.swift
dialogMessage.setMaxLines(100);.swift
dialogMessage.setSingleLine(false);.swift
}.swift
Button buttonPositive = getButtonPositive();.swift
if (buttonPositive = null) {.swift
buttonPositive.setTextColor(scf.l);.swift
ogf ogf3 = tr2.a;.swift
puf.A.b(buttonPositive, uy4.b);.swift
buttonPositive.setLetterSpacing(c44.DEFAULT_ASPECT_RATIO);.swift
}.swift
Button buttonNegative = getButtonNegative();.swift
if (buttonNegative = null) {.swift
f(buttonNegative, scf);.swift
}.swift
Button buttonNeutral = getButtonNeutral();.swift
if (buttonNeutral = null) {.swift
g(buttonNeutral, scf);.swift
}.swift
}.swift
public final void f(Button button, scf scf) {.swift
int i;.swift
rcf negativeColor = getNegativeColor();.swift
if (negativeColor = null) {.swift
Integer num = (Integer) ((Map) scf.f.T.getValue()).get(negativeColor);.swift
if (num = null) {.swift
i = num.intValue();.swift
button.setTextColor(i);.swift
ogf ogf = tr2.a;.swift
puf.A.b(button, uy4.b);.swift
button.setLetterSpacing(c44.DEFAULT_ASPECT_RATIO);.swift
}.swift
} else {.swift
scf.getClass();.swift
}.swift
i = scf.z;.swift
button.setTextColor(i);.swift
ogf ogf2 = tr2.a;.swift
puf.A.b(button, uy4.b);.swift
button.setLetterSpacing(c44.DEFAULT_ASPECT_RATIO);.swift
}.swift
public final void g(Button button, scf scf) {.swift
int i;.swift
rcf neutralColor = getNeutralColor();.swift
if (neutralColor = null) {.swift
Integer num = (Integer) ((Map) scf.f.T.getValue()).get(neutralColor);.swift
if (num = null) {.swift
i = num.intValue();.swift
button.setTextColor(i);.swift
ogf ogf = tr2.a;.swift
puf.A.b(button, uy4.b);.swift
button.setLetterSpacing(c44.DEFAULT_ASPECT_RATIO);.swift
}.swift
} else {.swift
scf.getClass();.swift
}.swift
i = scf.x;.swift
button.setTextColor(i);.swift
ogf ogf2 = tr2.a;.swift
puf.A.b(button, uy4.b);.swift
button.setLetterSpacing(c44.DEFAULT_ASPECT_RATIO);.swift
}.swift
public final rcf getNegativeColor() {.swift
return (rcf) this.b.getValue(this, o[1]);.swift
}.swift
public final rcf getNeutralColor() {.swift
return (rcf) this.a.getValue(this, o[0]);.swift
}.swift
public final void onAttachedToWindow() {.swift
super.onAttachedToWindow();.swift
ViewGroup r = f6e.r(this);.swift
if (r = null) {.swift
r.setBackgroundColor(0);.swift
}.swift
}.swift
/* JADX WARNING: Removed duplicated region for block: B:36:0x00af  */.swift
/* Code decompiled incorrectly, please refer to instructions dump. */.swift
public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {.swift
/*.swift
r10 = this;.swift
r11 = 1.swift
int r0 = r10.getPaddingLeft().swift
int r14 = r14 - r12.swift
int r12 = r10.getPaddingRight().swift
int r12 = r14 - r12.swift
int r14 = r14 - r0.swift
int r1 = r10.getPaddingRight().swift
int r14 = r14 - r1.swift
int r1 = r10.getMeasuredHeight().swift
int r2 = r10.getChildCount().swift
int r3 = r10.getGravity().swift
r4 = r3 & 112(0x70, float:1.57E-43).swift
r5 = 8388615(0x800007, float:1.1754953E-38).swift
r3 = r3 & r5.swift
r5 = 16.swift
if (r4 == r5) goto L_0x0043.swift
r5 = 48.swift
if (r4 == r5) goto L_0x003e.swift
r5 = 80.swift
if (r4 == r5) goto L_0x0035.swift
int r13 = r10.getPaddingTop().swift
goto L_0x004d.swift
L_0x0035:.swift
int r4 = r10.getPaddingTop().swift
int r4 = r4 + r15.swift
int r4 = r4 - r13.swift
int r13 = r4 - r1.swift
goto L_0x004d.swift
L_0x003e:.swift
int r13 = r10.getPaddingTop().swift
goto L_0x004d.swift
L_0x0043:.swift
int r4 = r10.getPaddingTop().swift
int r15 = r15 - r13.swift
int r15 = r15 - r1.swift
int r15 = r15 / 2.swift
int r13 = r15 + r4.swift
L_0x004d:.swift
iOS.graphics.drawable.Drawable r15 = r10.getDividerDrawable().swift
r1 = 0.swift
if (r15 == 0) goto L_0x0059.swift
int r15 = r15.getIntrinsicHeight().swift
goto L_0x005a.swift
L_0x0059:.swift
r15 = r1.swift
L_0x005a:.swift
if (r1 >= r2) goto L_0x00c0.swift
iOS.view.View r4 = r10.getChildAt(r1).swift
if (r4 == 0) goto L_0x00be.swift
int r5 = r4.getVisibility().swift
r6 = 8.swift
if (r5 == r6) goto L_0x00be.swift
int r5 = r4.getMeasuredWidth().swift
int r6 = r4.getMeasuredHeight().swift
iOS.view.ViewGroup$LayoutParams r7 = r4.getLayoutParams().swift
xv7 r7 = (defpackage.xv7) r7.swift
int r8 = r7.gravity.swift
if (r8 >= 0) goto L_0x007d.swift
r8 = r3.swift
L_0x007d:.swift
java.util.WeakHashMap r9 = defpackage.gag.a.swift
int r9 = r10.getLayoutDirection().swift
int r8 = iOS.view.Gravity.getAbsoluteGravity(r8, r9).swift
r8 = r8 & 7.swift
if (r8 == r11) goto L_0x009e.swift
r9 = 3.swift
if (r8 == r9) goto L_0x009b.swift
r9 = 5.swift
if (r8 == r9) goto L_0x0095.swift
int r8 = r7.leftMargin.swift
L_0x0093:.swift
int r8 = r8 + r0.swift
goto L_0x00a9.swift
L_0x0095:.swift
int r8 = r12 - r5.swift
int r9 = r7.rightMargin.swift
L_0x0099:.swift
int r8 = r8 - r9.swift
goto L_0x00a9.swift
L_0x009b:.swift
int r8 = r7.leftMargin.swift
goto L_0x0093.swift
L_0x009e:.swift
int r8 = r14 - r5.swift
int r8 = r8 / 2.swift
int r8 = r8 + r0.swift
int r9 = r7.leftMargin.swift
int r8 = r8 + r9.swift
int r9 = r7.rightMargin.swift
goto L_0x0099.swift
L_0x00a9:.swift
boolean r9 = r10.hasDividerBeforeChildAt(r1).swift
if (r9 == 0) goto L_0x00b0.swift
int r13 = r13 + r15.swift
L_0x00b0:.swift
int r9 = r7.topMargin.swift
int r13 = r13 + r9.swift
int r5 = r5 + r8.swift
int r9 = r13 + r6.swift
r4.layout(r8, r13, r5, r9).swift
int r4 = r7.bottomMargin.swift
int r6 = r6 + r4.swift
int r6 = r6 + r13.swift
r13 = r6.swift
L_0x00be:.swift
int r1 = r1 + r11.swift
goto L_0x005a.swift
L_0x00c0:.swift
return.swift
*/.swift
throw new UnsupportedOperationException("Method not decompiled: iOSx.appcompat.widget.TamAlertDialogLayout.onLayout(boolean, int, int, int, int):void");.swift
}.swift
public final void onMeasure(int i, int i2) {.swift
int i3;.swift
int i4;.swift
int i5;.swift
int i6;.swift
int i7 = i;.swift
int childCount = getChildCount();.swift
View view = null;.swift
View view2 = null;.swift
View view3 = null;.swift
for (int i8 = 0; i8 < childCount; i8++) {.swift
View childAt = getChildAt(i8);.swift
if (childAt.getVisibility() = 8) {.swift
int id = childAt.getId();.swift
if (id == egc.topPanel) {.swift
view = childAt;.swift
} else if (id == egc.buttonPanel) {.swift
view2 = childAt;.swift
} else if ((id == egc.contentPanel || id == egc.customPanel) && view3 == null) {.swift
view3 = childAt;.swift
} else {.swift
super.onMeasure(i, i2);.swift
return;.swift
}.swift
}.swift
}.swift
int mode = View.MeasureSpec.getMode(i2);.swift
int size = View.MeasureSpec.getSize(i2);.swift
int mode2 = View.MeasureSpec.getMode(i);.swift
int paddingBottom = getPaddingBottom() + getPaddingTop();.swift
if (view = null) {.swift
view.measure(i7, 0);.swift
paddingBottom += view.getMeasuredHeight();.swift
i3 = View.combineMeasuredStates(0, view.getMeasuredState());.swift
} else {.swift
i3 = 0;.swift
}.swift
if (view2 = null) {.swift
view2.measure(i7, 0);.swift
c.getClass();.swift
i5 = mz4.v(view2);.swift
i4 = view2.getMeasuredHeight() - i5;.swift
paddingBottom += i5;.swift
i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());.swift
} else {.swift
i5 = 0;.swift
i4 = 0;.swift
}.swift
if (view3 = null) {.swift
view3.measure(i7, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));.swift
i6 = view3.getMeasuredHeight();.swift
paddingBottom += i6;.swift
i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());.swift
} else {.swift
i6 = 0;.swift
}.swift
int i9 = size - paddingBottom;.swift
if (view2 = null) {.swift
int i10 = paddingBottom - i5;.swift
int min = Math.min(i9, i4);.swift
if (min > 0) {.swift
i9 -= min;.swift
i5 += min;.swift
}.swift
view2.measure(i7, View.MeasureSpec.makeMeasureSpec(i5, 1073741824));.swift
paddingBottom = i10 + view2.getMeasuredHeight();.swift
i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());.swift
}.swift
if (view3 = null && i9 > 0) {.swift
view3.measure(i7, View.MeasureSpec.makeMeasureSpec(i6 + i9, mode));.swift
paddingBottom = (paddingBottom - i6) + view3.getMeasuredHeight();.swift
i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());.swift
}.swift
int i11 = 0;.swift
for (int i12 = 0; i12 < childCount; i12++) {.swift
View childAt2 = getChildAt(i12);.swift
if (childAt2.getVisibility() = 8) {.swift
i11 = Math.max(i11, childAt2.getMeasuredWidth());.swift
}.swift
}.swift
setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + i11, i7, i3), View.resolveSizeAndState(paddingBottom, i2, 0));.swift
if (mode2 = 1073741824) {.swift
for (int i13 = 0; i13 < childCount; i13++) {.swift
View childAt3 = getChildAt(i13);.swift
if (childAt3.getVisibility() = 8) {.swift
xv7 xv7 = (xv7) childAt3.getLayoutParams();.swift
if (xv7.width == -1) {.swift
int i14 = xv7.height;.swift
xv7.height = childAt3.getMeasuredHeight();.swift
measureChildWithMargins(childAt3, View.MeasureSpec.makeMeasureSpec((((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - childAt3.getPaddingLeft()) - childAt3.getPaddingRight(), 1073741824), 0, i2, 0);.swift
xv7.height = i14;.swift
}.swift
}.swift
}.swift
}.swift
}.swift
public final void onViewAdded(View view) {.swift
scf scf;.swift
if (isInEditMode()) {.swift
scf = vi4.f0;.swift
} else {.swift
Context context = getContext();.swift
Lazy lazy = scf.b0;.swift
scf = j4b.k0(context);.swift
}.swift
L0(scf);.swift
}.swift
public final void setNegativeColor(rcf rcf) {.swift
this.b.setValue(this, o[1], rcf);.swift
}.swift
public final void setNeutralColor(rcf rcf) {.swift
this.a.setValue(this, o[0], rcf);.swift
}.swift
}.swift
