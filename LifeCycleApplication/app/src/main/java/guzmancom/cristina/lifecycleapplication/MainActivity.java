package guzmancom.cristina.lifecycleapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
 TextView txtState;
 Button buttonmain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtState=(TextView)findViewById(R.id.txtState);
        buttonmain=(Button)findViewById(R.id.buttonmain);
        buttonmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SecundaryActivity.class));
            }
        });

        txtState.setMovementMethod(new ScrollingMovementMethod());
        Toast.makeText(this,"onCreate",Toast.LENGTH_SHORT).show();
        Log.d("primary_state","onCreate");
        txtState.setText(txtState.getText()+"\n on Create");
    }

    @Override
    protected void onResume() {
        super.onResume();
        txtState=(TextView)findViewById(R.id.txtState);
        Toast.makeText( this, "on Resume",Toast.LENGTH_SHORT).show();
        Log.d( "State",  "on resume" );
        txtState.setText(txtState.getText()+"\n on Resume");

    }

    @Override
    protected void onStart() {
        super.onStart();
        txtState=(TextView)findViewById(R.id.txtState);
        Toast.makeText( this, "on start",Toast.LENGTH_SHORT).show();
        Log.d( "State",  "on Start" );
        txtState.setText(txtState.getText()+"\n on Start");
    }

    @Override
    protected void onPause() {
        super.onPause();
        txtState=(TextView)findViewById(R.id.txtState);
        Toast.makeText( this, "on Pause",Toast.LENGTH_SHORT).show();
        Log.d( "State",  "on Pause" );
        txtState.setText(txtState.getText()+"\n on Pause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        txtState=(TextView)findViewById(R.id.txtState);
        Toast.makeText( this, "on Destroy",Toast.LENGTH_SHORT).show();
        Log.d( "State",  "on Destroy" );
        txtState.setText(txtState.getText()+"\n on Destroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        txtState=(TextView)findViewById(R.id.txtState);
        Toast.makeText( this, "on Stop",Toast.LENGTH_SHORT).show();
        Log.d( "State",  "on stop" );
        txtState.setText(txtState.getText()+"\n on Stop");
    }
}
