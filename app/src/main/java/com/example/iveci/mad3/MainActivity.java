package com.example.iveci.mad3;

import android.content.DialogInterface;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    int choice;
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
                AlertDialog.Builder dlg = new AlertDialog.Builder(this);
                dlg.setTitle("기본대화상자")
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage("기본 대화상자다.")
                        .setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),
                                        "닫기를 눌러버렸다.",Toast.LENGTH_SHORT)
                                        .show();
                            }
                        })
                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),
                                        "확인을 눌러버렸다.",Toast.LENGTH_SHORT)
                                        .show();
                            }
                        }).show();
                break;
            }
            case R.id.button6: {
                AlertDialog.Builder dlg = new AlertDialog.Builder(this);
                String data[] = {"치킨", "피자", "라면"};
                dlg.setTitle("메뉴를 골라라.")
                        .setIcon(R.mipmap.ic_launcher)
                        .setSingleChoiceItems(data, 0, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                choice = which;
                            }
                        })
                        .setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),
                                        "닫기를 눌러버렸다.",Toast.LENGTH_SHORT)
                                        .show();
                            }
                        })
                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),
                                        "확인을 골랐다.",Toast.LENGTH_SHORT)
                                        .show();
                            }
                        }).show();
                break;
            }
            case R.id.button7: {
                AlertDialog.Builder dlg = new AlertDialog.Builder(this);
                final String data[] = {"치킨", "피자", "라면"};
                final boolean check[] = {false, true, false};
                dlg.setTitle("메뉴를 골라라.")
                        .setIcon(R.mipmap.ic_launcher)
                        .setMultiChoiceItems(data, check, new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                                check[which] = isChecked;
                            }
                        })
                        .setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),
                                        "닫기를 눌러버렸다.",Toast.LENGTH_SHORT)
                                        .show();
                            }
                        })
                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),
                                        (check[0] ? data[0]+", ": "")+ (check[1] ? data[1]+", " : "") + (check[2] ? data[2] : "")+ "을 골랐다.",Toast.LENGTH_SHORT)
                                        .show();
                            }
                        }).show();
                break;
            }
            case R.id.button8: {
                View view = View.inflate(this, R.layout.layoutio, null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(this);
                final EditText txt = (EditText) view.findViewById(R.id.editText3);
                dlg.setTitle("메뉴를 입력해라.")
                        .setView(view)
                        .setIcon(R.mipmap.ic_launcher)
                        .setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),
                                        "닫기를 눌러버렸다.",Toast.LENGTH_SHORT)
                                        .show();
                            }
                        })
                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),
                                        txt.getText().toString() + " 메뉴로 받았다.",Toast.LENGTH_SHORT)
                                        .show();
                            }
                        }).show();
                break;
            }
        }
    }
}
