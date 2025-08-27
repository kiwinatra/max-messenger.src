package ru.ok.messages.store;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import kotlin.Lazy;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ok/messages/store/SendUnsentCrashReportsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lkotlin/Lazy;", "Le24;", "crashService", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lkotlin/Lazy;)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class SendUnsentCrashReportsWorker extends Worker {
    public final Lazy b;

    public SendUnsentCrashReportsWorker(Context context, WorkerParameters workerParameters, Lazy<? extends e24> lazy) {
        super(context, workerParameters);
        this.b = lazy;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, d08] */
    public final d08 b() {
        try {
            ((e24) this.b.getValue()).getClass();
            z68.c("SendUnsentCrashReportsWorker", "send success!", new Object[0]);
            return d08.b();
        } catch (Throwable th) {
            z68.f("SendUnsentCrashReportsWorker", "send failure!", th);
            return new Object();
        }
    }
}
