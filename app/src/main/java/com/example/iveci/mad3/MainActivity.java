package com.example.iveci.mad3;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onyouclick(View v){
        switch (v.getId()) {
            case R.id.button: {
                Toast.makeText(getApplicationContext(), "일반 메시지 창입니다.", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.button2: {
                Toast tview = Toast.makeText(getApplicationContext(), "일반 메시지 창입니다.", Toast.LENGTH_SHORT);
                tview.setGravity(Gravity.LEFT | Gravity.TOP, 10, 20);
                tview.show();
                break;
            }
            case R.id.button3: {
                View view = getLayoutInflater().inflate(R.layout.toastlay,null);
                TextView tv = (TextView) view.findViewById(R.id.toasttext);
                tv.setText("레이아웃으로 만든 토스트이다.");
                Toast tview = new Toast(this);
                tview.setDuration(Toast.LENGTH_SHORT);
                tview.setGravity(Gravity.CENTER, 0, 100);
                tview.setView(view);
                tview.show();
                break;
            }
            case R.id.button4: {
                Snackbar.make(v, "SnackBar로 보여주는 메시지.", 500)
                        .setAction("YES", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        }).show();
                break;
            }
            case R.id.button5: {

                break;
            }
            case R.id.button6: {

                break;
            }
            case R.id.button7: {

                break;
            }
            case R.id.button8: {

                break;
            }
        }
    }
}
