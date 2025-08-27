package one.me.sdk.phoneutils;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import one.me.sdk.bottomsheet.BottomSheetWidget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/sdk/phoneutils/SelectCountryBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "phone-utils_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSelectCountryBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectCountryBottomSheet.kt\none/me/sdk/phoneutils/SelectCountryBottomSheet\n+ 2 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n24#2:63\n1#3:64\n1863#4,2:65\n*S KotlinDebug\n*F\n+ 1 SelectCountryBottomSheet.kt\none/me/sdk/phoneutils/SelectCountryBottomSheet\n*L\n37#1:63\n41#1:65,2\n*E\n"})
@SuppressLint({"ValidController"})
public final class SelectCountryBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ int w0 = 0;

    public SelectCountryBottomSheet(Bundle bundle) {
        super(bundle);
    }

    public final View n0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(View.generateViewId());
        textView.setText(ead.a0);
        puf.c.b(textView, uy4.b);
        textView.setTextColor(fu4.k.e(textView.getContext()).f().getText().e);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = (float) 12;
        float f2 = (float) 16;
        layoutParams.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        boolean z = getArgs().getBoolean("is_narnia_available");
        ysa ysa = xsa.a;
        List createListBuilder = CollectionsKt.createListBuilder();
        createListBuilder.add(xsa.b);
        createListBuilder.add(xsa.a);
        if (z) {
            createListBuilder.add((ysa) xsa.c.getValue());
        }
        for (ysa ysa2 : CollectionsKt.build(createListBuilder)) {
            x14 x14 = new x14(linearLayout.getContext());
            x14.setCountryInfo(ysa2);
            ct.G(x14, 300, new kqc(3, (Object) this, (Object) ysa2));
            linearLayout.addView(x14);
        }
        return linearLayout;
    }
}
