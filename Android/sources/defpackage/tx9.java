package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import ru.ok.messages.channels.FrgChatMembers;
import ru.ok.messages.contacts.picker.FrgContactMultiPicker;

/* renamed from: tx9  reason: default package */
public final class tx9 extends q7b {
    public final c c;
    public xe0 d = null;
    public a e = null;
    public boolean f;
    public final Context g;
    public final List h;
    public final long i;
    public final SparseArray j;
    public final ng6 k;

    public tx9(Context context, ed6 ed6, ArrayList arrayList, long j2, ng6 ng6) {
        this.c = ed6;
        this.j = new SparseArray();
        this.g = context;
        this.h = arrayList;
        this.i = j2;
        this.k = ng6;
    }

    public final void a(ViewGroup viewGroup, int i2, Object obj) {
        this.j.remove(i2);
        a aVar = (a) obj;
        if (this.d == null) {
            c cVar = this.c;
            cVar.getClass();
            this.d = new xe0(cVar);
        }
        xe0 xe0 = this.d;
        xe0.getClass();
        c cVar2 = aVar.D0;
        if (cVar2 == null || cVar2 == xe0.r) {
            xe0.b(new md6(6, aVar));
            if (aVar.equals(this.e)) {
                this.e = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + aVar.toString() + " is already attached to a FragmentManager.");
    }

    /* JADX INFO: finally extract failed */
    public final void b() {
        xe0 xe0 = this.d;
        if (xe0 != null) {
            if (!this.f) {
                try {
                    this.f = true;
                    xe0.g();
                    this.f = false;
                } catch (Throwable th) {
                    this.f = false;
                    throw th;
                }
            }
            this.d = null;
        }
    }

    public final int c() {
        return this.h.size();
    }

    public final CharSequence e(int i2) {
        int ordinal = ((y4) this.h.get(i2)).ordinal();
        Context context = this.g;
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? "" : context.getString(qad.P1) : context.getString(qad.p1) : context.getString(qad.y0);
    }

    public final a f(ViewGroup viewGroup, int i2) {
        int i3;
        long[] jArr;
        int i4 = i2;
        xe0 xe0 = this.d;
        c cVar = this.c;
        if (xe0 == null) {
            cVar.getClass();
            this.d = new xe0(cVar);
        }
        long j2 = (long) i4;
        a E = cVar.E("android:switcher:" + viewGroup.getId() + ":" + j2);
        if (E != null) {
            xe0 xe02 = this.d;
            xe02.getClass();
            xe02.b(new md6(7, E));
        } else {
            int ordinal = ((y4) this.h.get(i4)).ordinal();
            ng6 ng6 = this.k;
            long j3 = this.i;
            if (ordinal == 0) {
                E = FrgChatMembers.j3(j3, ij2.ADMIN, ng6);
            } else if (ordinal != 1) {
                long[] jArr2 = null;
                if (ordinal != 2) {
                    E = null;
                } else {
                    a32 G = ((qra) ym.e()).l().G(j3);
                    if (ng6 == null || ng6 != ng6.b) {
                        Set keySet = G.b.R.keySet();
                        if (keySet != null) {
                            jArr2 = cjf.j(keySet);
                        }
                        i3 = 5;
                        jArr = jArr2;
                    } else {
                        jArr = new long[0];
                        i3 = 6;
                    }
                    E = new FrgContactMultiPicker();
                    E.L2(FrgContactMultiPicker.i3(jArr, 1, i3, this.i, false));
                }
            } else {
                E = FrgChatMembers.j3(j3, ij2.MEMBER, ng6);
            }
            this.d.h(viewGroup.getId(), E, "android:switcher:" + viewGroup.getId() + ":" + j2, 1);
        }
        if (E != this.e) {
            E.N2(false);
            E.Q2(false);
        }
        this.j.put(i4, E);
        return E;
    }

    public final boolean g(View view, Object obj) {
        return ((a) obj).W1() == view;
    }

    public final void i(Parcelable parcelable, ClassLoader classLoader) {
    }

    public final Parcelable j() {
        return null;
    }

    public final void k(Object obj) {
        a aVar = (a) obj;
        a aVar2 = this.e;
        if (aVar != aVar2) {
            if (aVar2 != null) {
                aVar2.N2(false);
                this.e.Q2(false);
            }
            aVar.N2(true);
            aVar.Q2(true);
            this.e = aVar;
        }
    }

    public final void l(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }
}
