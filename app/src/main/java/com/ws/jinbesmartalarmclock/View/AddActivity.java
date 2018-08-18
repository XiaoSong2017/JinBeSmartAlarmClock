package com.ws.jinbesmartalarmclock.View;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

import com.ws.jinbesmartalarmclock.Model.AppService;
import com.ws.jinbesmartalarmclock.R;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        final TimePicker lTimePicker=findViewById(R.id.mTimerPicker);
        Button lButton=findViewById(R.id.mButton_yes);
        lButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pView) {
                AlarmManager lAlarmManager=(AlarmManager) getSystemService(ALARM_SERVICE);
                Intent lIntent=new Intent(AddActivity.this, AppService.class);
                lIntent.putExtra("action","alarm");
                PendingIntent lPendingIntent=PendingIntent.getService(AddActivity.this,0,
                        lIntent,0);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    assert lAlarmManager != null;
                    lAlarmManager.setExact(AlarmManager.RTC,System.currentTimeMillis(),lPendingIntent);
                }else {
                    assert lAlarmManager != null;
                    lAlarmManager.set(AlarmManager.RTC,System.currentTimeMillis(),lPendingIntent);
                }
            }
        });
    }
}
