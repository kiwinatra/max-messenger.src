package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;

/* renamed from: ye1  reason: default package */
public final class ye1 {
    public static final Pair r = new Pair("peerid", "WEB_SOCKET");
    public ue1 a;
    public final kz9 b;
    public final mz9 c;
    public final ArrayList d;
    public final List e;
    public final HashMap f = new HashMap();
    public boolean g;
    public float h = 1.0f;
    public a7a i = a7a.a;
    public Pair j;
    public String k;
    public String l;
    public long m;
    public boolean n;
    public boolean o;
    public e51 p;
    public List q = Collections.emptyList();

    public ye1(ue1 ue1, Pair pair, kz9 kz9, mz9 mz9) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = Collections.unmodifiableList(arrayList);
        this.a = ue1;
        e(pair);
        if (kz9 == null) {
            new kz9
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002f: CONSTRUCTOR  (r4v2 ? I:kz9) =  call: kz9.<init>():void type: CONSTRUCTOR in method: ye1.<init>(ue1, kotlin.Pair, kz9, mz9):void, dex: classes2.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v2 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                this = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.d = r0
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                r1.e = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.f = r0
                r0 = 1065353216(0x3f800000, float:1.0)
                r1.h = r0
                a7a r0 = defpackage.a7a.a
                r1.i = r0
                java.util.List r0 = java.util.Collections.emptyList()
                r1.q = r0
                r1.a = r2
                r1.e(r3)
                if (r4 == 0) goto L_0x002d
                goto L_0x0032
            L_0x002d:
                kz9 r4 = new kz9
                r4.<init>()
            L_0x0032:
                r1.b = r4
                if (r5 == 0) goto L_0x0037
                goto L_0x003c
            L_0x0037:
                mz9 r5 = new mz9
                r5.<init>()
            L_0x003c:
                r1.c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ye1.<init>(ue1, kotlin.Pair, kz9, mz9):void");
        }

        public final boolean a() {
            xe1 xe1 = xe1.b;
            List list = this.e;
            return list.contains(xe1) || list.contains(xe1.a);
        }

        public final boolean b() {
            return this.j != null;
        }

        public final boolean c() {
            return d() && this.o;
        }

        public final boolean d() {
            return this.c.e && this.n;
        }

        public final boolean e(Pair pair) {
            if (pair == null || TextUtils.isEmpty((CharSequence) pair.getFirst()) || Objects.equals(this.j, pair)) {
                return false;
            }
            if (this.j == null) {
                this.m = System.currentTimeMillis();
            }
            this.j = pair;
            Pair pair2 = (Pair) this.f.get(pair);
            if (pair2 == null) {
                return true;
            }
            this.l = (String) pair2.getFirst();
            this.k = (String) pair2.getSecond();
            return true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ye1.class != obj.getClass()) {
                return false;
            }
            ue1 ue1 = this.a;
            return ue1 != null && ue1.equals(((ye1) obj).a);
        }

        public final int hashCode() {
            return Objects.hashCode(this.a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CallParticipant{");
            sb.append(this.a);
            if (this.j != null || !this.f.isEmpty()) {
                sb.append("|registered");
            }
            Pair pair = this.j;
            if (pair != null) {
                sb.append("|accepted(");
                sb.append((String) pair.getFirst());
                sb.append(',');
                sb.append(this.l);
                sb.append('/');
                sb.append(this.k);
                sb.append(')');
            }
            if (this.g) {
                sb.append("|connected");
            }
            sb.append('|');
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }
