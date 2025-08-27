package defpackage;

import android.content.Context;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.view.ViewStub;
import java.util.ArrayList;
import java.util.List;
import ru.ok.messages.constructor.ConstructorPopupLayout;
import ru.ok.messages.constructor.ConstructorsListView;
import ru.ok.messages.constructor.MessageConstructorView;
import ru.ok.messages.constructor.MessagesConstructorDraftView;

/* renamed from: l2a  reason: default package */
public final class l2a extends q2 implements s99 {
    public ViewStub X;
    public MessagesConstructorDraftView Y;
    public final i1a Z;
    public final ju8 o;
    public final ju8 v;
    public boolean v0 = false;
    public final ju8 w;
    public int w0 = 1;
    public MessageConstructorView x;
    public final s3a x0;
    public ConstructorPopupLayout y;
    public ConstructorsListView z;

    public l2a(Context context, i1a i1a, s3a s3a, ch chVar, ju8 ju8, ju8 ju82, ju8 ju83) {
        super(context);
        this.Z = i1a;
        this.x0 = s3a;
        this.o = ju8;
        this.v = ju82;
        this.w = ju83;
    }

    public final void M() {
    }

    public final void Z() {
        if (this.v0) {
            this.w0 = 2;
            this.y.setState(ik3.a);
            this.y.post(new j2a(this, 3));
            this.v0 = false;
            return;
        }
        this.w0 = 1;
        if (this.y.getScrollState() != 0) {
            this.y.l((Runnable) null, true);
        }
        MessagesConstructorDraftView messagesConstructorDraftView = this.Y;
        if (messagesConstructorDraftView != null) {
            messagesConstructorDraftView.setVisible(false);
        }
    }

    public final void a0(boolean z2, dw0 dw0) {
        this.x.f(z2, dw0);
    }

    public final void c0(ak3 ak3) {
        ViewStub viewStub;
        this.w0 = 4;
        if (this.Y == null && (viewStub = this.X) != null) {
            MessagesConstructorDraftView messagesConstructorDraftView = (MessagesConstructorDraftView) viewStub.inflate();
            this.Y = messagesConstructorDraftView;
            messagesConstructorDraftView.w = this;
            messagesConstructorDraftView.bringToFront();
        }
        MessagesConstructorDraftView messagesConstructorDraftView2 = this.Y;
        messagesConstructorDraftView2.setVisible(true);
        Context context = messagesConstructorDraftView2.getContext();
        yva yva = messagesConstructorDraftView2.x;
        scf scf = messagesConstructorDraftView2.a;
        String string = context.getString(qad.r2);
        Spannable.Factory instance = Spannable.Factory.getInstance();
        StringBuilder m = g63.m(string, " ");
        m.append(((ck3) ak3.a).c);
        Spannable newSpannable = instance.newSpannable(m.toString());
        newSpannable.setSpan(new ForegroundColorSpan(scf.l), 0, string.length(), 17);
        messagesConstructorDraftView2.v.setText(yva.k.c(newSpannable));
    }

    public final void d0(List list) {
        this.w0 = 2;
        ConstructorsListView constructorsListView = this.z;
        ArrayList arrayList = constructorsListView.w;
        arrayList.clear();
        arrayList.addAll(list);
        constructorsListView.o.m();
        this.y.setState(ik3.a);
        this.y.post(new j2a(this, 1));
    }
}
