package lav.wru2;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

/**
 * Created by Ashwin on 3/20/2018.
 */

public class Shared{

    Context context;

    public Shared(Context context) {
        this.context=context;
    }

    public void save(String x){
        SharedPreferences sharedPreferences = context.getSharedPreferences("LoginDetails", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("here",x);
        Toast.makeText(context,"over",Toast.LENGTH_SHORT).show();
        editor.commit();

    }

    public boolean get(){
        SharedPreferences sharedPreferences = context.getSharedPreferences("LoginDetails", Context.MODE_PRIVATE);
        boolean out =sharedPreferences.getString("here","").isEmpty();
        Toast.makeText(context,"get",Toast.LENGTH_SHORT).show();
        return out;

    }
}
