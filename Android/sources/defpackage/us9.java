package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: us9  reason: default package */
public final class us9 extends FutureTask {
    public final /* synthetic */ xx a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public us9(xx xxVar, ni niVar) {
        super(niVar);
        this.a = xxVar;
    }

    public final void done() {
        xx xxVar = this.a;
        try {
            Object obj = get();
            if (!xxVar.v.get()) {
                xxVar.b(obj);
            }
        } catch (InterruptedException unused) {
        } catch (ExecutionException e) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e.getCause());
        } catch (CancellationException unused2) {
            if (!xxVar.v.get()) {
                xxVar.b((Object) null);
            }
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
