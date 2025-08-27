package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.ok.tamtam.stickers.view.RecyclerAutofitGridView;
import ru.ok.utils.widgets.RoundedRectFrameLayout;

/* renamed from: z25  reason: default package */
public final class z25 extends RoundedRectFrameLayout implements h15 {
    public int A0;
    public xoe v;
    public u25 v0;
    public RecyclerAutofitGridView w;
    public e15 w0;
    public j15 x;
    public ArrayList x0;
    public int y;
    public y25 y0;
    public fk z;
    public int z0;

    public final void a() {
        xoe xoe = this.v;
        if (xoe != null) {
            setBackgroundColor(xoe.a);
            this.x.F(this.v);
        }
    }

    public final void d(e15 e15) {
        e15 e152;
        y25 y25 = this.y0;
        if (y25 != null && (e152 = this.w0) != null) {
            j15 j15 = ((f15) y25).a;
            j15.E();
            h15 h15 = j15.o;
            if (h15 != null) {
                h15.f(e152, e15);
            }
        }
    }

    public final void f(e15 e15, e15 e152) {
    }

    public int getColumnsCount() {
        ArrayList arrayList = this.x0;
        if (arrayList == null) {
            return 6;
        }
        return Math.min(arrayList.size(), 6);
    }

    public e15 getOriginalEmoji() {
        return this.w0;
    }

    public int getPadding() {
        return (int) ld9.r(getContext(), 8.0f);
    }

    public int getRowsCount() {
        ArrayList arrayList = this.x0;
        if (arrayList == null) {
            return 1;
        }
        return (int) Math.ceil(((double) arrayList.size()) / ((double) getColumnsCount()));
    }

    public e15 getSelectedEmoji() {
        int i;
        ArrayList arrayList = this.x0;
        if (arrayList == null || (i = this.z0) < 0 || i >= arrayList.size()) {
            return null;
        }
        return (e15) this.x0.get(this.z0);
    }

    public void setAnimojiRepository(fk fkVar) {
        this.z = fkVar;
        j15 j15 = this.x;
        if (j15 != null) {
            j15.X = fkVar;
        }
    }

    public void setEmoji(e15 e15) {
        this.w0 = e15;
        List list = e15.d;
        this.x0 = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            CharSequence charSequence = (CharSequence) list.get(i);
            CharSequence charSequence2 = charSequence;
            this.x0.add(new e15(e15.a, e15.b, charSequence2, Collections.singletonList(charSequence), e15.e, e15.f, e15.g));
            if (e15.c.equals(charSequence)) {
                this.z0 = i;
            }
        }
        this.w.setDefaultColumns(getColumnsCount());
        j15 j15 = this.x;
        j15.Y = this.v0;
        j15.X = this.z;
        int i2 = this.z0;
        if (j15.z != i2) {
            j15.z = i2;
            j15.m();
        }
        this.x.w = this.x0;
    }

    public void setEmojiParser(u25 u25) {
        this.v0 = u25;
        j15 j15 = this.x;
        if (j15 != null) {
            j15.Y = u25;
        }
    }

    public void setItemSize(int i) {
        if (this.y != i) {
            this.y = i;
            j15 j15 = this.x;
            if (j15.y != i) {
                j15.y = i;
                j15.m();
            }
        }
    }

    public void setListener(y25 y25) {
        this.y0 = y25;
    }

    public void setTheme(xoe xoe) {
        this.v = xoe;
        a();
    }
}
