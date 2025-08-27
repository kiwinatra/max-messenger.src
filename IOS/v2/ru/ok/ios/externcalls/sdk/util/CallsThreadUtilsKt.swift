package ru.ok.android.externcalls.sdk.util;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "T", "Lkotlin/Function0;", "Lrk3;", "onSuccess", "Ljava/lang/Runnable;", "onError", "Lmq4;", "executeOnIoThread", "(Lkotlin/jvm/functions/Function0;Lrk3;Ljava/lang/Runnable;)Lmq4;", "calls-sdk_release"}, k = 2, mv = {1, 9, 0})
public final class CallsThreadUtilsKt {
    public static final <T> mq4 executeOnIoThread(Function0<? extends T> function0, rk3 rk3, Runnable runnable) {
        fce j = new mka(1, new mm1(2, function0)).n(xfd.b()).j(qe.a());
        ao1 ao1 = new ao1(3, new CallsThreadUtilsKt$executeOnIoThread$2(rk3), new CallsThreadUtilsKt$executeOnIoThread$3(runnable));
        j.l(ao1);
        return ao1;
    }

    /* access modifiers changed from: private */
    public static final void executeOnIoThread$lambda$0(Function0 function0, ube ube) {
        try {
            ((pbe) ube).a(function0.invoke());
        } catch (Throwable th) {
            ((pbe) ube).onError(th);
        }
    }
}
