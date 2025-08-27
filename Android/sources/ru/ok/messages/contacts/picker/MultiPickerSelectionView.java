package ru.ok.messages.contacts.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import ru.ok.utils.widgets.BadgeCountView;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0011\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\f¨\u0006\u0012"}, d2 = {"Lru/ok/messages/contacts/picker/MultiPickerSelectionView;", "Landroid/widget/FrameLayout;", "Lbif;", "Lmu3;", "Lrw9;", "doneAction", "", "setDoneAction", "(Lrw9;)V", "", "Lfo3;", "getContactInfos", "()Ljava/util/List;", "contactInfos", "Lvk3;", "getSelectedContacts", "selectedContacts", "sw9", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMultiPickerSelectionView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiPickerSelectionView.kt\nru/ok/messages/contacts/picker/MultiPickerSelectionView\n+ 2 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,221:1\n75#2:222\n44#2:223\n99#2:224\n1863#3,2:225\n1863#3,2:227\n1863#3,2:229\n1863#3,2:231\n1863#3,2:233\n*S KotlinDebug\n*F\n+ 1 MultiPickerSelectionView.kt\nru/ok/messages/contacts/picker/MultiPickerSelectionView\n*L\n102#1:222\n102#1:223\n102#1:224\n186#1:225,2\n190#1:227,2\n194#1:229,2\n198#1:231,2\n63#1:233,2\n*E\n"})
public final class MultiPickerSelectionView extends FrameLayout implements bif, mu3 {
    public final HashSet a = new HashSet();
    public final View b;
    public final BadgeCountView c;
    public final View o;
    public final RecyclerView v;
    public final lf0 w;
    public final AppCompatImageView x;

    @JvmOverloads
    public MultiPickerSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, ujc.view_multipicker_selection, this);
        this.c = (BadgeCountView) findViewById(lic.frg_contact_picker__tv_count);
        this.o = findViewById(lic.frg_contact_multi_picker__fl_count_bg);
        RecyclerView recyclerView = (RecyclerView) findViewById(lic.frg_contact_multi_picker__rv_selected);
        this.v = recyclerView;
        recyclerView.setHasFixedSize(true);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setItemAnimator(new mg4());
        lf0 lf0 = new lf0(getContext(), (mu3) this);
        this.w = lf0;
        lf0.C(true);
        recyclerView.setAdapter(lf0);
        this.x = (AppCompatImageView) findViewById(lic.frg_contact_multi_picker__iv_done);
        View findViewById = findViewById(lic.frg_contact_multi_picker__fl_count);
        this.b = findViewById;
        ct.G(findViewById, 300, new u99(4, (Object) this));
        c();
    }

    public final void a(fo3 fo3) {
        lf0 lf0 = this.w;
        int size = ((ArrayList) lf0.v).size();
        ArrayList arrayList = (ArrayList) lf0.v;
        arrayList.add(new lu3(fo3));
        lf0.a.e(size, 1);
        this.v.D0(arrayList.size() - 1);
        this.c.setCount(lf0.j());
    }

    public final void c() {
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(getContext());
        setBackgroundColor(k0.n);
        this.b.setBackground(k0.d());
        this.c.c();
        this.o.setBackground(i8b.K(Integer.valueOf(k0.l), (Integer) null, (Integer) null));
        this.x.setColorFilter(k0.m);
    }

    public final List<fo3> getContactInfos() {
        return this.w.E();
    }

    public final List<vk3> getSelectedContacts() {
        return this.w.F();
    }

    public final void setDoneAction(rw9 rw9) {
        int ordinal = rw9.ordinal();
        AppCompatImageView appCompatImageView = this.x;
        if (ordinal == 0) {
            appCompatImageView.setImageResource(nad.G);
            iq.t(appCompatImageView, 0);
        } else if (ordinal == 1) {
            appCompatImageView.setImageResource(nad.v1);
            iq.t(appCompatImageView, MathKt.roundToInt(((float) 4) * getContext().getResources().getDisplayMetrics().density));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
