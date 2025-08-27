package defpackage;

import java.lang.Thread;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* renamed from: yta  reason: default package */
public final /* synthetic */ class yta implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aua b;

    public /* synthetic */ yta(aua aua, int i) {
        this.a = i;
        this.b = aua;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [l15, java.lang.Object] */
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.b;
            case 1:
                aua aua = this.b;
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = aua.c;
                yta yta = new yta(aua, 0);
                ? obj = new Object();
                obj.a = uncaughtExceptionHandler;
                obj.b = yta;
                obj.c = new ConcurrentHashMap();
                return new wta(obj);
            default:
                return this.b.b();
        }
    }
}
