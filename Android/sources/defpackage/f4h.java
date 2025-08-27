package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: f4h  reason: default package */
public final /* synthetic */ class f4h implements Runnable {
    public final /* synthetic */ FirebaseInstanceIdReceiver a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ BroadcastReceiver.PendingResult v;

    public /* synthetic */ f4h(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.a = firebaseInstanceIdReceiver;
        this.b = intent;
        this.c = context;
        this.o = z;
        this.v = pendingResult;
    }

    public final void run() {
        int i;
        int i2;
        FirebaseInstanceIdReceiver firebaseInstanceIdReceiver = this.a;
        Intent intent = this.b;
        Context context = this.c;
        boolean z = this.o;
        BroadcastReceiver.PendingResult pendingResult = this.v;
        firebaseInstanceIdReceiver.getClass();
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Executor executor = null;
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                i = FirebaseInstanceIdReceiver.a(intent2);
            } else if (intent.getExtras() == null) {
                i = 500;
            } else {
                b43 b43 = new b43(intent);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                synchronized (FirebaseInstanceIdReceiver.class) {
                    SoftReference softReference = FirebaseInstanceIdReceiver.b;
                    if (softReference != null) {
                        executor = (Executor) softReference.get();
                    }
                    if (executor == null) {
                        ThreadPoolExecutor threadPoolExecutor = r10;
                        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new j5a("pscm-ack-executor", 0));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                        FirebaseInstanceIdReceiver.b = new SoftReference(executor);
                    }
                }
                executor.execute(new ij3(context, b43, countDownLatch));
                try {
                    i2 = ((Integer) hsg.c(new ata(context, 1).A(intent))).intValue();
                } catch (InterruptedException | ExecutionException unused) {
                    i2 = 500;
                }
                try {
                    countDownLatch.await(TimeUnit.SECONDS.toMillis(1), TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    "Message ack failed: ".concat(e.toString());
                }
                i = i2;
            }
            if (z && pendingResult != null) {
                pendingResult.setResultCode(i);
            }
            if (pendingResult != null) {
                pendingResult.finish();
            }
        } catch (Throwable th) {
            if (pendingResult != null) {
                pendingResult.finish();
            }
            throw th;
        }
    }
}
