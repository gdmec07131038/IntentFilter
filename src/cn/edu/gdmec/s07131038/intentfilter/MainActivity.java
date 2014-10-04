package cn.edu.gdmec.s07131038.intentfilter;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	EditText myEd;
	Button myBtn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myEd=(EditText) findViewById(R.id.editText1);
        myBtn1=(Button) findViewById(R.id.button1);
        myBtn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Uri myUri=Uri.parse(myEd.getText().toString());
				Intent myEd=new Intent(Intent.ACTION_VIEW,myUri);
				startActivity(myEd);
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
