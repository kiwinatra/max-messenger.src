package net.jpountz.lz4;

import java.nio.ByteBuffer;
import java.util.Arrays;
import net.jpountz.lz4.LZ4Utils;

final class LZ4HCJavaUnsafeCompressor extends LZ4Compressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4Compressor INSTANCE = new LZ4HCJavaUnsafeCompressor();
    final int compressionLevel;
    /* access modifiers changed from: private */
    public final int maxAttempts;

    public LZ4HCJavaUnsafeCompressor() {
        this(9);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x007d, code lost:
        r13 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0238, code lost:
        r16 = net.jpountz.lz4.LZ4UnsafeUtils.encodeSequence(r22, r16, r8.start, r8.ref, r8.len, r25, r17, r12);
        r2 = r8.end();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compress(byte[] r22, int r23, int r24, byte[] r25, int r26, int r27) {
        /*
            r21 = this;
            r8 = r22
            r0 = r23
            r1 = r24
            r9 = r26
            r2 = r27
            sun.misc.Unsafe r3 = defpackage.gwf.a
            defpackage.acd.b(r0, r8, r1)
            r10 = r25
            defpackage.acd.b(r9, r10, r2)
            int r11 = r0 + r1
            int r12 = r9 + r2
            int r13 = r11 + -12
            int r14 = r11 + -5
            int r1 = r0 + 1
            net.jpountz.lz4.LZ4HCJavaUnsafeCompressor$HashTable r15 = new net.jpountz.lz4.LZ4HCJavaUnsafeCompressor$HashTable
            r2 = r21
            r15.<init>(r0)
            net.jpountz.lz4.LZ4Utils$Match r7 = new net.jpountz.lz4.LZ4Utils$Match
            r7.<init>()
            net.jpountz.lz4.LZ4Utils$Match r6 = new net.jpountz.lz4.LZ4Utils$Match
            r6.<init>()
            net.jpountz.lz4.LZ4Utils$Match r5 = new net.jpountz.lz4.LZ4Utils$Match
            r5.<init>()
            net.jpountz.lz4.LZ4Utils$Match r4 = new net.jpountz.lz4.LZ4Utils$Match
            r4.<init>()
            r2 = r0
            r16 = r9
        L_0x003c:
            if (r1 >= r13) goto L_0x0250
            boolean r0 = r15.insertAndFindBestMatch((byte[]) r8, (int) r1, (int) r14, (net.jpountz.lz4.LZ4Utils.Match) r6)
            if (r0 != 0) goto L_0x0047
            int r1 = r1 + 1
            goto L_0x003c
        L_0x0047:
            net.jpountz.lz4.LZ4Utils.copyTo(r6, r7)
            r17 = r16
            r16 = r2
        L_0x004e:
            int r0 = r6.end()
            if (r0 >= r13) goto L_0x022f
            int r0 = r6.end()
            int r2 = r0 + -2
            int r0 = r6.start
            int r3 = r0 + 1
            int r1 = r6.len
            r0 = r15
            r18 = r1
            r1 = r22
            r21 = r4
            r4 = r14
            r23 = r5
            r5 = r18
            r8 = r6
            r6 = r23
            boolean r0 = r0.insertAndFindWiderMatch((byte[]) r1, (int) r2, (int) r3, (int) r4, (int) r5, (net.jpountz.lz4.LZ4Utils.Match) r6)
            if (r0 != 0) goto L_0x0080
            r10 = r21
            r27 = r13
            r24 = r14
            r14 = r23
        L_0x007d:
            r13 = r7
            goto L_0x0238
        L_0x0080:
            int r0 = r7.start
            int r1 = r8.start
            r6 = r23
            if (r0 >= r1) goto L_0x0092
            int r0 = r6.start
            int r2 = r7.len
            int r1 = r1 + r2
            if (r0 >= r1) goto L_0x0092
            net.jpountz.lz4.LZ4Utils.copyTo(r7, r8)
        L_0x0092:
            int r0 = r6.start
            int r1 = r8.start
            int r0 = r0 - r1
            r5 = 3
            if (r0 >= r5) goto L_0x00a4
            net.jpountz.lz4.LZ4Utils.copyTo(r6, r8)
            r4 = r21
            r5 = r6
            r6 = r8
            r8 = r22
            goto L_0x004e
        L_0x00a4:
            int r0 = r6.start
            int r1 = r8.start
            int r0 = r0 - r1
            r4 = 4
            r3 = 18
            if (r0 >= r3) goto L_0x00cf
            int r0 = r8.len
            if (r0 <= r3) goto L_0x00b3
            r0 = r3
        L_0x00b3:
            int r1 = r1 + r0
            int r2 = r6.end()
            int r2 = r2 - r4
            if (r1 <= r2) goto L_0x00c4
            int r0 = r6.start
            int r1 = r8.start
            int r0 = r0 - r1
            int r1 = r6.len
            int r0 = r0 + r1
            int r0 = r0 - r4
        L_0x00c4:
            int r1 = r6.start
            int r2 = r8.start
            int r1 = r1 - r2
            int r0 = r0 - r1
            if (r0 <= 0) goto L_0x00cf
            r6.fix(r0)
        L_0x00cf:
            int r0 = r6.start
            int r1 = r6.len
            int r0 = r0 + r1
            if (r0 >= r13) goto L_0x01e4
            int r0 = r6.end()
            int r2 = r0 + -3
            int r1 = r6.start
            int r0 = r6.len
            r18 = r0
            r0 = r15
            r19 = r1
            r1 = r22
            r24 = r7
            r7 = r3
            r3 = r19
            r7 = r4
            r4 = r14
            r20 = r5
            r5 = r18
            r7 = r6
            r6 = r21
            boolean r0 = r0.insertAndFindWiderMatch((byte[]) r1, (int) r2, (int) r3, (int) r4, (int) r5, (net.jpountz.lz4.LZ4Utils.Match) r6)
            if (r0 != 0) goto L_0x0106
            r10 = r21
            r27 = r13
            r13 = r24
            r24 = r14
            r14 = r7
            goto L_0x01ec
        L_0x0106:
            r6 = r21
            int r0 = r6.start
            int r1 = r8.end()
            int r1 = r1 + 3
            if (r0 >= r1) goto L_0x0180
            int r0 = r6.start
            int r1 = r8.end()
            if (r0 < r1) goto L_0x0167
            int r0 = r7.start
            int r1 = r8.end()
            if (r0 >= r1) goto L_0x0134
            int r0 = r8.end()
            int r1 = r7.start
            int r0 = r0 - r1
            r7.fix(r0)
            int r0 = r7.len
            r1 = 4
            if (r0 >= r1) goto L_0x0134
            net.jpountz.lz4.LZ4Utils.copyTo(r6, r7)
        L_0x0134:
            int r2 = r8.start
            int r3 = r8.ref
            int r4 = r8.len
            r0 = r22
            r1 = r16
            r5 = r25
            r10 = r6
            r6 = r17
            r27 = r13
            r13 = r24
            r24 = r14
            r14 = r7
            r7 = r12
            int r17 = net.jpountz.lz4.LZ4UnsafeUtils.encodeSequence(r0, r1, r2, r3, r4, r5, r6, r7)
            int r16 = r8.end()
            net.jpountz.lz4.LZ4Utils.copyTo(r10, r8)
            net.jpountz.lz4.LZ4Utils.copyTo(r14, r13)
            r6 = r8
            r4 = r10
            r7 = r13
            r5 = r14
            r8 = r22
            r14 = r24
            r10 = r25
            r13 = r27
            goto L_0x004e
        L_0x0167:
            r10 = r6
            r27 = r13
            r13 = r24
            r24 = r14
            r14 = r7
            net.jpountz.lz4.LZ4Utils.copyTo(r10, r14)
        L_0x0172:
            r21 = r10
            r7 = r13
            r6 = r14
            r5 = r20
            r14 = r24
            r10 = r25
            r13 = r27
            goto L_0x00a4
        L_0x0180:
            r10 = r6
            r27 = r13
            r13 = r24
            r24 = r14
            r14 = r7
            int r0 = r14.start
            int r1 = r8.end()
            if (r0 >= r1) goto L_0x01c6
            int r0 = r14.start
            int r1 = r8.start
            int r2 = r0 - r1
            r3 = 15
            if (r2 >= r3) goto L_0x01c3
            int r0 = r8.len
            r1 = 18
            if (r0 <= r1) goto L_0x01a2
            r8.len = r1
        L_0x01a2:
            int r0 = r8.end()
            int r1 = r14.end()
            r2 = 4
            int r1 = r1 - r2
            if (r0 <= r1) goto L_0x01b8
            int r0 = r14.end()
            int r1 = r8.start
            int r0 = r0 - r1
            int r0 = r0 - r2
            r8.len = r0
        L_0x01b8:
            int r0 = r8.end()
            int r1 = r14.start
            int r0 = r0 - r1
            r14.fix(r0)
            goto L_0x01c6
        L_0x01c3:
            int r0 = r0 - r1
            r8.len = r0
        L_0x01c6:
            int r2 = r8.start
            int r3 = r8.ref
            int r4 = r8.len
            r0 = r22
            r1 = r16
            r5 = r25
            r6 = r17
            r7 = r12
            int r17 = net.jpountz.lz4.LZ4UnsafeUtils.encodeSequence(r0, r1, r2, r3, r4, r5, r6, r7)
            int r16 = r8.end()
            net.jpountz.lz4.LZ4Utils.copyTo(r14, r8)
            net.jpountz.lz4.LZ4Utils.copyTo(r10, r14)
            goto L_0x0172
        L_0x01e4:
            r10 = r21
            r27 = r13
            r24 = r14
            r14 = r6
            r13 = r7
        L_0x01ec:
            int r0 = r14.start
            int r1 = r8.end()
            if (r0 >= r1) goto L_0x01fb
            int r0 = r14.start
            int r1 = r8.start
            int r0 = r0 - r1
            r8.len = r0
        L_0x01fb:
            int r2 = r8.start
            int r3 = r8.ref
            int r4 = r8.len
            r0 = r22
            r1 = r16
            r5 = r25
            r6 = r17
            r7 = r12
            int r6 = net.jpountz.lz4.LZ4UnsafeUtils.encodeSequence(r0, r1, r2, r3, r4, r5, r6, r7)
            int r1 = r8.end()
            int r2 = r14.start
            int r3 = r14.ref
            int r4 = r14.len
            int r16 = net.jpountz.lz4.LZ4UnsafeUtils.encodeSequence(r0, r1, r2, r3, r4, r5, r6, r7)
            int r2 = r14.end()
        L_0x0220:
            r1 = r2
            r6 = r8
            r4 = r10
            r7 = r13
            r5 = r14
            r8 = r22
            r14 = r24
            r10 = r25
            r13 = r27
            goto L_0x003c
        L_0x022f:
            r10 = r4
            r8 = r6
            r27 = r13
            r24 = r14
            r14 = r5
            goto L_0x007d
        L_0x0238:
            int r2 = r8.start
            int r3 = r8.ref
            int r4 = r8.len
            r0 = r22
            r1 = r16
            r5 = r25
            r6 = r17
            r7 = r12
            int r16 = net.jpountz.lz4.LZ4UnsafeUtils.encodeSequence(r0, r1, r2, r3, r4, r5, r6, r7)
            int r2 = r8.end()
            goto L_0x0220
        L_0x0250:
            int r3 = r11 - r2
            r0 = r22
            r1 = r2
            r2 = r3
            r3 = r25
            r4 = r16
            r5 = r12
            int r0 = net.jpountz.lz4.LZ4UnsafeUtils.lastLiterals(r0, r1, r2, r3, r4, r5)
            int r0 = r0 - r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4HCJavaUnsafeCompressor.compress(byte[], int, int, byte[], int, int):int");
    }

    public class HashTable {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        static final int MASK = 65535;
        private final int base;
        private final short[] chainTable = new short[65536];
        private final int[] hashTable;
        int nextToUpdate;

        public HashTable(int i) {
            this.base = i;
            this.nextToUpdate = i;
            int[] iArr = new int[32768];
            this.hashTable = iArr;
            Arrays.fill(iArr, -1);
        }

        private void addHash(ByteBuffer byteBuffer, int i) {
            addHash(byteBuffer.getInt(i), i);
        }

        private int hashPointer(byte[] bArr, int i) {
            return hashPointer(gwf.b(i, bArr));
        }

        private int next(int i) {
            return i - (this.chainTable[i & MASK] & MASK);
        }

        public void insert(int i, byte[] bArr) {
            while (true) {
                int i2 = this.nextToUpdate;
                if (i2 < i) {
                    addHash(bArr, i2);
                    this.nextToUpdate++;
                } else {
                    return;
                }
            }
        }

        public boolean insertAndFindBestMatch(byte[] bArr, int i, int i2, LZ4Utils.Match match) {
            int i3;
            int i4;
            int commonBytes;
            match.start = i;
            match.len = 0;
            insert(i, bArr);
            int hashPointer = hashPointer(bArr, i);
            if (hashPointer < i - 4 || hashPointer > i || hashPointer < this.base) {
                i4 = 0;
                i3 = 0;
            } else {
                if (LZ4UnsafeUtils.readIntEquals(bArr, hashPointer, i)) {
                    i4 = i - hashPointer;
                    i3 = LZ4UnsafeUtils.commonBytes(bArr, hashPointer + 4, i + 4, i2) + 4;
                    match.len = i3;
                    match.ref = hashPointer;
                } else {
                    i4 = 0;
                    i3 = 0;
                }
                hashPointer = next(hashPointer);
            }
            for (int i5 = 0; i5 < LZ4HCJavaUnsafeCompressor.this.maxAttempts && hashPointer >= Math.max(this.base, i - MASK) && hashPointer <= i; i5++) {
                if (LZ4UnsafeUtils.readIntEquals(bArr, hashPointer, i) && (commonBytes = LZ4UnsafeUtils.commonBytes(bArr, hashPointer + 4, i + 4, i2) + 4) > match.len) {
                    match.ref = hashPointer;
                    match.len = commonBytes;
                }
                hashPointer = next(hashPointer);
            }
            if (i3 != 0) {
                int i6 = (i3 + i) - 3;
                while (i < i6 - i4) {
                    this.chainTable[i & MASK] = (short) i4;
                    i++;
                }
                do {
                    this.chainTable[i & MASK] = (short) i4;
                    this.hashTable[LZ4Utils.hashHC(gwf.b(i, bArr))] = i;
                    i++;
                } while (i < i6);
                this.nextToUpdate = i6;
            }
            if (match.len != 0) {
                return true;
            }
            return false;
        }

        public boolean insertAndFindWiderMatch(byte[] bArr, int i, int i2, int i3, int i4, LZ4Utils.Match match) {
            int commonBytesBackward;
            int commonBytes;
            match.len = i4;
            insert(i, bArr);
            int hashPointer = hashPointer(bArr, i);
            for (int i5 = 0; i5 < LZ4HCJavaUnsafeCompressor.this.maxAttempts && hashPointer >= Math.max(this.base, i - MASK) && hashPointer <= i; i5++) {
                if (LZ4UnsafeUtils.readIntEquals(bArr, hashPointer, i) && (commonBytes = LZ4UnsafeUtils.commonBytes(bArr, hashPointer + 4, i + 4, i3) + 4 + commonBytesBackward) > match.len) {
                    match.len = commonBytes;
                    match.ref = hashPointer - (commonBytesBackward = LZ4UnsafeUtils.commonBytesBackward(bArr, hashPointer, i, this.base, i2));
                    match.start = i - commonBytesBackward;
                }
                hashPointer = next(hashPointer);
            }
            if (match.len > i4) {
                return true;
            }
            return false;
        }

        private void addHash(byte[] bArr, int i) {
            addHash(gwf.b(i, bArr), i);
        }

        private int hashPointer(ByteBuffer byteBuffer, int i) {
            return hashPointer(byteBuffer.getInt(i));
        }

        public void insert(int i, ByteBuffer byteBuffer) {
            while (true) {
                int i2 = this.nextToUpdate;
                if (i2 < i) {
                    addHash(byteBuffer, i2);
                    this.nextToUpdate++;
                } else {
                    return;
                }
            }
        }

        private void addHash(int i, int i2) {
            int hashHC = LZ4Utils.hashHC(i);
            int[] iArr = this.hashTable;
            int i3 = i2 - iArr[hashHC];
            if (i3 >= 65536) {
                i3 = MASK;
            }
            this.chainTable[i2 & MASK] = (short) i3;
            iArr[hashHC] = i2;
        }

        private int hashPointer(int i) {
            return this.hashTable[LZ4Utils.hashHC(i)];
        }

        public boolean insertAndFindWiderMatch(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, LZ4Utils.Match match) {
            int commonBytesBackward;
            int commonBytes;
            match.len = i4;
            insert(i, byteBuffer);
            int hashPointer = hashPointer(byteBuffer, i);
            for (int i5 = 0; i5 < LZ4HCJavaUnsafeCompressor.this.maxAttempts && hashPointer >= Math.max(this.base, i - MASK) && hashPointer <= i; i5++) {
                if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, hashPointer, i) && (commonBytes = LZ4ByteBufferUtils.commonBytes(byteBuffer, hashPointer + 4, i + 4, i3) + 4 + commonBytesBackward) > match.len) {
                    match.len = commonBytes;
                    match.ref = hashPointer - (commonBytesBackward = LZ4ByteBufferUtils.commonBytesBackward(byteBuffer, hashPointer, i, this.base, i2));
                    match.start = i - commonBytesBackward;
                }
                hashPointer = next(hashPointer);
            }
            if (match.len > i4) {
                return true;
            }
            return false;
        }

        public boolean insertAndFindBestMatch(ByteBuffer byteBuffer, int i, int i2, LZ4Utils.Match match) {
            int i3;
            int i4;
            int commonBytes;
            match.start = i;
            match.len = 0;
            insert(i, byteBuffer);
            int hashPointer = hashPointer(byteBuffer, i);
            if (hashPointer < i - 4 || hashPointer > i || hashPointer < this.base) {
                i4 = 0;
                i3 = 0;
            } else {
                if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, hashPointer, i)) {
                    i4 = i - hashPointer;
                    i3 = LZ4ByteBufferUtils.commonBytes(byteBuffer, hashPointer + 4, i + 4, i2) + 4;
                    match.len = i3;
                    match.ref = hashPointer;
                } else {
                    i4 = 0;
                    i3 = 0;
                }
                hashPointer = next(hashPointer);
            }
            for (int i5 = 0; i5 < LZ4HCJavaUnsafeCompressor.this.maxAttempts && hashPointer >= Math.max(this.base, i - MASK) && hashPointer <= i; i5++) {
                if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, hashPointer, i) && (commonBytes = LZ4ByteBufferUtils.commonBytes(byteBuffer, hashPointer + 4, i + 4, i2) + 4) > match.len) {
                    match.ref = hashPointer;
                    match.len = commonBytes;
                }
                hashPointer = next(hashPointer);
            }
            if (i3 != 0) {
                int i6 = (i3 + i) - 3;
                while (i < i6 - i4) {
                    this.chainTable[i & MASK] = (short) i4;
                    i++;
                }
                do {
                    this.chainTable[i & MASK] = (short) i4;
                    this.hashTable[LZ4Utils.hashHC(byteBuffer.getInt(i))] = i;
                    i++;
                } while (i < i6);
                this.nextToUpdate = i6;
            }
            if (match.len != 0) {
                return true;
            }
            return false;
        }
    }

    public LZ4HCJavaUnsafeCompressor(int i) {
        this.maxAttempts = 1 << (i - 1);
        this.compressionLevel = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x025c, code lost:
        r0 = net.jpountz.lz4.LZ4ByteBufferUtils.encodeSequence(r10, r0, r1.start, r1.ref, r1.len, r11, r16, r13);
        r3 = r1.end();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compress(java.nio.ByteBuffer r23, int r24, int r25, java.nio.ByteBuffer r26, int r27, int r28) {
        /*
            r22 = this;
            r0 = r24
            r3 = r25
            r1 = r27
            r6 = r28
            boolean r2 = r23.hasArray()
            if (r2 == 0) goto L_0x0036
            boolean r2 = r26.hasArray()
            if (r2 == 0) goto L_0x0036
            byte[] r2 = r23.array()
            int r4 = r23.arrayOffset()
            int r4 = r4 + r0
            byte[] r5 = r26.array()
            int r0 = r26.arrayOffset()
            int r7 = r0 + r1
            r0 = r22
            r1 = r2
            r2 = r4
            r3 = r25
            r4 = r5
            r5 = r7
            r6 = r28
            int r0 = r0.compress((byte[]) r1, (int) r2, (int) r3, (byte[]) r4, (int) r5, (int) r6)
            return r0
        L_0x0036:
            java.nio.ByteBuffer r10 = defpackage.ow0.c(r23)
            java.nio.ByteBuffer r11 = defpackage.ow0.c(r26)
            defpackage.ow0.b(r10, r0, r3)
            defpackage.ow0.b(r11, r1, r6)
            int r12 = r0 + r3
            int r13 = r1 + r6
            int r14 = r12 + -12
            int r15 = r12 + -5
            int r2 = r0 + 1
            net.jpountz.lz4.LZ4HCJavaUnsafeCompressor$HashTable r9 = new net.jpountz.lz4.LZ4HCJavaUnsafeCompressor$HashTable
            r3 = r22
            r9.<init>(r0)
            net.jpountz.lz4.LZ4Utils$Match r8 = new net.jpountz.lz4.LZ4Utils$Match
            r8.<init>()
            net.jpountz.lz4.LZ4Utils$Match r7 = new net.jpountz.lz4.LZ4Utils$Match
            r7.<init>()
            net.jpountz.lz4.LZ4Utils$Match r6 = new net.jpountz.lz4.LZ4Utils$Match
            r6.<init>()
            net.jpountz.lz4.LZ4Utils$Match r5 = new net.jpountz.lz4.LZ4Utils$Match
            r5.<init>()
            r3 = r0
            r0 = r1
        L_0x006b:
            if (r2 >= r14) goto L_0x0271
            boolean r4 = r9.insertAndFindBestMatch((java.nio.ByteBuffer) r10, (int) r2, (int) r15, (net.jpountz.lz4.LZ4Utils.Match) r7)
            if (r4 != 0) goto L_0x0076
            int r2 = r2 + 1
            goto L_0x006b
        L_0x0076:
            net.jpountz.lz4.LZ4Utils.copyTo(r7, r8)
            r16 = r0
            r0 = r3
        L_0x007c:
            int r2 = r7.end()
            if (r2 >= r14) goto L_0x0251
            int r2 = r7.end()
            int r4 = r2 + -2
            int r2 = r7.start
            int r17 = r2 + 1
            int r3 = r7.len
            r2 = r9
            r18 = r3
            r3 = r10
            r22 = r5
            r5 = r17
            r23 = r6
            r6 = r15
            r1 = r7
            r7 = r18
            r25 = r12
            r12 = r8
            r8 = r23
            boolean r2 = r2.insertAndFindWiderMatch((java.nio.ByteBuffer) r3, (int) r4, (int) r5, (int) r6, (int) r7, (net.jpountz.lz4.LZ4Utils.Match) r8)
            if (r2 != 0) goto L_0x00b3
            r17 = r22
            r20 = r9
            r21 = r14
            r14 = r23
            r23 = r21
            goto L_0x025c
        L_0x00b3:
            int r2 = r12.start
            int r3 = r1.start
            r8 = r23
            if (r2 >= r3) goto L_0x00c5
            int r2 = r8.start
            int r4 = r12.len
            int r3 = r3 + r4
            if (r2 >= r3) goto L_0x00c5
            net.jpountz.lz4.LZ4Utils.copyTo(r12, r1)
        L_0x00c5:
            int r2 = r8.start
            int r3 = r1.start
            int r2 = r2 - r3
            r7 = 3
            if (r2 >= r7) goto L_0x00da
            net.jpountz.lz4.LZ4Utils.copyTo(r8, r1)
            r5 = r22
            r7 = r1
            r6 = r8
            r8 = r12
        L_0x00d5:
            r12 = r25
            r1 = r27
            goto L_0x007c
        L_0x00da:
            int r2 = r8.start
            int r3 = r1.start
            int r2 = r2 - r3
            r6 = 4
            r5 = 18
            if (r2 >= r5) goto L_0x0105
            int r2 = r1.len
            if (r2 <= r5) goto L_0x00e9
            r2 = r5
        L_0x00e9:
            int r3 = r3 + r2
            int r4 = r8.end()
            int r4 = r4 - r6
            if (r3 <= r4) goto L_0x00fa
            int r2 = r8.start
            int r3 = r1.start
            int r2 = r2 - r3
            int r3 = r8.len
            int r2 = r2 + r3
            int r2 = r2 - r6
        L_0x00fa:
            int r3 = r8.start
            int r4 = r1.start
            int r3 = r3 - r4
            int r2 = r2 - r3
            if (r2 <= 0) goto L_0x0105
            r8.fix(r2)
        L_0x0105:
            int r2 = r8.start
            int r3 = r8.len
            int r2 = r2 + r3
            if (r2 >= r14) goto L_0x0209
            int r2 = r8.end()
            int r4 = r2 + -3
            int r3 = r8.start
            int r2 = r8.len
            r17 = r2
            r2 = r9
            r18 = r3
            r3 = r10
            r23 = r9
            r9 = r5
            r5 = r18
            r9 = r6
            r6 = r15
            r19 = r7
            r7 = r17
            r9 = r8
            r8 = r22
            boolean r2 = r2.insertAndFindWiderMatch((java.nio.ByteBuffer) r3, (int) r4, (int) r5, (int) r6, (int) r7, (net.jpountz.lz4.LZ4Utils.Match) r8)
            if (r2 != 0) goto L_0x0139
            r17 = r22
            r20 = r23
            r23 = r14
            r14 = r9
            goto L_0x0210
        L_0x0139:
            r8 = r22
            int r2 = r8.start
            int r3 = r1.end()
            int r3 = r3 + 3
            if (r2 >= r3) goto L_0x01a6
            int r2 = r8.start
            int r3 = r1.end()
            if (r2 < r3) goto L_0x0192
            int r2 = r9.start
            int r3 = r1.end()
            if (r2 >= r3) goto L_0x0167
            int r2 = r1.end()
            int r3 = r9.start
            int r2 = r2 - r3
            r9.fix(r2)
            int r2 = r9.len
            r3 = 4
            if (r2 >= r3) goto L_0x0167
            net.jpountz.lz4.LZ4Utils.copyTo(r8, r9)
        L_0x0167:
            int r4 = r1.start
            int r5 = r1.ref
            int r6 = r1.len
            r2 = r10
            r3 = r0
            r7 = r11
            r0 = r8
            r8 = r16
            r20 = r23
            r23 = r14
            r14 = r9
            r9 = r13
            int r16 = net.jpountz.lz4.LZ4ByteBufferUtils.encodeSequence(r2, r3, r4, r5, r6, r7, r8, r9)
            int r2 = r1.end()
            net.jpountz.lz4.LZ4Utils.copyTo(r0, r1)
            net.jpountz.lz4.LZ4Utils.copyTo(r14, r12)
            r5 = r0
            r7 = r1
            r0 = r2
            r8 = r12
            r6 = r14
            r9 = r20
            r14 = r23
            goto L_0x00d5
        L_0x0192:
            r20 = r23
            r23 = r14
            r14 = r9
            r9 = r8
            net.jpountz.lz4.LZ4Utils.copyTo(r9, r14)
            r22 = r9
        L_0x019d:
            r8 = r14
            r7 = r19
            r9 = r20
            r14 = r23
            goto L_0x00da
        L_0x01a6:
            r20 = r23
            r23 = r14
            r14 = r9
            r9 = r8
            int r2 = r14.start
            int r3 = r1.end()
            if (r2 >= r3) goto L_0x01ea
            int r2 = r14.start
            int r3 = r1.start
            int r4 = r2 - r3
            r5 = 15
            if (r4 >= r5) goto L_0x01e7
            int r2 = r1.len
            r3 = 18
            if (r2 <= r3) goto L_0x01c6
            r1.len = r3
        L_0x01c6:
            int r2 = r1.end()
            int r3 = r14.end()
            r4 = 4
            int r3 = r3 - r4
            if (r2 <= r3) goto L_0x01dc
            int r2 = r14.end()
            int r3 = r1.start
            int r2 = r2 - r3
            int r2 = r2 - r4
            r1.len = r2
        L_0x01dc:
            int r2 = r1.end()
            int r3 = r14.start
            int r2 = r2 - r3
            r14.fix(r2)
            goto L_0x01ea
        L_0x01e7:
            int r2 = r2 - r3
            r1.len = r2
        L_0x01ea:
            int r4 = r1.start
            int r5 = r1.ref
            int r6 = r1.len
            r2 = r10
            r3 = r0
            r7 = r11
            r8 = r16
            r0 = r9
            r9 = r13
            int r16 = net.jpountz.lz4.LZ4ByteBufferUtils.encodeSequence(r2, r3, r4, r5, r6, r7, r8, r9)
            int r2 = r1.end()
            net.jpountz.lz4.LZ4Utils.copyTo(r14, r1)
            net.jpountz.lz4.LZ4Utils.copyTo(r0, r14)
            r22 = r0
            r0 = r2
            goto L_0x019d
        L_0x0209:
            r17 = r22
            r20 = r9
            r23 = r14
            r14 = r8
        L_0x0210:
            int r2 = r14.start
            int r3 = r1.end()
            if (r2 >= r3) goto L_0x021f
            int r2 = r14.start
            int r3 = r1.start
            int r2 = r2 - r3
            r1.len = r2
        L_0x021f:
            int r4 = r1.start
            int r5 = r1.ref
            int r6 = r1.len
            r2 = r10
            r3 = r0
            r7 = r11
            r8 = r16
            r9 = r13
            int r8 = net.jpountz.lz4.LZ4ByteBufferUtils.encodeSequence(r2, r3, r4, r5, r6, r7, r8, r9)
            int r3 = r1.end()
            int r4 = r14.start
            int r5 = r14.ref
            int r6 = r14.len
            int r0 = net.jpountz.lz4.LZ4ByteBufferUtils.encodeSequence(r2, r3, r4, r5, r6, r7, r8, r9)
            int r3 = r14.end()
        L_0x0241:
            r7 = r1
            r2 = r3
            r8 = r12
            r6 = r14
            r5 = r17
            r9 = r20
            r14 = r23
            r12 = r25
            r1 = r27
            goto L_0x006b
        L_0x0251:
            r17 = r5
            r1 = r7
            r20 = r9
            r25 = r12
            r23 = r14
            r14 = r6
            r12 = r8
        L_0x025c:
            int r4 = r1.start
            int r5 = r1.ref
            int r6 = r1.len
            r2 = r10
            r3 = r0
            r7 = r11
            r8 = r16
            r9 = r13
            int r0 = net.jpountz.lz4.LZ4ByteBufferUtils.encodeSequence(r2, r3, r4, r5, r6, r7, r8, r9)
            int r3 = r1.end()
            goto L_0x0241
        L_0x0271:
            r25 = r12
            int r4 = r25 - r3
            r2 = r10
            r5 = r11
            r6 = r0
            r7 = r13
            int r0 = net.jpountz.lz4.LZ4ByteBufferUtils.lastLiterals(r2, r3, r4, r5, r6, r7)
            int r0 = r0 - r27
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4HCJavaUnsafeCompressor.compress(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }
}
