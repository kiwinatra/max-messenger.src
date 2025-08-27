package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* renamed from: rb9  reason: default package */
public final /* synthetic */ class rb9 implements tma {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ rb9(ph9 ph9) {
        this.a = ph9;
    }

    public final lv3 a(View view, lv3 lv3) {
        Pair pair;
        xv1 xv1;
        iv3 iv3;
        kv3 kv3 = lv3.a;
        ClipData b = kv3.b();
        boolean z = true;
        Uri uri = null;
        if (b.getItemCount() == 1) {
            if (b.getItemAt(0).getUri() == null) {
                z = false;
            }
            lv3 lv32 = z ? lv3 : null;
            if (z) {
                lv3 = null;
            }
            pair = Pair.create(lv32, lv3);
        } else {
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            for (int i = 0; i < b.getItemCount(); i++) {
                ClipData.Item itemAt = b.getItemAt(i);
                if (itemAt.getUri() != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(itemAt);
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(itemAt);
                }
            }
            Pair create = arrayList == null ? Pair.create((Object) null, b) : arrayList2 == null ? Pair.create(b, (Object) null) : Pair.create(lv3.a(b.getDescription(), arrayList), lv3.a(b.getDescription(), arrayList2));
            if (create.first == null) {
                pair = Pair.create((Object) null, lv3);
            } else if (create.second == null) {
                pair = Pair.create(lv3, (Object) null);
            } else {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 31) {
                    xv1 = new xv1(lv3);
                } else {
                    jv3 jv3 = new jv3();
                    jv3.b = kv3.b();
                    jv3.c = kv3.l();
                    jv3.o = kv3.getFlags();
                    jv3.v = kv3.e();
                    jv3.w = kv3.getExtras();
                    xv1 = jv3;
                }
                xv1.c((ClipData) create.first);
                lv3 build = xv1.build();
                if (i2 >= 31) {
                    iv3 = new xv1(lv3);
                } else {
                    jv3 jv32 = new jv3();
                    jv32.b = kv3.b();
                    jv32.c = kv3.l();
                    jv32.o = kv3.getFlags();
                    jv32.v = kv3.e();
                    jv32.w = kv3.getExtras();
                    iv3 = jv32;
                }
                iv3.c((ClipData) create.second);
                pair = Pair.create(build, iv3.build());
            }
        }
        lv3 lv33 = (lv3) pair.first;
        lv3 lv34 = (lv3) pair.second;
        if (lv33 != null) {
            kv3 kv32 = lv33.a;
            if (kv32.b().getItemCount() > 0) {
                uri = kv32.b().getItemAt(0).getUri();
            }
        }
        if (uri != null) {
            this.a.invoke(uri);
        }
        return lv34;
    }
}
