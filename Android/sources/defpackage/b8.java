package defpackage;

import android.view.MenuInflater;
import android.view.View;
import kotlin.LazyKt;

/* renamed from: b8  reason: default package */
public abstract class b8 {
    public boolean a = true;
    public Object b;

    public b8(hs7 hs7) {
        this.b = LazyKt.lazy(new al2(hs7, 0));
    }

    public abstract void a();

    public abstract View b();

    public abstract m69 c();

    public abstract MenuInflater d();

    public abstract CharSequence e();

    public abstract CharSequence f();

    public abstract void g();

    public abstract boolean i();

    public abstract void j(View view);

    public abstract void k(int i);

    public abstract void l(CharSequence charSequence);

    public abstract void m(int i);

    public abstract void n(CharSequence charSequence);

    public abstract void p(boolean z);
}
