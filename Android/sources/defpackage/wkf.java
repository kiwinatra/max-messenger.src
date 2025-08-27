package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: wkf  reason: default package */
public final /* synthetic */ class wkf implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rlf b;

    public /* synthetic */ wkf(rlf rlf, int i) {
        this.a = i;
        this.b = rlf;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                Runnable delegatedTask = this.b.a.getDelegatedTask();
                if (delegatedTask == null) {
                    return null;
                }
                delegatedTask.run();
                return Unit.INSTANCE;
            case 1:
                Runnable delegatedTask2 = this.b.a.getDelegatedTask();
                if (delegatedTask2 == null) {
                    return null;
                }
                delegatedTask2.run();
                return Unit.INSTANCE;
            default:
                this.b.a.beginHandshake();
                return Unit.INSTANCE;
        }
    }
}
