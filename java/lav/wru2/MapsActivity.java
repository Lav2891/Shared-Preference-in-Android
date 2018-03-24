package lav.wru2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MapsActivity extends AppCompatActivity {
   private EditText e;
   private Button bb;
    String x;
    Shared share;
   private CheckBox ch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        share = new Shared(this);

        e = (EditText)findViewById(R.id.et);
        bb = (Button)findViewById(R.id.b);
        ch = (CheckBox)findViewById(R.id.c);

        if (!share.get()) {
            x = e.getText().toString();

            Intent intent = new Intent(MapsActivity.this, Nextnew.class);
            intent.putExtra("get", x);
            startActivity(intent);
            finish();

        }


        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               value();

            }
        });


}

public void value(){
    x = e.getText().toString();
            share.save(x);
        Intent intent = new Intent(MapsActivity.this, Nextnew.class);
        intent.putExtra("get", x);
        startActivity(intent);
        finish();

}




    public void save(String x){
        new Shared(this).save(x);
    }

   }