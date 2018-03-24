package lav.wru2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Ashwin on 3/20/2018.
 */

public class Nextnew extends AppCompatActivity {
    TextView t;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nextnew);
        String x = getIntent().getStringExtra("get");
        t = (TextView)findViewById(R.id.tv);
        t.setText(x);

    }
}
