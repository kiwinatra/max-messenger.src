package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.KotlinVersion;

public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        Class<tj4> cls = tj4.class;
        hashSet.add(pac.a(cls));
        for (Class cls2 : new Class[0]) {
            q8.c(cls2, "Null interface");
            hashSet.add(pac.a(cls2));
        }
        bm4 bm4 = new bm4(2, 0, gb0.class);
        if (!hashSet.contains(bm4.a)) {
            hashSet2.add(bm4);
            arrayList.add(new mb3((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new tb4(26), hashSet3));
            pac pac = new pac(bf0.class, Executor.class);
            dr8 dr8 = new dr8(pf4.class, new Class[]{tx6.class, ux6.class});
            dr8.a(bm4.a(Context.class));
            dr8.a(bm4.a(hp5.class));
            dr8.a(new bm4(2, 0, sx6.class));
            dr8.a(new bm4(1, 1, (Class) cls));
            dr8.a(new bm4(pac, 1, 0));
            dr8.f = new nf4(pac, 0);
            arrayList.add(dr8.b());
            arrayList.add(m5a.p("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
            arrayList.add(m5a.p("fire-core", "21.0.0"));
            arrayList.add(m5a.p("device-name", a(Build.PRODUCT)));
            arrayList.add(m5a.p("device-model", a(Build.DEVICE)));
            arrayList.add(m5a.p("device-brand", a(Build.BRAND)));
            arrayList.add(m5a.v("android-target-sdk", new ip5(0)));
            arrayList.add(m5a.v("android-min-sdk", new ip5(1)));
            arrayList.add(m5a.v("android-platform", new ip5(2)));
            arrayList.add(m5a.v("android-installer", new ip5(3)));
            try {
                str = KotlinVersion.CURRENT.toString();
            } catch (NoClassDefFoundError unused) {
                str = null;
            }
            if (str != null) {
                arrayList.add(m5a.p("kotlin", str));
            }
            return arrayList;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }
}
