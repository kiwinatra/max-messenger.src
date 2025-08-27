package one.me.chatscreen.mediabar.mediatypepicker;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/chatscreen/mediabar/mediatypepicker/MediaTypePickerWidget;", "Lone/me/sdk/arch/Widget;", "Lqg3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Legd;", "parentScope", "", "chatId", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "chat-screen_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMediaTypePickerWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaTypePickerWidget.kt\none/me/chatscreen/mediabar/mediatypepicker/MediaTypePickerWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 ContextExt.kt\none/me/sdk/arch/ext/ContextExtKt\n+ 4 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n+ 5 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n+ 7 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,168:1\n420#2:169\n420#2:170\n235#2,10:171\n410#2,8:181\n410#2,8:189\n255#2,9:223\n17#3:197\n135#4,3:198\n138#4,8:215\n33#5,14:201\n93#6,2:232\n157#6,8:235\n96#6,10:243\n24#7:234\n*S KotlinDebug\n*F\n+ 1 MediaTypePickerWidget.kt\none/me/chatscreen/mediabar/mediatypepicker/MediaTypePickerWidget\n*L\n45#1:169\n46#1:170\n48#1:171,10\n74#1:181,8\n77#1:189,8\n50#1:223,9\n96#1:197\n127#1:198,3\n127#1:215,8\n127#1:201,14\n58#1:232,2\n62#1:235,8\n58#1:243,10\n61#1:234\n*E\n"})
@SuppressLint({"ValidController"})
public final class MediaTypePickerWidget extends Widget implements qg3 {
    public static final /* synthetic */ KProperty[] w;
    public final is a;
    public final is b;
    public final Lazy c;
    public final sn0 o;
    public final z5a v;

    static {
        Class<MediaTypePickerWidget> cls = MediaTypePickerWidget.class;
        w = new KProperty[]{wj6.p(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), wj6.p(cls, "parentScope", "getParentScope-IluPPks()Ljava/lang/String;", 0), wj6.p(cls, "root", "getRoot()Lone/me/chatscreen/mediabar/mediatypepicker/MediaTypePickerButtonsView;", 0)};
    }

    public MediaTypePickerWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = new is(Long.class, "chat_id");
        this.b = new is(egd.class, Widget.ARG_SCOPE_ID);
        this.c = createViewModelLazy(r19.class, new i76(23, new z19(this, 0)));
        this.o = binding(new z19(this, 1));
        this.v = (z5a) un2.a.getAccessor().g(z5a.class);
    }

    public final r19 c0() {
        return (r19) this.c.getValue();
    }

    public final void g(int i, Bundle bundle) {
        if (i == 1) {
            xag.h(c0().b.b, l19.a);
        } else if (i == 2) {
            try {
                String str = hsg.n;
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("*/*");
                startActivityForResult(intent, 373);
                z5a.g(this.v, jgd.CHAT_SYSTEM_FILE_VIEWER);
            } catch (ActivityNotFoundException unused) {
                e0b e0b = new e0b((Widget) this);
                e0b.i(q8.p(qad.B5, getContext()));
                e0b.j();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: dcf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: dcf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: dcf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: dcf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: s58} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: dcf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: dcf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: dcf} */
    /* JADX WARNING: type inference failed for: r1v5, types: [s58] */
    /* JADX WARNING: type inference failed for: r1v7, types: [s58] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r9, int r10, android.content.Intent r11) {
        /*
            r8 = this;
            r0 = 371(0x173, float:5.2E-43)
            r1 = 0
            if (r9 == r0) goto L_0x0046
            r0 = 373(0x175, float:5.23E-43)
            if (r9 == r0) goto L_0x001e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Unexpected onActivityResult code "
            r8.<init>(r9)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "MediaTypePickerWidget"
            defpackage.z68.f(r9, r8, r1)
            goto L_0x0092
        L_0x001e:
            if (r11 == 0) goto L_0x0045
            android.net.Uri r9 = r11.getData()
            if (r9 != 0) goto L_0x0027
            goto L_0x0045
        L_0x0027:
            r19 r8 = r8.c0()
            jx3 r10 = r8.a
            kotlin.Lazy r11 = r8.z
            java.lang.Object r11 = r11.getValue()
            gaf r11 = (defpackage.gaf) r11
            osa r11 = (defpackage.osa) r11
            q04 r11 = r11.b()
            q19 r0 = new q19
            r0.<init>(r9, r8, r1)
            r8 = 2
            defpackage.ev0.v(r10, r11, r1, r0, r8)
            goto L_0x0092
        L_0x0045:
            return
        L_0x0046:
            r9 = -1
            if (r10 != r9) goto L_0x0072
            if (r11 != 0) goto L_0x004c
            goto L_0x0072
        L_0x004c:
            java.lang.String r9 = "ru.ok.tamtam.extra.LOCATION"
            java.io.Serializable r9 = r11.getSerializableExtra(r9)
            boolean r10 = r9 instanceof defpackage.s58
            if (r10 == 0) goto L_0x0059
            r1 = r9
            s58 r1 = (defpackage.s58) r1
        L_0x0059:
            if (r1 != 0) goto L_0x005d
            s58 r1 = defpackage.s58.x
        L_0x005d:
            r3 = r1
            java.lang.String r9 = "ru.ok.tamtam.extra.LIVE"
            r0 = 0
            long r4 = r11.getLongExtra(r9, r0)
            java.lang.String r9 = "ru.ok.tamtam.extra.ZOOM"
            long r6 = r11.getLongExtra(r9, r0)
            dcf r1 = new dcf
            r2 = r1
            r2.<init>(r3, r4, r6)
        L_0x0072:
            if (r1 == 0) goto L_0x0092
            r19 r8 = r8.c0()
            p19 r8 = r8.b
            s85 r9 = r8.b
            n19 r10 = new n19
            long r2 = r1.c
            float r11 = (float) r2
            long r2 = r1.b
            s58 r0 = r1.a
            r10.<init>(r0, r11, r2)
            defpackage.xag.h(r9, r10)
            k19 r9 = defpackage.k19.a
            s85 r8 = r8.b
            defpackage.xag.h(r8, r9)
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chatscreen.mediabar.mediatypepicker.MediaTypePickerWidget.onActivityResult(int, int, android.content.Intent):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        KProperty kProperty = w[2];
        return (h19) this.o.getValue();
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        xme xme = c0().v;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(xme, getViewLifecycleOwner().getLifecycle(), iu7), new a29((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(c0().w, getViewLifecycleOwner().getLifecycle(), iu7), new b29((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public MediaTypePickerWidget(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(i2a.l(str, Widget.ARG_SCOPE_ID), TuplesKt.to("chat_id", Long.valueOf(j))));
    }
}
