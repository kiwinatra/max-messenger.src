package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.common.VideoFrameProcessingException;
import com.google.android.exoplayer2.PlaybackException;
import java.util.List;
import javax.inject.Provider;
import kotlin.Unit;
import kotlin.reflect.KProperty;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import ru.ok.android.externcalls.analytics.internal.event.EventQueueCollector;
import ru.ok.android.externcalls.analytics.internal.upload.Uploader;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.events.MultiEventListener;
import ru.ok.android.externcalls.sdk.factory.JoinAnonByLinkParams;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.ParticipantsUpdater;
import ru.ok.android.externcalls.sdk.utils.cancelable.Cancelable;
import ru.ok.android.externcalls.sdk.utils.cancelable.DisposableCancelableKt;
import ru.ok.messages.channels.CreateChannelFragment;
import ru.ok.messages.channels.CreateChannelViewModel;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.util.HandledException;

/* renamed from: rt3  reason: default package */
public final /* synthetic */ class rt3 implements qk3, wze, tm, ParticipantsUpdater.MeChanger, ExternalIdsResolver.ExtraResolver, q85, j08, h08, zi6, lj4, s5g, Cancelable, cb8, Provider, Uploader.IdleStateProvider, i08 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rt3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void a(VideoFrameProcessingException videoFrameProcessingException) {
        qrf qrf = (qrf) ((rt6) this.b).b;
        qrf.getClass();
        qrf.w.execute(new sx8(10, qrf, videoFrameProcessingException));
    }

    public void accept(Object obj) {
        i7b i7b;
        bpe bpe;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                ((st3) obj2).c();
                return;
            case 1:
                Throwable th = (Throwable) obj;
                z68.e("st3", th.getMessage());
                ((uta) ((m95) obj2)).c(new HandledException(th), true);
                return;
            case 13:
                ((om0) obj2).d((List) obj);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                s9c s9c = (s9c) obj;
                th4 th4 = (th4) obj2;
                th4.getClass();
                z68.c("th4", "success connect to host: %s", s9c.j.toString());
                th4.k(s9c);
                return;
            default:
                Long l = (Long) obj;
                q25 q25 = ((r25) obj2).F0;
                if (q25 != null && (i7b = (i7b) ((t26) q25).z) != null && (bpe = ((cpe) i7b).G0) != null) {
                    bpe.X0();
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [ye4, java.lang.Object] */
    public Object apply(Object obj) {
        switch (this.a) {
            case 12:
                xe4 xe4 = (xe4) obj;
                ? obj2 = new Object();
                te4 te4 = (te4) this.b;
                obj2.a = te4.b;
                obj2.b = te4.c;
                xe4.getClass();
                return new qa3(2, new ni(7, xe4, obj2));
            case 21:
                return new d25(((d25) this.b).b, (List) obj);
            default:
                return ((u25) this.b).c((CharSequence) obj);
        }
    }

    public void b() {
        OneMeDraweeView oneMeDraweeView = ((q35) this.b).E0;
        if (oneMeDraweeView != null) {
            oneMeDraweeView.setVisibility(8);
        }
    }

    public List c() {
        switch (this.a) {
            case 2:
                return (List) ((su3) this.b).f.getValue();
            default:
                return (List) ((su3) this.b).f.getValue();
        }
    }

    public void cancel() {
        DisposableCancelableKt.toCancelable$lambda$0((mq4) this.b);
    }

    public void d(Object obj) {
        tqd tqd = ((sl6) ((tl6) obj)).a;
        CreateChannelFragment createChannelFragment = (CreateChannelFragment) this.b;
        CreateChannelViewModel i3 = createChannelFragment.i3();
        xme xme = i3.m;
        o85 o85 = new o85(Boolean.FALSE);
        xme.getClass();
        xme.m((Object) null, o85);
        KProperty[] kPropertyArr = CreateChannelViewModel.G;
        i3.i.setValue(i3, kPropertyArr[1], (Object) null);
        i3.l(tqd.v);
        i3.k.setValue(i3, kPropertyArr[3], tqd.w);
        i3.l.setValue(i3, kPropertyArr[4], tqd.x);
        o85 o852 = new o85(Unit.INSTANCE);
        xme xme2 = i3.s;
        xme2.getClass();
        xme2.m((Object) null, o852);
        createChannelFragment.l3();
    }

    public sm e() {
        return ConversationFactory.lambda$joinAnonByLink$14((JoinAnonByLinkParams) this.b);
    }

    public void g(Object obj, wq5 wq5) {
        sb5 sb5 = (sb5) obj;
        SparseArray sparseArray = ((vb4) this.b).v;
        SparseBooleanArray sparseBooleanArray = wq5.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int a2 = wq5.a(i);
            sd sdVar = (sd) sparseArray.get(a2);
            sdVar.getClass();
            sparseArray2.append(a2, sdVar);
        }
        sb5.getClass();
    }

    public Object get() {
        return ((Uploader) this.b).getSink();
    }

    public void invoke(Object obj) {
        Object obj2 = this.b;
        switch (this.a) {
            case 10:
                ((sb5) obj).getClass();
                z68.f("sb5", "onPlayerError", (PlaybackException) obj2);
                return;
            case 27:
                ((rob) obj).q((ts8) obj2);
                return;
            case 28:
                ((sob) obj).S((o44) obj2);
                return;
            default:
                ((rob) obj).q(((mc5) obj2).a.S0);
                return;
        }
    }

    public boolean isIdle() {
        return ((EventQueueCollector.IdleStateProvider) this.b).isIdle();
    }

    public k0d j(int i, spf spf, int[] iArr) {
        qb7 o = tb7.o();
        for (int i2 = 0; i2 < spf.a; i2++) {
            int i3 = i;
            spf spf2 = spf;
            int i4 = i2;
            o.a(new zi4(i3, spf2, i4, (ej4) this.b, iArr[i2]));
        }
        return o.j();
    }

    public ParticipantId onExternalByInternalResolution(ConversationParticipant conversationParticipant) {
        return ((MultiEventListener) this.b).onExternalByInternalResolution(conversationParticipant);
    }

    public void updateMyExternalId(ParticipantId participantId) {
        ((ConversationParticipant) this.b).setExternalId(participantId);
    }

    public /* synthetic */ rt3(sd sdVar, PlaybackException playbackException) {
        this.a = 10;
        this.b = playbackException;
    }

    public /* synthetic */ rt3(vb4 vb4, j3h j3h) {
        this.a = 9;
        this.b = vb4;
    }
}
