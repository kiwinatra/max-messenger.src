package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlin.uuid.Uuid;
import one.me.android.externalcallback.ExternalCallbackWidget;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.chatscreen.ChatScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.contactlist.ContactListWidget;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.profile.ProfileScreen;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: x2  reason: default package */
public final class x2 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x2(Object obj, Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.a = i;
        this.c = obj;
        this.o = obj2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                x2 x2Var = new x2((AbstractPickerScreen) this.o, (Continuation) obj3, 0);
                x2Var.b = (Map) obj;
                x2Var.c = (Map) obj2;
                return x2Var.invokeSuspend(Unit.INSTANCE);
            case 1:
                x2 x2Var2 = new x2((xb) this.o, (Continuation) obj3, 1);
                x2Var2.b = (List) obj;
                x2Var2.c = (List) obj2;
                return x2Var2.invokeSuspend(Unit.INSTANCE);
            case 2:
                x2 x2Var3 = new x2((BaseBottomSheetWidget) this.o, (Continuation) obj3, 2);
                x2Var3.b = (orb) obj;
                x2Var3.c = (k2b) obj2;
                return x2Var3.invokeSuspend(Unit.INSTANCE);
            case 3:
                x2 x2Var4 = new x2((t81) this.o, (Continuation) obj3, 3);
                x2Var4.b = (y11) obj;
                x2Var4.c = (s44) obj2;
                return x2Var4.invokeSuspend(Unit.INSTANCE);
            case 4:
                x2 x2Var5 = new x2((CallLinkInfoScreen) this.o, (Continuation) obj3, 4);
                x2Var5.b = (CoordinatorLayout) obj;
                x2Var5.c = (k2b) obj2;
                return x2Var5.invokeSuspend(Unit.INSTANCE);
            case 5:
                x2 x2Var6 = new x2((ChatScreen) this.o, (Continuation) obj3, 5);
                x2Var6.b = (lld) obj;
                x2Var6.c = (sp2) obj2;
                return x2Var6.invokeSuspend(Unit.INSTANCE);
            case 6:
                x2 x2Var7 = new x2((tw2) this.o, (Continuation) obj3, 6);
                x2Var7.b = (ss2) obj;
                x2Var7.c = (ouf) obj2;
                return x2Var7.invokeSuspend(Unit.INSTANCE);
            case 7:
                k2b k2b = (k2b) obj2;
                x2 x2Var8 = new x2((nwe) this.c, (nwe) this.o, (Continuation) obj3, 7);
                x2Var8.b = (RecyclerView) obj;
                return x2Var8.invokeSuspend(Unit.INSTANCE);
            case 8:
                x2 x2Var9 = new x2((ContactListWidget) this.o, (Continuation) obj3, 8);
                x2Var9.b = (po3) obj;
                x2Var9.c = (List) obj2;
                return x2Var9.invokeSuspend(Unit.INSTANCE);
            case 9:
                k2b k2b2 = (k2b) obj2;
                x2 x2Var10 = new x2((ow3) this.c, (ImageView) this.o, (Continuation) obj3, 9);
                x2Var10.b = (FrameLayout) obj;
                return x2Var10.invokeSuspend(Unit.INSTANCE);
            case 10:
                x2 x2Var11 = new x2((ExternalCallbackWidget) this.o, (Continuation) obj3, 10);
                x2Var11.b = (TextView) obj;
                x2Var11.c = (k2b) obj2;
                return x2Var11.invokeSuspend(Unit.INSTANCE);
            case 11:
                x2 x2Var12 = new x2((w86) this.o, (Continuation) obj3, 11);
                x2Var12.b = (List) obj;
                x2Var12.c = (j66) obj2;
                return x2Var12.invokeSuspend(Unit.INSTANCE);
            case 12:
                x2 x2Var13 = new x2((InputPhoneScreen) this.o, (Continuation) obj3, 12);
                x2Var13.b = (TextView) obj;
                x2Var13.c = (k2b) obj2;
                return x2Var13.invokeSuspend(Unit.INSTANCE);
            case 13:
                x2 x2Var14 = new x2((Drawable) this.o, (Continuation) obj3, 13);
                x2Var14.b = (TextView) obj;
                x2Var14.c = (k2b) obj2;
                return x2Var14.invokeSuspend(Unit.INSTANCE);
            case Protos.Attaches.Attach.LOCATION:
                List list = (List) obj;
                x2 x2Var15 = new x2((EndlessRecyclerView2) this.c, (LogsViewerScreen) this.o, (Continuation) obj3, 14);
                x2Var15.b = (List) obj2;
                return x2Var15.invokeSuspend(Unit.INSTANCE);
            case Protos.Attaches.Attach.DAILY_MEDIA:
                LinearLayout linearLayout = (LinearLayout) obj;
                x2 x2Var16 = new x2((Drawable) this.c, (AppCompatTextView) this.o, (Continuation) obj3, 15);
                x2Var16.b = (k2b) obj2;
                return x2Var16.invokeSuspend(Unit.INSTANCE);
            case 16:
                LinearLayout linearLayout2 = (LinearLayout) obj;
                x2 x2Var17 = new x2((AppCompatTextView) this.c, (AppCompatTextView) this.o, (Continuation) obj3, 16);
                x2Var17.b = (k2b) obj2;
                return x2Var17.invokeSuspend(Unit.INSTANCE);
            case LangUtils.HASH_SEED:
                x2 x2Var18 = new x2((MessageContextMenuBottomSheet) this.o, (Continuation) obj3, 17);
                x2Var18.b = (FrameLayout) obj;
                x2Var18.c = (k2b) obj2;
                return x2Var18.invokeSuspend(Unit.INSTANCE);
            case 18:
                x2 x2Var19 = new x2((en9) this.o, (Continuation) obj3, 18);
                x2Var19.b = (a32) obj;
                x2Var19.c = (wj9) obj2;
                return x2Var19.invokeSuspend(Unit.INSTANCE);
            case 19:
                x2 x2Var20 = new x2((xcb) this.o, (Continuation) obj3, 19);
                x2Var20.b = (zcb) obj;
                x2Var20.c = (zcb) obj2;
                return x2Var20.invokeSuspend(Unit.INSTANCE);
            case 20:
                x2 x2Var21 = new x2((jib) this.o, (Continuation) obj3, 20);
                x2Var21.b = (ss2) obj;
                x2Var21.c = (List) obj2;
                return x2Var21.invokeSuspend(Unit.INSTANCE);
            case 21:
                x2 x2Var22 = new x2((djb) this.o, (Continuation) obj3, 21);
                x2Var22.b = (List) obj;
                x2Var22.c = (j66) obj2;
                return x2Var22.invokeSuspend(Unit.INSTANCE);
            case 22:
                x2 x2Var23 = new x2((cjb) this.o, (Continuation) obj3, 22);
                x2Var23.b = (List) obj;
                x2Var23.c = (j66) obj2;
                return x2Var23.invokeSuspend(Unit.INSTANCE);
            case 23:
                x2 x2Var24 = new x2((PickerContactsListWidget) this.o, (Continuation) obj3, 23);
                x2Var24.b = (List) obj;
                x2Var24.c = (List) obj2;
                return x2Var24.invokeSuspend(Unit.INSTANCE);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                x2 x2Var25 = new x2((ProfileChangeLinkScreen) this.o, (Continuation) obj3, 24);
                x2Var25.b = (ViewGroup) obj;
                x2Var25.c = (k2b) obj2;
                return x2Var25.invokeSuspend(Unit.INSTANCE);
            case 25:
                x2 x2Var26 = new x2((syb) this.o, (Continuation) obj3, 25);
                x2Var26.b = (a32) obj;
                x2Var26.c = (vk3) obj2;
                return x2Var26.invokeSuspend(Unit.INSTANCE);
            case 26:
                x2 x2Var27 = new x2((ProfileScreen) this.o, (Continuation) obj3, 26);
                x2Var27.b = (View) obj;
                x2Var27.c = (k2b) obj2;
                return x2Var27.invokeSuspend(Unit.INSTANCE);
            case 27:
                x2 x2Var28 = new x2((RecordControlsWidget) this.o, (Continuation) obj3, 27);
                x2Var28.b = (TextView) obj;
                x2Var28.c = (k2b) obj2;
                return x2Var28.invokeSuspend(Unit.INSTANCE);
            case 28:
                x2 x2Var29 = new x2((nmd) this.o, (Continuation) obj3, 28);
                x2Var29.b = (TextView) obj;
                x2Var29.c = (k2b) obj2;
                return x2Var29.invokeSuspend(Unit.INSTANCE);
            default:
                x2 x2Var30 = new x2((c3c) this.o, (Continuation) obj3, 29);
                x2Var30.b = (TextView) obj;
                x2Var30.c = (k2b) obj2;
                return x2Var30.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        q81 q81;
        SpannableString spannableString;
        boolean z;
        int i;
        int i2;
        int i3 = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i3) {
            case 0:
                ResultKt.throwOnFailure(obj);
                Map map = (Map) this.b;
                Map map2 = (Map) this.c;
                Iterator it = SetsKt.minus(map.keySet(), map2.keySet()).iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    AbstractPickerScreen abstractPickerScreen = (AbstractPickerScreen) this.o;
                    if (hasNext) {
                        long longValue = ((Number) it.next()).longValue();
                        KProperty[] kPropertyArr = AbstractPickerScreen.x;
                        abstractPickerScreen.h0().c(longValue);
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map2.entrySet()) {
                            if (!Intrinsics.areEqual(map.get(entry.getKey()), entry.getValue())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                            long longValue2 = ((Number) entry2.getKey()).longValue();
                            njb njb = (njb) entry2.getValue();
                            KProperty[] kPropertyArr2 = AbstractPickerScreen.x;
                            abstractPickerScreen.h0().c(longValue2);
                            abstractPickerScreen.h0().a(longValue2, njb.b, njb.e, njb.c, njb.d);
                        }
                        return map2;
                    }
                }
            case 1:
                ResultKt.throwOnFailure(obj);
                return ((xb) this.o).j() ? (List) this.c : (List) this.b;
            case 2:
                ResultKt.throwOnFailure(obj);
                orb orb = (orb) this.b;
                k2b k2b = (k2b) this.c;
                BaseBottomSheetWidget baseBottomSheetWidget = (BaseBottomSheetWidget) this.o;
                k2b g0 = baseBottomSheetWidget.g0();
                if (g0 != null) {
                    k2b = g0;
                }
                KProperty kProperty = BaseBottomSheetWidget.w[0];
                if (((Boolean) baseBottomSheetWidget.b.a(baseBottomSheetWidget)).booleanValue()) {
                    orb.setBackground(new ColorDrawable(k2b.c().d));
                }
                return Unit.INSTANCE;
            case 3:
                ResultKt.throwOnFailure(obj);
                y11 y11 = (y11) this.b;
                s44 s44 = (s44) this.c;
                t81 t81 = (t81) this.o;
                xme xme = t81.v;
                do {
                    value = xme.getValue();
                    p81 p81 = (p81) value;
                    ld9 ld9 = s44.a;
                    boolean z2 = ld9 != null && ld9.J();
                    q81 = p81.b;
                    q81 q812 = q81.b;
                    boolean z3 = s44.f;
                    if (q81 != q812) {
                        q81 = !z3 ? q81.a : q812;
                    }
                    CharSequence charSequence = y11.b;
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    hl1 hl1 = t81.o;
                    hl1.getClass();
                    if (StringsKt.isBlank(charSequence)) {
                        spannableString = null;
                    } else {
                        boolean z4 = s44.g;
                        int i4 = (z3 || !z4 || !z2) ? (z3 || !z4) ? z2 ? pqa.b0 : pqa.h : pqa.t : pqa.u;
                        int i5 = l2b.f.f;
                        Drawable b2 = ew3.b(hl1.a, i4);
                        iq.a0(b2, i5);
                        float f = (float) 16;
                        b2.setBounds(0, 0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
                        spannableString = new SpannableString("   " + charSequence + " ");
                        spannableString.setSpan(new bq5(b2, (vp5) null, 6), 0, 1, 17);
                    }
                } while (!xme.b(value, new p81(spannableString, q81)));
                return Unit.INSTANCE;
            case 4:
                ResultKt.throwOnFailure(obj);
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.b;
                KProperty[] kPropertyArr3 = CallLinkInfoScreen.z0;
                CallLinkInfoScreen callLinkInfoScreen = (CallLinkInfoScreen) this.o;
                callLinkInfoScreen.getClass();
                KProperty[] kPropertyArr4 = CallLinkInfoScreen.z0;
                KProperty kProperty2 = kPropertyArr4[3];
                js9 js9 = fu4.k;
                ((TextView) callLinkInfoScreen.X.getValue(callLinkInfoScreen, kProperty2)).setTextColor(js9.f(coordinatorLayout).getText().e);
                KProperty kProperty3 = kPropertyArr4[5];
                js9.e(coordinatorLayout.getContext()).f().getText().getClass();
                ((TextView) callLinkInfoScreen.Z.getValue(callLinkInfoScreen, kProperty3)).setTextColor(-16745729);
                ((TextView) callLinkInfoScreen.Y.getValue(callLinkInfoScreen, kPropertyArr4[4])).setTextColor(js9.e(coordinatorLayout.getContext()).f().getText().h);
                coordinatorLayout.setBackgroundColor(((k2b) this.c).c().h);
                return Unit.INSTANCE;
            case 5:
                ResultKt.throwOnFailure(obj);
                sp2 sp2 = (sp2) this.c;
                KProperty[] kPropertyArr5 = ChatScreen.d1;
                Long k = ((ChatScreen) this.o).q0().k();
                return !(((lld) this.b) instanceof hld) ? as0.b : (sp2 == null || !(k == null || k.longValue() == 0)) ? as0.a : as0.c;
            case 6:
                ResultKt.throwOnFailure(obj);
                ss2 ss2 = (ss2) this.b;
                ouf ouf = (ouf) this.c;
                KProperty[] kPropertyArr6 = tw2.T0;
                ((tw2) this.o).getClass();
                Iterable<xk2> iterable = ss2.a;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                for (xk2 xk2 : iterable) {
                    sr2 sr2 = (sr2) ouf.a.f(xk2.a);
                    if (!Intrinsics.areEqual((Object) sr2 != null ? sr2.b : null, (Object) xk2.x)) {
                        xk2 = new xk2(xk2.a, xk2.b, xk2.c, xk2.o, xk2.v, xk2.w, sr2 != null ? sr2.b : null, xk2.y, xk2.z, xk2.X, xk2.Y, xk2.Z, xk2.v0, xk2.w0, xk2.x0, xk2.y0, xk2.z0, xk2.A0, xk2.B0, xk2.C0);
                    }
                    arrayList.add(xk2);
                }
                return new ss2(arrayList, ss2.b);
            case 7:
                ResultKt.throwOnFailure(obj);
                ((nwe) this.c).j();
                ((nwe) this.o).j();
                ((RecyclerView) this.b).a0();
                return Unit.INSTANCE;
            case 8:
                ResultKt.throwOnFailure(obj);
                po3 po3 = (po3) this.b;
                List list = (List) this.c;
                KProperty[] kPropertyArr7 = ContactListWidget.N0;
                ContactListWidget contactListWidget = (ContactListWidget) this.o;
                CharSequence d0 = contactListWidget.d0();
                if (!(d0 == null || d0.length() == 0)) {
                    return Unit.INSTANCE;
                }
                contactListWidget.v.G(po3.a);
                contactListWidget.w.G(CollectionsKt.emptyList());
                contactListWidget.x.G(po3.c);
                po3 po32 = po3.d;
                t56 t56 = contactListWidget.z;
                if (po3 == po32) {
                    t56.G(CollectionsKt.emptyList());
                } else {
                    t56.G(list);
                }
                return Unit.INSTANCE;
            case 9:
                ResultKt.throwOnFailure(obj);
                FrameLayout frameLayout = (FrameLayout) this.b;
                Integer num = ((ow3) this.c).e;
                if (num != null) {
                    ((ImageView) this.o).setImageTintList(ColorStateList.valueOf(fu4.k.f(frameLayout).i(num.intValue())));
                }
                return Unit.INSTANCE;
            case 10:
                ResultKt.throwOnFailure(obj);
                k2b k2b2 = (k2b) this.c;
                int i6 = ExternalCallbackWidget.z0;
                ExternalCallbackWidget externalCallbackWidget = (ExternalCallbackWidget) this.o;
                externalCallbackWidget.getClass();
                ((TextView) this.b).setTextColor(k2b2.getText().h);
                ((te7) externalCallbackWidget.x0.getValue()).b = new int[]{0, k2b2.getIcon().g};
                return Unit.INSTANCE;
            case 11:
                ResultKt.throwOnFailure(obj);
                j66 j66 = (j66) this.c;
                Iterable<zx5> iterable2 = (List) this.b;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
                for (zx5 zx5 : iterable2) {
                    r14 r14 = (r14) j66.a.get(zx5.a);
                    if (r14 == null) {
                        r14 = r14.b;
                    }
                    ((w86) this.o).getClass();
                    arrayList2.add(new y16(zx5.a, zx5.b, zx5.c, r14, zx5.A0));
                }
                return arrayList2;
            case 12:
                ResultKt.throwOnFailure(obj);
                k2b k2b3 = (k2b) this.c;
                ((TextView) this.b).setTextColor(k2b3.getText().f);
                KProperty[] kPropertyArr8 = InputPhoneScreen.D0;
                InputPhoneScreen inputPhoneScreen = (InputPhoneScreen) this.o;
                inputPhoneScreen.getClass();
                KProperty kProperty4 = InputPhoneScreen.D0[5];
                String p = q8.p(nlc.oneme_login_welcome_terms, inputPhoneScreen.getContext());
                String p2 = q8.p(nlc.oneme_login_welcome_privacy_policy_clickable_part, inputPhoneScreen.getContext());
                String p3 = q8.p(nlc.oneme_login_welcome_user_agreement_clickable_part, inputPhoneScreen.getContext());
                SpannableString spannableString2 = new SpannableString(p);
                InputPhoneScreen.h0(p, p2, spannableString2, new gh7(0, inputPhoneScreen), k2b3);
                InputPhoneScreen.h0(p, p3, spannableString2, new gh7(1, inputPhoneScreen), k2b3);
                ((TextView) inputPhoneScreen.Z.getValue(inputPhoneScreen, kProperty4)).setText(spannableString2);
                return Unit.INSTANCE;
            case 13:
                ResultKt.throwOnFailure(obj);
                TextView textView = (TextView) this.b;
                k2b k2b4 = (k2b) this.c;
                ((Drawable) this.o).setTint(k2b4.getIcon().f);
                k2b4.getText().getClass();
                textView.setTextColor(-16745729);
                textView.setBackground(new RippleDrawable(ColorStateList.valueOf(k2b4.b().a.c), new ColorDrawable(k2b4.c().f), new ColorDrawable(-65536)));
                return Unit.INSTANCE;
            case Protos.Attaches.Attach.LOCATION:
                ResultKt.throwOnFailure(obj);
                EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) this.c;
                endlessRecyclerView2.setRefreshingNext(false);
                boolean isEmpty = ((List) this.b).isEmpty();
                LogsViewerScreen logsViewerScreen = (LogsViewerScreen) this.o;
                if (isEmpty) {
                    if (!Intrinsics.areEqual((Object) endlessRecyclerView2.getAdapter(), (Object) logsViewerScreen.o)) {
                        endlessRecyclerView2.O0(logsViewerScreen.o, true);
                    }
                } else if (!Intrinsics.areEqual((Object) endlessRecyclerView2.getAdapter(), (Object) logsViewerScreen.v)) {
                    endlessRecyclerView2.O0(logsViewerScreen.v, true);
                }
                logsViewerScreen.v.m();
                logsViewerScreen.o.m();
                return Unit.INSTANCE;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                ResultKt.throwOnFailure(obj);
                k2b k2b5 = (k2b) this.b;
                k2b5.getIcon().getClass();
                ((Drawable) this.c).setTint(-1);
                k2b5.getText().getClass();
                ((AppCompatTextView) this.o).setTextColor(-1);
                return Unit.INSTANCE;
            case 16:
                ResultKt.throwOnFailure(obj);
                k2b k2b6 = (k2b) this.b;
                ((AppCompatTextView) this.c).setTextColor(k2b6.getText().e);
                ((AppCompatTextView) this.o).setTextColor(k2b6.getText().f);
                return Unit.INSTANCE;
            case LangUtils.HASH_SEED:
                ResultKt.throwOnFailure(obj);
                KProperty[] kPropertyArr9 = MessageContextMenuBottomSheet.X0;
                MessageContextMenuBottomSheet messageContextMenuBottomSheet = (MessageContextMenuBottomSheet) this.o;
                messageContextMenuBottomSheet.getClass();
                ColorDrawable colorDrawable = messageContextMenuBottomSheet.J0;
                colorDrawable.setColor(((k2b) this.c).c().f);
                ((FrameLayout) this.b).setBackground(colorDrawable);
                return Unit.INSTANCE;
            case 18:
                ResultKt.throwOnFailure(obj);
                a32 a32 = (a32) this.b;
                wj9 wj9 = (wj9) this.c;
                d19 d19 = ((en9) this.o).c1;
                d19.getClass();
                List createListBuilder = CollectionsKt.createListBuilder();
                if (!wj9.c) {
                    Iterator it2 = ((ArrayList) d19.b).iterator();
                    while (it2.hasNext()) {
                        createListBuilder.addAll(((b12) it2.next()).b(a32));
                    }
                }
                Iterator it3 = ((ArrayList) d19.c).iterator();
                if (!it3.hasNext()) {
                    createListBuilder.addAll(wj9.a);
                    if (!wj9.b) {
                        Iterator it4 = ((ArrayList) d19.a).iterator();
                        if (it4.hasNext()) {
                            rae.w(it4.next());
                            throw null;
                        }
                    }
                    return CollectionsKt.build(createListBuilder);
                }
                rae.w(it3.next());
                throw null;
            case 19:
                ResultKt.throwOnFailure(obj);
                zcb zcb = (zcb) this.b;
                zcb zcb2 = (zcb) this.c;
                zcb zcb3 = zcb.a;
                xcb.a((xcb) this.o, "gallery", zcb == zcb3 ? "allowed" : zcb2 == zcb3 ? "partial" : "denied");
                return Unit.INSTANCE;
            case 20:
                ResultKt.throwOnFailure(obj);
                ss2 ss22 = (ss2) this.b;
                List list2 = (List) this.c;
                ((jib) this.o).w0.setValue(Boxing.boxBoolean(ss22.b));
                ArrayList arrayList3 = new ArrayList(ss22.a.size());
                if (!((Boolean) ((jib) this.o).w.invoke()).booleanValue() || ss22.b) {
                    jib jib = (jib) this.o;
                    for (xk2 j : ss22.a) {
                        arrayList3.add(jib.j(jib, j));
                    }
                } else {
                    jz9 a2 = xa8.a();
                    for (Number longValue3 : SequencesKt.mapNotNull(CollectionsKt.asSequence(ss22.a), new oo9(18))) {
                        a2.e(longValue3.longValue());
                    }
                    jz9 jz9 = ((jib) this.o).C0;
                    long[] jArr = jz9.b;
                    long[] jArr2 = jz9.a;
                    int length = jArr2.length - 2;
                    if (length >= 0) {
                        int i7 = 0;
                        while (true) {
                            long j2 = jArr2[i7];
                            if ((((~j2) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                                int i8 = 8 - ((~(i7 - length)) >>> 31);
                                int i9 = 0;
                                while (i9 < i8) {
                                    if ((j2 & 255) < 128) {
                                        i2 = i7;
                                        if (!a2.a(jArr[(i7 << 3) + i9])) {
                                            z = true;
                                        }
                                    } else {
                                        i2 = i7;
                                    }
                                    j2 >>= 8;
                                    i9++;
                                    i7 = i2;
                                }
                                int i10 = i7;
                                if (i8 == 8) {
                                    i = i10;
                                }
                            } else {
                                i = i7;
                            }
                            if (i != length) {
                                i7 = i + 1;
                            }
                        }
                    }
                    z = false;
                    ((jib) this.o).C0 = a2;
                    if (!z) {
                        Iterable iterable3 = (Iterable) ((jib) this.o).B0.getValue();
                        if (!(iterable3 instanceof Collection) || !((Collection) iterable3).isEmpty()) {
                            Iterator it5 = iterable3.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    if (a2.a(((hhb) it5.next()).a)) {
                                    }
                                }
                            }
                        }
                    } else {
                        xme xme2 = ((jib) this.o).A0;
                        xme2.m((Object) null, Long.valueOf(((Number) xme2.getValue()).longValue() + 1));
                    }
                    jib jib2 = (jib) this.o;
                    for (xk2 j3 : ss22.a) {
                        arrayList3.add(jib.j(jib2, j3));
                    }
                    CollectionsKt.plus(arrayList3, list2);
                }
                return arrayList3;
            case 21:
                ResultKt.throwOnFailure(obj);
                j66 j662 = (j66) this.c;
                Iterable<zx5> iterable4 = (List) this.b;
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable4, 10));
                for (zx5 zx52 : iterable4) {
                    r14 r142 = (r14) j662.a.get(zx52.a);
                    if (r142 == null) {
                        r142 = r14.b;
                    }
                    ((djb) this.o).getClass();
                    arrayList4.add(new y16(zx52.a, zx52.b, zx52.c, r142, zx52.A0));
                }
                return arrayList4;
            case 22:
                ResultKt.throwOnFailure(obj);
                j66 j663 = (j66) this.c;
                Iterable<zx5> iterable5 = (List) this.b;
                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable5, 10));
                for (zx5 zx53 : iterable5) {
                    r14 r143 = (r14) j663.a.get(zx53.a);
                    if (r143 == null) {
                        r143 = r14.b;
                    }
                    ((cjb) this.o).getClass();
                    arrayList5.add(new y16(zx53.a, zx53.b, zx53.c, r143, zx53.A0));
                }
                return arrayList5;
            case 23:
                ResultKt.throwOnFailure(obj);
                PickerContactsListWidget pickerContactsListWidget = (PickerContactsListWidget) this.o;
                pickerContactsListWidget.y.G((List) this.c);
                pickerContactsListWidget.w.G((List) this.b);
                return Unit.INSTANCE;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                ResultKt.throwOnFailure(obj);
                k2b k2b7 = (k2b) this.c;
                ((ViewGroup) this.b).setBackgroundColor(k2b7.c().h);
                KProperty[] kPropertyArr10 = ProfileChangeLinkScreen.Y;
                ((ProfileChangeLinkScreen) this.o).f0().setBackgroundColor(k2b7.c().h);
                return Unit.INSTANCE;
            case 25:
                ResultKt.throwOnFailure(obj);
                a32 a322 = (a32) this.b;
                vk3 vk3 = (vk3) this.c;
                KProperty[] kPropertyArr11 = syb.C0;
                ((syb) this.o).getClass();
                boolean z5 = vk3.r() == a322.b.d;
                return new cyb(z5 || a322.t(vk3.r()), z5 || ld9.F(a322.f(vk3.r()), 1), z5 || ld9.F(a322.f(vk3.r()), 16), z5 || ld9.F(a322.f(vk3.r()), 8), z5 || ld9.F(a322.f(vk3.r()), 2), z5 || ld9.F(a322.f(vk3.r()), Uuid.SIZE_BITS), (byb) null, (byb) null, (byb) null, (byb) null, (byb) null, (byb) null, (byb) null, 8128);
            case 26:
                ResultKt.throwOnFailure(obj);
                k2b k2b8 = (k2b) this.c;
                ((View) this.b).setBackgroundColor(k2b8.c().h);
                KProperty[] kPropertyArr12 = ProfileScreen.D0;
                ProfileScreen profileScreen = (ProfileScreen) this.o;
                profileScreen.d0().setTextColor(k2b8.getText().e);
                ((TextView) profileScreen.Y.getValue(profileScreen, ProfileScreen.D0[6])).setTextColor(k2b8.getText().f);
                return Unit.INSTANCE;
            case 27:
                ResultKt.throwOnFailure(obj);
                TextView textView2 = (TextView) this.b;
                k2b k2b9 = (k2b) this.c;
                KProperty[] kPropertyArr13 = RecordControlsWidget.g1;
                if (((RecordControlsWidget) this.o).D0().v0.a.getValue() instanceof dwc) {
                    k2b9.getText().getClass();
                    textView2.setTextColor(-1);
                } else {
                    textView2.setTextColor(k2b9.getText().e);
                }
                return Unit.INSTANCE;
            case 28:
                ResultKt.throwOnFailure(obj);
                ((TextView) this.b).setTextColor(((Number) ((nmd) this.o).b.invoke((k2b) this.c)).intValue());
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                ((TextView) this.b).setTextColor(((Number) ((c3c) this.o).b.invoke((k2b) this.c)).intValue());
                return Unit.INSTANCE;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x2(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.a = i;
        this.o = obj;
    }
}
