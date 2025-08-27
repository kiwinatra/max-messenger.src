package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import one.me.android.MainActivity;
import one.me.android.deeplink.LinkInterceptorWidget;
import one.me.android.join.JoinChatWidget;
import one.me.deeplink.InvalidDeeplinkNamingException;
import one.me.sdk.arch.Widget;

/* renamed from: fy7  reason: default package */
public final class fy7 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ LinkInterceptorWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fy7(LinkInterceptorWidget linkInterceptorWidget, Continuation continuation) {
        super(2, continuation);
        this.b = linkInterceptorWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        fy7 fy7 = new fy7(this.b, continuation);
        fy7.a = obj;
        return fy7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fy7) create((kx7) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        kx7 kx7 = (kx7) this.a;
        int i = LinkInterceptorWidget.o;
        LinkInterceptorWidget linkInterceptorWidget = this.b;
        hn requireActivity = linkInterceptorWidget.requireActivity();
        boolean z = !(requireActivity instanceof t7d);
        String a2 = kx7.a();
        iz1 iz1 = new iz1(a2, 4);
        boolean areEqual = Intrinsics.areEqual((Object) kx7, (Object) bx7.a);
        v0b v0b = v0b.a;
        if (areEqual) {
            e0b e0b = new e0b((Widget) linkInterceptorWidget);
            e0b.b = new z0b(r0b.a, "Ждите", "ждите", v0b, new n0b(2, 0, 6));
            e0b.j();
        } else if (kx7 instanceof uw7) {
            z0b z0b = new z0b(new o0b(cad.i1), q8.p(rkc.snackbar_link_info_error, linkInterceptorWidget.getContext()), (CharSequence) null, v0b, new n0b(2, 0, 6));
            if (z) {
                int i2 = MainActivity.E0;
                js9.l(requireActivity, (Uri) null, z0b, (iz1) null, 10);
                requireActivity.finish();
            } else {
                e0b e0b2 = new e0b((Widget) linkInterceptorWidget);
                e0b2.b = z0b;
                e0b2.j();
            }
        } else if (kx7 instanceof xw7) {
            if (z) {
                int i3 = MainActivity.E0;
                js9.l(requireActivity, (Uri) null, (z0b) null, (iz1) null, 14);
                requireActivity.finish();
            } else {
                zb8.b.getClass();
                zb8.o1((String) null, false);
            }
        } else if (kx7 instanceof yw7) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(((yw7) kx7).a);
            linkInterceptorWidget.startActivity(intent);
        } else if (kx7 instanceof tw7) {
            if (z) {
                e9d router = linkInterceptorWidget.getRouter();
                tw7 tw7 = (tw7) kx7;
                i9d n = iq.n(new JoinChatWidget(tw7.a, tw7.d, tw7.b, tw7.c), (ey3) null, (ey3) null);
                n.d("join_chat");
                router.R(n);
            } else {
                tw7 tw72 = (tw7) kx7;
                ta4 W0 = yn7.b.W0();
                zqd zqd = new zqd(9);
                zqd.b = ":join";
                zqd.z(Long.valueOf(tw72.a), "id");
                zqd.z(tw72.d, "link");
                zqd.z(Boolean.valueOf(tw72.c), "channel");
                zqd.z(Boolean.TRUE, "no_anim");
                String str = tw72.b;
                if (str != null) {
                    zqd.z(str, "title");
                }
                W0.c(zqd.p(), (Bundle) null);
            }
        } else if (kx7 instanceof cx7) {
            if (z) {
                int i4 = MainActivity.E0;
                ox2 ox2 = ox2.b;
                cx7 cx7 = (cx7) kx7;
                Long boxLong = Boxing.boxLong(cx7.b);
                js9.l(requireActivity, ox2.n1(ox2, cx7.a, "local", (Long) null, boxLong.longValue() > 0 ? boxLong : null, (List) null, (String) null, (Boolean) null, true, 244), (z0b) null, iz1, 4);
                requireActivity.finish();
            } else {
                ox2 ox22 = ox2.b;
                cx7 cx72 = (cx7) kx7;
                Long boxLong2 = Boxing.boxLong(cx72.b);
                ox2.p1(ox22, cx72.a, "local", (Long) null, boxLong2.longValue() > 0 ? boxLong2 : null, (List) null, (String) null, 116);
            }
        } else if (kx7 instanceof dx7) {
            if (z) {
                int i5 = MainActivity.E0;
                r4c.b.getClass();
                zqd zqd2 = new zqd(9);
                zqd2.b = ":profile";
                zqd2.z(Long.valueOf(((dx7) kx7).a), "id");
                zqd2.z("contact", "type");
                js9.l(requireActivity, zqd2.p(), (z0b) null, iz1, 4);
                requireActivity.finish();
            } else {
                r4c.b.s1(((dx7) kx7).a);
            }
        } else if (kx7 instanceof ex7) {
            if (z) {
                int i6 = MainActivity.E0;
                ex7 ex7 = (ex7) kx7;
                js9.l(requireActivity, ox2.n1(ox2.b, ex7.a, "local", (Long) null, (Long) null, (List) null, ex7.b, (Boolean) null, false, 476), (z0b) null, iz1, 4);
                requireActivity.finish();
            } else {
                ex7 ex72 = (ex7) kx7;
                ox2.p1(ox2.b, ex72.a, "local", (Long) null, (Long) null, (List) null, ex72.b, 92);
            }
        } else if (kx7 instanceof hx7) {
            if (z) {
                int i7 = MainActivity.E0;
                ox2.b.getClass();
                zqd zqd3 = new zqd(9);
                zqd3.b = ":stickers/set";
                zqd3.z(Long.valueOf(((hx7) kx7).a), "set_id");
                js9.l(requireActivity, zqd3.p(), (z0b) null, (iz1) null, 12);
                requireActivity.finish();
            } else {
                ta4 W02 = ox2.b.W0();
                zqd zqd4 = new zqd(9);
                zqd4.b = ":stickers/set";
                zqd4.z(Long.valueOf(((hx7) kx7).a), "set_id");
                W02.c(zqd4.p(), (Bundle) null);
            }
        } else if (kx7 instanceof gx7) {
            Lazy lazy = linkInterceptorWidget.b;
            if (z) {
                lf1 lf1 = (lf1) lazy.getValue();
                gx7 gx7 = (gx7) kx7;
                lf1.c();
                if (((Boolean) lf1.n.getValue()).booleanValue()) {
                    String str2 = gx7.a;
                    if (!StringsKt.isBlank(str2)) {
                        if (!((mp1) lf1.d()).e(new sje(str2, true))) {
                            mf1.b.getClass();
                            ArrayList arrayList = new ArrayList();
                            if (StringsKt__StringsJVMKt.startsWith$default(":call-active", ":", false, 2, (Object) null)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(":call-active");
                                sb.append('?');
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    sb.append((String) it.next());
                                    sb.append(Typography.amp);
                                }
                                sb.deleteCharAt(StringsKt.getLastIndex(sb));
                                Uri c = y64.c(sb.toString(), "max", (String) null);
                                int i8 = MainActivity.E0;
                                js9.l(requireActivity, c, (z0b) null, (iz1) null, 12);
                                Unit unit = Unit.INSTANCE;
                            } else {
                                throw new InvalidDeeplinkNamingException(":call-active");
                            }
                        } else {
                            mf1.b.getClass();
                            zqd zqd5 = new zqd(9);
                            zqd5.b = ":call-join-preview";
                            zqd5.z(str2, "link");
                            Uri p = zqd5.p();
                            int i9 = MainActivity.E0;
                            js9.l(requireActivity, p, (z0b) null, (iz1) null, 12);
                            Unit unit2 = Unit.INSTANCE;
                        }
                        requireActivity.finish();
                    }
                }
                lf1.a.a();
                requireActivity.finish();
            } else {
                ((lf1) lazy.getValue()).i(((gx7) kx7).a, true, false, false, new u75(29, kx7));
            }
        } else {
            boolean areEqual2 = Intrinsics.areEqual((Object) kx7, (Object) ww7.a);
            p0b p0b = p0b.a;
            if (areEqual2) {
                z0b z0b2 = new z0b(p0b, q8.p(rkc.snackbar_self_contact_open, linkInterceptorWidget.getContext()), (CharSequence) null, v0b, new n0b(2, 0, 6));
                if (z) {
                    int i10 = MainActivity.E0;
                    js9.l(requireActivity, (Uri) null, z0b2, (iz1) null, 10);
                    requireActivity.finish();
                } else {
                    e0b e0b3 = new e0b((Widget) linkInterceptorWidget);
                    e0b3.b = z0b2;
                    e0b3.j();
                }
            } else if (kx7 instanceof vw7) {
                if (z) {
                    int i11 = MainActivity.E0;
                    js9.l(requireActivity, ((vw7) kx7).a, (z0b) null, iz1, 4);
                    requireActivity.finish();
                } else {
                    Boxing.boxBoolean(((ta4) qra.a.getAccessor().g(ta4.class)).c(((vw7) kx7).a, (Bundle) null));
                }
            } else if (Intrinsics.areEqual((Object) kx7, (Object) fx7.a)) {
                z0b z0b3 = new z0b(p0b, q8.p(rkc.snackbar_contact_removed, linkInterceptorWidget.getContext()), (CharSequence) null, v0b, new n0b(2, 0, 6));
                if (z) {
                    int i12 = MainActivity.E0;
                    js9.l(requireActivity, (Uri) null, z0b3, (iz1) null, 10);
                    requireActivity.finish();
                } else {
                    e0b e0b4 = new e0b((Widget) linkInterceptorWidget);
                    e0b4.b = z0b3;
                    e0b4.j();
                }
            } else if (kx7 instanceof zw7) {
                if (z) {
                    int i13 = MainActivity.E0;
                    zb8.b.getClass();
                    zqd zqd6 = new zqd(9);
                    zqd6.b = ":chat-list";
                    zqd6.z(Boolean.FALSE, "message_push");
                    String str3 = ((zw7) kx7).a;
                    if (str3 != null) {
                        zqd6.z(str3, "folder_id");
                    }
                    js9.l(requireActivity, zqd6.p(), (z0b) null, (iz1) null, 12);
                    requireActivity.finish();
                } else {
                    zb8.b.getClass();
                    zb8.o1(((zw7) kx7).a, false);
                }
            } else if (kx7 instanceof jx7) {
                z0b z0b4 = new z0b(p0b, q8.p(rkc.snackbar_folder_link_error_title, linkInterceptorWidget.getContext()), q8.p(rkc.snackbar_folder_link_error_caption, linkInterceptorWidget.getContext()), v0b, new n0b(2, 0, 6));
                if (z) {
                    int i14 = MainActivity.E0;
                    js9.l(requireActivity, (Uri) null, z0b4, (iz1) null, 10);
                    requireActivity.finish();
                } else {
                    e0b e0b5 = new e0b((Widget) linkInterceptorWidget);
                    e0b5.b = z0b4;
                    e0b5.j();
                }
            } else if (!(kx7 instanceof ax7)) {
                throw new NoWhenBranchMatchedException();
            } else if (z) {
                int i15 = MainActivity.E0;
                zb8 zb8 = zb8.b;
                ax7 ax7 = (ax7) kx7;
                nfd nfd = kfg.c;
                zb8.getClass();
                js9.l(requireActivity, zb8.p1(ax7.a, ax7.b), (z0b) null, (iz1) null, 12);
                requireActivity.finish();
            } else {
                zb8 zb82 = zb8.b;
                ax7 ax72 = (ax7) kx7;
                nfd nfd2 = kfg.c;
                zb82.W0().c(zb8.p1(ax72.a, ax72.b), (Bundle) null);
            }
        }
        if (!z && a2 != null) {
            zb8.b.W0().b(":external_callback", o54.f(TuplesKt.to("params", a2)));
        }
        return Unit.INSTANCE;
    }
}
