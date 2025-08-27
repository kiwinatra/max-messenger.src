package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: as8  reason: default package */
public final class as8 extends fzc {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public int d;
    public int e;
    public final Object f;
    public final Object g;

    public as8(Context context, s01 s01, s01 s012) {
        this.f = s01;
        this.g = s012;
        this.b = ViewConfiguration.get(context).getScaledTouchSlop();
        this.c = 50;
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        View r;
        MessageModel N;
        View r2;
        switch (this.a) {
            case 0:
                int i3 = this.b;
                int i4 = this.c;
                if (i2 > 0) {
                    int i5 = this.e + i2;
                    this.e = i5;
                    if (i5 >= i4 || i2 >= i3) {
                        ((Function0) this.g).invoke();
                        this.e = 0;
                        this.d = 0;
                        return;
                    }
                    return;
                } else if (i2 < 0) {
                    int i6 = this.d + i2;
                    this.d = i6;
                    if (Math.abs(i6) >= i4 || Math.abs(i2) >= i3) {
                        ((Function0) this.f).invoke();
                        this.d = 0;
                        this.e = 0;
                        return;
                    }
                    return;
                } else {
                    return;
                }
            default:
                LinearLayoutManager v = y7e.v(recyclerView);
                if (v != null) {
                    this.b = v.V0();
                    int X0 = v.X0();
                    this.d = X0;
                    int i7 = this.b;
                    if (i7 != -1 && X0 != -1) {
                        int i8 = this.c;
                        Rect rect = (Rect) this.f;
                        if (i7 < i8 && (r2 = v.r(i7)) != null) {
                            r2.getLocalVisibleRect(rect);
                            if (((float) rect.height()) >= ((float) r2.getMeasuredHeight()) * 0.3f) {
                                this.c = this.b;
                            }
                        }
                        int i9 = this.d;
                        if (i9 > this.e && (r = v.r(i9)) != null) {
                            if (!r.getLocalVisibleRect(rect) || ((float) rect.height()) < ((float) r.getMeasuredHeight()) * 0.3f) {
                                this.d = v.W0();
                            }
                            int i10 = this.d;
                            boolean z = false;
                            if (i10 >= 0) {
                                MessagesListWidget messagesListWidget = (MessagesListWidget) this.g;
                                if (i10 < messagesListWidget.v0.j() && (N = messagesListWidget.v0.N(i10)) != null) {
                                    z = messagesListWidget.k0().D(N);
                                }
                            }
                            if (z) {
                                this.e = this.d;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Only linear layout manger supported");
        }
    }

    public as8(MessagesListWidget messagesListWidget) {
        this.g = messagesListWidget;
        this.f = new Rect();
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.e = -1;
    }
}
