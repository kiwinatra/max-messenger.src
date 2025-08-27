package defpackage;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import java.util.Collections;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.messages.list.ui.MessagesListWidget;
import ru.ok.tamtam.stickers.view.RecyclerAutofitGridView;
import ru.ok.utils.widgets.RoundedRectFrameLayout;

/* renamed from: yb1  reason: default package */
public final /* synthetic */ class yb1 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yb1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARNING: type inference failed for: r13v9, types: [android.view.View, z25, ru.ok.utils.widgets.RoundedRectFrameLayout, android.view.ViewGroup] */
    public final boolean onLongClick(View view) {
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = CallLinkInfoScreen.z0;
                if (!(((tb1) obj2).d instanceof rb1)) {
                    return false;
                }
                dc1 d0 = ((CallLinkInfoScreen) obj).d0();
                CharSequence charSequence = ((tb1) d0.y.a.getValue()).c;
                if (charSequence == null) {
                    return true;
                }
                xag.h(d0.z, new f91(charSequence));
                return true;
            case 1:
                ((Function1) obj2).invoke((j29) obj);
                return true;
            case 2:
                ((Function2) obj2).invoke(Long.valueOf(((zo3) obj).a), view);
                return true;
            case 3:
                ((qs3) obj2).getClass();
                ((dm3) obj).getClass();
                return true;
            case 4:
                yu3 yu3 = (yu3) obj2;
                yu3.getClass();
                vk3 vk3 = ((qs3) obj).K0;
                yu3.v.getClass();
                return true;
            case 5:
                j15 j15 = (j15) obj2;
                j15.getClass();
                b45 b45 = (b45) obj;
                e15 e15 = (e15) b45.getTag();
                j15.E();
                if (j15.o != null && e15.d.size() > 1) {
                    j15.E();
                    ? roundedRectFrameLayout = new RoundedRectFrameLayout(b45.getContext(), (AttributeSet) null);
                    roundedRectFrameLayout.z0 = -1;
                    View.inflate(roundedRectFrameLayout.getContext(), ljc.emoji_choose_view, roundedRectFrameLayout);
                    roundedRectFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                    roundedRectFrameLayout.w = (RecyclerAutofitGridView) roundedRectFrameLayout.findViewById(tic.emoji_choose_view__rv_grid);
                    j15 j152 = new j15(roundedRectFrameLayout, roundedRectFrameLayout.v, Collections.emptyList(), roundedRectFrameLayout.z, roundedRectFrameLayout.v0);
                    roundedRectFrameLayout.x = j152;
                    roundedRectFrameLayout.w.setAdapter(j152);
                    roundedRectFrameLayout.a();
                    roundedRectFrameLayout.setCornerRadius(ld9.r(roundedRectFrameLayout.getContext(), 4.0f));
                    int padding = roundedRectFrameLayout.getPadding();
                    roundedRectFrameLayout.A0 = padding;
                    roundedRectFrameLayout.w.setPadding(padding, padding, padding, padding);
                    roundedRectFrameLayout.w.setItemAnimator((yyc) null);
                    roundedRectFrameLayout.setTheme(j15.v);
                    roundedRectFrameLayout.setAnimojiRepository(j15.X);
                    roundedRectFrameLayout.setEmojiParser(j15.Y);
                    roundedRectFrameLayout.setEmoji(e15);
                    roundedRectFrameLayout.setListener(new f15(j15));
                    int height = b45.getHeight();
                    roundedRectFrameLayout.setItemSize(height);
                    PopupWindow popupWindow = new PopupWindow(roundedRectFrameLayout, -2, -2);
                    j15.x = popupWindow;
                    popupWindow.setOutsideTouchable(true);
                    j15.x.setBackgroundDrawable((Drawable) null);
                    j15.x.setElevation(ld9.r(b45.getContext(), 5.0f));
                    int rowsCount = roundedRectFrameLayout.getRowsCount();
                    int columnsCount = roundedRectFrameLayout.getColumnsCount();
                    int padding2 = roundedRectFrameLayout.getPadding();
                    j15.x.showAsDropDown(b45, (int) (((-(((double) (((float) columnsCount) / 2.0f)) - 0.5d)) * ((double) height)) - ((double) padding2)), (int) (((((float) (-height)) * 1.5f) - ((float) (rowsCount * height))) - ((float) padding2)));
                }
                return true;
            case 6:
                y36 y36 = (y36) obj2;
                y36.E0.invoke(view, (x16) obj, Integer.valueOf(y36.q()));
                return true;
            case 7:
                ((Function2) obj2).invoke(view, (woa) obj);
                return true;
            case 8:
                xr6 xr6 = ((pr6) obj2).D0;
                b0 b0Var = ((wr6) ((qr6) obj)).x;
                if (b0Var != null) {
                    b0Var.A(xr6);
                }
                return true;
            case 9:
                gpe gpe = ((qb8) obj2).F0;
                if (gpe != null) {
                    ((uoe) obj).b(gpe);
                }
                return true;
            case 10:
                ((Function2) obj2).invoke(Long.valueOf(((z29) obj).a), view);
                return true;
            case 11:
                d99 d99 = (d99) obj;
                long j = d99.H0;
                pn9 pn9 = (pn9) ((t89) obj2);
                pn9.getClass();
                KProperty[] kPropertyArr2 = MessagesListWidget.R0;
                pn9.a.m0(j, d99.G0);
                return true;
            case 12:
                gpe gpe2 = ((qb8) obj2).F0;
                if (gpe2 != null) {
                    ((uoe) obj).b(gpe2);
                }
                return true;
            default:
                wmd wmd = ((hqe) obj2).H0;
                if (wmd != null) {
                    ((Function1) obj).invoke(wmd);
                }
                return true;
        }
    }
}
