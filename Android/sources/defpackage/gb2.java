package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.functions.Function0;

/* renamed from: gb2  reason: default package */
public final /* synthetic */ class gb2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ hb2 c;

    public /* synthetic */ gb2(Context context, hb2 hb2, int i) {
        this.a = i;
        this.b = context;
        this.c = hb2;
    }

    public final Object invoke() {
        hb2 hb2 = this.c;
        Context context = this.b;
        switch (this.a) {
            case 0:
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
                appCompatTextView.setId(jxa.I);
                appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
                appCompatTextView.setTextAlignment(2);
                appCompatTextView.setMaxLines(1);
                appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                appCompatTextView.setVisibility(8);
                ogf ogf = tr2.a;
                puf.i.b(appCompatTextView, uy4.b);
                fu4.k.e(appCompatTextView.getContext()).f().getText().getClass();
                appCompatTextView.setTextColor(-16745729);
                f6e.c(hb2, appCompatTextView, -1);
                return appCompatTextView;
            default:
                aya aya = new aya(context);
                aya.setId(dad.h);
                u3b.a(aya, new cf(10, aya, aya));
                aya.setSize(wxa.a);
                aya.setVisibility(0);
                hb2.addView(aya);
                return aya;
        }
    }
}
