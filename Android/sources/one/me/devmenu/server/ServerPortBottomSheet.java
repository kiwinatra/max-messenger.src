package one.me.devmenu.server;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/devmenu/server/ServerPortBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "dev-menu_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nServerPortBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerPortBottomSheet.kt\none/me/devmenu/server/ServerPortBottomSheet\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 6 StringExt.kt\nru/ok/tamtam/shared/StringExtKt\n*L\n1#1,122:1\n235#2,10:123\n24#3:133\n24#3:135\n1#4:134\n49#5:136\n65#5,16:137\n93#5,3:153\n4#6:156\n*S KotlinDebug\n*F\n+ 1 ServerPortBottomSheet.kt\none/me/devmenu/server/ServerPortBottomSheet\n*L\n38#1:123,10\n57#1:133\n78#1:135\n69#1:136\n69#1:137,16\n69#1:153,3\n86#1:156\n*E\n"})
@SuppressLint({"ValidController"})
public final class ServerPortBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ KProperty[] z0;
    public final Lazy w0 = createViewModelLazy(wrb.class, new zfa(22, new red(10)));
    public final ReadOnlyProperty x0 = viewBinding(rgc.server_port_input);
    public final ReadOnlyProperty y0 = viewBinding(rgc.server_port_custom_btn);

    static {
        Class<ServerPortBottomSheet> cls = ServerPortBottomSheet.class;
        z0 = new KProperty[]{wj6.p(cls, "customInput", "getCustomInput()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0), wj6.p(cls, "customButton", "getCustomButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    }

    public ServerPortBottomSheet() {
        super((Bundle) null, 1, (DefaultConstructorMarker) null);
    }

    public final View n0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setText("Порт сервера");
        puf.c.b(textView, uy4.b);
        textView.setTextColor(fu4.k.e(textView.getContext()).f().getText().e);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = (float) 12;
        float f2 = (float) 16;
        layoutParams.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        h2b h2b = new h2b(linearLayout.getContext());
        h2b.setId(rgc.server_port_input);
        h2b.setText(((a33) ((x23) ((wrb) this.w0.getValue()).b.getValue())).A());
        h2b.setLayoutParams(new fj3(-1, -2));
        h2b.setBackgroundColorAttr(Integer.valueOf(jya.a));
        h2b.setHint("Введите кастомный порт");
        h2b.setInputType(2);
        EditText editText = h2b.a;
        u2 u2Var = new u2(16, this);
        editText.addTextChangedListener(u2Var);
        editText.addTextChangedListener(u2Var);
        linearLayout.addView(h2b);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), (AttributeSet) null);
        oneMeButton.setId(rgc.server_port_custom_btn);
        fj3 fj3 = new fj3(-1, -2);
        fj3.topMargin = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(fj3);
        oneMeButton.setAppearance(xpa.o);
        oneMeButton.setSize(aqa.c);
        oneMeButton.setMode(zpa.a);
        oneMeButton.setText((CharSequence) "Установить");
        ct.G(oneMeButton, 300, new kqc(5, (Object) this, (Object) oneMeButton));
        linearLayout.addView(oneMeButton);
        return linearLayout;
    }
}
