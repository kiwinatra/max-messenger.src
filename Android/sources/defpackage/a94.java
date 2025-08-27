package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* renamed from: a94  reason: default package */
public class a94 implements skf {
    public final long a;
    public boolean b;
    public final Object c;

    public /* synthetic */ a94() {
        this(300);
    }

    public skf a() {
        return new a94(((skf) this.c).a(), this.a);
    }

    public void b(View view, Function0 function0) {
        if (this.b) {
            this.b = false;
            function0.invoke();
            view.postDelayed(new cf(14, (nm1) this.c), this.a);
        }
    }

    public boolean hasNext() {
        return !this.b && ((skf) this.c).hasNext();
    }

    public long next() {
        n79.n(hasNext());
        long next = ((skf) this.c).next();
        if (this.a <= next) {
            this.b = true;
        }
        return next;
    }

    public a94(long j) {
        this.a = j;
        this.b = true;
        this.c = new nm1(24, this);
    }

    public a94(skf skf, long j) {
        this.c = skf;
        this.a = j;
    }
}
