package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: v7g  reason: default package */
public final class v7g implements kn1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void a(e4 e4Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((kn1) it.next()).a(e4Var);
        }
    }
}
