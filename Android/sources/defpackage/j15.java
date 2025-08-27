package defpackage;

import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ru.ok.tamtam.animoji.views.AnimojiTextView;

/* renamed from: j15  reason: default package */
public final class j15 extends tyc {
    public fk X;
    public u25 Y;
    public final h15 o;
    public xoe v;
    public List w;
    public PopupWindow x;
    public int y;
    public int z = -1;

    public j15(h15 h15, xoe xoe, List list, fk fkVar, u25 u25) {
        this.w = list;
        this.o = h15;
        this.v = xoe;
        this.X = fkVar;
        this.Y = u25;
        C(true);
    }

    public final void E() {
        PopupWindow popupWindow = this.x;
        if (popupWindow != null) {
            View contentView = popupWindow.getContentView();
            if (contentView instanceof z25) {
                ((z25) contentView).setListener((y25) null);
            }
            this.x.dismiss();
        }
        this.x = null;
    }

    public final void F(xoe xoe) {
        this.v = xoe;
        PopupWindow popupWindow = this.x;
        if (popupWindow != null) {
            View contentView = popupWindow.getContentView();
            if (contentView instanceof z25) {
                ((z25) contentView).setTheme(xoe);
            }
        }
        m();
    }

    public final int j() {
        return this.w.size();
    }

    public final long k(int i) {
        return (long) ((e15) this.w.get(i)).hashCode();
    }

    public final int l(int i) {
        return tic.view_type_emoji;
    }

    public final void s(pzc pzc, int i) {
        boolean z2;
        e15 e15 = (e15) this.w.get(i);
        i15 i15 = (i15) pzc;
        fk fkVar = i15.E0.X;
        boolean z3 = false;
        b45 b45 = i15.D0;
        if (fkVar != null) {
            hj hjVar = hj.a;
            Set c = ((xi) fkVar.a.get()).c();
            if (!(c instanceof Collection) || !c.isEmpty()) {
                Iterator it = c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (StringsKt__StringsJVMKt.contentEquals((CharSequence) it.next(), "STICKERS_KEYBOARD", true)) {
                            z2 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z2 = false;
            b45.setAnimojiEnabled(z2);
        }
        b45.setText(e15.c);
        View view = i15.a;
        view.setTag(e15);
        view.setLongClickable(e15.d.size() > 1);
        b45.setTheme(this.v);
        if (i == this.z) {
            z3 = true;
        }
        b45.setHighlighted(z3);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [b45, android.widget.FrameLayout, android.view.View, android.view.GestureDetector$OnGestureListener, java.lang.Object, android.view.ViewGroup] */
    public final pzc u(ViewGroup viewGroup, int i) {
        ? frameLayout = new FrameLayout(viewGroup.getContext());
        View.inflate(frameLayout.getContext(), ljc.emoji_item_view, frameLayout);
        frameLayout.a = (AnimojiTextView) frameLayout.findViewById(tic.emoji_item_view__tv_emoji);
        frameLayout.c = new GestureDetector(frameLayout.getContext(), frameLayout);
        frameLayout.setTouchListener(new f15(this));
        frameLayout.setOnClickListener(new xu3(6, (Object) this));
        frameLayout.setOnLongClickListener(new yb1(5, this, frameLayout));
        if (this.y > 0) {
            wu6 wu6 = (wu6) frameLayout.getLayoutParams();
            if (wu6 == null) {
                int i2 = this.y;
                wu6 = new wu6(i2, i2);
            } else {
                int i3 = this.y;
                wu6.height = i3;
                wu6.width = i3;
            }
            frameLayout.setLayoutParams(wu6);
        }
        return new i15(this, frameLayout);
    }
}
