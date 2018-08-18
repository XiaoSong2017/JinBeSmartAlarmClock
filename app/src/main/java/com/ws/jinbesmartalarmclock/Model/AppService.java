package com.ws.jinbesmartalarmclock.Model;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.NotificationCompat;

import com.ws.jinbesmartalarmclock.R;

import java.util.Objects;


/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * TODO: Customize class - update intent actions and extra parameters.
 */
public class AppService extends IntentService {
//    // TODO: Rename actions, choose action names that describe tasks that this
//    // IntentService can perform, e.g. ACTION_FETCH_NEW_ITEMS
//    public static final String ACTION_FOO = "com.ws.jinbesmartalarmclock.Model.action.FOO";
//    public static final String ACTION_BAZ = "com.ws.jinbesmartalarmclock.Model.action.BAZ";
//
//    // TODO: Rename parameters
//    public static final String EXTRA_PARAM1 = "com.ws.jinbesmartalarmclock.Model.extra.PARAM1";
//    public static final String EXTRA_PARAM2 = "com.ws.jinbesmartalarmclock.Model.extra.PARAM2";

    public AppService() {
        super("AppService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
//        if (intent != null) {
//            final String action = intent.getAction();
//            if (ACTION_FOO.equals(action)) {
//                final String param1 = intent.getStringExtra(EXTRA_PARAM1);
//                final String param2 = intent.getStringExtra(EXTRA_PARAM2);
//                handleActionFoo(param1, param2);
//            } else if (ACTION_BAZ.equals(action)) {
//                final String param1 = intent.getStringExtra(EXTRA_PARAM1);
//                final String param2 = intent.getStringExtra(EXTRA_PARAM2);
//                handleActionBaz(param1, param2);
//            }
//        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            if(Objects.requireNonNull(intent.getStringExtra("action").equals("alarm"))){
                alarmService();
            }
        }else {
            if (intent.getStringExtra("action").equals("alarm")){
                alarmService();
            }
        }
    }

    private void alarmService() {
        Notification lNotification=new NotificationCompat.Builder(getApplicationContext())
                .setSmallIcon(R.drawable.ic_menu_send).setContentTitle(getResources().getString(R.string.app_name))
                .setSubText(getResources().getText(R.string.action_settings)).build();
        NotificationManager lNotificationManager=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        assert lNotificationManager != null;
        lNotificationManager.notify(1,lNotification);
    }

//    /**
//     * Handle action Foo in the provided background thread with the provided
//     * parameters.
//     */
//    private void handleActionFoo(String param1, String param2) {
//        // TODO: Handle action Foo
//        throw new UnsupportedOperationException("Not yet implemented");
//    }
//
//    /**
//     * Handle action Baz in the provided background thread with the provided
//     * parameters.
//     */
//    private void handleActionBaz(String param1, String param2) {
//        // TODO: Handle action Baz
//        throw new UnsupportedOperationException("Not yet implemented");
//    }
}
