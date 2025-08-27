package defpackage;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* renamed from: dag  reason: default package */
public abstract class dag {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static lv3 b(View view, lv3 lv3) {
        ContentInfo i = lv3.a.i();
        Objects.requireNonNull(i);
        ContentInfo m = n30.m(i);
        ContentInfo performReceiveContent = view.performReceiveContent(m);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == m ? lv3 : new lv3(new y35(performReceiveContent));
    }

    public static void c(View view, String[] strArr, tma tma) {
        if (tma == null) {
            view.setOnReceiveContentListener(strArr, (OnReceiveContentListener) null);
        } else {
            view.setOnReceiveContentListener(strArr, new eag(tma));
        }
    }
}
