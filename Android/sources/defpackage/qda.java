package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.List;

/* renamed from: qda  reason: default package */
public final class qda {
    public final CharSequence a;
    public final long b;
    public final ldb c;
    public final Bundle d = new Bundle();
    public String e;
    public Uri f;

    public qda(CharSequence charSequence, long j, ldb ldb) {
        this.a = charSequence;
        this.b = j;
        this.c = ldb;
    }

    public static Bundle[] a(List list) {
        Bundle[] bundleArr = new Bundle[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            qda qda = (qda) list.get(i);
            qda.getClass();
            Bundle bundle = new Bundle();
            CharSequence charSequence = qda.a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", qda.b);
            ldb ldb = qda.c;
            if (ldb != null) {
                bundle.putCharSequence("sender", ldb.a);
                bundle.putParcelable("sender_person", pda.a(kdb.b(ldb)));
            }
            String str = qda.e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = qda.f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            Bundle bundle2 = qda.d;
            if (bundle2 != null) {
                bundle.putBundle("extras", bundle2);
            }
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }
}
