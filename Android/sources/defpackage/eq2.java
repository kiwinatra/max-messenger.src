package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: eq2  reason: default package */
public final class eq2 {
    public final hs7 a;
    public final hs7 b;
    public final hs7 c;
    public final hs7 d;
    public final hs7 e;
    public final hs7 f;
    public final hs7 g;

    public eq2(hs7 hs7, hs7 hs72, hs7 hs73, hs7 hs74, hs7 hs75, hs7 hs76, hs7 hs77) {
        this.a = hs7;
        this.b = hs72;
        this.c = hs73;
        this.d = hs74;
        this.e = hs75;
        this.f = hs76;
        this.g = hs77;
    }

    public final CharSequence a(a32 a32) {
        m72 m72;
        h72 h72;
        String format;
        vk3 vk3;
        List list;
        if (a32.g0()) {
            return ((yva) this.b.get()).a.getString(qad.T8);
        }
        ArrayList k = a32.k();
        if (!a32.N()) {
            if (a32.L()) {
                if (!k.isEmpty()) {
                    int c2 = a32.b.c();
                    if (!((nh3) this.a.get()).f() || !a32.f0() || a32.b.e.size() < a32.b.c()) {
                        format = ghf.s(zjc.tt_chat_subtitle_count, c2, ((yva) this.b.get()).a);
                    } else {
                        ArrayList k2 = a32.k();
                        ptb ptb = (ptb) this.c.get();
                        if (k2.isEmpty()) {
                            list = Collections.emptyList();
                        } else {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = k2.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                try {
                                    if (ptb.g(((vk3) next).r())) {
                                        arrayList.add(next);
                                    }
                                } catch (Throwable th) {
                                    throw new RuntimeException(th);
                                }
                            }
                            list = arrayList;
                        }
                        int size = list.size();
                        yva yva = (yva) this.b.get();
                        yva.getClass();
                        StringBuilder sb = new StringBuilder();
                        sb.append(size + 1);
                        sb.append(" ");
                        int i = tmc.tt_of;
                        Context context = yva.a;
                        sb.append(context.getString(i));
                        sb.append(" ");
                        sb.append(c2);
                        sb.append(" ");
                        sb.append(context.getString(tmc.tt_contact_status_online));
                        format = sb.toString();
                    }
                } else if (a32.b.c() == 0) {
                    return "";
                } else {
                    if (a32.f0() && a32.b.c() == 1) {
                        return ((yva) this.b.get()).a.getString(tmc.tt_chat_participants_empty__subtitle);
                    }
                    return ghf.s(zjc.tt_chat_subtitle_count, a32.b.c(), ((yva) this.b.get()).a);
                }
            } else if (a32.K()) {
                yva yva2 = (yva) this.b.get();
                int c3 = a32.b.c();
                if (c3 == 0) {
                    yva2.getClass();
                    format = "";
                } else {
                    format = ghf.s(zjc.tt_channel_subtitle_count, c3, yva2.a);
                }
            } else if (a32.H()) {
                h72 h722 = a32.b.K;
                if (h722.g) {
                    synchronized (a32.x) {
                        try {
                            vk3 = (!a32.H() || a32.x.isEmpty()) ? null : (vk3) a32.x.get(0);
                        } catch (Throwable th2) {
                            while (true) {
                                throw th2;
                            }
                        }
                    }
                    if (vk3 != null) {
                        return vk3.f();
                    }
                    return null;
                } else if (cvg.A(h722.e)) {
                    return null;
                } else {
                    return String.format(((yva) this.b.get()).a.getString(tmc.tt_chat_admin_group_name_subtitle), new Object[]{a32.b.K.e});
                }
            } else if (!a32.R() || (m72 = a32.b) == null || (h72 = m72.K) == null) {
                return null;
            } else {
                if (!h72.g) {
                    yva yva3 = (yva) this.b.get();
                    yva3.getClass();
                    boolean isEmpty = TextUtils.isEmpty((CharSequence) null);
                    Context context2 = yva3.a;
                    format = !isEmpty ? String.format(context2.getString(tmc.tt_chat_group_name_subtitle), new Object[]{null}) : context2.getString(tmc.tt_chat_group_subtitle);
                } else if (cvg.A(h72.e)) {
                    return null;
                } else {
                    yva yva4 = (yva) this.b.get();
                    String str = a32.b.K.e;
                    yva4.getClass();
                    boolean isEmpty2 = TextUtils.isEmpty(str);
                    Context context3 = yva4.a;
                    format = !isEmpty2 ? String.format(context3.getString(tmc.tt_chat_group_name_subtitle), new Object[]{str}) : context3.getString(tmc.tt_chat_group_subtitle);
                }
            }
            return format;
        } else if (!k.isEmpty()) {
            return ((rtb) this.d.get()).d((vk3) k.get(0), true);
        } else {
            return null;
        }
    }
}
