package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: b1h  reason: default package */
public final class b1h extends bzg implements RandomAccess, c1h {
    public final List b;

    static {
        new b1h();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b1h(int i) {
        super(true);
        ArrayList arrayList = new ArrayList(i);
        this.b = arrayList;
    }

    public final c1h a() {
        return this.a ? new f3h(this) : this;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        b();
        this.b.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        b();
        if (collection instanceof c1h) {
            collection = ((c1h) collection).i();
        }
        boolean addAll = this.b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final x0h c(int i) {
        List list = this.b;
        if (i >= list.size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(list);
            return new b1h(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final void clear() {
        b();
        this.b.clear();
        this.modCount++;
    }

    /* renamed from: e */
    public final String get(int i) {
        String str;
        List list = this.b;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof fzg) {
            fzg fzg = (fzg) obj;
            Charset charset = y0h.a;
            fzg.getClass();
            Charset charset2 = y0h.a;
            if (fzg.e() == 0) {
                str = "";
            } else {
                str = new String(fzg.b, 0, fzg.e(), charset2);
            }
            int e = fzg.e();
            r3h.a.getClass();
            if (js9.n(0, fzg.b, e)) {
                list.set(i, str);
            }
            return str;
        }
        byte[] bArr = (byte[]) obj;
        String str2 = new String(bArr, y0h.a);
        js9 js9 = r3h.a;
        int length = bArr.length;
        r3h.a.getClass();
        if (js9.n(0, bArr, length)) {
            list.set(i, str2);
        }
        return str2;
    }

    public final List i() {
        return Collections.unmodifiableList(this.b);
    }

    public final void j(fzg fzg) {
        b();
        this.b.add(fzg);
        this.modCount++;
    }

    public final Object k(int i) {
        return this.b.get(i);
    }

    public final Object remove(int i) {
        String str;
        b();
        Object remove = this.b.remove(i);
        this.modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof fzg) {
            fzg fzg = (fzg) remove;
            Charset charset = y0h.a;
            fzg.getClass();
            Charset charset2 = y0h.a;
            if (fzg.e() == 0) {
                str = "";
            } else {
                return new String(fzg.b, 0, fzg.e(), charset2);
            }
        } else {
            str = new String((byte[]) remove, y0h.a);
        }
        return str;
    }

    public final Object set(int i, Object obj) {
        b();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof fzg)) {
            return new String((byte[]) obj2, y0h.a);
        }
        fzg fzg = (fzg) obj2;
        Charset charset = y0h.a;
        fzg.getClass();
        Charset charset2 = y0h.a;
        if (fzg.e() == 0) {
            return "";
        }
        return new String(fzg.b, 0, fzg.e(), charset2);
    }

    public final int size() {
        return this.b.size();
    }

    public b1h(ArrayList arrayList) {
        super(true);
        this.b = arrayList;
    }

    public b1h() {
        super(false);
        this.b = Collections.emptyList();
    }

    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
