package one.me.folders.edit;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\f¨\u0006\r"}, d2 = {"Lone/me/folders/edit/FolderEditScreen;", "Lone/me/sdk/arch/Widget;", "Lqg3;", "Lmy5;", "Lu36;", "", "folderId", "<init>", "(Ljava/lang/String;)V", "", "serverChatId", "(J)V", "()V", "folders_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFolderEditScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FolderEditScreen.kt\none/me/folders/edit/FolderEditScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,245:1\n420#2:246\n419#2:247\n235#2,10:248\n24#3:258\n*S KotlinDebug\n*F\n+ 1 FolderEditScreen.kt\none/me/folders/edit/FolderEditScreen\n*L\n52#1:246\n53#1:247\n55#1:248,10\n148#1:258\n*E\n"})
@SuppressLint({"ValidController"})
public final class FolderEditScreen extends Widget implements qg3, my5, u36 {
    public static final /* synthetic */ KProperty[] y;
    public final yh7 a;
    public final is b;
    public final is c;
    public final Lazy o;
    public final ny5 v;
    public final ReadOnlyProperty w;
    public final ReadOnlyProperty x;

    static {
        Class<FolderEditScreen> cls = FolderEditScreen.class;
        y = new KProperty[]{wj6.p(cls, "folderId", "getFolderId()Ljava/lang/String;", 0), wj6.p(cls, "serverChatId", "getServerChatId()J", 0), wj6.p(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wj6.p(cls, "createButton", "getCreateButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    }

    public FolderEditScreen(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = yh7.d;
        this.b = new is(String.class, "key_folder_id");
        this.c = new is(Long.class, 0L, "key_server_chat_id");
        this.o = createViewModelLazy(m06.class, new rn2(25, new u75(6, this)));
        ny5 ny5 = new ny5(((aua) i66.a.getAccessor().g(aua.class)).a(), this);
        this.v = ny5;
        this.w = viewBinding(gua.g);
        this.x = viewBinding(gua.d);
        bs0.K(new ps5(d0().w0, new wq0(2, ny5, ny5.class, "submitList", "submitList(Ljava/util/List;)V", 4, 15), 5), getLifecycleScope());
    }

    public static final h3b c0(FolderEditScreen folderEditScreen) {
        folderEditScreen.getClass();
        return (h3b) folderEditScreen.w.getValue(folderEditScreen, y[2]);
    }

    public final m06 d0() {
        return (m06) this.o.getValue();
    }

    public final void e0() {
        Activity activity;
        int i = pq7.a;
        if (pq7.b(pq7.c) && (activity = getActivity()) != null) {
            kr7.A(activity);
        }
    }

    public final void g(int i, Bundle bundle) {
        m06 d0 = d0();
        d0.getClass();
        if (i == gua.d) {
            d0.n();
        } else if (i == gua.c && d0.b != null) {
            xag.g(d0, ((osa) d0.o).b(), (f14) null, new f06(d0, (Continuation) null), 2);
        }
    }

    public final yh7 getInsetsConfig() {
        return this.a;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h3b d = o54.d(getContext(), (AttributeSet) null);
        d.setId(gua.g);
        d.setForm(z2b.a);
        d.setLeftActions(new p2b(new lz5(this, 0)));
        RecyclerView recyclerView = new RecyclerView(getContext(), (AttributeSet) null);
        recyclerView.setId(gua.e);
        recyclerView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        recyclerView.setAdapter(this.v);
        recyclerView.setItemAnimator((yyc) null);
        lc5 lc5 = new lc5(11, (Object) this);
        recyclerView.j(new mnd(fu4.k.e(recyclerView.getContext()).f(), lc5, (h9) null, 12));
        recyclerView.j(new iz5(lc5));
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton.setId(gua.d);
        oneMeButton.setEnabled(false);
        oneMeButton.setAppearance(xpa.o);
        oneMeButton.setSize(aqa.c);
        oneMeButton.setMode(zpa.a);
        oneMeButton.setText(iua.h);
        ct.G(oneMeButton, 300, new xu3(8, (Object) this));
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        constraintLayout.setId(gua.f);
        fj3 fj3 = new fj3(0, -2);
        fj3.i = 0;
        fj3.e = 0;
        fj3.h = 0;
        Unit unit = Unit.INSTANCE;
        constraintLayout.addView(d, fj3);
        fj3 fj32 = new fj3(0, 0);
        fj32.j = d.getId();
        fj32.e = 0;
        fj32.h = 0;
        fj32.l = 0;
        constraintLayout.addView(recyclerView, fj32);
        fj3 fj33 = new fj3(0, -2);
        fj33.e = 0;
        fj33.h = 0;
        fj33.l = 0;
        float f = (float) 12;
        fj33.setMargins(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), 0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        constraintLayout.addView(oneMeButton, fj33);
        b0h.H(constraintLayout, new mh0(3, (Continuation) null, 6));
        return constraintLayout;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        bs0.K(new ps5(d0().x0, new mz5(this, (Continuation) null), 5), getViewLifecycleScope());
        bs0.K(new ps5(d0().Z, new nz5(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public FolderEditScreen(String str) {
        this(o54.f(TuplesKt.to("key_folder_id", str)));
    }

    public FolderEditScreen(long j) {
        this(o54.f(TuplesKt.to("key_server_chat_id", Long.valueOf(j))));
    }

    public FolderEditScreen() {
        this((Bundle) null);
    }
}
