package defpackage;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* renamed from: fge  reason: default package */
public final class fge extends SpannableStringBuilder {
    public final Class a;
    public final ArrayList b = new ArrayList();

    public fge(Class cls, CharSequence charSequence) {
        super(charSequence);
        bs0.q(cls, "watcherClass cannot be null");
        this.a = cls;
    }

    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                ((ege) arrayList.get(i)).b.incrementAndGet();
                i++;
            } else {
                return;
            }
        }
    }

    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                ((ege) arrayList.get(i)).onTextChanged(this, 0, length(), length());
                i++;
            } else {
                return;
            }
        }
    }

    public final ege c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return null;
            }
            ege ege = (ege) arrayList.get(i);
            if (ege.a == obj) {
                return ege;
            }
            i++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = r1.getClass();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(java.lang.Object r1) {
        /*
            r0 = this;
            if (r1 == 0) goto L_0x000c
            java.lang.Class r1 = r1.getClass()
            java.lang.Class r0 = r0.a
            if (r0 != r1) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fge.d(java.lang.Object):boolean");
    }

    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                ((ege) arrayList.get(i)).b.decrementAndGet();
                i++;
            } else {
                return;
            }
        }
    }

    public final int getSpanEnd(Object obj) {
        ege c;
        if (d(obj) && (c = c(obj)) != null) {
            obj = c;
        }
        return super.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        ege c;
        if (d(obj) && (c = c(obj)) != null) {
            obj = c;
        }
        return super.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        ege c;
        if (d(obj) && (c = c(obj)) != null) {
            obj = c;
        }
        return super.getSpanStart(obj);
    }

    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.a != cls) {
            return super.getSpans(i, i2, cls);
        }
        ege[] egeArr = (ege[]) super.getSpans(i, i2, ege.class);
        Object[] objArr = (Object[]) Array.newInstance(cls, egeArr.length);
        for (int i3 = 0; i3 < egeArr.length; i3++) {
            objArr[i3] = egeArr[i3].a;
        }
        return objArr;
    }

    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    public final int nextSpanTransition(int i, int i2, Class<ege> cls) {
        if (cls == null || this.a == cls) {
            cls = ege.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    public final void removeSpan(Object obj) {
        ege ege;
        if (d(obj)) {
            ege = c(obj);
            if (ege != null) {
                obj = ege;
            }
        } else {
            ege = null;
        }
        super.removeSpan(obj);
        if (ege != null) {
            this.b.remove(ege);
        }
    }

    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (d(obj)) {
            ege ege = new ege(obj);
            this.b.add(ege);
            obj = ege;
        }
        super.setSpan(obj, i, i2, i3);
    }

    public final CharSequence subSequence(int i, int i2) {
        return new fge(this.a, this, i, i2);
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m5append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* renamed from: delete  reason: collision with other method in class */
    public final SpannableStringBuilder m10delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    /* renamed from: insert  reason: collision with other method in class */
    public final SpannableStringBuilder m11insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m8append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        a();
        super.replace(i, i2, charSequence);
        e();
        return this;
    }

    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    /* renamed from: insert  reason: collision with other method in class */
    public final SpannableStringBuilder m12insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public fge(Class cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        bs0.q(cls, "watcherClass cannot be null");
        this.a = cls;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m4append(char c) {
        super.append(c);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m7append(char c) {
        super.append(c);
        return this;
    }

    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        a();
        super.replace(i, i2, charSequence, i3, i4);
        e();
        return this;
    }

    public final Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m6append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m9append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
