package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {
    static final js7 BG_EXECUTOR = new js7(new gc3(1));
    static final js7 BLOCKING_EXECUTOR = new js7(new gc3(3));
    static final js7 LITE_EXECUTOR = new js7(new gc3(2));
    static final js7 SCHEDULER = new js7(new gc3(4));

    private static StrictMode.ThreadPolicy bgPolicy() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        detectNetwork.detectResourceMismatches();
        detectNetwork.detectUnbufferedIo();
        return detectNetwork.penaltyLog().build();
    }

    private static ThreadFactory factory(String str, int i) {
        return new h54(str, i, (StrictMode.ThreadPolicy) null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$getComponents$4(cc3 cc3) {
        return (ScheduledExecutorService) BG_EXECUTOR.get();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$getComponents$5(cc3 cc3) {
        return (ScheduledExecutorService) BLOCKING_EXECUTOR.get();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService lambda$getComponents$6(cc3 cc3) {
        return (ScheduledExecutorService) LITE_EXECUTOR.get();
    }

    private static StrictMode.ThreadPolicy litePolicy() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* access modifiers changed from: private */
    public static ScheduledExecutorService scheduled(ExecutorService executorService) {
        return new pl4(executorService, (ScheduledExecutorService) SCHEDULER.get());
    }

    public List<mb3> getComponents() {
        Class<bf0> cls = bf0.class;
        Class<ScheduledExecutorService> cls2 = ScheduledExecutorService.class;
        pac pac = new pac(cls, cls2);
        Class<ExecutorService> cls3 = ExecutorService.class;
        Class<Executor> cls4 = Executor.class;
        pac[] pacArr = {new pac(cls, cls3), new pac(cls, cls4)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(pac);
        for (pac c : pacArr) {
            q8.c(c, "Null interface");
        }
        Collections.addAll(hashSet, pacArr);
        mb3 mb3 = new mb3((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new lw4(4), hashSet3);
        Class<qp0> cls5 = qp0.class;
        pac pac2 = new pac(cls5, cls2);
        pac[] pacArr2 = {new pac(cls5, cls3), new pac(cls5, cls4)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(pac2);
        for (pac c2 : pacArr2) {
            q8.c(c2, "Null interface");
        }
        Collections.addAll(hashSet4, pacArr2);
        mb3 mb32 = new mb3((String) null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new lw4(5), hashSet6);
        Class<pv7> cls6 = pv7.class;
        pac pac3 = new pac(cls6, cls2);
        pac[] pacArr3 = {new pac(cls6, cls3), new pac(cls6, cls4)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(pac3);
        for (pac c3 : pacArr3) {
            q8.c(c3, "Null interface");
        }
        Collections.addAll(hashSet7, pacArr3);
        mb3 mb33 = new mb3((String) null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new lw4(6), hashSet9);
        dr8 a = mb3.a(new pac(cvf.class, cls4));
        a.f = new lw4(7);
        return Arrays.asList(new mb3[]{mb3, mb32, mb33, a.b()});
    }

    private static ThreadFactory factory(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return new h54(str, i, threadPolicy);
    }
}
