//package com.etletle.cyclingBehavior;
//
//import android.app.NotificationManager;
//import android.app.PendingIntent;
//import android.content.Context;
//import android.content.Intent;
//import android.support.v7.app.NotificationCompat;
//import android.util.Log;
//
//import com.google.android.gms.location.sample.activityrecognition.MainActivity;
//import com.google.android.gms.location.sample.activityrecognition.R;
//
///**
// * Created by FabianLucien on 2/1/16.
// */
//public class Notification_01 {
//
//        public static void showNotification(Context context, String title, String message) {
//
//            NotificationManager notificationManager = (NotificationManager)
//                    context.getSystemService(Context.NOTIFICATION_SERVICE);
//
//            notificationManager.cancel(1);
//
//            int icon = R.drawable.cast_ic_notification_on;
//            Intent intent = new Intent(context, MainActivity.class);
//            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
//            PendingIntent resultPendingIntent = PendingIntent.getActivity(context, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
//            NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
//            NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
//            android.app.Notification notification = builder.setSmallIcon(icon)
//                    .setTicker(title)
//                    .setWhen(0)
//                    .setAutoCancel(true) // on tap, remove the notification
//                    .setContentTitle(title)
//                    .setStyle(inboxStyle)
//                    .setContentIntent(resultPendingIntent)
//                    .setContentText(message)
//                    .setPriority(android.app.Notification.PRIORITY_HIGH)
//                    .build();
//
//            notificationManager.notify(1, notification);
//            Log.i("TestLog", "Notification send!");
//        }
//
//        public static void cancelNotification(Context ctx, int notifyId) {
//
//            if (notifyId == 0) {
//                return;
//            } else {
//                String ns = Context.NOTIFICATION_SERVICE;
//                NotificationManager nMgr = (NotificationManager) ctx.getSystemService(ns);
//                nMgr.cancel(notifyId);
//            }
//        }
//}
//
