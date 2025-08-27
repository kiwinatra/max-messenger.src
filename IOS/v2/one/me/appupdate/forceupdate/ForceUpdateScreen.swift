package one.me.appupdate.forceupdate;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/appupdate/forceupdate/ForceUpdateScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "app-update_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nForceUpdateScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForceUpdateScreen.kt\none/me/appupdate/forceupdate/ForceUpdateScreen\n+ 2 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 ConstraintSetExt.kt\none/me/sdk/uikit/common/ConstraintSetExtKt\n+ 5 ConstraintSetExt.kt\none/me/sdk/uikit/common/ConstraintSetBuilder\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n28#2:184\n24#2:185\n24#2:188\n24#2:191\n24#2:192\n24#2:193\n24#2:194\n24#2:195\n24#2:196\n24#2:197\n24#2:198\n24#2:199\n24#2:200\n24#2:201\n24#2:202\n24#2:203\n172#3,2:186\n172#3,2:189\n20#4:204\n21#4:215\n186#5,2:205\n186#5,2:207\n186#5,2:209\n186#5,2:211\n186#5,2:213\n1#6:216\n*S KotlinDebug\n*F\n+ 1 ForceUpdateScreen.kt\none/me/appupdate/forceupdate/ForceUpdateScreen\n*L\n49#1:184\n51#1:185\n69#1:188\n106#1:191\n109#1:192\n110#1:193\n111#1:194\n117#1:195\n118#1:196\n119#1:197\n120#1:198\n126#1:199\n127#1:200\n133#1:201\n134#1:202\n135#1:203\n51#1:186,2\n69#1:189,2\n150#1:204\n150#1:215\n151#1:205,2\n158#1:207,2\n164#1:209,2\n170#1:211,2\n176#1:213,2\n*E\n"})
public final class ForceUpdateScreen extends Widget {
    public static final /* synthetic */ int o = 0;
    public final yh7 a = new yh7((jdb) null, new nr0(jdb.b, mr0.a, false), 1);
    public final sq b;
    public final apa c;

    public ForceUpdateScreen() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
        nq nqVar = nq.a;
        this.b = (sq) nqVar.getAccessor().g(sq.class);
        this.c = (apa) nqVar.getAccessor().g(apa.class);
    }

    public final yh7 getInsetsConfig() {
        return this.a;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ImageView imageView = new ImageView(getContext());
        imageView.setId(kna.a);
        imageView.setOutlineProvider(new n04(vo4.c().getDisplayMetrics().density * 32.0f));
        imageView.setBackground(iq.D((Context) this.c.a.g(Context.class), xjc.ic_launcher_background));
        int roundToInt = MathKt.roundToInt(((float) 17) * vo4.c().getDisplayMetrics().density);
        imageView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
        imageView.setImageResource(cad.d);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setId(kna.e);
        imageView2.setClipToOutline(true);
        imageView2.setOutlineProvider(new a42(imageView2, 4));
        imageView2.setBackground(q8.a(imageView2.getContext(), 1301046487, 78.0f, true));
        float f = (float) 12;
        int roundToInt2 = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        imageView2.setPadding(roundToInt2, roundToInt2, roundToInt2, roundToInt2);
        imageView2.setImageResource(cad.g);
        TextView textView = new TextView(getContext());
        textView.setId(kna.c);
        textView.setGravity(1);
        puf.h.b(textView, uy4.b);
        js9 js9 = fu4.k;
        textView.setTextColor(js9.e(textView.getContext()).f().getText().e);
        textView.setText(lna.b);
        TextView textView2 = new TextView(getContext());
        textView2.setId(kna.b);
        textView2.setGravity(1);
        puf.E.b(textView2, uy4.b);
        textView2.setTextColor(js9.e(textView2.getContext()).f().getText().e);
        textView2.setText(lna.a);
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton.setId(kna.d);
        oneMeButton.setAppearance(xpa.c);
        oneMeButton.setSize(aqa.c);
        oneMeButton.setMode(zpa.a);
        oneMeButton.setText(lna.c);
        ct.G(oneMeButton, 300, new xu3(10, (Object) this));
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        b0h.H(constraintLayout, new m96(textView, textView2, (Continuation) null, 0));
        float f2 = (float) 120;
        constraintLayout.addView(imageView, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        float f3 = (float) 60;
        fj3 fj3 = new fj3(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
        float f4 = (float) 84;
        fj3.setMarginStart(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4));
        fj3.topMargin = MathKt.roundToInt(f4 * vo4.c().getDisplayMetrics().density);
        Unit unit = Unit.INSTANCE;
        constraintLayout.addView(imageView2, fj3);
        fj3 fj32 = new fj3(-1, -2);
        fj32.setMarginStart(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        fj32.setMarginEnd(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        fj32.bottomMargin = MathKt.roundToInt(((float) 20) * vo4.c().getDisplayMetrics().density);
        fj32.topMargin = MathKt.roundToInt(((float) 50) * vo4.c().getDisplayMetrics().density);
        constraintLayout.addView(textView, fj32);
        fj3 fj33 = new fj3(-1, -2);
        fj33.setMarginStart(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        fj33.setMarginEnd(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        constraintLayout.addView(textView2, fj33);
        fj3 fj34 = new fj3(-1, -2);
        fj34.setMarginStart(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        fj34.setMarginEnd(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        fj34.bottomMargin = MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density);
        constraintLayout.addView(oneMeButton, fj34);
        pj3 h = ct.h(constraintLayout);
        int id = imageView.getId();
        h.e(id, 3, 0, 3);
        h.e(id, 6, 0, 6);
        h.e(id, 7, 0, 7);
        h.e(id, 4, textView.getId(), 3);
        h.j(id).d.W = 2;
        int id2 = imageView2.getId();
        h.e(id2, 3, imageView.getId(), 3);
        h.e(id2, 4, imageView.getId(), 4);
        h.e(id2, 6, imageView.getId(), 6);
        h.e(id2, 7, imageView.getId(), 7);
        int id3 = textView.getId();
        h.e(id3, 3, imageView.getId(), 4);
        h.e(id3, 6, 0, 6);
        h.e(id3, 7, 0, 7);
        h.e(id3, 4, textView2.getId(), 3);
        int id4 = textView2.getId();
        h.e(id4, 3, textView.getId(), 4);
        h.e(id4, 6, 0, 6);
        h.e(id4, 7, 0, 7);
        h.e(id4, 4, oneMeButton.getId(), 3);
        int id5 = oneMeButton.getId();
        h.e(id5, 4, 0, 4);
        h.e(id5, 6, 0, 6);
        h.e(id5, 7, 0, 7);
        h.a(constraintLayout);
        return constraintLayout;
    }
}
