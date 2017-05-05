package itad230.assign3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void timerClick(View v){
        Intent intent = new Intent(this, TimerActivity.class);
        startActivity(intent);
    }

    public void alarmClick(View v){
        Intent intent = new Intent(this, AlarmActivity.class);
        startActivity(intent);
    }

    public void cameraClick(View v){
        Intent intent = new Intent(this, CameraActivity.class);
        startActivity(intent);
    }
}
