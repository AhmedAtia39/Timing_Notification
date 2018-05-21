package com.example.ahmed.timing_notification;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.NotificationCompat;

import static android.content.Context.NOTIFICATION_SERVICE;
import static android.support.v4.app.NotificationCompat.DEFAULT_SOUND;

public class MyBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        NotificationManager N = (NotificationManager) context.getSystemService(NOTIFICATION_SERVICE);

        NotificationCompat.Builder n = new NotificationCompat.Builder(context);
        n.setContentTitle("منبه");
        n.setSmallIcon(R.drawable.img_notify);
        n.setContentText("Wlcome it's time .");
        n.setAutoCancel(true);
        n.setDefaults(DEFAULT_SOUND);

        Intent i = new Intent(context, MainActivity.class);
        PendingIntent p = PendingIntent.getActivity(context, 0, i, 0);
        n.setContentIntent(p);

        N.notify(1, n.build());
    }
}
