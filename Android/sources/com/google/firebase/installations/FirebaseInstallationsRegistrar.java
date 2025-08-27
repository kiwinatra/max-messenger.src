package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* access modifiers changed from: private */
    public static mp5 lambda$getComponents$0(cc3 cc3) {
        return new lp5((hp5) cc3.a(hp5.class), cc3.c(tx6.class), (ExecutorService) cc3.g(new pac(bf0.class, ExecutorService.class)), new ssd((Executor) cc3.g(new pac(qp0.class, Executor.class))));
    }

    public List<mb3> getComponents() {
        dr8 dr8 = new dr8(mp5.class, new Class[0]);
        dr8.b = LIBRARY_NAME;
        dr8.a(bm4.a(hp5.class));
        dr8.a(new bm4(0, 1, tx6.class));
        dr8.a(new bm4(new pac(bf0.class, ExecutorService.class), 1, 0));
        dr8.a(new bm4(new pac(qp0.class, Executor.class), 1, 0));
        dr8.f = new ip5(4);
        mb3 b = dr8.b();
        sx6 sx6 = new sx6(0);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(pac.a(sx6.class));
        return Arrays.asList(new mb3[]{b, new mb3((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new ms1(20, sx6), hashSet3), m5a.p(LIBRARY_NAME, "18.0.0")});
    }
}
