package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.Lazy;
import ru.ok.messages.messages.widgets.MessageComposeEditText;
import ru.ok.tamtam.stickers.panel.RelativePanelLayout;

/* renamed from: u2a  reason: default package */
public final class u2a extends q2 implements b8b, bpe, f2a {
    public d8b X;
    public final gb8 Y;
    public final long Z = 0;
    public final s3a o;
    public final ch v;
    public final fk v0;
    public final oh4 w;
    public final u25 w0;
    public final ise x;
    public cpe y;
    public RelativePanelLayout z;

    public u2a(Context context, s3a s3a, ch chVar, oh4 oh4, ise ise, gb8 gb8, fk fkVar, c35 c35) {
        super(context);
        this.o = s3a;
        this.v = chVar;
        this.w = oh4;
        this.x = ise;
        this.Y = gb8;
        this.v0 = fkVar;
        this.w0 = c35;
    }

    public static ype c0(p7b p7b) {
        int ordinal = p7b.ordinal();
        if (ordinal == 1) {
            return ype.RECENTS;
        }
        if (ordinal == 2) {
            return ype.KEYBOARD_FAVORITE;
        }
        if (ordinal == 3) {
            return ype.KEYBOARD_FAVORITE_SET;
        }
        if (ordinal == 4) {
            return ype.SIMILAR_TAB;
        }
        Locale locale = Locale.ENGLISH;
        throw new IllegalStateException("Unexpected value: " + p7b);
    }

    public final void D(qq7 qq7, p7b p7b) {
        boe d = this.w.d(qq7, p7b);
        if (d == null) {
            z68.e("u2a", "Sticker is null");
        } else {
            N(new ox4(this, d, p7b, 1));
        }
    }

    public final void H0(long j) {
        for (h1a h1a : (Set) this.a) {
            h1a.getClass();
        }
    }

    public final void M() {
        this.z = (RelativePanelLayout) ((View) this.c);
        d8b d8b = new d8b((Context) this.b, this.z, this);
        this.X = d8b;
        this.z.setSizeListener(d8b);
    }

    public final void W() {
        s3a s3a = this.o;
        Context context = (Context) s3a.b;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            MessageComposeEditText messageComposeEditText = s3a.X;
            if (activity != null && !activity.isFinishing() && messageComposeEditText != null) {
                messageComposeEditText.requestFocus();
                messageComposeEditText.post(new uo5(18, (Object) activity, (Object) messageComposeEditText));
            }
        }
    }

    public final void X0() {
        this.o.X.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    public final void Z() {
        Context context = (Context) this.b;
        cpe cpe = new cpe(context);
        this.y = cpe;
        cpe.N(this.Y, false);
        zd4 zd4 = new zd4();
        zd4.b = context.getString(qad.G9);
        zd4.c = context.getString(qad.D3);
        if (TextUtils.isEmpty(zd4.b)) {
            zd4.b = "The stickers you sent will appear here";
        }
        if (TextUtils.isEmpty(zd4.c)) {
            zd4.c = "All stickers";
        }
        voe voe = new voe(zd4);
        Lazy lazy = scf.b0;
        xoe s = cvg.s(j4b.k0(context), context);
        this.y.setLocalization(voe);
        this.y.setTheme(s);
        this.y.setListener(this);
        this.y.setPageProvider(this.w);
        this.y.setStickers(this.x);
        this.y.setAnimojiRepository(this.v0);
        this.y.setEmojiParser(this.w0);
        d8b d8b = this.X;
        cpe cpe2 = this.y;
        if (d8b.h == null) {
            d8b.h = new FrameLayout(d8b.b);
        }
        d8b.h.addView(cpe2);
        cpe cpe3 = this.y;
        if (this.z.getPaddingBottom() == 0) {
            this.v.j(cpe3);
        }
        this.X.h(this.y);
    }

    public final boolean a0() {
        cpe cpe = this.y;
        return (cpe == null || this.X == null || cpe.getVisibility() != 0) ? false : true;
    }

    public final void b0() {
        s3a s3a = this.o;
        s3a.X.dispatchKeyEvent(new KeyEvent(0, 67));
        s3a.N(new a0(10, s3a));
    }

    public final void c1(boolean z2) {
        for (h1a X2 : (Set) this.a) {
            X2.X();
        }
    }

    public final void d(e15 e15) {
        CharSequence charSequence = e15.c;
        s3a s3a = this.o;
        Editable text = s3a.X.getText();
        if ((charSequence instanceof Spannable) && charSequence != null && charSequence.length() != 0 && (charSequence instanceof Spannable)) {
            int length = charSequence.length();
            Object[] objArr = null;
            try {
                Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
                if (spanned != null) {
                    objArr = spanned.getSpans(0, length, uk.class);
                }
            } catch (Throwable unused) {
            }
            uk[] ukVarArr = (uk[]) objArr;
            if (ukVarArr != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                for (uk ukVar : ukVarArr) {
                    int spanStart = spannableStringBuilder.getSpanStart(ukVar);
                    int spanEnd = spannableStringBuilder.getSpanEnd(ukVar);
                    spannableStringBuilder.removeSpan(ukVar);
                    try {
                        spannableStringBuilder.setSpan(new uk(ukVar.a, ukVar.b, ukVar.c, ukVar.o), spanStart, spanEnd, 33);
                    } catch (Throwable unused2) {
                    }
                }
                charSequence = new SpannableString(spannableStringBuilder);
            }
        }
        CharSequence charSequence2 = charSequence;
        if (text == null || charSequence2 == null) {
            s3a.X.setText(charSequence2);
        } else {
            int selectionStart = s3a.X.getSelectionStart();
            int selectionEnd = s3a.X.getSelectionEnd();
            int max = Math.max(selectionStart, 0);
            int max2 = Math.max(selectionEnd, 0);
            int min = Math.min(max, max2);
            int max3 = Math.max(max, max2);
            if (selectionStart == -1 && selectionEnd == -1) {
                text.append(charSequence2);
            } else {
                text.replace(min, max3, charSequence2, 0, charSequence2.length());
            }
        }
        s3a.N(new a0(10, s3a));
    }

    public final void f(e15 e15, e15 e152) {
        d(e152);
        N(new pv1(5, (Object) e15, (Object) e152));
    }

    public final void f0() {
        N(new k2a(3));
    }

    public final long h1() {
        return this.Z;
    }

    public final void l() {
        N(new k2a(6));
    }

    public final void m0() {
        N(new k2a(5));
    }

    public final void o0() {
        this.o.X.requestFocus();
    }

    public final void r0(qq7 qq7, p7b p7b) {
        if (this.w.d(qq7, p7b) == null) {
            z68.f("u2a", "Sticker is null", (Throwable) null);
            return;
        }
        Iterator it = ((Set) this.a).iterator();
        if (it.hasNext()) {
            h1a h1a = (h1a) it.next();
            c0(p7b);
            h1a.getClass();
            Parcelable.Creator<goe> creator = goe.CREATOR;
            h1a.c.c();
            throw null;
        }
    }

    public final void s0(qq7 qq7, p7b p7b) {
        boe d = this.w.d(qq7, p7b);
        if (d == null) {
            z68.e("u2a", "Sticker is null");
        } else {
            N(new pv1(this, d, p7b));
        }
    }

    public final void u() {
        N(new k2a(4));
    }

    public final void w0(boolean z2) {
        N(new t2a(z2));
    }
}
