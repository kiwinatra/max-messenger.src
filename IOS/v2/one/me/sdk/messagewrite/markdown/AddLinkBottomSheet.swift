package one.me.sdk.messagewrite.markdown;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Selection;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/sdk/messagewrite/markdown/AddLinkBottomSheet;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Legd;", "scopeId", "Lta;", "addLinkState", "(Ljava/lang/String;Lta;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "message-write-widget_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAddLinkBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddLinkBottomSheet.kt\none/me/sdk/messagewrite/markdown/AddLinkBottomSheet\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 ContextExt.kt\none/me/sdk/arch/ext/ContextExtKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n+ 8 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,146:1\n420#2:147\n255#2,9:148\n24#3:157\n24#3:158\n24#3:159\n24#3:170\n24#3:173\n24#3:185\n24#3:212\n142#4,8:160\n148#4,2:171\n17#5:168\n1#6:169\n213#7,11:174\n58#8,23:186\n93#8,3:209\n*S KotlinDebug\n*F\n+ 1 AddLinkBottomSheet.kt\none/me/sdk/messagewrite/markdown/AddLinkBottomSheet\n*L\n38#1:147\n44#1:148,9\n73#1:157\n74#1:158\n79#1:159\n93#1:170\n94#1:173\n99#1:185\n133#1:212\n79#1:160,8\n93#1:171,2\n83#1:168\n94#1:174,11\n106#1:186,23\n106#1:209,3\n*E\n"})
public final class AddLinkBottomSheet extends BaseBottomSheetWidget {
    public static final /* synthetic */ KProperty[] Z;
    public final ReadOnlyProperty X;
    public final Lazy Y;
    public final ta y;
    public final ReadOnlyProperty z;

    static {
        Class<AddLinkBottomSheet> cls = AddLinkBottomSheet.class;
        Z = new KProperty[]{rae.s(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0), wj6.p(cls, "editText", "getEditText()Landroidx/appcompat/widget/AppCompatEditText;", 0), wj6.p(cls, "button", "getButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    }

    public AddLinkBottomSheet(Bundle bundle) {
        super(bundle);
        is isVar = new is(egd.class, Widget.ARG_SCOPE_ID);
        Parcelable parcelable = bundle.getParcelable("bottom_sheet:add_link:key");
        if (parcelable != null) {
            this.y = (ta) parcelable;
            this.z = viewBinding(xya.v);
            this.X = viewBinding(xya.u);
            KProperty kProperty = Z[0];
            this.Y = m1571getSharedViewModelcp94BC8(((egd) isVar.a(this)).a, kf8.class, (Function0) null);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final frb d0() {
        return new qa(this, 0);
    }

    public final yh7 e0() {
        return new yh7((jdb) null, new nr0(jdb.b, mr0.c, false), 1);
    }

    public final void m0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        FrameLayout frameLayout2 = frameLayout;
        int roundToInt = MathKt.roundToInt(((float) 10) * vo4.c().getDisplayMetrics().density);
        float f = (float) 12;
        float f2 = (float) 8;
        frameLayout2.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), roundToInt, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f3 = (float) 16;
        int roundToInt2 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3);
        textView.setPaddingRelative(textView.getPaddingStart(), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), textView.getPaddingEnd(), roundToInt2);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        textView.setText(q8.p(yya.o, getContext()));
        puf.c.b(textView, uy4.b);
        b0h.H(textView, new ra(3, (Continuation) null, 0));
        linearLayout.addView(textView);
        AppCompatEditText appCompatEditText = new AppCompatEditText(linearLayout.getContext(), (AttributeSet) null);
        appCompatEditText.setId(xya.v);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        appCompatEditText.setPaddingRelative(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        int roundToInt3 = MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density);
        int roundToInt4 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        int roundToInt5 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        int i = layoutParams2.topMargin;
        layoutParams2.setMarginStart(roundToInt4);
        layoutParams2.topMargin = i;
        layoutParams2.setMarginEnd(roundToInt5);
        layoutParams2.bottomMargin = roundToInt3;
        appCompatEditText.setLayoutParams(layoutParams2);
        puf.k.b(appCompatEditText, uy4.b);
        appCompatEditText.setClipToOutline(true);
        appCompatEditText.setOutlineProvider(new n04((float) MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
        appCompatEditText.setInputType(524288);
        String str = this.y.c;
        if (str == null) {
            str = "https://";
        }
        appCompatEditText.setText(str);
        Editable text = appCompatEditText.getText();
        if (text != null) {
            Selection.setSelection(text, text.length());
        }
        appCompatEditText.requestFocus();
        appCompatEditText.addTextChangedListener(new u2(1, this));
        b0h.H(appCompatEditText, new sa(3, (Continuation) null, 0));
        linearLayout.addView(appCompatEditText);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(xya.u);
        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        oneMeButton.setSize(aqa.c);
        oneMeButton.setMode(zpa.o);
        oneMeButton.setAppearance(xpa.c);
        oneMeButton.setText(yya.n);
        ct.G(oneMeButton, 300, new x4(8, (Object) this));
        linearLayout.addView(oneMeButton);
        frameLayout2.addView(linearLayout, -1, -2);
        nu4 nu4 = new nu4(frameLayout.getContext());
        nu4.setTranslationY((float) g63.b((float) 6, vo4.c().getDisplayMetrics().density, -roundToInt));
        frameLayout2.addView(nu4);
    }

    public final void onViewCreated(View view) {
        KProperty[] kPropertyArr = Z;
        OneMeButton oneMeButton = (OneMeButton) this.X.getValue(this, kPropertyArr[2]);
        boolean z2 = true;
        KProperty kProperty = kPropertyArr[1];
        ReadOnlyProperty readOnlyProperty = this.z;
        Editable text = ((AppCompatEditText) readOnlyProperty.getValue(this, kProperty)).getText();
        if (text == null || text.length() == 0 || StringsKt.contentEquals((CharSequence) ((AppCompatEditText) readOnlyProperty.getValue(this, kPropertyArr[1])).getText(), (CharSequence) "https://")) {
            z2 = false;
        }
        oneMeButton.setEnabled(z2);
    }

    public AddLinkBottomSheet(String str, ta taVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(i2a.l(str, Widget.ARG_SCOPE_ID), TuplesKt.to("bottom_sheet:add_link:key", taVar)));
    }
}
