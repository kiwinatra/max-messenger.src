package defpackage;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* renamed from: eag  reason: default package */
public final class eag implements OnReceiveContentListener {
    public final tma a;

    public eag(tma tma) {
        this.a = tma;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        lv3 lv3 = new lv3(new y35(contentInfo));
        lv3 a2 = this.a.a(view, lv3);
        if (a2 == null) {
            return null;
        }
        if (a2 == lv3) {
            return contentInfo;
        }
        ContentInfo i = a2.a.i();
        Objects.requireNonNull(i);
        return n30.m(i);
    }
}
