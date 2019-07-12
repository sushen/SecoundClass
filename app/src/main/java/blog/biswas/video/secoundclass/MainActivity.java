package blog.biswas.video.secoundclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvNumber;
    Button btn1;
    Button btn2;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNumber = findViewById(R.id.tvNumber);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        if(v.getId() == R.id.btn1){
            tvNumber.setText("1");
        }else if (v.getId() == R.id.btn2){
            tvNumber.setText("2");
        }else if(v.getId() == R.id.btn3){
            tvNumber.setText("3");
        }
    }
}
