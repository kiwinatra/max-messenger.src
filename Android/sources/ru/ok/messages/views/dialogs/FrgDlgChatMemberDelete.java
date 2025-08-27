package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatCheckBox;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

public class FrgDlgChatMemberDelete extends FrgDlgChecked<ah6> {
    public bh6 F1;
    public long G1;
    public boolean H1;

    public static FrgDlgChatMemberDelete f3(long j, String str, boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putLong("ru.ok.tamtam.extra.MEMBER_ID", j);
        bundle.putString("ru.ok.tamtam.extra.MEMBER_NAME", str);
        bundle.putBoolean("ru.ok.tamtam.extra.BLOCK", z);
        bundle.putBoolean("ru.ok.tamtam.extra.IS_CHANNEL", z2);
        FrgDlgChatMemberDelete frgDlgChatMemberDelete = new FrgDlgChatMemberDelete();
        frgDlgChatMemberDelete.L2(bundle);
        return frgDlgChatMemberDelete;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [bh6, android.widget.LinearLayout, android.view.View, android.widget.CompoundButton$OnCheckedChangeListener, android.view.ViewGroup] */
    public final Dialog V2(Bundle bundle) {
        Integer num;
        Integer num2;
        this.H1 = this.x.getBoolean("ru.ok.tamtam.extra.BLOCK");
        boolean z = this.x.getBoolean("ru.ok.tamtam.extra.IS_CHANNEL");
        this.G1 = this.x.getLong("ru.ok.tamtam.extra.MEMBER_ID");
        String string = this.x.getString("ru.ok.tamtam.extra.MEMBER_NAME");
        ? linearLayout = new LinearLayout(G2());
        LayoutInflater.from(linearLayout.getContext()).inflate(ujc.member_menu_content, linearLayout);
        linearLayout.b = (AppCompatCheckBox) linearLayout.findViewById(lic.member_menu_content__cb_delete_messages);
        Context context = linearLayout.getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        AppCompatCheckBox appCompatCheckBox = linearLayout.b;
        appCompatCheckBox.setTextColor(k0.G);
        if (!(Intrinsics.areEqual((Object) k0, (Object) vi4.f0) || (num = k0.X) == null || (num2 = k0.W) == null)) {
            jd3.c(appCompatCheckBox, new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{num.intValue(), num2.intValue()}));
        }
        linearLayout.a = (ViewStub) linearLayout.findViewById(lic.member_menu_content__vs_delete_type);
        linearLayout.setOrientation(1);
        linearLayout.b.setOnCheckedChangeListener(linearLayout);
        this.F1 = linearLayout;
        G2();
        int a = ro4.a(16.0f);
        this.F1.setPadding(a, a, a, a);
        cg8 cg8 = new cg8(O1());
        cg8 q = cg8.q(((qra) ym.e()).v().k.c(this.H1 ? T1(qad.d1, string) : T1(qad.f1, string)));
        q.k(this.H1 ? S1(qad.b1).toUpperCase() : S1(qad.a1).toUpperCase(), new d10(3, (Object) this));
        q.m(S1(qad.m0).toUpperCase(), new e10(1));
        if (z) {
            cg8.a.f = ((qra) ym.e()).v().k.c(T1(qad.j8, string));
        } else {
            cg8.s(this.F1);
        }
        return cg8.create();
    }

    public final Class c3() {
        return ah6.class;
    }

    public final String e3() {
        return "ru.ok.messages.views.dialogs.FrgDlgChatMemberDelete";
    }
}
