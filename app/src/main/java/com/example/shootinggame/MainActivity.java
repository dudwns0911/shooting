package com.example.shootinggame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView iv_gun;
    ImageView iv_bullet;
    ImageView iv_clay;
    TextView iv_score;

    double screen_width, screen_height;
    float bullet_height,bullet_width;
    float gun_height, gun_width;
    float clay_height, clay_width;
    float bullet_center_x, bullet_center_y;
    double gun_x, gun_y;
    double gun_center_x;
    int score;

    final int NO_OF_CLAYS =10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout layout =(ConstraintLayout) findViewById(R.id.layout);
        Display display =getWindowManager().getDefaultDisplay();
        Point size =new Point();
        display.getSize(size);
        screen_width = size.x;
        screen_height = size.y;

        iv_bullet = new ImageView(this);
        iv_gun = new ImageView(this);
        iv_clay = new ImageView(this);
        tv_score = findViewById(R.id.tv_score);

        iv_gun.setImageResource(R.drawable.gun);
        iv_gun.measure(iv_gun.getMeasuredWidth(),iv_gun.getMeasuredHeight());
        gun_height = iv_gun.getMeasuredHeight();
        gun_width =iv_gun.getMeasuredWidth();
        layout.addView(iv_gun);

        iv_bullet.setImageResource(R.drawable.bullet);
        iv_bullet.measure(iv_bullet.getMeasuredWidth(),iv_bullet.getMeasuredHeight());
        bullet_height =iv_bullet.getMeasuredHeight()
    }
}
