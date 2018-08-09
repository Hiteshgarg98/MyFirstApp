package hgcom.meterstoinches.meterstoinches;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.id.input;
import static java.sql.Types.DOUBLE;

public class MainActivity extends AppCompatActivity {
    private EditText e1;
    private TextView e2;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.e1);
        e2=(TextView)findViewById(R.id.e2);
        b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double m=39.37;
                double result=0;
                if(e1.getText().toString().equals("")){
                   e2.setText(R.string.error_message);
                    e2.setTextColor(Color.DKGRAY);
                }
                else {
                    double input = Double.parseDouble(e1.getText().toString());
                    result = input * m;
                    e2.setText(String.format("%.2f",result));
                    e2.setTextColor(Color.DKGRAY);
                }
            }
        });





    }
}
