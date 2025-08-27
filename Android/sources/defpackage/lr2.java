package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputContentInfo;

/* renamed from: lr2  reason: default package */
public final /* synthetic */ class lr2 implements qk3, kg7 {
    public final /* synthetic */ View a;

    public /* synthetic */ lr2(View view) {
        this.a = view;
    }

    public void accept(Object obj) {
        this.a.setTranslationY(((Float) obj).floatValue());
    }

    public boolean b(rt6 rt6, int i, Bundle bundle) {
        xv1 xv1;
        boolean z = true;
        if ((i & 1) != 0) {
            try {
                ((vs6) rt6.b).v();
                InputContentInfo inputContentInfo = (InputContentInfo) ((vs6) rt6.b).b;
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception unused) {
                return false;
            }
        }
        ClipDescription description = ((InputContentInfo) ((vs6) rt6.b).b).getDescription();
        vs6 vs6 = (vs6) rt6.b;
        ClipData clipData = new ClipData(description, new ClipData.Item(((InputContentInfo) vs6.b).getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            xv1 = new xv1(clipData, 2);
        } else {
            jv3 jv3 = new jv3();
            jv3.b = clipData;
            jv3.c = 2;
            xv1 = jv3;
        }
        xv1.a(((InputContentInfo) vs6.b).getLinkUri());
        xv1.setExtras(bundle);
        if (gag.g(this.a, xv1.build()) != null) {
            z = false;
        }
        return z;
    }
}
