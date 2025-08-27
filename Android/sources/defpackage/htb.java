package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* renamed from: htb  reason: default package */
public final class htb extends fzc {
    public static final /* synthetic */ KProperty[] m;
    public static final String n;
    public final Function0 a;
    public final int b;
    public final boolean c;
    public final sk3 d;
    public final jz9 e = new jz9(10);
    public final jz9 f = new jz9(10);
    public boolean g;
    public int h = -1;
    public int i = -1;
    public int j;
    public final HashSet k;
    public final bl l;

    static {
        Class<htb> cls = htb.class;
        m = new KProperty[]{rae.s(cls, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)};
        n = cls.getName();
    }

    public htb(gn9 gn9, int i2, boolean z, sk3 sk3) {
        this.a = gn9;
        this.b = i2;
        this.c = z;
        this.d = sk3;
        this.k = new HashSet(i2);
        Delegates delegates = Delegates.INSTANCE;
        this.l = new bl(21, this);
    }

    public final void a(RecyclerView recyclerView, int i2) {
        this.l.setValue(this, m[0], recyclerView);
    }

    public final void b(RecyclerView recyclerView, int i2, int i3) {
        this.l.setValue(this, m[0], recyclerView);
        if (this.c && this.g && this.d != null) {
            HashSet hashSet = this.k;
            try {
                hashSet.clear();
                c();
                hashSet.clear();
            } catch (Throwable th) {
                z68.f(n, "tryToPrefetch failure!", th);
            }
        }
    }

    public final void c() {
        tyc adapter;
        sk3 sk3;
        int q;
        boolean z = false;
        RecyclerView recyclerView = (RecyclerView) this.l.getValue(this, m[0]);
        if (recyclerView != null) {
            boolean z2 = false;
            int i2 = 0;
            int i3 = -1;
            int i4 = -1;
            while (true) {
                boolean z3 = i2 < recyclerView.getChildCount();
                HashSet hashSet = this.k;
                jz9 jz9 = this.f;
                if (z3) {
                    int i5 = i2 + 1;
                    View childAt = recyclerView.getChildAt(i2);
                    if (childAt != null) {
                        try {
                            pzc U = recyclerView.U(childAt);
                            mb9 mb9 = U instanceof mb9 ? (mb9) U : null;
                            if (mb9 != null && mb9.d()) {
                                long a2 = mb9.a();
                                boolean e2 = jz9.e(a2);
                                if (e2) {
                                    hashSet.add(Long.valueOf(a2));
                                }
                                z2 = z2 || e2;
                                if (z2 && (q = ((pzc) mb9).q()) != -1) {
                                    i3 = Math.min(i3, q);
                                    i4 = Math.max(i4, q);
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        i2 = i5;
                    } else {
                        throw new IndexOutOfBoundsException();
                    }
                } else {
                    jz9 jz92 = this.e;
                    if (jz92.c() && !Intrinsics.areEqual((Object) jz9, (Object) jz92)) {
                        z = true;
                    }
                    this.g = z;
                    if (z2 && (adapter = recyclerView.getAdapter()) != null) {
                        int size = hashSet.size();
                        if (size > 0) {
                            int i6 = this.b;
                            if (((float) size) < ((float) i6) * 0.8f) {
                                if (this.j != adapter.j()) {
                                    this.j = adapter.j();
                                    this.h = -1;
                                    this.i = -1;
                                }
                                int i7 = (i6 - size) / 2;
                                if (i7 != 0) {
                                    List list = (List) this.a.invoke();
                                    if (this.h != i3) {
                                        this.h = i3;
                                        for (Number longValue : o5a.a0(list, i3, -i7)) {
                                            long longValue2 = longValue.longValue();
                                            if (jz9.e(longValue2)) {
                                                hashSet.add(Long.valueOf(longValue2));
                                            }
                                        }
                                    }
                                    if (this.i != i4) {
                                        this.i = i4;
                                        for (Number longValue3 : o5a.a0(list, i4, i7)) {
                                            long longValue4 = longValue3.longValue();
                                            if (jz9.e(longValue4)) {
                                                hashSet.add(Long.valueOf(longValue4));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if ((!hashSet.isEmpty()) && (sk3 = this.d) != null) {
                            sk3.accept(CollectionsKt.toList(hashSet));
                        }
                        if (!this.g) {
                            z68.c(n, "clear", new Object[0]);
                            hashSet.clear();
                            jz9.g();
                            jz92.g();
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }
}
