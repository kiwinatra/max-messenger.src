package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.Triple;
import kotlin.UninitializedPropertyAccessException;
import one.me.rlottie.RLottieDrawable;

/* renamed from: oh4  reason: default package */
public final class oh4 implements k7b, pse {
    public static final String[] J0 = {"😂", "😘", "👍", "😊", "🌹", "😄", "😡", "😀", "😉", "😔", "😍", "😃", "😜", "🙈", "😭", "😁", "💩", "😒", "😳", "😞", "😝", "😅", "🌺", "😏", "😢", "😆", "💔", "😛", "🌼", "😚", "🙏", "🌙", "👊", "🌷", "💐", "😋", "🎁", "👏", "👌", "💋"};
    public or7 A0;
    public or7 B0;
    public final or7 C0;
    public or7 D0;
    public or7 E0;
    public ArrayList F0;
    public List G0 = Collections.emptyList();
    public List H0 = Collections.emptyList();
    public final fk I0;
    public final om0 X;
    public final dac Y;
    public final om0 Z;
    public final ai5 a;
    public final vi5 b;
    public final jbf c;
    public final xoe o;
    public final Drawable v;
    public final HashMap v0 = new HashMap();
    public final t25 w;
    public final CopyOnWriteArrayList w0;
    public final gvc x;
    public final or7 x0;
    public final u25 y;
    public volatile List y0 = Collections.emptyList();
    public final moe z;
    public volatile hpe z0 = null;

    public oh4(Context context, ai5 ai5, vi5 vi5, jbf jbf, t25 t25, gvc gvc, c35 c35, moe moe, fk fkVar) {
        dac dac = new dac();
        this.Y = dac;
        om0 I = om0.I(Boolean.TRUE);
        this.Z = I;
        this.a = ai5;
        this.b = vi5;
        this.c = jbf;
        this.w = t25;
        this.x = gvc;
        this.y = c35;
        this.z = moe;
        this.I0 = fkVar;
        context.getResources().getDimensionPixelSize(mad.d);
        Lazy lazy = scf.b0;
        xoe s = cvg.s(j4b.k0(context), context);
        this.o = s;
        Drawable b2 = ew3.b(context, nad.h2);
        Objects.requireNonNull(b2);
        this.v = b2;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.w0 = copyOnWriteArrayList;
        Drawable a2 = xoe.a(s.n);
        Objects.requireNonNull(a2);
        copyOnWriteArrayList.add(new hvc(a2, Collections.emptyList(), Collections.emptyList()));
        copyOnWriteArrayList.add(new o25(b2, Collections.emptyList()));
        om0 I2 = om0.I(copyOnWriteArrayList);
        this.X = I2;
        lja s2 = new gia(new yia(dac, new mh4(this, 0), 3), 0).s(((kbf) jbf).c());
        rt3 rt3 = new rt3(13, (Object) I2);
        tb4 tb4 = new tb4(22);
        dj6 dj6 = m58.e;
        or7 or7 = new or7(rt3, tb4, dj6);
        s2.a(or7);
        this.x0 = or7;
        HashSet hashSet = new HashSet();
        rha rha = new rha(dac, new fj6(hashSet), new tb4(23), 3);
        mh4 mh4 = new mh4(this, 12);
        Objects.requireNonNull(I, "observer is null");
        try {
            rha.a(new qia(I, mh4, 1));
            if (!o54.y(this.C0)) {
                z68.c("oh4", "loadEmojiGroups: skipped, not disposed", new Object[0]);
                return;
            }
            om0 om0 = t25.a;
            jbf.getClass();
            rka y2 = om0.x(((kbf) jbf).a()).y(1);
            or7 or72 = new or7(new mh4(this, 13), new mh4(this, 14), dj6);
            y2.a(or72);
            this.C0 = or72;
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            hd8.Z(th);
            n54.D(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final jha a() {
        return this.X;
    }

    public final lja b() {
        om0 om0 = this.Z;
        om0.getClass();
        return new iia(new gia(om0, 0), new tb4(20), m58.f, m58.e).s(((kbf) this.c).c());
    }

    public final Triple c(List list) {
        CharSequence charSequence;
        RLottieDrawable rLottieDrawable;
        String str = null;
        fk fkVar = this.I0;
        if (fkVar != null) {
            Iterator it = list.iterator();
            rLottieDrawable = null;
            charSequence = null;
            while (it.hasNext()) {
                CharSequence charSequence2 = (CharSequence) it.next();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : fkVar.e.entrySet()) {
                    Matcher matcher = Pattern.compile(Pattern.quote((String) entry.getKey())).matcher(charSequence2);
                    while (matcher.find() && matcher.end() - matcher.start() == charSequence2.length()) {
                        arrayList.add(new qi(matcher.group(), (k15) entry.getValue(), matcher.start(), matcher.end()));
                    }
                }
                if (!arrayList.isEmpty()) {
                    if (((qi) arrayList.get(0)).b.a.c != null) {
                        str = ((qi) arrayList.get(0)).b.a.c.toString();
                    }
                    try {
                        rLottieDrawable = fkVar.a(((qi) arrayList.get(0)).a, ((qi) arrayList.get(0)).b.a.a.toString());
                    } catch (UninitializedPropertyAccessException e) {
                        z68.h("oh4", e, "EmojiPaletteProvider: failed to create RLottieDrawable for emoji: ", new Object[0]);
                    }
                    charSequence = charSequence2;
                }
            }
        } else {
            rLottieDrawable = null;
            charSequence = null;
        }
        return new Triple(str, rLottieDrawable, charSequence);
    }

    public final boe d(qq7 qq7, p7b p7b) {
        int ordinal = p7b.ordinal();
        if (ordinal == 1) {
            return e(nh4.c).a(qq7);
        }
        if (ordinal == 2) {
            return e(nh4.o).a(qq7);
        }
        if (ordinal == 3) {
            return e(nh4.v).a(qq7);
        }
        if (ordinal != 4) {
            return null;
        }
        return e(nh4.w).a(qq7);
    }

    public final tq7 e(nh4 nh4) {
        HashMap hashMap = this.v0;
        tq7 tq7 = (tq7) hashMap.get(nh4);
        if (tq7 != null) {
            return tq7;
        }
        tq7 tq72 = new tq7();
        hashMap.put(nh4, tq72);
        return tq72;
    }

    public final void f(nh4 nh4) {
        z68.c("oh4", "loadComplete " + nh4, new Object[0]);
        this.Y.d(nh4);
    }

    public final void g(p7b p7b, g7b g7b) {
        int i = 0;
        while (true) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.w0;
            if (i >= copyOnWriteArrayList.size()) {
                return;
            }
            if (((g7b) copyOnWriteArrayList.get(i)).b == p7b) {
                copyOnWriteArrayList.set(i, g7b);
                return;
            }
            i++;
        }
    }

    public final void v(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        nh4 nh4 = nh4.w;
        tq7 e = e(nh4);
        for (int i = 0; i < list.size(); i++) {
            ArrayList d = this.z.d((vte) list.get(i));
            arrayList.addAll(d);
            arrayList2.addAll((List) e.b(d).f());
        }
        this.G0 = arrayList;
        this.H0 = arrayList2;
        g(p7b.SIMILAR, new kae(xoe.a(this.o.u), this.H0));
        e.a = this.G0;
        f(nh4);
    }
}
