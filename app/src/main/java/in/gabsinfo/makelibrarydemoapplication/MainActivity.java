package in.gabsinfo.makelibrarydemoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import in.gabsinfo.arithmetic.Operations;

public class MainActivity extends AppCompatActivity {

    private EditText mEtFirst,mEtSecond;
    private TextView mTvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEtFirst=findViewById(R.id.et_first);
        mEtSecond=findViewById(R.id.et_second);
        Button btnSum=findViewById(R.id.btn_sum);
        Button btnDivision=findViewById(R.id.btn_division);
        Button btnMultiplication=findViewById(R.id.btn_multiplication);
        mTvResult=findViewById(R.id.tv_result);

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isValid()){

                    String strFirst = mEtFirst.getText().toString().trim();
                    String strSecond = mEtSecond.getText().toString().trim();
                    mTvResult.setText("Answer is : "+Operations.sum(Integer.valueOf(strFirst),Integer.valueOf(strSecond)));

                }else{
                    Toast.makeText(MainActivity.this, "All Fields are required.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isValid()){

                    String strFirst = mEtFirst.getText().toString().trim();
                    String strSecond = mEtSecond.getText().toString().trim();
                    mTvResult.setText("Answer is : "+Operations.multiplication(Integer.valueOf(strFirst),Integer.valueOf(strSecond)));

                }else{
                    Toast.makeText(MainActivity.this, "All Fields are required.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isValid()){

                    String strFirst = mEtFirst.getText().toString().trim();
                    String strSecond = mEtSecond.getText().toString().trim();
                    mTvResult.setText("Answer is : "+Operations.division(Integer.valueOf(strFirst),Integer.valueOf(strSecond)));

                }else{
                    Toast.makeText(MainActivity.this, "All Fields are required.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    private boolean isValid(){
        String strFirst = mEtFirst.getText().toString().trim();
        String strSecond = mEtSecond.getText().toString().trim();
        if(strFirst.isEmpty() || strSecond.isEmpty())
            return false;
        else
            return true;
    }
}
