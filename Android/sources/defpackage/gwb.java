package defpackage;

import android.graphics.RectF;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* renamed from: gwb  reason: default package */
public abstract class gwb {
    public final long a;
    public final Lazy b;
    public final Lazy c;
    public final xme d;
    public final etc e;

    public gwb(long j) {
        this.a = j;
        lgb lgb = new lgb(22);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = LazyKt.lazy(lazyThreadSafetyMode, lgb);
        this.c = LazyKt.lazy(lazyThreadSafetyMode, new lgb(23));
        xme a2 = f6e.a((Object) null);
        this.d = a2;
        this.e = new etc(a2);
    }

    public h6c A(long j) {
        return null;
    }

    public Object B(Continuation continuation) {
        return Unit.INSTANCE;
    }

    public Object C(Continuation continuation) {
        return Unit.INSTANCE;
    }

    public Unit D(Continuation continuation) {
        return Unit.INSTANCE;
    }

    public Unit a(Continuation continuation) {
        return Unit.INSTANCE;
    }

    public boolean b() {
        return false;
    }

    public Object c(String str, RectF rectF, Continuation continuation) {
        return Unit.INSTANCE;
    }

    public abstract void d();

    public j91 e() {
        return null;
    }

    public final void f(fwb fwb) {
        this.d.setValue(fwb);
    }

    public long g() {
        return 0;
    }

    public String h() {
        return null;
    }

    public Long i() {
        return null;
    }

    public Long j() {
        return null;
    }

    public qr2 k() {
        return null;
    }

    public txb l() {
        return null;
    }

    public long m() {
        return this.a;
    }

    public Object n(Continuation continuation) {
        return null;
    }

    public String o() {
        return null;
    }

    public boolean p() {
        return false;
    }

    public boolean q() {
        return false;
    }

    public boolean r() {
        return this instanceof yq0;
    }

    public void s() {
    }

    public Object t(Continuation continuation) {
        return null;
    }

    public Unit u() {
        return Unit.INSTANCE;
    }

    public Object v(long j, boolean z, Continuation continuation) {
        return Unit.INSTANCE;
    }

    public boolean w() {
        return false;
    }

    public pa4 x() {
        return null;
    }

    public h6c y() {
        return null;
    }

    public List z() {
        return CollectionsKt.emptyList();
    }
}
