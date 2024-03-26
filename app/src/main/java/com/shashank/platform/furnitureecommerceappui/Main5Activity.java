package com.shashank.platform.furnitureecommerceappui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        // 상태 바를 투명하게 설정
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);

        // Intent에서 데이터 추출
        String itemName = getIntent().getStringExtra("itemName1"); // 이름
        String itemPrice = getIntent().getStringExtra("itemPrice1"); // 가격

        // TextView 찾기
        TextView textViewItemName = findViewById(R.id.textViewItemName); // 이름을 표시할 TextView
        TextView textViewItemPrice = findViewById(R.id.textViewItemPrice); // 가격을 표시할 TextView

        // TextView에 데이터 설정
        textViewItemName.setText(itemName);
        textViewItemPrice.setText(itemPrice);

        // "뒤로 가기" 버튼 클릭 이벤트 처리
        Button backButton = findViewById(R.id.buttonBack);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Main2Activity로 이동
                Intent intent = new Intent(Main5Activity.this, HomeFragment.class);
                startActivity(intent);
                finish(); // 현재 액티비티 종료
            }
        });
    }
}
