package defpackage;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* renamed from: d9f  reason: default package */
public final class d9f extends SuspendLambda implements Function2 {
    public final /* synthetic */ ata X;
    public Closeable a;
    public ata b;
    public FileChannel c;
    public Ref.ObjectRef o;
    public ByteBuffer v;
    public long w;
    public int x;
    public int y;
    public /* synthetic */ Object z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d9f(ata ata, Continuation continuation) {
        super(2, continuation);
        this.X = ata;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        d9f d9f = new d9f(this.X, continuation);
        d9f.z = obj;
        return d9f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d9f) create((ds5) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v24, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v25, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v26, resolved type: java.io.RandomAccessFile} */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:34|(7:36|(1:38)|39|40|(1:52)|34|(0))|41|42|46|47|(1:49)(4:50|51|40|(0))|49) */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0113, code lost:
        r4 = r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x0170 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00de A[Catch:{ all -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00eb A[Catch:{ all -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012e A[Catch:{ all -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0131 A[Catch:{ all -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0186 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.y
            java.lang.String r3 = "<Invalid UTF-8 sequence>"
            r4 = 0
            r5 = 0
            r7 = 2
            r8 = 1
            r9 = 0
            if (r2 == 0) goto L_0x0055
            if (r2 == r8) goto L_0x002d
            if (r2 != r7) goto L_0x0025
            java.lang.Object r0 = r0.z
            r1 = r0
            java.io.Closeable r1 = (java.io.Closeable) r1
            kotlin.ResultKt.throwOnFailure(r19)     // Catch:{ all -> 0x0020 }
            goto L_0x0188
        L_0x0020:
            r0 = move-exception
            r10 = r1
        L_0x0022:
            r1 = r0
            goto L_0x0191
        L_0x0025:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002d:
            int r2 = r0.x
            long r10 = r0.w
            java.nio.ByteBuffer r12 = r0.v
            kotlin.jvm.internal.Ref$ObjectRef r13 = r0.o
            java.nio.channels.FileChannel r14 = r0.c
            ata r15 = r0.b
            java.io.Closeable r7 = r0.a
            java.lang.Object r8 = r0.z
            ds5 r8 = (defpackage.ds5) r8
            kotlin.ResultKt.throwOnFailure(r19)     // Catch:{ all -> 0x0050 }
            r6 = r2
            r2 = r8
            r8 = r15
            r5 = 1
            r16 = r10
            r10 = r7
            r7 = r14
            r14 = r13
            r13 = r12
            r11 = r16
            goto L_0x012f
        L_0x0050:
            r0 = move-exception
            r1 = r0
            r10 = r7
            goto L_0x0191
        L_0x0055:
            kotlin.ResultKt.throwOnFailure(r19)
            java.lang.Object r2 = r0.z
            ds5 r2 = (defpackage.ds5) r2
            java.io.File r7 = new java.io.File
            ata r8 = r0.X
            java.lang.Object r10 = r8.b
            java.lang.String r10 = (java.lang.String) r10
            r7.<init>(r10)
            boolean r10 = r7.exists()
            if (r10 == 0) goto L_0x0198
            java.io.RandomAccessFile r10 = new java.io.RandomAccessFile
            java.lang.String r11 = "r"
            r10.<init>(r7, r11)
            java.nio.channels.FileChannel r7 = r10.getChannel()     // Catch:{ all -> 0x0086 }
            long r11 = r7.size()     // Catch:{ all -> 0x0086 }
            int r13 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r13 != 0) goto L_0x0088
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0086 }
            kotlin.io.CloseableKt.closeFinally(r10, r9)
            return r0
        L_0x0086:
            r0 = move-exception
            goto L_0x0022
        L_0x0088:
            kotlin.jvm.internal.Ref$ObjectRef r13 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch:{ all -> 0x0086 }
            r13.<init>()     // Catch:{ all -> 0x0086 }
            java.nio.ByteBuffer r14 = java.nio.ByteBuffer.allocate(r4)     // Catch:{ all -> 0x0086 }
            r13.element = r14     // Catch:{ all -> 0x0086 }
        L_0x0093:
            int r14 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r14 <= 0) goto L_0x0153
            kotlin.coroutines.CoroutineContext r14 = r18.getContext()     // Catch:{ all -> 0x0086 }
            defpackage.kv0.q(r14)     // Catch:{ all -> 0x0086 }
            r8.getClass()     // Catch:{ all -> 0x0086 }
            int r14 = (int) r11     // Catch:{ all -> 0x0086 }
            r15 = 8192(0x2000, float:1.14794E-41)
            int r14 = kotlin.ranges.RangesKt.coerceAtMost((int) r15, (int) r14)     // Catch:{ all -> 0x0086 }
            long r5 = (long) r14     // Catch:{ all -> 0x0086 }
            long r11 = r11 - r5
            r7.position(r11)     // Catch:{ all -> 0x0086 }
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r14)     // Catch:{ all -> 0x0086 }
            r7.read(r5)     // Catch:{ all -> 0x0086 }
            r5.flip()     // Catch:{ all -> 0x0086 }
            int r6 = r5.remaining()     // Catch:{ all -> 0x0086 }
            T r14 = r13.element     // Catch:{ all -> 0x0086 }
            java.nio.ByteBuffer r14 = (java.nio.ByteBuffer) r14     // Catch:{ all -> 0x0086 }
            int r14 = r14.remaining()     // Catch:{ all -> 0x0086 }
            int r6 = r6 + r14
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r6)     // Catch:{ all -> 0x0086 }
            r6.put(r5)     // Catch:{ all -> 0x0086 }
            T r5 = r13.element     // Catch:{ all -> 0x0086 }
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5     // Catch:{ all -> 0x0086 }
            r6.put(r5)     // Catch:{ all -> 0x0086 }
            r6.flip()     // Catch:{ all -> 0x0086 }
            int r5 = r6.limit()     // Catch:{ all -> 0x0086 }
            r14 = r13
            r13 = r6
            r6 = r5
        L_0x00dc:
            if (r5 <= 0) goto L_0x0131
            int r15 = r5 + -1
            r13.position(r15)     // Catch:{ all -> 0x0086 }
            byte r9 = r13.get()     // Catch:{ all -> 0x0086 }
            r4 = 10
            if (r9 == r4) goto L_0x00f4
            r4 = 13
            if (r9 != r4) goto L_0x00f0
            goto L_0x00f4
        L_0x00f0:
            r5 = r15
        L_0x00f1:
            r4 = 0
            r9 = 0
            goto L_0x00dc
        L_0x00f4:
            int r6 = r6 - r15
            r4 = 1
            int r6 = r6 - r4
            byte[] r4 = new byte[r6]     // Catch:{ all -> 0x0086 }
            r13.position(r5)     // Catch:{ all -> 0x0086 }
            r13.get(r4)     // Catch:{ all -> 0x0086 }
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)     // Catch:{ all -> 0x0086 }
            r8.getClass()     // Catch:{ all -> 0x0086 }
            java.lang.Object r5 = r8.c     // Catch:{ CharacterCodingException -> 0x0113 }
            java.nio.charset.CharsetDecoder r5 = (java.nio.charset.CharsetDecoder) r5     // Catch:{ CharacterCodingException -> 0x0113 }
            java.nio.CharBuffer r4 = r5.decode(r4)     // Catch:{ CharacterCodingException -> 0x0113 }
            java.lang.String r4 = r4.toString()     // Catch:{ CharacterCodingException -> 0x0113 }
            goto L_0x0114
        L_0x0113:
            r4 = r3
        L_0x0114:
            r0.z = r2     // Catch:{ all -> 0x0086 }
            r0.a = r10     // Catch:{ all -> 0x0086 }
            r0.b = r8     // Catch:{ all -> 0x0086 }
            r0.c = r7     // Catch:{ all -> 0x0086 }
            r0.o = r14     // Catch:{ all -> 0x0086 }
            r0.v = r13     // Catch:{ all -> 0x0086 }
            r0.w = r11     // Catch:{ all -> 0x0086 }
            r0.x = r15     // Catch:{ all -> 0x0086 }
            r5 = 1
            r0.y = r5     // Catch:{ all -> 0x0086 }
            java.lang.Object r4 = r2.a(r4, r0)     // Catch:{ all -> 0x0086 }
            if (r4 != r1) goto L_0x012e
            return r1
        L_0x012e:
            r6 = r15
        L_0x012f:
            r5 = r6
            goto L_0x00f1
        L_0x0131:
            r5 = 1
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r6)     // Catch:{ all -> 0x0086 }
            r14.element = r4     // Catch:{ all -> 0x0086 }
            r4 = 0
            r13.position(r4)     // Catch:{ all -> 0x0086 }
            r13.limit(r6)     // Catch:{ all -> 0x0086 }
            T r6 = r14.element     // Catch:{ all -> 0x0086 }
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6     // Catch:{ all -> 0x0086 }
            r6.put(r13)     // Catch:{ all -> 0x0086 }
            T r6 = r14.element     // Catch:{ all -> 0x0086 }
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6     // Catch:{ all -> 0x0086 }
            r6.flip()     // Catch:{ all -> 0x0086 }
            r13 = r14
            r5 = 0
            r9 = 0
            goto L_0x0093
        L_0x0153:
            T r4 = r13.element     // Catch:{ all -> 0x0086 }
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4     // Catch:{ all -> 0x0086 }
            boolean r4 = r4.hasRemaining()     // Catch:{ all -> 0x0086 }
            if (r4 == 0) goto L_0x0187
            T r4 = r13.element     // Catch:{ all -> 0x0086 }
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4     // Catch:{ all -> 0x0086 }
            r8.getClass()     // Catch:{ all -> 0x0086 }
            java.lang.Object r5 = r8.c     // Catch:{ CharacterCodingException -> 0x0170 }
            java.nio.charset.CharsetDecoder r5 = (java.nio.charset.CharsetDecoder) r5     // Catch:{ CharacterCodingException -> 0x0170 }
            java.nio.CharBuffer r4 = r5.decode(r4)     // Catch:{ CharacterCodingException -> 0x0170 }
            java.lang.String r3 = r4.toString()     // Catch:{ CharacterCodingException -> 0x0170 }
        L_0x0170:
            r0.z = r10     // Catch:{ all -> 0x0086 }
            r4 = 0
            r0.a = r4     // Catch:{ all -> 0x0086 }
            r0.b = r4     // Catch:{ all -> 0x0086 }
            r0.c = r4     // Catch:{ all -> 0x0086 }
            r0.o = r4     // Catch:{ all -> 0x0086 }
            r0.v = r4     // Catch:{ all -> 0x0086 }
            r4 = 2
            r0.y = r4     // Catch:{ all -> 0x0086 }
            java.lang.Object r0 = r2.a(r3, r0)     // Catch:{ all -> 0x0086 }
            if (r0 != r1) goto L_0x0187
            return r1
        L_0x0187:
            r1 = r10
        L_0x0188:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0020 }
            r0 = 0
            kotlin.io.CloseableKt.closeFinally(r1, r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0191:
            throw r1     // Catch:{ all -> 0x0192 }
        L_0x0192:
            r0 = move-exception
            r2 = r0
            kotlin.io.CloseableKt.closeFinally(r10, r1)
            throw r2
        L_0x0198:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "File does not exist: "
            r1.<init>(r2)
            java.lang.Object r2 = r8.b
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d9f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
