package ru.ok.android.externcalls.sdk;

import android.os.Handler;

public class AudioSampleEnergyCalculator implements mq9 {
    private final Handler mainThreadHandler;
    private final l60 processor = new l60();

    public AudioSampleEnergyCalculator(Handler handler) {
        this.mainThreadHandler = handler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onSample$0(long j) {
        this.processor.a(j);
    }

    public l60 getProcessor() {
        return this.processor;
    }

    public void onSample(int i, int i2, int i3, z6b z6b) {
        long j = 0;
        int i4 = 0;
        while (true) {
            int i5 = z6b.a;
            if (i4 < i5) {
                short a = z6b.a(i4);
                j += (long) (a * a);
                i4++;
            } else {
                this.mainThreadHandler.post(new z60(this, (long) Math.sqrt((double) (j / ((long) i5))), 2));
                return;
            }
        }
    }
}
