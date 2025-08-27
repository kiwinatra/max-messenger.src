package defpackage;

import kotlin.jvm.internal.PropertyReference0Impl;

/* renamed from: t68  reason: default package */
public final /* synthetic */ class t68 extends PropertyReference0Impl {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t68(int i, Object obj) {
        super(obj, n79.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        this.a = i;
        switch (i) {
            case 1:
                super(obj, tna.class, "weakActivities", "getWeakActivities()Ljava/util/concurrent/CopyOnWriteArrayList;", 0);
                return;
            case 2:
                super(obj, urc.class, "isExpanded", "isExpanded()Z", 0);
                return;
            default:
                return;
        }
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                return this.receiver.getClass().getSimpleName();
            case 1:
                return ((tna) this.receiver).a;
            default:
                return Boolean.valueOf(((urc) this.receiver).c.j() > 8);
        }
    }
}
