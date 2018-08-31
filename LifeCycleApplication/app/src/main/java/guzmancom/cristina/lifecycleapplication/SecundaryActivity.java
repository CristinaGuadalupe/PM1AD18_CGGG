package guzmancom.cristina.lifecycleapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecundaryActivity extends Activity {
    TextView txtState;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secundary_screem);
    }

    public void clickBotonPrincipal(View v){
        startActionMode(new Intent(MainActivity.this,MainActivity.class));
    }

}
