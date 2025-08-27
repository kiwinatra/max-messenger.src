package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.views.widgets.TamAvatarView;
import ru.ok.tamtam.stickers.view.RecyclerAutofitGridView;

/* renamed from: t26  reason: default package */
public final class t26 extends jj0 implements q25, jvc, ipe, lae {
    public final Object X;
    public Object Y;
    public Object Z;
    public final /* synthetic */ int v = 0;
    public Object w;
    public Object x;
    public Object y;
    public final Object z;

    public t26(c26 c26, c26 c262, d26 d26, b26 b26, b26 b262, x15 x15, c26 c263) {
        super((j4b) w63.I);
        this.w = c26;
        this.x = c262;
        this.z = d26;
        this.X = b26;
        this.Y = b262;
        this.Z = x15;
        this.y = c263;
    }

    public void F(List list, List list2) {
        switch (this.v) {
            case 1:
                i7b i7b = (i7b) this.z;
                if (i7b != null) {
                    ((cpe) i7b).O(list, list2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = (defpackage.cpe) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void I() {
        /*
            r1 = this;
            java.lang.Object r1 = r1.z
            i7b r1 = (defpackage.i7b) r1
            if (r1 == 0) goto L_0x0014
            cpe r1 = (defpackage.cpe) r1
            bpe r0 = r1.G0
            if (r0 == 0) goto L_0x0014
            r0.u()
            bpe r1 = r1.G0
            r1.f0()
        L_0x0014:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t26.I():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = (defpackage.cpe) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void J(defpackage.qq7 r2, defpackage.p7b r3) {
        /*
            r1 = this;
            java.lang.Object r1 = r1.z
            i7b r1 = (defpackage.i7b) r1
            if (r1 == 0) goto L_0x0014
            cpe r1 = (defpackage.cpe) r1
            bpe r0 = r1.G0
            if (r0 == 0) goto L_0x0014
            r0.s0(r2, r3)
            bpe r1 = r1.G0
            r1.f0()
        L_0x0014:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t26.J(qq7, p7b):void");
    }

    public long k(int i) {
        switch (this.v) {
            case 1:
                return ((g7b) E(i)).a;
            default:
                return super.k(i);
        }
    }

    public final int l(int i) {
        switch (this.v) {
            case 0:
                return ((y26) E(i)).b();
            default:
                return ((g7b) E(i)).b.a;
        }
    }

    public final void s(pzc pzc, int i) {
        int i2;
        scf scf;
        scf scf2;
        int i3 = 8;
        int i4 = 0;
        switch (this.v) {
            case 0:
                y26 y26 = (y26) E(i);
                if (y26 instanceof u26) {
                    p26 p26 = (p26) pzc;
                    n26 n26 = ((u26) y26).a;
                    int i5 = n26.c;
                    TextView textView = (TextView) p26.a;
                    Drawable b = ew3.b(textView.getContext(), n26.b);
                    textView.setText(i5);
                    hsg.D(b, (Drawable) null, (Drawable) null, (Drawable) null, textView);
                    if (!textView.isLaidOut() || textView.isLayoutRequested()) {
                        textView.addOnLayoutChangeListener(new nn1(1, b, textView));
                    } else {
                        if (textView.isInEditMode()) {
                            scf2 = vi4.f0;
                        } else {
                            Context context = textView.getContext();
                            Lazy lazy = scf.b0;
                            scf2 = j4b.k0(context);
                        }
                        b.setColorFilter(new PorterDuffColorFilter(scf2.l, PorterDuff.Mode.SRC_IN));
                    }
                    int i6 = lic.add_chats_to_folder;
                    int i7 = n26.a;
                    if (i7 == i6) {
                        ct.G(textView, 300, new o26(p26, 0));
                        return;
                    } else if (i7 == lic.filter_chats_in_folder) {
                        ct.G(textView, 300, new o26(p26, 1));
                        return;
                    } else {
                        return;
                    }
                } else if (y26 instanceof v26) {
                    r26 r26 = (r26) pzc;
                    s26 s26 = ((v26) y26).a;
                    a32 a32 = s26.c;
                    View view = r26.a;
                    TextView textView2 = r26.G0;
                    ImageView imageView = r26.J0;
                    TamAvatarView tamAvatarView = r26.F0;
                    if (a32 != null) {
                        tamAvatarView.a(a32, true);
                        if (view.isInEditMode()) {
                            scf = vi4.f0;
                        } else {
                            Context context2 = view.getContext();
                            Lazy lazy2 = scf.b0;
                            scf = j4b.k0(context2);
                        }
                        n79.a(textView2, s26.c, scf);
                        imageView.setVisibility(8);
                        tamAvatarView.setVisibility(0);
                    } else {
                        imageView.setImageDrawable(r26.K0);
                        imageView.setVisibility(0);
                        tamAvatarView.setVisibility(4);
                    }
                    textView2.setText(s26.a);
                    CharSequence charSequence = s26.b;
                    int length = charSequence.length();
                    TextView textView3 = r26.H0;
                    if (length > 0) {
                        textView3.setText(charSequence);
                        textView3.setVisibility(0);
                    } else {
                        textView3.setVisibility(8);
                    }
                    if (s26.d) {
                        i3 = 0;
                    }
                    ImageView imageView2 = r26.I0;
                    imageView2.setVisibility(i3);
                    ct.G(imageView2, 300, new q26(r26, s26, 0));
                    ct.G(view, 300, new q26(r26, s26, 1));
                    return;
                } else if (y26 instanceof w26) {
                    ((w26) y26).getClass();
                    ((zq4) pzc).M(xq4.FAT_DIVIDER);
                    return;
                } else if (y26 instanceof x26) {
                    p56 p56 = (p56) pzc;
                    c05 c05 = ((x26) y26).a;
                    n79.d(p56.F0, c05.b, p56.D0);
                    CharSequence charSequence2 = c05.c;
                    int length2 = charSequence2.length();
                    View view2 = p56.a;
                    TextView textView4 = p56.G0;
                    if (length2 > 0) {
                        textView4.setText(charSequence2);
                        Context context3 = view2.getContext();
                        Lazy lazy3 = scf.b0;
                        textView4.setTextColor(j4b.k0(context3).G);
                    } else {
                        textView4.setText(view2.getContext().getString(qad.B2));
                        Context context4 = view2.getContext();
                        Lazy lazy4 = scf.b0;
                        textView4.setTextColor(j4b.k0(context4).N);
                    }
                    ct.G(view2, 300, new o56(p56, c05, 0));
                    boolean z2 = c05.d;
                    int i8 = z2 ? nad.M : nad.H;
                    AppCompatImageView appCompatImageView = p56.H0;
                    appCompatImageView.setImageResource(i8);
                    if (z2) {
                        i2 = (view2.isInEditMode() ? vi4.f0 : j4b.k0(view2.getContext())).l;
                    } else {
                        i2 = (view2.isInEditMode() ? vi4.f0 : j4b.k0(view2.getContext())).N;
                    }
                    appCompatImageView.setColorFilter(i2);
                    ct.G(appCompatImageView, 300, new o56(p56, c05, 1));
                    return;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            default:
                j7b j7b = (j7b) pzc;
                g7b g7b = (g7b) E(i);
                int ordinal = g7b.b.ordinal();
                t26 t26 = j7b.D0;
                View view3 = j7b.a;
                if (ordinal == 0) {
                    r25 r25 = (r25) view3;
                    r25.setTheme((xoe) t26.w);
                    r25.setAnimojiRepository((fk) t26.Y);
                    r25.setEmojiParser((u25) t26.Z);
                    r25.setStickers((ise) t26.y);
                    r25.M0.F();
                    ArrayList arrayList = r25.O0;
                    List list = ((o25) g7b).e;
                    if (arrayList == null) {
                        r25.O0 = new ArrayList(list.size());
                    } else {
                        arrayList.clear();
                    }
                    ArrayList arrayList2 = r25.N0;
                    if (arrayList2 == null) {
                        r25.N0 = new ArrayList(list.size());
                    } else {
                        arrayList2.clear();
                    }
                    while (i4 < list.size()) {
                        d25 d25 = (d25) list.get(i4);
                        j15 j15 = new j15(r25, r25.E0, d25.a, r25.Q0, r25.R0);
                        r25.N0.add(j15);
                        r25.M0.E(j15);
                        o8f i9 = r25.I0.i();
                        TabLayout tabLayout = i9.g;
                        if (tabLayout != null) {
                            i9.b = iq.D(tabLayout.getContext(), d25.b);
                            TabLayout tabLayout2 = i9.g;
                            if (tabLayout2.L0 == 1 || tabLayout2.O0 == 2) {
                                tabLayout2.q(true);
                            }
                            i9.c();
                            o54.h(i9.h, new ml2(r25, i4, 1));
                            TabLayout tabLayout3 = r25.I0;
                            tabLayout3.b(i9, tabLayout3.b.isEmpty());
                            r25.O0.add(i9);
                            if (i4 < list.size() - 1) {
                                lw9 lw9 = r25.M0;
                                xoe xoe = r25.E0;
                                h35 h35 = new h35();
                                h35.v = xoe;
                                lw9.E(h35);
                            }
                            i4++;
                        } else {
                            throw new IllegalArgumentException("Tab not attached to a TabLayout");
                        }
                    }
                    r25.I0.post(new ne4(16, r25));
                    return;
                } else if (ordinal == 1) {
                    hvc hvc = (hvc) g7b;
                    kvc kvc = (kvc) view3;
                    kvc.setTheme((xoe) t26.w);
                    kvc.setAnimojiRepository((fk) t26.Y);
                    kvc.setEmojiParser((u25) t26.Z);
                    kvc.setLocalization((voe) t26.x);
                    kvc.setStickers((ise) t26.y);
                    kvc.S0 = hvc.e;
                    kvc.R0 = hvc.f;
                    int min = Math.min(kvc.H0.getSpanCount(), kvc.R0.size());
                    ArrayList arrayList3 = new ArrayList(min);
                    for (int i10 = 0; i10 < min; i10++) {
                        arrayList3.add((e15) kvc.R0.get(i10));
                    }
                    kvc.J0.w = arrayList3;
                    if (kvc.S0.isEmpty()) {
                        kvc.E0.setVisibility(0);
                    } else {
                        kvc.E0.setVisibility(8);
                    }
                    kvc.J0.m();
                    kvc.K0.G(kvc.S0);
                    return;
                } else if (ordinal == 2) {
                    jpe jpe = (jpe) view3;
                    jpe.setTheme((xoe) t26.w);
                    jpe.a((ise) t26.y, p7b.STICKER);
                    jpe.b.G(((hpe) g7b).e);
                    return;
                } else if (ordinal == 3) {
                    jpe jpe2 = (jpe) view3;
                    jpe2.setTheme((xoe) t26.w);
                    jpe2.a((ise) t26.y, p7b.SET);
                    jpe2.b.G(((wxd) g7b).e);
                    return;
                } else if (ordinal == 4) {
                    nae nae = (nae) view3;
                    nae.setTheme((xoe) t26.w);
                    nae.setStickers((ise) t26.y);
                    nae.setType(p7b.SIMILAR);
                    nae.b.G(((kae) g7b).f);
                    return;
                } else {
                    Locale locale = Locale.ENGLISH;
                    throw new IllegalArgumentException("Unknown page type " + g7b.b);
                }
        }
    }

    /* JADX WARNING: type inference failed for: r2v8, types: [r25, androidx.constraintlayout.widget.ConstraintLayout, android.view.View, java.lang.Object, android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r2v9, types: [fv, androidx.constraintlayout.widget.ConstraintLayout, kvc, android.view.View, java.lang.Object, android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r2v10, types: [fv, android.widget.FrameLayout, android.view.View, java.lang.Object, android.view.ViewGroup, jpe] */
    public final pzc u(ViewGroup viewGroup, int i) {
        nae nae;
        ViewGroup viewGroup2 = viewGroup;
        int i2 = i;
        switch (this.v) {
            case 0:
                switch (i2) {
                    case 31288:
                        return new zq4(LayoutInflater.from(viewGroup.getContext()).inflate(ujc.row_divider, viewGroup2, false));
                    case 31290:
                        return new r26(LayoutInflater.from(viewGroup.getContext()).inflate(ujc.row_folder_chat, viewGroup2, false), (c26) ((Function2) this.x), (d26) ((Function1) this.z));
                    case 31291:
                        return new p56(LayoutInflater.from(viewGroup.getContext()).inflate(ujc.row_folder, viewGroup2, false), (x15) this.Z, (c26) ((Function2) this.y));
                    case 31292:
                        return new p26(LayoutInflater.from(viewGroup.getContext()).inflate(ujc.row_folder_chat_button, viewGroup2, false), (b26) ((Function0) this.X), (b26) ((Function0) this.Y));
                    default:
                        throw new IllegalArgumentException(a81.j(i2, "unknown viewtype ", "!"));
                }
            default:
                for (p7b p7b : p7b.values()) {
                    if (p7b.a == i2) {
                        int ordinal = p7b.ordinal();
                        if (ordinal != 0) {
                            gb8 gb8 = (gb8) this.X;
                            if (ordinal == 1) {
                                ? constraintLayout = new ConstraintLayout(viewGroup.getContext());
                                constraintLayout.R0 = Collections.emptyList();
                                constraintLayout.S0 = Collections.emptyList();
                                View.inflate(constraintLayout.getContext(), ljc.recents_page, constraintLayout);
                                constraintLayout.setLayoutParams(new fj3(-1, -1));
                                constraintLayout.setAnimojiRepository((fk) this.Y);
                                constraintLayout.setEmojiParser((u25) this.Z);
                                constraintLayout.E0 = (Group) constraintLayout.findViewById(tic.recents_page__g_empty_stickers);
                                constraintLayout.F0 = (TextView) constraintLayout.findViewById(tic.recents_page__tv_no_stickers);
                                Button button = (Button) constraintLayout.findViewById(tic.recents_page__b_all_stickers);
                                constraintLayout.G0 = button;
                                o54.h(button, new ivc(0, constraintLayout));
                                constraintLayout.H0 = (RecyclerAutofitGridView) constraintLayout.findViewById(tic.recents_page__rv_grid);
                                constraintLayout.I0 = new lw9();
                                j15 j15 = new j15(constraintLayout, constraintLayout.N0, Collections.emptyList(), constraintLayout.L0, constraintLayout.M0);
                                constraintLayout.J0 = j15;
                                constraintLayout.I0.E(j15);
                                constraintLayout.I0.E(new tyc());
                                gv gvVar = new gv(ew3.b(constraintLayout.getContext(), ifc.stickers_placeholder), ise.a().a.a, constraintLayout.N0, gb8);
                                constraintLayout.K0 = gvVar;
                                gvVar.J(constraintLayout);
                                constraintLayout.I0.E(constraintLayout.K0);
                                constraintLayout.H0.setItemAnimator((yyc) null);
                                constraintLayout.H0.setAdapter(constraintLayout.I0);
                                constraintLayout.H0.setSpanSizeLookup(new d61(constraintLayout, 3));
                                constraintLayout.H0.m(new k61(9, constraintLayout));
                                constraintLayout.setListener(this);
                                nae = constraintLayout;
                            } else if (ordinal == 2 || ordinal == 3) {
                                ? frameLayout = new FrameLayout(viewGroup.getContext(), (AttributeSet) null, 0, 0);
                                View.inflate(frameLayout.getContext(), ljc.page_view, frameLayout);
                                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                frameLayout.a = (RecyclerAutofitGridView) frameLayout.findViewById(tic.page_view__rv_content);
                                gv gvVar2 = new gv(ew3.b(frameLayout.getContext(), ifc.stickers_placeholder), ise.a().a.a, frameLayout.o, gb8);
                                frameLayout.b = gvVar2;
                                gvVar2.J(frameLayout);
                                frameLayout.a.setItemAnimator((yyc) null);
                                frameLayout.a.setAdapter(frameLayout.b);
                                frameLayout.a.m(new k61(11, frameLayout));
                                frameLayout.setListener(this);
                                nae = frameLayout;
                            } else if (ordinal == 4) {
                                nae nae2 = new nae(viewGroup.getContext());
                                nae2.setLottieLayer(gb8);
                                nae2.setListener(this);
                                nae = nae2;
                            } else {
                                Locale locale = Locale.ENGLISH;
                                throw new IllegalArgumentException(wj6.h(i2, "Unknown viewType "));
                            }
                        } else {
                            ? constraintLayout2 = new ConstraintLayout(viewGroup.getContext());
                            View.inflate(constraintLayout2.getContext(), ljc.smiles_page_view, constraintLayout2);
                            constraintLayout2.setLayoutParams(new fj3(-1, -1));
                            constraintLayout2.H0 = constraintLayout2.findViewById(tic.smiles_page_view__tabs_holder);
                            TabLayout tabLayout = (TabLayout) constraintLayout2.findViewById(tic.smiles_page_view__tabs);
                            constraintLayout2.I0 = tabLayout;
                            tabLayout.setUnboundedRipple(true);
                            constraintLayout2.I0.setSelectedTabIndicatorGravity(2);
                            constraintLayout2.I0.setSelectedTabIndicatorHeight((int) ld9.r(constraintLayout2.getContext(), 2.0f));
                            lw9 lw9 = new lw9();
                            constraintLayout2.M0 = lw9;
                            lw9.C(true);
                            constraintLayout2.K0 = constraintLayout2.findViewById(tic.smiles_page_view__delimiter);
                            RecyclerAutofitGridView recyclerAutofitGridView = (RecyclerAutofitGridView) constraintLayout2.findViewById(tic.smiles_page_view__rv_grid);
                            constraintLayout2.J0 = recyclerAutofitGridView;
                            recyclerAutofitGridView.m(new k61(2, constraintLayout2));
                            constraintLayout2.J0.setAdapter(constraintLayout2.M0);
                            constraintLayout2.J0.setSpanSizeLookup(new d61(constraintLayout2, 2));
                            ImageButton imageButton = (ImageButton) constraintLayout2.findViewById(tic.smiles_page_view__delete);
                            constraintLayout2.L0 = imageButton;
                            imageButton.setOnTouchListener(new ng1(4, constraintLayout2));
                            constraintLayout2.L0.setOnClickListener(new p71(2));
                            constraintLayout2.setListener(this);
                            constraintLayout2.setAnimojiRepository((fk) this.Y);
                            constraintLayout2.setEmojiParser((u25) this.Z);
                            nae = constraintLayout2;
                        }
                        return new j7b(this, nae);
                    }
                }
                Locale locale2 = Locale.ENGLISH;
                throw new IllegalArgumentException(wj6.h(i2, "Unknown viewType "));
        }
    }

    public t26(xoe xoe, voe voe, ise ise, gb8 gb8, i7b i7b) {
        super((j4b) new w63(15));
        this.w = xoe;
        this.x = voe;
        this.y = ise;
        this.z = i7b;
        this.X = gb8;
    }
}
